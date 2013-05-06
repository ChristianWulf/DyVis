/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.metrics.impl;

import feature.common.CommonPackage;

import feature.common.impl.CommonPackageImpl;

import feature.dynamics.DynamicsPackage;

import feature.dynamics.impl.DynamicsPackageImpl;

import feature.metrics.AbsoluteDurationMetric;
import feature.metrics.IDynamicsMetric;
import feature.metrics.IStaticsMetric;
import feature.metrics.MetricsFactory;
import feature.metrics.MetricsPackage;
import feature.metrics.NOAMetric;
import feature.metrics.NOMMetric;
import feature.metrics.PercentDurationMetric;

import feature.statics.StaticsPackage;

import feature.statics.impl.StaticsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricsPackageImpl extends EPackageImpl implements MetricsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStaticsMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDynamicsMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noaMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nomMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentDurationMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteDurationMetricEClass = null;

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
	 * @see feature.metrics.MetricsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetricsPackageImpl() {
		super(eNS_URI, MetricsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetricsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetricsPackage init() {
		if (isInited) return (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Obtain or create and register package
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetricsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StaticsPackageImpl theStaticsPackage = (StaticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaticsPackage.eNS_URI) instanceof StaticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaticsPackage.eNS_URI) : StaticsPackage.eINSTANCE);
		DynamicsPackageImpl theDynamicsPackage = (DynamicsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DynamicsPackage.eNS_URI) instanceof DynamicsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DynamicsPackage.eNS_URI) : DynamicsPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);

		// Create package meta-data objects
		theMetricsPackage.createPackageContents();
		theStaticsPackage.createPackageContents();
		theDynamicsPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theMetricsPackage.initializePackageContents();
		theStaticsPackage.initializePackageContents();
		theDynamicsPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetricsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetricsPackage.eNS_URI, theMetricsPackage);
		return theMetricsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIStaticsMetric() {
		return iStaticsMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDynamicsMetric() {
		return iDynamicsMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNOAMetric() {
		return noaMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNOAMetric_Noa() {
		return (EAttribute)noaMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNOMMetric() {
		return nomMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNOMMetric_Nom() {
		return (EAttribute)nomMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPercentDurationMetric() {
		return percentDurationMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentDurationMetric_DurPercent() {
		return (EAttribute)percentDurationMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteDurationMetric() {
		return absoluteDurationMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteDurationMetric_DurAbsolute() {
		return (EAttribute)absoluteDurationMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactory getMetricsFactory() {
		return (MetricsFactory)getEFactoryInstance();
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
		iStaticsMetricEClass = createEClass(ISTATICS_METRIC);

		iDynamicsMetricEClass = createEClass(IDYNAMICS_METRIC);

		noaMetricEClass = createEClass(NOA_METRIC);
		createEAttribute(noaMetricEClass, NOA_METRIC__NOA);

		nomMetricEClass = createEClass(NOM_METRIC);
		createEAttribute(nomMetricEClass, NOM_METRIC__NOM);

		percentDurationMetricEClass = createEClass(PERCENT_DURATION_METRIC);
		createEAttribute(percentDurationMetricEClass, PERCENT_DURATION_METRIC__DUR_PERCENT);

		absoluteDurationMetricEClass = createEClass(ABSOLUTE_DURATION_METRIC);
		createEAttribute(absoluteDurationMetricEClass, ABSOLUTE_DURATION_METRIC__DUR_ABSOLUTE);
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
		noaMetricEClass.getESuperTypes().add(this.getIStaticsMetric());
		nomMetricEClass.getESuperTypes().add(this.getIStaticsMetric());
		percentDurationMetricEClass.getESuperTypes().add(this.getIDynamicsMetric());
		absoluteDurationMetricEClass.getESuperTypes().add(this.getIDynamicsMetric());

		// Initialize classes and features; add operations and parameters
		initEClass(iStaticsMetricEClass, IStaticsMetric.class, "IStaticsMetric", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iDynamicsMetricEClass, IDynamicsMetric.class, "IDynamicsMetric", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noaMetricEClass, NOAMetric.class, "NOAMetric", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNOAMetric_Noa(), ecorePackage.getEInt(), "noa", null, 0, 1, NOAMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nomMetricEClass, NOMMetric.class, "NOMMetric", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNOMMetric_Nom(), ecorePackage.getEInt(), "nom", null, 0, 1, NOMMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(percentDurationMetricEClass, PercentDurationMetric.class, "PercentDurationMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentDurationMetric_DurPercent(), ecorePackage.getEFloat(), "durPercent", null, 0, 1, PercentDurationMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteDurationMetricEClass, AbsoluteDurationMetric.class, "AbsoluteDurationMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteDurationMetric_DurAbsolute(), ecorePackage.getELong(), "durAbsolute", null, 0, 1, AbsoluteDurationMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MetricsPackageImpl
