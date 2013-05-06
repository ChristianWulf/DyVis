package cau.se.chw.importers;

import java.util.List;

import org.omg.schema.spec.kdm.code.AbstractCodeElement;
import org.omg.schema.spec.kdm.code.ClassUnit;
import org.omg.schema.spec.kdm.code.MethodUnit;
import org.omg.schema.spec.kdm.code.ParameterUnit;
import org.omg.schema.spec.kdm.code.Signature;
import org.omg.schema.spec.kdm.code._package;
import org.omg.schema.spec.kdm.code.AbstractCodeElement.Choice;
import org.omg.schema.spec.kdm.source.AbstractInventoryElement;
import org.omg.schema.spec.kdm.source.Directory;
import org.omg.schema.spec.kdm.source.InventoryModel;
import org.omg.schema.spec.kdm.source.SourceFile;
import org.omg.schema.spec.kdm.source.SourceRegion;

public class KDMHelper_v1_2 {

	private KDMHelper_v1_2() {
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
		List<org.omg.schema.spec.kdm.code.ControlElement.Choice> elements = element.getChoice3s();
		for (org.omg.schema.spec.kdm.code.ControlElement.Choice c : elements) {
			AbstractCodeElement e = c.getCodeElement();
			if (e instanceof Signature) {
				return ((Signature) e).getParameterUnits();
			}
		}
		throw new IllegalStateException("There is no source region.");
	}

	public static SourceRegion getSourceRegion(AbstractCodeElement element) {
//		List<Element> elements = element.getSourceOrCommentOrEntryFlow();
		for (Choice c : element.getChoice2s()) {
			if (c.ifSource()) {
//			if (e instanceof SourceRef) {
//				List<SourceRegion> sourceRegions = ((SourceRef) e).getRegions();
				List<SourceRegion> sourceRegions = c.getSource().getRegions();
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
			if (element.getId().getId().equalsIgnoreCase(id)) {
				return element;
			} else if (element instanceof Directory) {
				// recursive
				AbstractInventoryElement result = getCorrespondingInventoryElement(id,
						((Directory) element).getInventoryElements());
				if (null != result) {
					return result;
				}
			}
		}
		return null;
	}

	public static String getPackagePath(InventoryModel inventoryModel, _package pkg) {
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
		List<AbstractCodeElement> classes = pkg.getCodeElements();
		for (AbstractCodeElement class1 : classes) {
			if (class1 instanceof ClassUnit) {
				SourceRegion source = KDMHelper_v1_2.getSourceRegion(class1);
				SourceFile sf = (SourceFile) KDMHelper_v1_2.getCorrespondingInventoryElement(source
						.getFile(), inventoryModel.getInventoryElements());
				return sf.getPath();
			}
		}
		return "";
	}
}
