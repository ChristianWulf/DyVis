package cau.se.chw.importers;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.omg.schema.spec.kdm.code.AbstractCodeElement;
import org.omg.schema.spec.kdm.code.ClassUnit;
import org.omg.schema.spec.kdm.code.CodeItem;
import org.omg.schema.spec.kdm.code.CodeModel;
import org.omg.schema.spec.kdm.code.MethodKind;
import org.omg.schema.spec.kdm.code.MethodUnit;
import org.omg.schema.spec.kdm.code.StorableKind;
import org.omg.schema.spec.kdm.code.StorableUnit;
import org.omg.schema.spec.kdm.code._package;
import org.omg.schema.spec.kdm.kdm.KDMModel;
import org.omg.schema.spec.kdm.kdm.Segment;
import org.omg.schema.spec.kdm.kdm.Segment.Choice;
import org.omg.schema.spec.kdm.source.InventoryModel;
import org.omg.schema.spec.kdm.source.SourceFile;
import org.omg.schema.spec.kdm.source.SourceRegion;

import cau.se.chw.comparators.ComparatorPackage;
import cau.se.chw.main.utils.FileSystem;
import cau.se.chw.main.utils.XML;
import cau.se.chw.model.IFeatureModel;
import feature.statics.DAttribute;
import feature.statics.DClass;
import feature.statics.DMethod;
import feature.statics.DPackage;
import feature.statics.StaticsFactory;
import feature.statics.impl.StaticsFactoryImpl;
import feature.statics.impl.StaticsPackageImpl;

public class KDMImporter_v1_2 implements IStaticsImporter {

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(KDMImporter_v1_2.class.getName());
	private final IFeatureModel featureModel;
	private final StaticsFactory factory;

	/**
	 * Constructs a new instance of {@link KDMImporter_v1_2}.
	 * 
	 * @param featureModel
	 */
	public KDMImporter_v1_2(IFeatureModel featureModel) {
		this.featureModel = featureModel;
		StaticsPackageImpl.init();
		factory = StaticsFactoryImpl.eINSTANCE;
	}

	@Override
	public void loadFromFile(String absolutePath) {
		// try {
		// XML.getInstance().loadSchema("src/org/omg/schemadefinition/KDM.kdmXMI.xsd");
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } catch (PropertyException e) {
		// e.printStackTrace();
		// }
		long start = System.nanoTime();
		System.out.print("Loading text file...\t\t");
		String xmlString = FileSystem.getInstance().loadTxtFile(absolutePath);
		System.out.println("took " + (System.nanoTime() - start));

		start = System.nanoTime();
		System.out.print("Parsing schema content...\t");
		Segment root = (Segment) XML.getInstance().extract(xmlString);
		System.out.println("took " + (System.nanoTime() - start));

		featureModel.clearAll();

		start = System.nanoTime();
		List<DPackage> packages = convertKDMToFeatureElements(root);
		if (packages.size() == 0) {
			throw new RuntimeException("The KDM file does not contain any packages.");
		}
		System.out.println("\t\t\t\ttook " + (System.nanoTime() - start));

		start = System.nanoTime();
		buildPackageHierarchy(packages);
		findAndAddRootPackage(packages);
		System.out.println("\t\t\t\ttook " + (System.nanoTime() - start));
		featureModel.setStaticsLoaded();
	}

	private void findAndAddRootPackage(List<DPackage> packages) {
		final DPackage root = factory.createDPackage();
		root.setLevel(0);
		featureModel.addPackage(root);

		List<DPackage> highestLevelPackages = new ArrayList<DPackage>();
		// find highest level packages
		for (DPackage p : packages) {
			if (p.getLevel() == 1) {
				highestLevelPackages.add(p);
			}
			// add each _package
			featureModel.addPackage(p);
		}
		// find root root _package
		final DPackage first = highestLevelPackages.get(0);
		int endIndex = first.getName().indexOf(".");
		String superPackage = first.getName().substring(0, endIndex);

		boolean hasSuperPackage = true;
		for (int index = 1; index < highestLevelPackages.size(); index++) {
			DPackage p = highestLevelPackages.get(index);
			if (!p.getName().startsWith(superPackage)) {
				hasSuperPackage = false;
				break;
			}
		}

		int index = first.getFilename().lastIndexOf(superPackage.replace('.', File.separatorChar));
		String rootPackagePath = first.getFilename().substring(0, index);

		if (!hasSuperPackage) {
			rootPackagePath = "";
			superPackage = "<ground>";
		}

		// write root _package
		root.setFilename(rootPackagePath + superPackage);
		root.setName(superPackage);

		// add highest level packages to the root _package
		for (DPackage p : highestLevelPackages) {
			root.getChildren().add(p);
		}
	}

