/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.dataTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see metaphor.dataTypes.DataTypesFactory
 * @model kind="package"
 * @generated
 */
public interface DataTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.chw-thesis-WS09.de/metaphor/dt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesPackage eINSTANCE = metaphor.dataTypes.impl.DataTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaphor.dataTypes.impl.SceneElementImpl <em>Scene Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaphor.dataTypes.impl.SceneElementImpl
	 * @see metaphor.dataTypes.impl.DataTypesPackageImpl#getSceneElement()
	 * @generated
	 */
	int SCENE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ELEMENT__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ELEMENT__REL_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Abs Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ELEMENT__ABS_POSITION = 3;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ELEMENT__SCENE_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ELEMENT__SOURCE_OBJECT = 5;

	/**
	 * The number of structural features of the '<em>Scene Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link metaphor.dataTypes.impl.StaticElementImpl <em>Static Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaphor.dataTypes.impl.StaticElementImpl
	 * @see metaphor.dataTypes.impl.DataTypesPackageImpl#getStaticElement()
	 * @generated
	 */
	int STATIC_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ELEMENT__NAME = SCENE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ELEMENT__COLOR = SCENE_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ELEMENT__REL_POSITION = SCENE_ELEMENT__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Abs Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ELEMENT__ABS_POSITION = SCENE_ELEMENT__ABS_POSITION;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ELEMENT__SCENE_OBJECT = SCENE_ELEMENT__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ELEMENT__SOURCE_OBJECT = SCENE_ELEMENT__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ELEMENT__WIDTH = SCENE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ELEMENT__LENGTH = SCENE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ELEMENT_FEATURE_COUNT = SCENE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Position</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3d
	 * @see metaphor.dataTypes.impl.DataTypesPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 2;


	/**
	 * Returns the meta object for class '{@link metaphor.dataTypes.SceneElement <em>Scene Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene Element</em>'.
	 * @see metaphor.dataTypes.SceneElement
	 * @generated
	 */
	EClass getSceneElement();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.dataTypes.SceneElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaphor.dataTypes.SceneElement#getName()
	 * @see #getSceneElement()
	 * @generated
	 */
	EAttribute getSceneElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.dataTypes.SceneElement#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see metaphor.dataTypes.SceneElement#getColor()
	 * @see #getSceneElement()
	 * @generated
	 */
	EAttribute getSceneElement_Color();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.dataTypes.SceneElement#getRelPosition <em>Rel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Position</em>'.
	 * @see metaphor.dataTypes.SceneElement#getRelPosition()
	 * @see #getSceneElement()
	 * @generated
	 */
	EAttribute getSceneElement_RelPosition();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.dataTypes.SceneElement#getAbsPosition <em>Abs Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abs Position</em>'.
	 * @see metaphor.dataTypes.SceneElement#getAbsPosition()
	 * @see #getSceneElement()
	 * @generated
	 */
	EAttribute getSceneElement_AbsPosition();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.dataTypes.SceneElement#getSceneObject <em>Scene Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene Object</em>'.
	 * @see metaphor.dataTypes.SceneElement#getSceneObject()
	 * @see #getSceneElement()
	 * @generated
	 */
	EAttribute getSceneElement_SceneObject();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.dataTypes.SceneElement#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Object</em>'.
	 * @see metaphor.dataTypes.SceneElement#getSourceObject()
	 * @see #getSceneElement()
	 * @generated
	 */
	EAttribute getSceneElement_SourceObject();

	/**
	 * Returns the meta object for class '{@link metaphor.dataTypes.StaticElement <em>Static Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Element</em>'.
	 * @see metaphor.dataTypes.StaticElement
	 * @generated
	 */
	EClass getStaticElement();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.dataTypes.StaticElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see metaphor.dataTypes.StaticElement#getWidth()
	 * @see #getStaticElement()
	 * @generated
	 */
	EAttribute getStaticElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link metaphor.dataTypes.StaticElement#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see metaphor.dataTypes.StaticElement#getLength()
	 * @see #getStaticElement()
	 * @generated
	 */
	EAttribute getStaticElement_Length();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Vector3d <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Position</em>'.
	 * @see javax.vecmath.Vector3d
	 * @model instanceClass="javax.vecmath.Vector3d"
	 * @generated
	 */
	EDataType getPosition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypesFactory getDataTypesFactory();

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
		 * The meta object literal for the '{@link metaphor.dataTypes.impl.SceneElementImpl <em>Scene Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaphor.dataTypes.impl.SceneElementImpl
		 * @see metaphor.dataTypes.impl.DataTypesPackageImpl#getSceneElement()
		 * @generated
		 */
		EClass SCENE_ELEMENT = eINSTANCE.getSceneElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_ELEMENT__NAME = eINSTANCE.getSceneElement_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_ELEMENT__COLOR = eINSTANCE.getSceneElement_Color();

		/**
		 * The meta object literal for the '<em><b>Rel Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_ELEMENT__REL_POSITION = eINSTANCE.getSceneElement_RelPosition();

		/**
		 * The meta object literal for the '<em><b>Abs Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_ELEMENT__ABS_POSITION = eINSTANCE.getSceneElement_AbsPosition();

		/**
		 * The meta object literal for the '<em><b>Scene Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_ELEMENT__SCENE_OBJECT = eINSTANCE.getSceneElement_SceneObject();

		/**
		 * The meta object literal for the '<em><b>Source Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_ELEMENT__SOURCE_OBJECT = eINSTANCE.getSceneElement_SourceObject();

		/**
		 * The meta object literal for the '{@link metaphor.dataTypes.impl.StaticElementImpl <em>Static Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaphor.dataTypes.impl.StaticElementImpl
		 * @see metaphor.dataTypes.impl.DataTypesPackageImpl#getStaticElement()
		 * @generated
		 */
		EClass STATIC_ELEMENT = eINSTANCE.getStaticElement();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ELEMENT__WIDTH = eINSTANCE.getStaticElement_Width();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ELEMENT__LENGTH = eINSTANCE.getStaticElement_Length();

		/**
		 * The meta object literal for the '<em>Position</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3d
		 * @see metaphor.dataTypes.impl.DataTypesPackageImpl#getPosition()
		 * @generated
		 */
		EDataType POSITION = eINSTANCE.getPosition();

	}

} //DataTypesPackage
