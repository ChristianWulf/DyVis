/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.visualization.util;

import metaphor.dataTypes.SceneElement;
import metaphor.dataTypes.StaticElement;

import metaphor.visualization.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metaphor.visualization.VisualizationPackage
 * @generated
 */
public class VisualizationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisualizationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VisualizationPackage.eINSTANCE;
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
	protected VisualizationSwitch<Adapter> modelSwitch =
		new VisualizationSwitch<Adapter>() {
			@Override
			public Adapter caseDistrict(District object) {
				return createDistrictAdapter();
			}
			@Override
			public Adapter caseStreet(Street object) {
				return createStreetAdapter();
			}
			@Override
			public Adapter caseBuilding(Building object) {
				return createBuildingAdapter();
			}
			@Override
			public Adapter caseFloor(Floor object) {
				return createFloorAdapter();
			}
			@Override
			public Adapter caseSceneElement(SceneElement object) {
				return createSceneElementAdapter();
			}
			@Override
			public Adapter caseStaticElement(StaticElement object) {
				return createStaticElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link metaphor.visualization.District <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaphor.visualization.District
	 * @generated
	 */
	public Adapter createDistrictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaphor.visualization.Street <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaphor.visualization.Street
	 * @generated
	 */
	public Adapter createStreetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaphor.visualization.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaphor.visualization.Building
	 * @generated
	 */
	public Adapter createBuildingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaphor.visualization.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaphor.visualization.Floor
	 * @generated
	 */
	public Adapter createFloorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaphor.dataTypes.SceneElement <em>Scene Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaphor.dataTypes.SceneElement
	 * @generated
	 */
	public Adapter createSceneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaphor.dataTypes.StaticElement <em>Static Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaphor.dataTypes.StaticElement
	 * @generated
	 */
	public Adapter createStaticElementAdapter() {
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

} //VisualizationAdapterFactory
