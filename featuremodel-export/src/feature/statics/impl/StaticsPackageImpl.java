/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.statics.impl;

import feature.common.CommonPackage;

import feature.common.impl.CommonPackageImpl;

import feature.dynamics.DynamicsPackage;

import feature.dynamics.impl.DynamicsPackageImpl;

import feature.metrics.MetricsPackage;

import feature.metrics.impl.MetricsPackageImpl;

import feature.statics.DAttribute;
import feature.statics.DClass;
import feature.statics.DMethod;
import feature.statics.DPackage;
import feature.statics.StaticsFactory;
import feature.statics.StaticsPackage;

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
public class StaticsPackageImpl extends EPackageImpl implements StaticsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAttributeEClass = null;

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
	 * @see feature.statics.StaticsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StaticsPackageImpl() {
		super(eNS_URI, StaticsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StaticsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StaticsPackage init() {
		if (isInited) return (StaticsPackage)EPackage.Registry.INSTANCE.getEPackage(StaticsPackage.eNS_URI);

		// Obtain or create and register package
		StaticsPackageImpl theStaticsPackage = (StaticsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StaticsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StaticsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DynamicsPackageImpl theDynamicsPackage = (DynamicsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DynamicsPackage.eNS_URI) instanceof DynamicsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DynamicsPackage.eNS_URI) : DynamicsPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);

		// Create package meta-data objects
		theStaticsPackage.createPackageContents();
		theDynamicsPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theStaticsPackage.initializePackageContents();
		theDynamicsPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStaticsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StaticsPackage.eNS_URI, theStaticsPackage);
		return theStaticsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPackage() {
		return dPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPackage_Children() {
		return (EReference)dPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPackage_Level() {
		return (EAttribute)dPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDClass() {
		return dClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDClass_Instances() {
		return (EReference)dClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDClass_Attributes() {
		return (EReference)dClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDClass_Methods() {
		return (EReference)dClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMethod() {
		return dMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMethod_Instances() {
		return (EReference)dMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMethod_ReturnValue() {
		return (EAttribute)dMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMethod_Parameters() {
		return (EReference)dMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMethod_Parent() {
		return (EReference)dMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAttribute() {
		return dAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAttribute_Type() {
		return (EAttribute)dAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAttribute_Value() {
		return (EAttribute)dAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticsFactory getStaticsFactory() {
		return (StaticsFactory)getEFactoryInstance();
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
		dPackageEClass = createEClass(DPACKAGE);
		createEReference(dPackageEClass, DPACKAGE__CHILDREN);
		createEAttribute(dPackageEClass, DPACKAGE__LEVEL);

		dClassEClass = createEClass(DCLASS);
		createEReference(dClassEClass, DCLASS__INSTANCES);
		createEReference(dClassEClass, DCLASS__ATTRIBUTES);
		createEReference(dClassEClass, DCLASS__METHODS);

		dMethodEClass = createEClass(DMETHOD);
		createEReference(dMethodEClass, DMETHOD__INSTANCES);
		createEAttribute(dMethodEClass, DMETHOD__RETURN_VALUE);
		createEReference(dMethodEClass, DMETHOD__PARAMETERS);
		createEReference(dMethodEClass, DMETHOD__PARENT);

		dAttributeEClass = createEClass(DATTRIBUTE);
		createEAttribute(dAttributeEClass, DATTRIBUTE__TYPE);
		createEAttribute(dAttributeEClass, DATTRIBUTE__VALUE);
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
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		MetricsPackage theMetricsPackage = (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		DynamicsPackage theDynamicsPackage = (DynamicsPackage)EPackage.Registry.INSTANCE.getEPackage(DynamicsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dPackageEClass.getESuperTypes().add(theCommonPackage.getIComponent());
		dPackageEClass.getESuperTypes().add(theCommonPackage.getCodeElement());
		dPackageEClass.getESuperTypes().add(theCommonPackage.getIInfoElement());
		dClassEClass.getESuperTypes().add(theCommonPackage.getIComponent());
		dClassEClass.getESuperTypes().add(theCommonPackage.getCodeElement());
		dClassEClass.getESuperTypes().add(theCommonPackage.getIInfoElement());
		dClassEClass.getESuperTypes().add(theMetricsPackage.getNOMMetric());
		dClassEClass.getESuperTypes().add(theMetricsPackage.getNOAMetric());
		dMethodEClass.getESuperTypes().add(theCommonPackage.getCodeElement());
		dAttributeEClass.getESuperTypes().add(theCommonPackage.getCodeElement());

		// Initialize classes and features; add operations and parameters
		initEClass(dPackageEClass, DPackage.class, "DPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDPackage_Children(), theCommonPackage.getIComponent(), null, "children", null, 0, -1, DPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDPackage_Level(), ecorePackage.getEInt(), "level", null, 0, 1, DPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dClassEClass, DClass.class, "DClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDClass_Instances(), theDynamicsPackage.getDClassInstance(), theDynamicsPackage.getDClassInstance_Parent(), "instances", null, 0, -1, DClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDClass_Attributes(), this.getDAttribute(), null, "attributes", null, 0, -1, DClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDClass_Methods(), this.getDMethod(), this.getDMethod_Parent(), "methods", null, 0, -1, DClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dMethodEClass, DMethod.class, "DMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMethod_Instances(), theDynamicsPackage.getDMethodInstance(), theDynamicsPackage.getDMethodInstance_Parent(), "instances", null, 0, -1, DMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMethod_ReturnValue(), ecorePackage.getEString(), "returnValue", null, 0, 1, DMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMethod_Parameters(), this.getDAttribute(), null, "parameters", null, 0, -1, DMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMethod_Parent(), this.getDClass(), this.getDClass_Methods(), "parent", null, 0, 1, DMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dAttributeEClass, DAttribute.class, "DAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, DAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, DAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StaticsPackageImpl
