/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.visualization;

import metaphor.dataTypes.DataTypesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see metaphor.visualization.VisualizationFactory
 * @model kind="package"
 * @generated
 */
public interface VisualizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visualization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.chw-thesis-WS09.de/metaphor/v";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "v";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizationPackage eINSTANCE = metaphor.visualization.impl.VisualizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaphor.visualization.impl.DistrictImpl <em>District</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaphor.visualization.impl.DistrictImpl
	 * @see metaphor.visualization.impl.VisualizationPackageImpl#getDistrict()
	 * @generated
	 */
	int DISTRICT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__NAME = DataTypesPackage.STATIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__COLOR = DataTypesPackage.STATIC_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__REL_POSITION = DataTypesPackage.STATIC_ELEMENT__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Abs Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__ABS_POSITION = DataTypesPackage.STATIC_ELEMENT__ABS_POSITION;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__SCENE_OBJECT = DataTypesPackage.STATIC_ELEMENT__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__SOURCE_OBJECT = DataTypesPackage.STATIC_ELEMENT__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__WIDTH = DataTypesPackage.STATIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__LENGTH = DataTypesPackage.STATIC_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__ALTITUDE = DataTypesPackage.STATIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__CONTEXT_TRANSFORMATION = DataTypesPackage.STATIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__CHILDREN = DataTypesPackage.STATIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>District</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_FEATURE_COUNT = DataTypesPackage.STATIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link metaphor.visualization.impl.StreetImpl <em>Street</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaphor.visualization.impl.StreetImpl
	 * @see metaphor.visualization.impl.VisualizationPackageImpl#getStreet()
	 * @generated
	 */
	int STREET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__NAME = DataTypesPackage.SCENE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__COLOR = DataTypesPackage.SCENE_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__REL_POSITION = DataTypesPackage.SCENE_ELEMENT__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Abs Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__ABS_POSITION = DataTypesPackage.SCENE_ELEMENT__ABS_POSITION;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__SCENE_OBJECT = DataTypesPackage.SCENE_ELEMENT__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__SOURCE_OBJECT = DataTypesPackage.SCENE_ELEMENT__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Caller Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__CALLER_FLOOR = DataTypesPackage.SCENE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callee Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__CALLEE_FLOOR = DataTypesPackage.SCENE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Street</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_FEATURE_COUNT = DataTypesPackage.SCENE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link metaphor.visualization.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaphor.visualization.impl.BuildingImpl
	 * @see metaphor.visualization.impl.VisualizationPackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = DataTypesPackage.STATIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__COLOR = DataTypesPackage.STATIC_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__REL_POSITION = DataTypesPackage.STATIC_ELEMENT__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Abs Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__ABS_POSITION = DataTypesPackage.STATIC_ELEMENT__ABS_POSITION;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__SCENE_OBJECT = DataTypesPackage.STATIC_ELEMENT__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__SOURCE_OBJECT = DataTypesPackage.STATIC_ELEMENT__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__WIDTH = DataTypesPackage.STATIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__LENGTH = DataTypesPackage.STATIC_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__TEXTURE = DataTypesPackage.STATIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__TRANSPARENCY = DataTypesPackage.STATIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__HEIGHT = DataTypesPackage.STATIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Floors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__FLOORS = DataTypesPackage.STATIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = DataTypesPackage.STATIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link metaphor.visualization.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaphor.visualization.impl.FloorImpl
	 * @see metaphor.visualization.impl.VisualizationPackageImpl#getFloor()
	 * @generated
	 */
	int FLOOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__NAME = DataTypesPackage.SCENE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__COLOR = DataTypesPackage.SCENE_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__REL_POSITION = DataTypesPackage.SCENE_ELEMENT__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Abs Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__ABS_POSITION = DataTypesPackage.SCENE_ELEMENT__ABS_POSITION;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__SCENE_OBJECT = DataTypesPackage.SCENE_ELEMENT__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__SOURCE_OBJECT = DataTypesPackage.SCENE_ELEMENT__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Building</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__BUILDING = DataTypesPackage.SCENE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__HEIGHT = DataTypesPackage.SCENE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FEATURE_COUNT = DataTypesPackage.SCENE_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link metaphor.visualization.District <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>District</em>'.
	 * @see metaphor.visualization.District
	 * @generated
	 */
	EClass getDistrict();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.visualization.District#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see metaphor.visualization.District#getAltitude()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.visualization.District#getContextTransformation <em>Context Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Transformation</em>'.
	 * @see metaphor.visualization.District#getContextTransformation()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_ContextTransformation();

	/**
	 * Returns the meta object for the reference list '{@link metaphor.visualization.District#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see metaphor.visualization.District#getChildren()
	 * @see #getDistrict()
	 * @generated
	 */
	EReference getDistrict_Children();

	/**
	 * Returns the meta object for class '{@link metaphor.visualization.Street <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Street</em>'.
	 * @see metaphor.visualization.Street
	 * @generated
	 */
	EClass getStreet();

	/**
	 * Returns the meta object for the reference '{@link metaphor.visualization.Street#getCallerFloor <em>Caller Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caller Floor</em>'.
	 * @see metaphor.visualization.Street#getCallerFloor()
	 * @see #getStreet()
	 * @generated
	 */
	EReference getStreet_CallerFloor();

	/**
	 * Returns the meta object for the reference '{@link metaphor.visualization.Street#getCalleeFloor <em>Callee Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callee Floor</em>'.
	 * @see metaphor.visualization.Street#getCalleeFloor()
	 * @see #getStreet()
	 * @generated
	 */
	EReference getStreet_CalleeFloor();

	/**
	 * Returns the meta object for class '{@link metaphor.visualization.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see metaphor.visualization.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.visualization.Building#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture</em>'.
	 * @see metaphor.visualization.Building#getTexture()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Texture();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.visualization.Building#getTransparency <em>Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparency</em>'.
	 * @see metaphor.visualization.Building#getTransparency()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Transparency();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.visualization.Building#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see metaphor.visualization.Building#getHeight()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Height();

	/**
	 * Returns the meta object for the reference list '{@link metaphor.visualization.Building#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Floors</em>'.
	 * @see metaphor.visualization.Building#getFloors()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Floors();

	/**
	 * Returns the meta object for class '{@link metaphor.visualization.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see metaphor.visualization.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for the reference '{@link metaphor.visualization.Floor#getBuilding <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Building</em>'.
	 * @see metaphor.visualization.Floor#getBuilding()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Building();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.visualization.Floor#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see metaphor.visualization.Floor#getHeight()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_Height();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisualizationFactory getVisualizationFactory();

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
		 * The meta object literal for the '{@link metaphor.visualization.impl.DistrictImpl <em>District</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaphor.visualization.impl.DistrictImpl
		 * @see metaphor.visualization.impl.VisualizationPackageImpl#getDistrict()
		 * @generated
		 */
		EClass DISTRICT = eINSTANCE.getDistrict();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__ALTITUDE = eINSTANCE.getDistrict_Altitude();

		/**
		 * The meta object literal for the '<em><b>Context Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__CONTEXT_TRANSFORMATION = eINSTANCE.getDistrict_ContextTransformation();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRICT__CHILDREN = eINSTANCE.getDistrict_Children();

		/**
		 * The meta object literal for the '{@link metaphor.visualization.impl.StreetImpl <em>Street</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaphor.visualization.impl.StreetImpl
		 * @see metaphor.visualization.impl.VisualizationPackageImpl#getStreet()
		 * @generated
		 */
		EClass STREET = eINSTANCE.getStreet();

		/**
		 * The meta object literal for the '<em><b>Caller Floor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREET__CALLER_FLOOR = eINSTANCE.getStreet_CallerFloor();

		/**
		 * The meta object literal for the '<em><b>Callee Floor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREET__CALLEE_FLOOR = eINSTANCE.getStreet_CalleeFloor();

		/**
		 * The meta object literal for the '{@link metaphor.visualization.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaphor.visualization.impl.BuildingImpl
		 * @see metaphor.visualization.impl.VisualizationPackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING__TEXTURE = eINSTANCE.getBuilding_Texture();

		/**
		 * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING__TRANSPARENCY = eINSTANCE.getBuilding_Transparency();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING__HEIGHT = eINSTANCE.getBuilding_Height();

		/**
		 * The meta object literal for the '<em><b>Floors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__FLOORS = eINSTANCE.getBuilding_Floors();

		/**
		 * The meta object literal for the '{@link metaphor.visualization.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaphor.visualization.impl.FloorImpl
		 * @see metaphor.visualization.impl.VisualizationPackageImpl#getFloor()
		 * @generated
		 */
		EClass FLOOR = eINSTANCE.getFloor();

		/**
		 * The meta object literal for the '<em><b>Building</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR__BUILDING = eINSTANCE.getFloor_Building();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR__HEIGHT = eINSTANCE.getFloor_Height();

	}

} //VisualizationPackage
