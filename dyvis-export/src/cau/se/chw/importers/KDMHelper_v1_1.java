package cau.se.chw.importers;

import java.util.List;

import org.omg.schema.spec.kdm._1_1.code.AbstractCodeElement;
import org.omg.schema.spec.kdm._1_1.code.ClassUnit;
import org.omg.schema.spec.kdm._1_1.code.MethodUnit;
import org.omg.schema.spec.kdm._1_1.code.Package;
import org.omg.schema.spec.kdm._1_1.code.ParameterUnit;
import org.omg.schema.spec.kdm._1_1.code.Signature;
import org.omg.schema.spec.kdm._1_1.core.Element;
import org.omg.schema.spec.kdm._1_1.source.AbstractInventoryElement;
import org.omg.schema.spec.kdm._1_1.source.Directory;
import org.omg.schema.spec.kdm._1_1.source.InventoryModel;
import org.omg.schema.spec.kdm._1_1.source.SourceFile;
import org.omg.schema.spec.kdm._1_1.source.SourceRef;
import org.omg.schema.spec.kdm._1_1.source.SourceRegion;

public class KDMHelper_v1_1 {

	private KDMHelper_v1_1() {
		// should not be constructible
	}

	// public static CodeModel loadCodeModel(Segment seg) {
	// for (KDMFramework model : seg.getSegmentOrModel()) {
	// if (model instanceof CodeModel) {
	// return (CodeModel) model;
	// }
	// }
	// throw new
	// IllegalStateException("KDM formated file contains no code model.");
	// }

	public static List<ParameterUnit> getParameters(MethodUnit element) {
		List<AbstractCodeElement> elements = element.getTypeOrCodeElement();
		for (AbstractCodeElement e : elements) {
			// AbstractCodeElement e = c.getCodeElement();
			if (e instanceof Signature) {
				return ((Signature) e).getParameterUnit();
			}
		}
		throw new IllegalStateException("There is no source region.");
	}

	public static SourceRegion getSourceRegion(AbstractCodeElement element) {
		List<Element> elements = element.getSourceOrCommentOrEntryFlow();
		for (Element e : elements) {
			if (e instanceof SourceRef) {
				List<SourceRegion> sourceRegions = ((SourceRef) e).getRegion();
				if (sourceRegions.isEmpty()) {
					throw new IllegalStateException("Source regions are empty.");
				} else {
					return sourceRegions.get(0);
				}
			}
		}
		throw new IllegalStateException("There is no source region.");
	}

	public static AbstractInventoryElement getCorrespondingInventoryElement(final String id,
			List<AbstractInventoryElement> elements) {
		for (AbstractInventoryElement element : elements) {
			if (element.getId().equalsIgnoreCase(id)) {
				return element;
			} else if (element instanceof Directory) {
				// recursive
				AbstractInventoryElement result = getCorrespondingInventoryElement(id,
						((Directory) element).getInventoryElement());
				if (null != result) {
					return result;
				}
			}
		}
		return null;
	}

	public static String getPackagePath(InventoryModel inventoryModel, Package pkg) {
		// for (AbstractInventoryElement ie : elements) {
		// if (ie instanceof Directory) {
		// Directory dir = (Directory) ie;
		// if (dir.getName() != null && pkg.getName().startsWith(dir.getName()))
		// {
		// return "";
		// } else {
		// String path = dir.getPath();
		// if (null == path) {
		// path = "";
		// }
		// String name = dir.getName();
		// if (null == name) {
		// name = "";
		// }
		// return path + name + getPackagePath(dir.getInventoryElement(), pkg);
		// }
		// }
		// }
		//
		// return "";
		List<AbstractCodeElement> classes = pkg.getCodeElement();
		for (AbstractCodeElement class1 : classes) {
			if (class1 instanceof ClassUnit) {
				SourceRegion source = KDMHelper_v1_1.getSourceRegion(class1);
				SourceFile sf = (SourceFile) KDMHelper_v1_1.getCorrespondingInventoryElement(source
						.getAltFile(), inventoryModel.getInventoryElement());
				return sf.getPath();
			}
		}
		return "";
	}
}
