/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.statics.util;

import feature.common.CodeElement;
import feature.common.IComponent;
import feature.common.IInfoElement;

import feature.metrics.IStaticsMetric;
import feature.metrics.NOAMetric;
import feature.metrics.NOMMetric;

import feature.statics.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see feature.statics.StaticsPackage
 * @generated
 */
public class StaticsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StaticsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StaticsPackage.eINSTANCE;
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
	protected StaticsSwitch<Adapter> modelSwitch =
		new StaticsSwitch<Adapter>() {
			@Override
			public Adapter caseDPackage(DPackage object) {
				return createDPackageAdapter();
			}
			@Override
			public Adapter caseDClass(DClass object) {
				return createDClassAdapter();
			}
			@Override
			public Adapter caseDMethod(DMethod object) {
				return createDMethodAdapter();
			}
			@Override
			public Adapter caseDAttribute(DAttribute object) {
				return createDAttributeAdapter();
			}
			@Override
			public Adapter caseIComponent(IComponent object) {
				return createIComponentAdapter();
			}
			@Override
			public Adapter caseCodeElement(CodeElement object) {
				return createCodeElementAdapter();
			}
			@Override
			public Adapter caseIInfoElement(IInfoElement object) {
				return createIInfoElementAdapter();
			}
			@Override
			public Adapter caseIStaticsMetric(IStaticsMetric object) {
				return createIStaticsMetricAdapter();
			}
			@Override
			public Adapter caseNOMMetric(NOMMetric object) {
				return createNOMMetricAdapter();
			}
			@Override
			public Adapter caseNOAMetric(NOAMetric object) {
				return createNOAMetricAdapter();
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
	 * Creates a new adapter for an object of class '{@link feature.statics.DPackage <em>DPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.statics.DPackage
	 * @generated
	 */
	public Adapter createDPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.statics.DClass <em>DClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.statics.DClass
	 * @generated
	 */
	public Adapter createDClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.statics.DMethod <em>DMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.statics.DMethod
	 * @generated
	 */
	public Adapter createDMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.statics.DAttribute <em>DAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.statics.DAttribute
	 * @generated
	 */
	public Adapter createDAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.common.IComponent <em>IComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.common.IComponent
	 * @generated
	 */
	public Adapter createIComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.common.CodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.common.CodeElement
	 * @generated
	 */
	public Adapter createCodeElementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link feature.metrics.IStaticsMetric <em>IStatics Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.metrics.IStaticsMetric
	 * @generated
	 */
	public Adapter createIStaticsMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.metrics.NOMMetric <em>NOM Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.metrics.NOMMetric
	 * @generated
	 */
	public Adapter createNOMMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link feature.metrics.NOAMetric <em>NOA Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see feature.metrics.NOAMetric
	 * @generated
	 */
	public Adapter createNOAMetricAdapter() {
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

} //StaticsAdapterFactory
