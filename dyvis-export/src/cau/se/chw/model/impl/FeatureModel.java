package cau.se.chw.model.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import cau.se.chw.comparators.ComparatorEoi;
import cau.se.chw.comparators.ComparatorKeyTin;
import cau.se.chw.metrics.IMetricWriter;
import cau.se.chw.metrics.impl.MetricWriter;
import cau.se.chw.model.AbstractFeatureModel;
import cau.se.chw.model.IInfoWriter;
import cau.se.chw.observers.ObsDynamicsLoaded;
import cau.se.chw.observers.ObsStaticsLoaded;
import feature.common.ITraceElement;
import feature.dynamics.DClassInstance;
import feature.dynamics.DMethodInstance;
import feature.dynamics.impl.DynamicsFactoryImpl;
import feature.statics.DClass;
import feature.statics.DMethod;
import feature.statics.DPackage;

public class FeatureModel extends AbstractFeatureModel {

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(FeatureModel.class.getName());

	private final List<DPackage> packages = new ArrayList<DPackage>();
	// further lists are only for performance increase
	private final List<DClass> classes = new ArrayList<DClass>();
	private final Map<Long, List<DMethodInstance>> methodEvents = new HashMap<Long, List<DMethodInstance>>();
	private final Map<DClass, List<DClassInstance>> classInstanceEvents = new HashMap<DClass, List<DClassInstance>>();

	private final IMetricWriter metric = new MetricWriter();
	private final IInfoWriter infoWriter = InfoWriter.getInstance();

	private final Comparator<? super DMethodInstance> compa = new ComparatorEoi();
	//private final Comparator<? super ITraceElement> compaTrace = new ComparatorTrace();
	private final Comparator<? super Long> compaKeyTin = new ComparatorKeyTin(methodEvents);

	/**
	 * Constructs a new instance of {@link FeatureModel}.
	 */
	public FeatureModel() {
		logger.setLevel(Level.OFF);
	}

	@Override
	public void addClass(DClass class1) {
		classes.add(class1);
		logger.info("ADDED class = " + class1.getName());
	}

	@Override
	public void addClassInstance(DClassInstance classInstance) {
		if (null == classInstance) {
			throw new IllegalArgumentException("Parameter 'classInstance' may not be null.");
		}
		// if (null == classInstance.getParent()) {
		// throw new IllegalArgumentException(
		// "Attribute 'parent' of parameter 'classInstance' may not be null.");
		// }
		if (null == classInstance.getObjectID()) {
			throw new IllegalArgumentException(
					"Attribute 'objectID' of parameter 'classInstance' may not be null");
		}

		List<DClassInstance> events = classInstanceEvents.get(classInstance.getParent());
		if (null == events) {
			events = new ArrayList<DClassInstance>();
			classInstanceEvents.put(classInstance.getParent(), events);
		}
		events.add(classInstance);

		// TODO useless -> remove
//		if (null != classInstance.getObjectID()) {
//			objectIds.add(classInstance.getObjectID());
//		}

		// traceIds.add(classInstance.getTraceId());
	}

	@Override
	public void addMethodInstance(DMethodInstance methodInstance) {
		List<DMethodInstance> events = methodEvents.get(methodInstance.getTraceId());
		if (null == events) {
			events = new ArrayList<DMethodInstance>();
			methodEvents.put(methodInstance.getTraceId(), events);
		}
		events.add(methodInstance);
		// traceIds.add(methodInstance.getTraceId());
	}

	@Override
	public void addPackage(DPackage package1) {
		packages.add(package1);
		logger.info("ADDED package = " + package1.getName());
	}

	@Override
	public void setDynamicsLoaded() {
		// set unique object ids for the first (static) instances
		// TODO remove because we have caller and callee DClassInstances?
		// for (List<DClassInstance> instances : classInstanceEvents.values()) {
		// DClassInstance first = instances.get(0);
		// if (first.getObjectID() == null) {
		// long id = nextFreeObjectID();
		// first.setObjectID(id);
		// }
		//			
		// for (DClassInstance ci : instances) {
		// System.out.println(ci.getParent().getName());
		// }
		// }

		sortMethodInstances(methodEvents.values());
		setCallersAndCallees(methodEvents.values());
		writeMetrics(methodEvents.values());

		infoWriter.writeMethodInstances(methodEvents.values());
		infoWriter.writeClassInstances(classInstanceEvents.values());

		notifyListeners(ObsDynamicsLoaded.class, null);
	}

	@Override
	public void setStaticsLoaded() {
		for (DClass cl : classes) {
			metric.write(cl);
			createStaticClassInstance(cl);
		}

		infoWriter.writePackages(packages);
		infoWriter.writeClasses(classes);

		notifyListeners(ObsStaticsLoaded.class, null);
	}

	@Override
	public void clearAll() {
		packages.clear();
		classes.clear();
		clearDynamics();
	}

	@Override
	public void clearDynamics() {
		for (List<DMethodInstance> instances : methodEvents.values()) {
			while (instances.size() > 0) {
				DMethodInstance mi = instances.remove(0);
				mi.setParent(null);	// remove from parent
			}
		}
		
		for (List<DClassInstance> instances : classInstanceEvents.values()) {
			// maintain "static" instances
			while (instances.size() > 1) {
				DClassInstance ci = instances.remove(1);
				ci.setParent(null);	// remove from parent
			}
		}
		
		// traceIds.clear();
	}

	@Override
	public DPackage getFirstPackage() {
		return packages.get(0);
	}

	@Override
	public DClass getDClass(String componentName) {
		String[] tokens = componentName.split("\\.");
		final String className = tokens[tokens.length - 1];
		// TODO search can be optimized by a better data structure
		for (DClass cl : classes) {
			if (cl.getName().equals(className)) {
				return cl;
			}
		}

		return null;
	}

	@Override
	public DMethod getDMethod(DClass dClass, String opname) {
		// TODO search can be optimized by a better data structure
		for (DMethod mt : dClass.getMethods()) {
			if (mt.getName().equals(opname)) {
				return mt;
			}
		}
		return null;
	}

	@Override
	public List<ITraceElement> getTraceEvents() {
		List<ITraceElement> events = new ArrayList<ITraceElement>();
		for (List<DMethodInstance> trace : methodEvents.values()) {
			events.addAll(trace);
		}
		for (List<DClassInstance> instances : classInstanceEvents.values()) {
			for (int i = 1; i < instances.size(); i++) {
				// does not add the static instance
				events.add(instances.get(i));
			}
		}
		return events;
	}

	@Override
	public List<Long> getAllTraceIds() {
		List<Long> sortedList = new ArrayList<Long>(methodEvents.keySet());
		Collections.sort(sortedList, compaKeyTin );
		return sortedList;
	}

	private void createStaticClassInstance(DClass cl) {
		DClassInstance classInstance = DynamicsFactoryImpl.eINSTANCE.createDClassInstance();
		classInstance.setParent(cl);
		classInstance.setTin(0); // a static class should always exists
		classInstance.setEoi(-1); // identifies as static class

		List<DClassInstance> instances = new ArrayList<DClassInstance>();
		instances.add(classInstance);
		classInstanceEvents.put(cl, instances);
	}

//	private long nextFreeObjectID() {
//		// TODO can be optimized
//		Long previous;
//		do {
//			previous = nextFreeId;
//			for (Long id : objectIds) {
//				if (nextFreeId == id) {
//					nextFreeId++;
//					break;
//				}
//			}
//		} while (previous != nextFreeId);
//
//		objectIds.add(nextFreeId);
//		return nextFreeId++;
//	}

	/**
	 * Precondition: <code>events</code> must be sorted by eoi.<br>
	 * Postcondition: all except the first (eoi > 0) events have set their
	 * <code>caller</code> attribute.
	 * 
	 * @param events
	 */
	private void setCallerAndCalleeClasses(List<DMethodInstance> events) {
		setCalleeClassInstance(events.get(0));
		for (int index = 1; index < events.size(); index++) {
			DMethodInstance callerEvent = events.get(index - 1);
			DMethodInstance thisEvent = events.get(index);

			setCalleeClassInstance(thisEvent);
			// the caller class is the owner/callee class of the caller method
			// event
			thisEvent.setCallerClassInstance(callerEvent.getCalleeClassInstance());
		}
	}

	/**
	 * Precondition: <code>mi.getCalleeClassInstance()</code> has the default
	 * static "instance", i.e. not <code>null</code>.
	 * 
	 * @param mi
	 */
	private void setCalleeClassInstance(DMethodInstance mi) {
		// if this method has a non-static owner/callee class
		if (null != mi.getCalleeId()) {
			for (DClassInstance ci : mi.getCalleeClassInstance().getParent().getInstances()) {
				if (mi.getCalleeId().equals(ci.getObjectID())) {
					mi.setCalleeClassInstance(ci);
					break;
				}
			}
		}
	}

	@Override
	public List<DClassInstance> getStaticClassInstances() {
		List<DClassInstance> staticInstances = new ArrayList<DClassInstance>();
		for (List<DClassInstance> instances : classInstanceEvents.values()) {
			DClassInstance ci = instances.get(0);
			staticInstances.add(ci);
		}
		return staticInstances;
	}

	@Override
	public List<ITraceElement> getAllTraceElements(long traceId) {
		List<ITraceElement> elements = new ArrayList<ITraceElement>();

		List<DMethodInstance> methods = methodEvents.get(traceId);
		// if (null != methods) {
		if (null == methods) {
			throw new IllegalArgumentException();
		}
		// add all method calls
		for (DMethodInstance mi : methods) {
			if (calleeIsNotStatic(mi)) {
				DClassInstance ci = mi.getCalleeClassInstance();
				// TODO improve performance
				if (!elements.contains(ci)) {
					elements.add(ci);
				}
				logger.info("GET instantiiation");
			}
			elements.add(mi);
		}
		// }

		return elements;
	}

	private boolean calleeIsNotStatic(DMethodInstance mi) {
		return mi.getCalleeClassInstance().getTin() > 0;
	}

	private void sortMethodInstances(Collection<List<DMethodInstance>> methodEvents) {
		for (List<DMethodInstance> events : methodEvents) {
			Collections.sort(events, compa);
		}
	}

	private void setCallersAndCallees(Collection<List<DMethodInstance>> methodEvents) {
		for (List<DMethodInstance> events : methodEvents) {
			setCallerAndCalleeClasses(events);
		}
	}

	private void writeMetrics(Collection<List<DMethodInstance>> methodEvents) {
		for (List<DMethodInstance> events : methodEvents) {
			metric.write(events);
		}
	}

	@Override
	public List<ITraceElement> getAllMethodCalls(long traceId) {
		List<ITraceElement> methods = new ArrayList<ITraceElement>();
		for (DMethodInstance mi : methodEvents.get(traceId)) {
			methods.add(mi);
		}
		return methods;
	}

	// final static private String traceDoesNotExists(final long traceId) {
	// return "Trace with trace id " + traceId + " does not exists.";
	// }
	//
	// final static private String eventDoesNotExists(final int eoi) {
	// return "Event with execution order index " + eoi + " does not exists.";
	// }
}
