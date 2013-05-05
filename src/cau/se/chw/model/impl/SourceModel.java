package cau.se.chw.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import prototypes.observer.AbstractObservable;
import cau.se.chw.model.ISourceModel;
import cau.se.chw.observers.ObsClassInstanceAdded;
import cau.se.chw.observers.ObsClassInstanceRemoved;
import cau.se.chw.observers.ObsDynamicsCleared;
import cau.se.chw.observers.ObsMethodInstanceAdded;
import cau.se.chw.observers.ObsMethodInstanceRemoved;
import cau.se.chw.observers.ObsStaticsLoaded;
import feature.common.ITraceElement;
import feature.dynamics.DClassInstance;
import feature.dynamics.DMethodInstance;
import feature.statics.DClass;
import feature.statics.DPackage;

public class SourceModel extends AbstractObservable implements ISourceModel {

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(SourceModel.class.getName());
	private DPackage root;
	private final Map<Long, List<DMethodInstance>> methodEvents = new HashMap<Long, List<DMethodInstance>>();
	private final Map<DClass, List<DClassInstance>> objectEvents = new HashMap<DClass, List<DClassInstance>>();

	public void setRootPackage(DPackage root) {
		this.root = root;
		notifyListeners(ObsStaticsLoaded.class, root);
	}

	private void addMethodInstance(DMethodInstance methodInstance) {
		List<DMethodInstance> events = methodEvents.get(methodInstance.getTraceId());
		if (null == events) {
			// TODO use more efficient data structure
			events = new ArrayList<DMethodInstance>();
			methodEvents.put(methodInstance.getTraceId(), events);
		}
		events.add(methodInstance);
		notifyListeners(ObsMethodInstanceAdded.class, methodInstance);
	}

	private void removeMethodInstance(DMethodInstance methodInstance) {
		List<DMethodInstance> events = methodEvents.get(methodInstance.getTraceId());
		// if NullPointerExeception here: methodInstance has already been
		// removed
		events.remove(methodInstance);
		notifyListeners(ObsMethodInstanceRemoved.class, methodInstance);
	}

	public void addClassInstance(DClassInstance classInstance) {
		List<DClassInstance> events = objectEvents.get(classInstance.getParent());
		if (null == events) {
			// TODO use more efficient data structure
			events = new ArrayList<DClassInstance>();
			objectEvents.put(classInstance.getParent(), events);
		}
		events.add(classInstance);
		notifyListeners(ObsClassInstanceAdded.class, classInstance);
	}

	private void removeClassInstance(DClassInstance classInstance) {
		List<DClassInstance> events = objectEvents.get(classInstance.getParent());
		// if NullPointerExeception here: classInstance has already been
		// removed
		events.remove(classInstance);
		notifyListeners(ObsClassInstanceRemoved.class, classInstance);
	}

	public void clear() {
		root = null;
		clearDynamics();
	}

	public void clearDynamics() {
		resetScene();
		// remove the last instance, too
		for (List<DClassInstance> instances : objectEvents.values()) {
			if (instances.size() > 0) {
				notifyListeners(ObsClassInstanceRemoved.class, instances.remove(0));
			}
		}
		notifyListeners(ObsDynamicsCleared.class, null);
	}

	@Override
	public void resetScene() {
		// remove and notify trace elements separately
		for (List<DMethodInstance> methodCalls : methodEvents.values()) {
			while (methodCalls.size() > 0) {
				DMethodInstance methodEvent = methodCalls.remove(0);
				notifyListeners(ObsMethodInstanceRemoved.class, methodEvent);
			}
		}

		for (List<DClassInstance> instances : objectEvents.values()) {
			// maintain the static instance for each class
			while (instances.size() > 1) {
				DClassInstance classInstance = instances.remove(1);
				notifyListeners(ObsClassInstanceRemoved.class, classInstance);
			}
		}
	}

	/**
	 * Adds the given trace element.
	 * 
	 * @param te
	 */
	@Override
	public void addTraceElement(ITraceElement te) {
		if (te instanceof DMethodInstance) {
			this.addMethodInstance((DMethodInstance) te);
		} else if (te instanceof DClassInstance) {
			this.addClassInstance((DClassInstance) te);
		}
	}

	/**
	 * Removes the given trace element.
	 * 
	 * @param te
	 */
	@Override
	public void removeTraceElement(ITraceElement te) {
		if (te instanceof DMethodInstance) {
			this.removeMethodInstance((DMethodInstance) te);
		} else if (te instanceof DClassInstance) {
			this.removeClassInstance((DClassInstance) te);
		}
	}
}
