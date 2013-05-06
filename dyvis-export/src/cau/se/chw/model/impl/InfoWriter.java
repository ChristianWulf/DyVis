package cau.se.chw.model.impl;

import java.util.Collection;
import java.util.List;

import cau.se.chw.model.IInfoWriter;
import feature.dynamics.DClassInstance;
import feature.dynamics.DMethodInstance;
import feature.statics.DClass;
import feature.statics.DPackage;

/**
 * 
 * {@InheritDoc}
 * 
 * @author chw
 * 
 */
public class InfoWriter implements IInfoWriter {

	private static final String[] PACKAGE_ROWDESCRIPTION = new String[] { "Package name",
			"Filename", "Hierarchy level" };
	private static final String[] CLASS_ROWDESCRIPTION = new String[] { "Class name", "Filename",
			"Line", "Number of attributes", "Number of methods" };
	private static final String[] METHODCALL_ROWDESCRIPTION = new String[] { "Method name",
			"Filename", "Line", "caller class", "callee class", "Trace Identifier", "eoi", "ess",
			"invocation begin (in ns)", "invocation end (in ns)", "Duration (absolute in ns)",
			"Duration (relative in %)" };
	private static final String[] INSTANTIATION_ROWDESCRIPTION = new String[] { "Instance name",
			"Filename", "Line", "Trace Identifier", "eoi", "instantiation time" };

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final InfoWriter INSTANCE = new InfoWriter();
	}

	/**
	 * Private constructor.
	 */
	private InfoWriter() {
	}

	/**
	 * Returns the only instance of this class.
	 * 
	 * @return
	 */
	public static InfoWriter getInstance() {
		return InstanceHolder.INSTANCE;
	}

	@Override
	public void writeInfo(DPackage p) {
		String[] contents = new String[] { p.getName(), p.getFilename(),
				Integer.toString(p.getLevel()) };

		p.setRowDescriptions(PACKAGE_ROWDESCRIPTION);
		p.setContents(contents);
	}

	@Override
	public void writeInfo(DClass cl) {
		String[] contents = new String[] { cl.getName(), cl.getFilename(),
				Integer.toString(cl.getLine()), Integer.toString(cl.getNoa()),
				Integer.toString(cl.getNom()) };

		cl.setRowDescriptions(CLASS_ROWDESCRIPTION);
		cl.setContents(contents);
	}

	@Override
	public void writeInfo(DMethodInstance mi) {
		DClassInstance caller = mi.getCallerClassInstance();
		String callerName;
		if (null == caller) {
			callerName = "<entry>";
		} else {
			callerName = mi.getCallerClassInstance().getParent().getName();
		}

		String[] contents = new String[] { mi.getParent().getName(), mi.getParent().getFilename(),
				Integer.toString(mi.getParent().getLine()), callerName,
				mi.getCalleeClassInstance().getParent().getName(), Long.toString(mi.getTraceId()),
				Integer.toString(mi.getEoi()), Integer.toString(mi.getEss()),
				Long.toString(mi.getTin()), Long.toString(mi.getTout()),
				Long.toString(mi.getDurAbsolute()), Float.toString(mi.getDurPercent()) };

		mi.setRowDescriptions(METHODCALL_ROWDESCRIPTION);
		mi.setContents(contents);
	}

	@Override
	public void writeInfo(DClassInstance ci) {
		String[] contents = new String[] { ci.getParent().getName(), ci.getParent().getFilename(),
				Integer.toString(ci.getParent().getLine()), Long.toString(ci.getTraceId()),
				Integer.toString(ci.getEoi()), Long.toString(ci.getTin()) };

		ci.setRowDescriptions(INSTANTIATION_ROWDESCRIPTION);
		ci.setContents(contents);
	}

	@Override
	public void writePackages(List<DPackage> packages) {
		for (DPackage p : packages) {
			writeInfo(p);
		}
	}

	@Override
	public void writeClasses(List<DClass> classes) {
		for (DClass cl : classes) {
			writeInfo(cl);
		}
	}

	@Override
	public void writeClassInstances(Collection<List<DClassInstance>> classInstances) {
		for (List<DClassInstance> instances : classInstances) {
			for (DClassInstance ci : instances) {
				writeInfo(ci);
			}
		}
	}

	@Override
	public void writeMethodInstances(Collection<List<DMethodInstance>> methodCalls) {
		for (List<DMethodInstance> trace : methodCalls) {
			for (DMethodInstance mi : trace) {
				writeInfo(mi);
			}
		}
	}

}
