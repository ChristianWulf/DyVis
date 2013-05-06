/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.visualization.impl;

import metaphor.visualization.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationFactoryImpl extends EFactoryImpl implements VisualizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisualizationFactory init() {
		try {
			VisualizationFactory theVisualizationFactory = (VisualizationFactory)EPackage.Registry.INSTANCE.getEFactory("www.chw-thesis-WS09.de/metaphor/v"); 
			if (theVisualizationFactory != null) {
				return theVisualizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisualizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VisualizationPackage.DISTRICT: return createDistrict();
			case VisualizationPackage.STREET: return createStreet();
			case VisualizationPackage.BUILDING: return createBuilding();
			case VisualizationPackage.FLOOR: return createFloor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public District createDistrict() {
		DistrictImpl district = new DistrictImpl();
		return district;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Street createStreet() {
		StreetImpl street = new StreetImpl();
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Building createBuilding() {
		BuildingImpl building = new BuildingImpl();
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor createFloor() {
		FloorImpl floor = new FloorImpl();
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPackage getVisualizationPackage() {
		return (VisualizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisualizationPackage getPackage() {
		return VisualizationPackage.eINSTANCE;
	}

} //VisualizationFactoryImpl