	private List<DPackage> convertKDMToFeatureElements(Segment segment) {
		CodeModel codeModel = null;
		InventoryModel inventoryModel = null;

		for (Choice choice : segment.getChoice3s()) {
			KDMModel model = choice.getModel();
			if (model instanceof CodeModel) {
				codeModel = (CodeModel) model;
			} else if (model instanceof InventoryModel) {
				inventoryModel = (InventoryModel) model;
			}
		}

		List<DPackage> packages = new ArrayList<DPackage>();

		for (AbstractCodeElement element : codeModel.getCodeElements()) {
			if (element instanceof _package) {
				_package pa = (_package) element;
				// only add packages containing packages and/or classes
				if (pa.getCodeElements().size() > 0) {
					DPackage pkg = addPackage(inventoryModel, pa);
					packages.add(pkg);
				}
			}
		}

		return packages;
	}

	private void buildPackageHierarchy(List<DPackage> packages) {
		Collections.sort(packages, new ComparatorPackage());

		List<DPackage> parents = new ArrayList<DPackage>();

		for (int index = 0; index < packages.size(); index++) {
			DPackage currentPackage = packages.get(index);

			int level = 0;
			for (DPackage pkg : parents) {
				if (currentPackage.getName().startsWith(pkg.getName())) {
					level++;
				} else {
					break;
				}
			}

			currentPackage.setLevel(level + 1); // +1 cause root is added later
			if (level > 0) {
				// remove wrong parents
				parents = parents.subList(0, level);
				// get parent
				DPackage parent = parents.get(parents.size() - 1);
				parent.getChildren().add(currentPackage);
				// System.out.println("ADDED "+currentPackage.getName()+" to "+parent.getName());
			} else {
				parents.clear();
				// System.out.println("ADDED "+currentPackage.getName()+" to "+parent.getName());
			}

			parents.add(currentPackage);
		}
	}

	private DPackage addPackage(InventoryModel inventoryModel, _package element) {
		String path = KDMHelper_v1_2.getPackagePath(inventoryModel, element);

		DPackage pkg = factory.createDPackage();
		pkg.setFilename(path.replace('/', File.separatorChar));
		// pkg.setLine(Integer.valueOf(sourceRegion.getStartLine()));
		pkg.setName(element.getName());

		addClasses(pkg, element, inventoryModel);

		return pkg;
	}

	private void addClass(DPackage parent, ClassUnit element, InventoryModel inventoryModel) {
		if (element.getIsAbstract().equalsIgnoreCase("true")) {
			return;
		}
		if (element.getName().equalsIgnoreCase("<anonymous>")) {
			return;
		}

		SourceRegion sourceRegion = KDMHelper_v1_2.getSourceRegion(element);
		SourceFile invItem = (SourceFile) KDMHelper_v1_2.getCorrespondingInventoryElement(sourceRegion
				.getFile(), inventoryModel.getInventoryElements());

		if (null == invItem) {
			throw new IllegalStateException("There is no inventory element for altFile = "
					+ sourceRegion.getFile());
		}
		// complete file system path + filename with extension
		String filename = invItem.getPath() + invItem.getName();

		DClass class1 = factory.createDClass();
		class1.setFilename(filename.replace('/', File.separatorChar));
		class1.setLine(Integer.valueOf(sourceRegion.getStartLine()));
		class1.setName(element.getName());

		this.addAttributesAndMethods(class1, element);

		parent.getChildren().add(class1);
		featureModel.addClass(class1);
	}

	private void addAttributesAndMethods(DClass parent, ClassUnit element) {
		List<CodeItem> items = element.getCodeElements();
		for (CodeItem item : items) {
			if (item instanceof MethodUnit) {
				addMethod(parent, (MethodUnit) item);
			} else if (item instanceof StorableUnit) {
				addAttribute(parent, (StorableUnit) item);
			}
		}
	}

	private void addMethod(DClass parent, MethodUnit element) {
		MethodKind kind = element.getKind();
		if (kind == MethodKind.METHOD || kind == MethodKind.ABSTRACT) {
			SourceRegion sourceRegion = KDMHelper_v1_2.getSourceRegion(element);

			// List<ParameterUnit> parameters = getParameters(element);
			// TODO return type, parameters

			DMethod method = factory.createDMethod();
			method.setFilename(parent.getFilename());
			method.setLine(Integer.valueOf(sourceRegion.getStartLine()));
			method.setName(element.getName());
			method.setParent(parent);
			// method.setReturnValue();

			parent.getMethods().add(method);
		}
	}

	private void addAttribute(DClass parent, StorableUnit element) {
		StorableKind kind = element.getKind();
		if (kind == StorableKind.GLOBAL || kind == StorableKind.STATIC) {
			SourceRegion sourceRegion = KDMHelper_v1_2.getSourceRegion(element);

			DAttribute dAttribute = factory.createDAttribute();
			dAttribute.setFilename(parent.getFilename());
			dAttribute.setLine(Integer.valueOf(sourceRegion.getStartLine()));
			dAttribute.setName(element.getName());
			// dAttribute.setType(element.getType());
			// dAttribute.setValue(value);

			parent.getAttributes().add(dAttribute);
		}
	}

	private void addClasses(DPackage pkg, _package element, InventoryModel inventoryModel) {
		List<AbstractCodeElement> classes = element.getCodeElements();
		for (AbstractCodeElement class1 : classes) {
			if (class1 instanceof ClassUnit) {
				addClass(pkg, (ClassUnit) class1, inventoryModel);
			}
		}
	}

}
