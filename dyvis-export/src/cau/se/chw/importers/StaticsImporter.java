package cau.se.chw.importers;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import statics.Attribute;
import statics.Class;
import statics.IStaticElement;
import statics.Method;
import statics.Package;
import cau.se.chw.model.IFeatureModel;
import feature.common.IComponent;
import feature.statics.DAttribute;
import feature.statics.DClass;
import feature.statics.DMethod;
import feature.statics.DPackage;
import feature.statics.StaticsFactory;
import feature.statics.impl.StaticsFactoryImpl;
import feature.statics.impl.StaticsPackageImpl;

public class StaticsImporter implements IStaticsImporter {

	private final static java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(StaticsImporter.class.getName());
	private final IFeatureModel featureModel;
	private final StaticsFactory factory;

	public StaticsImporter(IFeatureModel featureModel) {
		this.featureModel = featureModel;
		statics.impl.StaticsPackageImpl.init();
		StaticsPackageImpl.init();
		factory = StaticsFactoryImpl.eINSTANCE;
	}

	@Override
	public void loadFromFile(final String absolutePath) {
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// Register the default resource factory -- only needed for stand-alone!
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		// Get the resource
		Resource resource = resSet.getResource(URI.createFileURI(absolutePath), true);
		// read content
		Package root = (statics.Package) resource.getContents().get(0);

		addStaticsModel(root);
	}

	private void addStaticsModel(statics.Package root) {
		featureModel.clearAll();
		addStaticsTree(root);
		featureModel.setStaticsLoaded();
	}

	private IComponent addStaticsTree(Package root) {
		DPackage package1 = convertToFeaturePackage(root);

		for (IStaticElement child : root.getChildren()) {
			IComponent childComp = null;
			if (child instanceof Package) {
				childComp = addStaticsTree((Package) child);
			} else if (child instanceof Class) {
				childComp = convertToFeatureClass((Class) child);
			} else {
				logger.warning("Unknown static element: " + child);
			}
			if (null != childComp) {
				package1.getChildren().add(childComp);
			}
		}

		return package1;
	}

	private DPackage convertToFeaturePackage(Package root) {
		DPackage package1 = factory.createDPackage();
		package1.setFilename(root.getFilename());
		package1.setLine(root.getLine());
		package1.setName(root.getName());

		featureModel.addPackage(package1);
		return package1;
	}

	private IComponent convertToFeatureClass(Class staClass) {
		DClass class1 = factory.createDClass();
		class1.setFilename(staClass.getFilename());
		class1.setLine(staClass.getLine());
		class1.setName(staClass.getName());

		this.addAttributes(class1.getAttributes(), staClass.getAttributes());
		this.addMethods(class1, staClass);

		featureModel.addClass(class1);
		return class1;
	}

	private void addAttributes(List<DAttribute> dAttributes, List<Attribute> attributes) {
		for (Attribute attr : attributes) {
			DAttribute dAttribute = factory.createDAttribute();
			// dAttribute.setFilename(value);
			// dAttribute.setLine(value);
			dAttribute.setName(attr.getName());
			dAttribute.setType(attr.getType());
			// dAttribute.setValue(value);

			dAttributes.add(dAttribute);
		}
	}

	private void addMethods(DClass class1, Class staClass) {
		for (Method method : staClass.getMethods()) {
			DMethod dMethod = factory.createDMethod();
			dMethod.setFilename(method.getFilename());
			dMethod.setLine(method.getLine());
			dMethod.setName(method.getName());
			dMethod.setReturnValue(method.getReturnType());
			dMethod.setParent(class1);

			this.addAttributes(dMethod.getParameters(), method.getParameters());

			class1.getMethods().add(dMethod);
		}
	}
}
