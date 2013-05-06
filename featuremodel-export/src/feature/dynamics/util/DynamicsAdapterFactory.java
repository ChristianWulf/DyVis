/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.dynamics.util;

import feature.common.IInfoElement;
import feature.common.ITraceElement;

import feature.dynamics.*;

import feature.metrics.AbsoluteDurationMetric;
import feature.metrics.IDynamicsMetric;
import feature.metrics.PercentDurationMetric;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see feature.dynamics.DynamicsPackage
 * @generated
 */
public class DynamicsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DynamicsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DynamicsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicsSwitch<Adapter> modelSwitch =
		new DynamicsSwitch<Adapter>() {
			@Override
			public Adapter caseDClassInstance(DClassInstance object) {
				return createDClassInstanceAdapter();
			}
			@Override
			public Adapter caseDMethodInstance(DMethodInstance object) {
				return createDMethodInstanceAdapter();
			}
			@Override
			public Adapter caseITraceElement(ITraceElement object) {
				return createITraceElementAdapter();
			}
			@Override
			public Adapter caseIInfoElement(IInfoElement object) {
				return createIInfoElementAdapter();
			}
			@Override
			public Adapter caseIDynamicsMetric(IDynamicsMetric object) {
				return createIDynamicsMetricAdapter();
			}
			@Override
			public Adapter casePercentDurationMetric(PercentDurationMetric object) {
				return createPercentDurationMetricAdapter();
			}
			@Override
			public Adapter caseAbsoluteDurationMetric(AbsoluteDurationMetric object) {
				return createAbsoluteDurationMetricAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link feature.dynamics.DClassInstance <em>DClass Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.dynamics.DClassInstance
	 * @generated
	 */
	public Adapter createDClassInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.dynamics.DMethodInstance <em>DMethod Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.dynamics.DMethodInstance
	 * @generated
	 */
	public Adapter createDMethodInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.common.ITraceElement <em>ITrace Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.common.ITraceElement
	 * @generated
	 */
	public Adapter createITraceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.common.IInfoElement <em>IInfo Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.common.IInfoElement
	 * @generated
	 */
	public Adapter createIInfoElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.metrics.IDynamicsMetric <em>IDynamics Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.metrics.IDynamicsMetric
	 * @generated
	 */
	public Adapter createIDynamicsMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.metrics.PercentDurationMetric <em>Percent Duration Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.metrics.PercentDurationMetric
	 * @generated
	 */
	public Adapter createPercentDurationMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.metrics.AbsoluteDurationMetric <em>Absolute Duration Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.metrics.AbsoluteDurationMetric
	 * @generated
	 */
	public Adapter createAbsoluteDurationMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DynamicsAdapterFactory
