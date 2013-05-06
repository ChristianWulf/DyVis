/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.common.impl;

import feature.common.CodeElement;
import feature.common.CommonFactory;
import feature.common.CommonPackage;
import feature.common.IComponent;
import feature.common.IInfoElement;
import feature.common.ITraceElement;

import feature.dynamics.DynamicsPackage;

import feature.dynamics.impl.DynamicsPackageImpl;

import feature.metrics.MetricsPackage;

import feature.metrics.impl.MetricsPackageImpl;

import feature.statics.StaticsPackage;

import feature.statics.impl.StaticsPackageImpl;

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
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTraceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iInfoElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringArrayEDataType = null;

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
	 * @see feature.common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, CommonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StaticsPackageImpl theStaticsPackage = (StaticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaticsPackage.eNS_URI) instanceof StaticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaticsPackage.eNS_URI) : StaticsPackage.eINSTANCE);
		DynamicsPackageImpl theDynamicsPackage = (DynamicsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DynamicsPackage.eNS_URI) instanceof DynamicsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DynamicsPackage.eNS_URI) : DynamicsPackage.eINSTANCE);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonPackage.createPackageContents();
		theStaticsPackage.createPackageContents();
		theDynamicsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();
		theStaticsPackage.initializePackageContents();
		theDynamicsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITraceElement() {
		return iTraceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITraceElement_Tin() {
		return (EAttribute)iTraceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITraceElement_TraceId() {
		return (EAttribute)iTraceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITraceElement_Eoi() {
		return (EAttribute)iTraceElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIComponent() {
		return iComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIInfoElement() {
		return iInfoElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIInfoElement_MetaphorObject() {
		return (EAttribute)iInfoElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIInfoElement_Contents() {
		return (EAttribute)iInfoElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIInfoElement_RowDescriptions() {
		return (EAttribute)iInfoElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeElement() {
		return codeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeElement_Filename() {
		return (EAttribute)codeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeElement_Name() {
		return (EAttribute)codeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeElement_Line() {
		return (EAttribute)codeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringArray() {
		return stringArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
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
		iTraceElementEClass = createEClass(ITRACE_ELEMENT);
		createEAttribute(iTraceElementEClass, ITRACE_ELEMENT__TIN);
		createEAttribute(iTraceElementEClass, ITRACE_ELEMENT__TRACE_ID);
		createEAttribute(iTraceElementEClass, ITRACE_ELEMENT__EOI);

		iComponentEClass = createEClass(ICOMPONENT);

		iInfoElementEClass = createEClass(IINFO_ELEMENT);
		createEAttribute(iInfoElementEClass, IINFO_ELEMENT__METAPHOR_OBJECT);
		createEAttribute(iInfoElementEClass, IINFO_ELEMENT__CONTENTS);
		createEAttribute(iInfoElementEClass, IINFO_ELEMENT__ROW_DESCRIPTIONS);

		codeElementEClass = createEClass(CODE_ELEMENT);
		createEAttribute(codeElementEClass, CODE_ELEMENT__FILENAME);
		createEAttribute(codeElementEClass, CODE_ELEMENT__NAME);
		createEAttribute(codeElementEClass, CODE_ELEMENT__LINE);

		// Create data types
		stringArrayEDataType = createEDataType(STRING_ARRAY);
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

		// Initialize classes and features; add operations and parameters
		initEClass(iTraceElementEClass, ITraceElement.class, "ITraceElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getITraceElement_Tin(), ecorePackage.getELong(), "tin", "-1", 0, 1, ITraceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getITraceElement_TraceId(), ecorePackage.getELong(), "traceId", null, 0, 1, ITraceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getITraceElement_Eoi(), ecorePackage.getEInt(), "eoi", null, 0, 1, ITraceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iComponentEClass, IComponent.class, "IComponent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iInfoElementEClass, IInfoElement.class, "IInfoElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIInfoElement_MetaphorObject(), ecorePackage.getEJavaObject(), "metaphorObject", null, 0, 1, IInfoElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIInfoElement_Contents(), this.getStringArray(), "contents", null, 0, 1, IInfoElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIInfoElement_RowDescriptions(), this.getStringArray(), "rowDescriptions", null, 0, 1, IInfoElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeElementEClass, CodeElement.class, "CodeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeElement_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeElement_Line(), ecorePackage.getEInt(), "line", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringArrayEDataType, String[].class, "StringArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommonPackageImpl
