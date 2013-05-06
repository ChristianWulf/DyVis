/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.dynamics;

import feature.common.CommonPackage;

import feature.metrics.MetricsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see feature.dynamics.DynamicsFactory
 * @model kind="package"
 * @generated
 */
public interface DynamicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dynamics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.chw-thesis-WS09.de/root/dynamics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "d";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DynamicsPackage eINSTANCE = feature.dynamics.impl.DynamicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link feature.dynamics.impl.DClassInstanceImpl <em>DClass Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.dynamics.impl.DClassInstanceImpl
	 * @see feature.dynamics.impl.DynamicsPackageImpl#getDClassInstance()
	 * @generated
	 */
	int DCLASS_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Tin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_INSTANCE__TIN = CommonPackage.ITRACE_ELEMENT__TIN;

	/**
	 * The feature id for the '<em><b>Trace Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_INSTANCE__TRACE_ID = CommonPackage.ITRACE_ELEMENT__TRACE_ID;

	/**
	 * The feature id for the '<em><b>Eoi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_INSTANCE__EOI = CommonPackage.ITRACE_ELEMENT__EOI;

	/**
	 * The feature id for the '<em><b>Metaphor Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_INSTANCE__METAPHOR_OBJECT = CommonPackage.ITRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_INSTANCE__CONTENTS = CommonPackage.ITRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Row Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_INSTANCE__ROW_DESCRIPTIONS = CommonPackage.ITRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_INSTANCE__ACTION = CommonPackage.ITRACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_INSTANCE__OBJECT_ID = CommonPackage.ITRACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_INSTANCE__PARENT = CommonPackage.ITRACE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>DClass Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_INSTANCE_FEATURE_COUNT = CommonPackage.ITRACE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link feature.dynamics.impl.DMethodInstanceImpl <em>DMethod Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.dynamics.impl.DMethodInstanceImpl
	 * @see feature.dynamics.impl.DynamicsPackageImpl#getDMethodInstance()
	 * @generated
	 */
	int DMETHOD_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Dur Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__DUR_PERCENT = MetricsPackage.PERCENT_DURATION_METRIC__DUR_PERCENT;

	/**
	 * The feature id for the '<em><b>Dur Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__DUR_ABSOLUTE = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__TIN = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trace Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__TRACE_ID = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eoi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__EOI = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metaphor Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__METAPHOR_OBJECT = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__CONTENTS = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Row Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__ROW_DESCRIPTIONS = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__TOUT = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Callee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__CALLEE_ID = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__ESS = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__PARENT = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Caller Class Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__CALLER_CLASS_INSTANCE = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Callee Class Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE__CALLEE_CLASS_INSTANCE = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>DMethod Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_INSTANCE_FEATURE_COUNT = MetricsPackage.PERCENT_DURATION_METRIC_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link feature.dynamics.InstanceAction <em>Instance Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.dynamics.InstanceAction
	 * @see feature.dynamics.impl.DynamicsPackageImpl#getInstanceAction()
	 * @generated
	 */
	int INSTANCE_ACTION = 2;


	/**
	 * Returns the meta object for class '{@link feature.dynamics.DClassInstance <em>DClass Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DClass Instance</em>'.
	 * @see feature.dynamics.DClassInstance
	 * @generated
	 */
	EClass getDClassInstance();

	/**
	 * Returns the meta object for the attribute '{@link feature.dynamics.DClassInstance#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see feature.dynamics.DClassInstance#getAction()
	 * @see #getDClassInstance()
	 * @generated
	 */
	EAttribute getDClassInstance_Action();

	/**
	 * Returns the meta object for the attribute '{@link feature.dynamics.DClassInstance#getObjectID <em>Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object ID</em>'.
	 * @see feature.dynamics.DClassInstance#getObjectID()
	 * @see #getDClassInstance()
	 * @generated
	 */
	EAttribute getDClassInstance_ObjectID();

	/**
	 * Returns the meta object for the reference '{@link feature.dynamics.DClassInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see feature.dynamics.DClassInstance#getParent()
	 * @see #getDClassInstance()
	 * @generated
	 */
	EReference getDClassInstance_Parent();

	/**
	 * Returns the meta object for class '{@link feature.dynamics.DMethodInstance <em>DMethod Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMethod Instance</em>'.
	 * @see feature.dynamics.DMethodInstance
	 * @generated
	 */
	EClass getDMethodInstance();

	/**
	 * Returns the meta object for the attribute '{@link feature.dynamics.DMethodInstance#getTout <em>Tout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tout</em>'.
	 * @see feature.dynamics.DMethodInstance#getTout()
	 * @see #getDMethodInstance()
	 * @generated
	 */
	EAttribute getDMethodInstance_Tout();

	/**
	 * Returns the meta object for the attribute '{@link feature.dynamics.DMethodInstance#getCalleeId <em>Callee Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callee Id</em>'.
	 * @see feature.dynamics.DMethodInstance#getCalleeId()
	 * @see #getDMethodInstance()
	 * @generated
	 */
	EAttribute getDMethodInstance_CalleeId();

	/**
	 * Returns the meta object for the attribute '{@link feature.dynamics.DMethodInstance#getEss <em>Ess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ess</em>'.
	 * @see feature.dynamics.DMethodInstance#getEss()
	 * @see #getDMethodInstance()
	 * @generated
	 */
	EAttribute getDMethodInstance_Ess();

	/**
	 * Returns the meta object for the reference '{@link feature.dynamics.DMethodInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see feature.dynamics.DMethodInstance#getParent()
	 * @see #getDMethodInstance()
	 * @generated
	 */
	EReference getDMethodInstance_Parent();

	/**
	 * Returns the meta object for the reference '{@link feature.dynamics.DMethodInstance#getCallerClassInstance <em>Caller Class Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caller Class Instance</em>'.
	 * @see feature.dynamics.DMethodInstance#getCallerClassInstance()
	 * @see #getDMethodInstance()
	 * @generated
	 */
	EReference getDMethodInstance_CallerClassInstance();

	/**
	 * Returns the meta object for the reference '{@link feature.dynamics.DMethodInstance#getCalleeClassInstance <em>Callee Class Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callee Class Instance</em>'.
	 * @see feature.dynamics.DMethodInstance#getCalleeClassInstance()
	 * @see #getDMethodInstance()
	 * @generated
	 */
	EReference getDMethodInstance_CalleeClassInstance();

	/**
	 * Returns the meta object for enum '{@link feature.dynamics.InstanceAction <em>Instance Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Action</em>'.
	 * @see feature.dynamics.InstanceAction
	 * @generated
	 */
	EEnum getInstanceAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DynamicsFactory getDynamicsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link feature.dynamics.impl.DClassInstanceImpl <em>DClass Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.dynamics.impl.DClassInstanceImpl
		 * @see feature.dynamics.impl.DynamicsPackageImpl#getDClassInstance()
		 * @generated
		 */
		EClass DCLASS_INSTANCE = eINSTANCE.getDClassInstance();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCLASS_INSTANCE__ACTION = eINSTANCE.getDClassInstance_Action();

		/**
		 * The meta object literal for the '<em><b>Object ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCLASS_INSTANCE__OBJECT_ID = eINSTANCE.getDClassInstance_ObjectID();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCLASS_INSTANCE__PARENT = eINSTANCE.getDClassInstance_Parent();

		/**
		 * The meta object literal for the '{@link feature.dynamics.impl.DMethodInstanceImpl <em>DMethod Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.dynamics.impl.DMethodInstanceImpl
		 * @see feature.dynamics.impl.DynamicsPackageImpl#getDMethodInstance()
		 * @generated
		 */
		EClass DMETHOD_INSTANCE = eINSTANCE.getDMethodInstance();

		/**
		 * The meta object literal for the '<em><b>Tout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMETHOD_INSTANCE__TOUT = eINSTANCE.getDMethodInstance_Tout();

		/**
		 * The meta object literal for the '<em><b>Callee Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMETHOD_INSTANCE__CALLEE_ID = eINSTANCE.getDMethodInstance_CalleeId();

		/**
		 * The meta object literal for the '<em><b>Ess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMETHOD_INSTANCE__ESS = eINSTANCE.getDMethodInstance_Ess();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMETHOD_INSTANCE__PARENT = eINSTANCE.getDMethodInstance_Parent();

		/**
		 * The meta object literal for the '<em><b>Caller Class Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMETHOD_INSTANCE__CALLER_CLASS_INSTANCE = eINSTANCE.getDMethodInstance_CallerClassInstance();

		/**
		 * The meta object literal for the '<em><b>Callee Class Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMETHOD_INSTANCE__CALLEE_CLASS_INSTANCE = eINSTANCE.getDMethodInstance_CalleeClassInstance();

		/**
		 * The meta object literal for the '{@link feature.dynamics.InstanceAction <em>Instance Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.dynamics.InstanceAction
		 * @see feature.dynamics.impl.DynamicsPackageImpl#getInstanceAction()
		 * @generated
		 */
		EEnum INSTANCE_ACTION = eINSTANCE.getInstanceAction();

	}

} //DynamicsPackage
