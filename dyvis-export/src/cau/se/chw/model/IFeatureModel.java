package cau.se.chw.model;

import java.util.List;

import cau.se.chw.importers.KiekerImporter;
import feature.common.ITraceElement;
import feature.dynamics.DClassInstance;
import feature.dynamics.DMethodInstance;
import feature.statics.DClass;
import feature.statics.DMethod;
import feature.statics.DPackage;

public interface IFeatureModel {

	List<ITraceElement> getTraceEvents();
	
	void addPackage(DPackage pkg);

	void addClass(DClass cl);

	void addClassInstance(DClassInstance classInstance);

	void addMethodInstance(DMethodInstance methodInstance);

	void setStaticsLoaded();

	void setDynamicsLoaded();

	DPackage getFirstPackage();

	// List<DMethodInstance> getMethodInstances(long traceId, int from_eoi, int
	// to_eoi);

	/**
	 * Returns the <code>DClass</code> with the given <code>componentName</code>
	 * . Used by {@link KiekerImporter}.
	 * 
	 * @param componentName
	 * @return
	 */
	DClass getDClass(String componentName);

	/**
	 * Used by {@link KiekerImporter}.
	 * 
	 * @param dClass
	 * @param opname
	 * @return
	 */
	DMethod getDMethod(DClass dClass, String opname);

	/**
	 * Returns a sorted list containing all trace identifiers in ascending time
	 * order.
	 * 
	 * @return
	 */
	List<Long> getAllTraceIds();

	/**
	 * Returns all <code>ITraceElement</code>s of the trace indicated by
	 * <code>traceId</code>.
	 * 
	 * @param traceId
	 * @return
	 */
	List<ITraceElement> getAllTraceElements(long traceId);

	/**
	 * Clears all data, i.e. static as well as dynamic data.
	 */
	void clearAll();

	/**
	 * Clears all dynamic data.
	 */
	void clearDynamics();

	List<ITraceElement> getAllMethodCalls(long traceId);
}
