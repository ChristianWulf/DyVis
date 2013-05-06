/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.dynamics.impl;

import feature.common.CommonPackage;

import feature.common.impl.CommonPackageImpl;

import feature.dynamics.DClassInstance;
import feature.dynamics.DMethodInstance;
import feature.dynamics.DynamicsFactory;
import feature.dynamics.DynamicsPackage;
import feature.dynamics.InstanceAction;

import feature.metrics.MetricsPackage;

import feature.metrics.impl.MetricsPackageImpl;

import feature.statics.StaticsPackage;

import feature.statics.impl.StaticsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicsPackageImpl extends EPackageImpl implements DynamicsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dClassInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dMethodInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceActionEEnum = null;

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
	 * @see feature.dynamics.DynamicsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DynamicsPackageImpl() {
		super(eNS_URI, DynamicsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DynamicsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DynamicsPackage init() {
		if (isInited) return (DynamicsPackage)EPackage.Registry.INSTANCE.getEPackage(DynamicsPackage.eNS_URI);

		// Obtain or create and register package
		DynamicsPackageImpl theDynamicsPackage = (DynamicsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DynamicsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DynamicsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StaticsPackageImpl theStaticsPackage = (StaticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaticsPackage.eNS_URI) instanceof StaticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaticsPackage.eNS_URI) : StaticsPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);

		// Create package meta-data objects
		theDynamicsPackage.createPackageContents();
		theStaticsPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theDynamicsPackage.initializePackageContents();
		theStaticsPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDynamicsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DynamicsPackage.eNS_URI, theDynamicsPackage);
		return theDynamicsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDClassInstance() {
		return dClassInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDClassInstance_Action() {
		return (EAttribute)dClassInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDClassInstance_ObjectID() {
		return (EAttribute)dClassInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDClassInstance_Parent() {
		return (EReference)dClassInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMethodInstance() {
		return dMethodInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMethodInstance_Tout() {
		return (EAttribute)dMethodInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMethodInstance_CalleeId() {
		return (EAttribute)dMethodInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMethodInstance_Ess() {
		return (EAttribute)dMethodInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMethodInstance_Parent() {
		return (EReference)dMethodInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMethodInstance_CallerClassInstance() {
		return (EReference)dMethodInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMethodInstance_CalleeClassInstance() {
		return (EReference)dMethodInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceAction() {
		return instanceActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicsFactory getDynamicsFactory() {
		return (DynamicsFactory)getEFactoryInstance();
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
		dClassInstanceEClass = createEClass(DCLASS_INSTANCE);
		createEAttribute(dClassInstanceEClass, DCLASS_INSTANCE__ACTION);
		createEAttribute(dClassInstanceEClass, DCLASS_INSTANCE__OBJECT_ID);
		createEReference(dClassInstanceEClass, DCLASS_INSTANCE__PARENT);

		dMethodInstanceEClass = createEClass(DMETHOD_INSTANCE);
		createEAttribute(dMethodInstanceEClass, DMETHOD_INSTANCE__TOUT);
		createEAttribute(dMethodInstanceEClass, DMETHOD_INSTANCE__CALLEE_ID);
		createEAttribute(dMethodInstanceEClass, DMETHOD_INSTANCE__ESS);
		createEReference(dMethodInstanceEClass, DMETHOD_INSTANCE__PARENT);
		createEReference(dMethodInstanceEClass, DMETHOD_INSTANCE__CALLER_CLASS_INSTANCE);
		createEReference(dMethodInstanceEClass, DMETHOD_INSTANCE__CALLEE_CLASS_INSTANCE);

		// Create enums
		instanceActionEEnum = createEEnum(INSTANCE_ACTION);
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
		StaticsPackage theStaticsPackage = (StaticsPackage)EPackage.Registry.INSTANCE.getEPackage(StaticsPackage.eNS_URI);
		MetricsPackage theMetricsPackage = (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dClassInstanceEClass.getESuperTypes().add(theCommonPackage.getITraceElement());
		dClassInstanceEClass.getESuperTypes().add(theCommonPackage.getIInfoElement());
		dMethodInstanceEClass.getESuperTypes().add(theMetricsPackage.getPercentDurationMetric());
		dMethodInstanceEClass.getESuperTypes().add(theMetricsPackage.getAbsoluteDurationMetric());
		dMethodInstanceEClass.getESuperTypes().add(theCommonPackage.getITraceElement());
		dMethodInstanceEClass.getESuperTypes().add(theCommonPackage.getIInfoElement());

		// Initialize classes and features; add operations and parameters
		initEClass(dClassInstanceEClass, DClassInstance.class, "DClassInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDClassInstance_Action(), this.getInstanceAction(), "action", null, 0, 1, DClassInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDClassInstance_ObjectID(), ecorePackage.getELongObject(), "objectID", null, 0, 1, DClassInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDClassInstance_Parent(), theStaticsPackage.getDClass(), theStaticsPackage.getDClass_Instances(), "parent", null, 1, 1, DClassInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dMethodInstanceEClass, DMethodInstance.class, "DMethodInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDMethodInstance_Tout(), ecorePackage.getELong(), "tout", null, 0, 1, DMethodInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMethodInstance_CalleeId(), ecorePackage.getELongObject(), "calleeId", null, 0, 1, DMethodInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMethodInstance_Ess(), ecorePackage.getEInt(), "ess", null, 0, 1, DMethodInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMethodInstance_Parent(), theStaticsPackage.getDMethod(), theStaticsPackage.getDMethod_Instances(), "parent", null, 0, 1, DMethodInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMethodInstance_CallerClassInstance(), this.getDClassInstance(), null, "callerClassInstance", null, 0, 1, DMethodInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMethodInstance_CalleeClassInstance(), this.getDClassInstance(), null, "calleeClassInstance", null, 0, 1, DMethodInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(instanceActionEEnum, InstanceAction.class, "InstanceAction");
		addEEnumLiteral(instanceActionEEnum, InstanceAction.CREATE);
		addEEnumLiteral(instanceActionEEnum, InstanceAction.DESTROY);

		// Create resource
		createResource(eNS_URI);
	}

} //DynamicsPackageImpl
