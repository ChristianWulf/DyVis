package cau.se.chw.model;

import java.util.Collection;
import java.util.List;

import feature.dynamics.DClassInstance;
import feature.dynamics.DMethodInstance;
import feature.statics.DClass;
import feature.statics.DPackage;

/**
 * Writes the <code>RowDescriptions</code> and <code>Contents</code> attributes
 * of the model classes
 * <ul>
 * <li>{@link DPackage}</li>
 * <li>{@link DClass}</li>
 * <li>{@link DMethodInstance}</li>
 * <li>{@link DClassInstance}</li>
 * </ul>
 * 
 * @author chw
 * 
 */
public interface IInfoWriter {

	void writeInfo(DPackage p);

	void writeInfo(DClass cl);

	void writeInfo(DMethodInstance mi);

	void writeInfo(DClassInstance ci);

	void writeClasses(List<DClass> classes);

	void writePackages(List<DPackage> packages);

	void writeMethodInstances(Collection<List<DMethodInstance>> methodCalls);

	void writeClassInstances(Collection<List<DClassInstance>> classInstances);
}
