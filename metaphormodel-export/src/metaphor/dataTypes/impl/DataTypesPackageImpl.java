/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.dataTypes.impl;

import javax.vecmath.Vector3d;

import metaphor.dataTypes.DataTypesFactory;
import metaphor.dataTypes.DataTypesPackage;
import metaphor.dataTypes.SceneElement;
import metaphor.dataTypes.StaticElement;

import metaphor.visualization.VisualizationPackage;

import metaphor.visualization.impl.VisualizationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesPackageImpl extends EPackageImpl implements DataTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see metaphor.dataTypes.DataTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataTypesPackageImpl() {
		super(eNS_URI, DataTypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DataTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataTypesPackage init() {
		if (isInited) return (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);

		// Obtain or create and register package
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataTypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) : VisualizationPackage.eINSTANCE);

		// Create package meta-data objects
		theDataTypesPackage.createPackageContents();
		theVisualizationPackage.createPackageContents();

		// Initialize created meta-data
		theDataTypesPackage.initializePackageContents();
		theVisualizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataTypesPackage.eNS_URI, theDataTypesPackage);
		return theDataTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSceneElement() {
		return sceneElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneElement_Name() {
		return (EAttribute)sceneElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneElement_Color() {
		return (EAttribute)sceneElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneElement_RelPosition() {
		return (EAttribute)sceneElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneElement_AbsPosition() {
		return (EAttribute)sceneElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneElement_SceneObject() {
		return (EAttribute)sceneElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneElement_SourceObject() {
		return (EAttribute)sceneElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticElement() {
		return staticElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticElement_Width() {
		return (EAttribute)staticElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticElement_Length() {
		return (EAttribute)staticElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPosition() {
		return positionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesFactory getDataTypesFactory() {
		return (DataTypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sceneElementEClass = createEClass(SCENE_ELEMENT);
		createEAttribute(sceneElementEClass, SCENE_ELEMENT__NAME);
		createEAttribute(sceneElementEClass, SCENE_ELEMENT__COLOR);
		createEAttribute(sceneElementEClass, SCENE_ELEMENT__REL_POSITION);
		createEAttribute(sceneElementEClass, SCENE_ELEMENT__ABS_POSITION);
		createEAttribute(sceneElementEClass, SCENE_ELEMENT__SCENE_OBJECT);
		createEAttribute(sceneElementEClass, SCENE_ELEMENT__SOURCE_OBJECT);

		staticElementEClass = createEClass(STATIC_ELEMENT);
		createEAttribute(staticElementEClass, STATIC_ELEMENT__WIDTH);
		createEAttribute(staticElementEClass, STATIC_ELEMENT__LENGTH);

		// Create data types
		positionEDataType = createEDataType(POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		staticElementEClass.getESuperTypes().add(this.getSceneElement());

		// Initialize classes and features; add operations and parameters
		initEClass(sceneElementEClass, SceneElement.class, "SceneElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSceneElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SceneElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneElement_Color(), ecorePackage.getEInt(), "color", null, 0, 1, SceneElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneElement_RelPosition(), this.getPosition(), "relPosition", null, 0, 1, SceneElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneElement_AbsPosition(), this.getPosition(), "absPosition", null, 0, 1, SceneElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneElement_SceneObject(), ecorePackage.getEJavaObject(), "sceneObject", null, 0, 1, SceneElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneElement_SourceObject(), ecorePackage.getEJavaObject(), "sourceObject", null, 0, 1, SceneElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticElementEClass, StaticElement.class, "StaticElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticElement_Width(), ecorePackage.getEFloat(), "width", "-1", 0, 1, StaticElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticElement_Length(), ecorePackage.getEFloat(), "length", null, 0, 1, StaticElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(positionEDataType, Vector3d.class, "Position", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DataTypesPackageImpl
