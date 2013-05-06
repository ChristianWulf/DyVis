/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.visualization.impl;

import metaphor.dataTypes.DataTypesPackage;

import metaphor.dataTypes.impl.DataTypesPackageImpl;

import metaphor.visualization.Building;
import metaphor.visualization.District;
import metaphor.visualization.Floor;
import metaphor.visualization.Street;
import metaphor.visualization.VisualizationFactory;
import metaphor.visualization.VisualizationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationPackageImpl extends EPackageImpl implements VisualizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass districtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorEClass = null;

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
	 * @see metaphor.visualization.VisualizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisualizationPackageImpl() {
		super(eNS_URI, VisualizationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VisualizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisualizationPackage init() {
		if (isInited) return (VisualizationPackage)EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI);

		// Obtain or create and register package
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisualizationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theVisualizationPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();

		// Initialize created meta-data
		theVisualizationPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisualizationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisualizationPackage.eNS_URI, theVisualizationPackage);
		return theVisualizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistrict() {
		return districtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistrict_Altitude() {
		return (EAttribute)districtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistrict_ContextTransformation() {
		return (EAttribute)districtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistrict_Children() {
		return (EReference)districtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreet() {
		return streetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreet_CallerFloor() {
		return (EReference)streetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreet_CalleeFloor() {
		return (EReference)streetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilding() {
		return buildingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilding_Texture() {
		return (EAttribute)buildingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilding_Transparency() {
		return (EAttribute)buildingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilding_Height() {
		return (EAttribute)buildingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilding_Floors() {
		return (EReference)buildingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloor() {
		return floorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloor_Building() {
		return (EReference)floorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloor_Height() {
		return (EAttribute)floorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationFactory getVisualizationFactory() {
		return (VisualizationFactory)getEFactoryInstance();
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
		districtEClass = createEClass(DISTRICT);
		createEAttribute(districtEClass, DISTRICT__ALTITUDE);
		createEAttribute(districtEClass, DISTRICT__CONTEXT_TRANSFORMATION);
		createEReference(districtEClass, DISTRICT__CHILDREN);

		streetEClass = createEClass(STREET);
		createEReference(streetEClass, STREET__CALLER_FLOOR);
		createEReference(streetEClass, STREET__CALLEE_FLOOR);

		buildingEClass = createEClass(BUILDING);
		createEAttribute(buildingEClass, BUILDING__TEXTURE);
		createEAttribute(buildingEClass, BUILDING__TRANSPARENCY);
		createEAttribute(buildingEClass, BUILDING__HEIGHT);
		createEReference(buildingEClass, BUILDING__FLOORS);

		floorEClass = createEClass(FLOOR);
		createEReference(floorEClass, FLOOR__BUILDING);
		createEAttribute(floorEClass, FLOOR__HEIGHT);
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

		// Obtain other dependent packages
		DataTypesPackage theDataTypesPackage = (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		districtEClass.getESuperTypes().add(theDataTypesPackage.getStaticElement());
		streetEClass.getESuperTypes().add(theDataTypesPackage.getSceneElement());
		buildingEClass.getESuperTypes().add(theDataTypesPackage.getStaticElement());
		floorEClass.getESuperTypes().add(theDataTypesPackage.getSceneElement());

		// Initialize classes and features; add operations and parameters
		initEClass(districtEClass, District.class, "District", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistrict_Altitude(), ecorePackage.getEFloat(), "altitude", null, 0, 1, District.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistrict_ContextTransformation(), theDataTypesPackage.getPosition(), "contextTransformation", null, 0, 1, District.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistrict_Children(), theDataTypesPackage.getStaticElement(), null, "children", null, 0, -1, District.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streetEClass, Street.class, "Street", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStreet_CallerFloor(), this.getFloor(), null, "callerFloor", null, 1, 1, Street.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreet_CalleeFloor(), this.getFloor(), null, "calleeFloor", null, 1, 1, Street.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildingEClass, Building.class, "Building", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuilding_Texture(), ecorePackage.getEString(), "texture", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilding_Transparency(), ecorePackage.getEFloat(), "transparency", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilding_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_Floors(), this.getFloor(), this.getFloor_Building(), "floors", null, 0, -1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floorEClass, Floor.class, "Floor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFloor_Building(), this.getBuilding(), this.getBuilding_Floors(), "building", null, 1, 1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloor_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VisualizationPackageImpl
