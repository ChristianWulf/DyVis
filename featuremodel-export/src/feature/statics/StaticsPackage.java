/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.statics;

import feature.common.CommonPackage;

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
 * @see feature.statics.StaticsFactory
 * @model kind="package"
 * @generated
 */
public interface StaticsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.chw-thesis-WS09.de/root/statics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "s";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaticsPackage eINSTANCE = feature.statics.impl.StaticsPackageImpl.init();

	/**
	 * The meta object id for the '{@link feature.statics.impl.DPackageImpl <em>DPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.statics.impl.DPackageImpl
	 * @see feature.statics.impl.StaticsPackageImpl#getDPackage()
	 * @generated
	 */
	int DPACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__FILENAME = CommonPackage.ICOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__NAME = CommonPackage.ICOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__LINE = CommonPackage.ICOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metaphor Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__METAPHOR_OBJECT = CommonPackage.ICOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__CONTENTS = CommonPackage.ICOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Row Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__ROW_DESCRIPTIONS = CommonPackage.ICOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__CHILDREN = CommonPackage.ICOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE__LEVEL = CommonPackage.ICOMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>DPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPACKAGE_FEATURE_COUNT = CommonPackage.ICOMPONENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link feature.statics.impl.DClassImpl <em>DClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.statics.impl.DClassImpl
	 * @see feature.statics.impl.StaticsPackageImpl#getDClass()
	 * @generated
	 */
	int DCLASS = 1;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__FILENAME = CommonPackage.ICOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__NAME = CommonPackage.ICOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__LINE = CommonPackage.ICOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metaphor Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__METAPHOR_OBJECT = CommonPackage.ICOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__CONTENTS = CommonPackage.ICOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Row Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__ROW_DESCRIPTIONS = CommonPackage.ICOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__NOM = CommonPackage.ICOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Noa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__NOA = CommonPackage.ICOMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__INSTANCES = CommonPackage.ICOMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__ATTRIBUTES = CommonPackage.ICOMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__METHODS = CommonPackage.ICOMPONENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>DClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_FEATURE_COUNT = CommonPackage.ICOMPONENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link feature.statics.impl.DMethodImpl <em>DMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.statics.impl.DMethodImpl
	 * @see feature.statics.impl.StaticsPackageImpl#getDMethod()
	 * @generated
	 */
	int DMETHOD = 2;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD__FILENAME = CommonPackage.CODE_ELEMENT__FILENAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD__NAME = CommonPackage.CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD__LINE = CommonPackage.CODE_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD__INSTANCES = CommonPackage.CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD__RETURN_VALUE = CommonPackage.CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD__PARAMETERS = CommonPackage.CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD__PARENT = CommonPackage.CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMETHOD_FEATURE_COUNT = CommonPackage.CODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link feature.statics.impl.DAttributeImpl <em>DAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.statics.impl.DAttributeImpl
	 * @see feature.statics.impl.StaticsPackageImpl#getDAttribute()
	 * @generated
	 */
	int DATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__FILENAME = CommonPackage.CODE_ELEMENT__FILENAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__NAME = CommonPackage.CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__LINE = CommonPackage.CODE_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__TYPE = CommonPackage.CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__VALUE = CommonPackage.CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE_FEATURE_COUNT = CommonPackage.CODE_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link feature.statics.DPackage <em>DPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPackage</em>'.
	 * @see feature.statics.DPackage
	 * @generated
	 */
	EClass getDPackage();

	/**
	 * Returns the meta object for the reference list '{@link feature.statics.DPackage#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see feature.statics.DPackage#getChildren()
	 * @see #getDPackage()
	 * @generated
	 */
	EReference getDPackage_Children();

	/**
	 * Returns the meta object for the attribute '{@link feature.statics.DPackage#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see feature.statics.DPackage#getLevel()
	 * @see #getDPackage()
	 * @generated
	 */
	EAttribute getDPackage_Level();

	/**
	 * Returns the meta object for class '{@link feature.statics.DClass <em>DClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DClass</em>'.
	 * @see feature.statics.DClass
	 * @generated
	 */
	EClass getDClass();

	/**
	 * Returns the meta object for the reference list '{@link feature.statics.DClass#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see feature.statics.DClass#getInstances()
	 * @see #getDClass()
	 * @generated
	 */
	EReference getDClass_Instances();

	/**
	 * Returns the meta object for the reference list '{@link feature.statics.DClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see feature.statics.DClass#getAttributes()
	 * @see #getDClass()
	 * @generated
	 */
	EReference getDClass_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link feature.statics.DClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Methods</em>'.
	 * @see feature.statics.DClass#getMethods()
	 * @see #getDClass()
	 * @generated
	 */
	EReference getDClass_Methods();

	/**
	 * Returns the meta object for class '{@link feature.statics.DMethod <em>DMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMethod</em>'.
	 * @see feature.statics.DMethod
	 * @generated
	 */
	EClass getDMethod();

	/**
	 * Returns the meta object for the reference list '{@link feature.statics.DMethod#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see feature.statics.DMethod#getInstances()
	 * @see #getDMethod()
	 * @generated
	 */
	EReference getDMethod_Instances();

	/**
	 * Returns the meta object for the attribute '{@link feature.statics.DMethod#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Value</em>'.
	 * @see feature.statics.DMethod#getReturnValue()
	 * @see #getDMethod()
	 * @generated
	 */
	EAttribute getDMethod_ReturnValue();

	/**
	 * Returns the meta object for the reference list '{@link feature.statics.DMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see feature.statics.DMethod#getParameters()
	 * @see #getDMethod()
	 * @generated
	 */
	EReference getDMethod_Parameters();

	/**
	 * Returns the meta object for the reference '{@link feature.statics.DMethod#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see feature.statics.DMethod#getParent()
	 * @see #getDMethod()
	 * @generated
	 */
	EReference getDMethod_Parent();

	/**
	 * Returns the meta object for class '{@link feature.statics.DAttribute <em>DAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAttribute</em>'.
	 * @see feature.statics.DAttribute
	 * @generated
	 */
	EClass getDAttribute();

	/**
	 * Returns the meta object for the attribute '{@link feature.statics.DAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see feature.statics.DAttribute#getType()
	 * @see #getDAttribute()
	 * @generated
	 */
	EAttribute getDAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link feature.statics.DAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see feature.statics.DAttribute#getValue()
	 * @see #getDAttribute()
	 * @generated
	 */
	EAttribute getDAttribute_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StaticsFactory getStaticsFactory();

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
		 * The meta object literal for the '{@link feature.statics.impl.DPackageImpl <em>DPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.statics.impl.DPackageImpl
		 * @see feature.statics.impl.StaticsPackageImpl#getDPackage()
		 * @generated
		 */
		EClass DPACKAGE = eINSTANCE.getDPackage();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPACKAGE__CHILDREN = eINSTANCE.getDPackage_Children();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPACKAGE__LEVEL = eINSTANCE.getDPackage_Level();

		/**
		 * The meta object literal for the '{@link feature.statics.impl.DClassImpl <em>DClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.statics.impl.DClassImpl
		 * @see feature.statics.impl.StaticsPackageImpl#getDClass()
		 * @generated
		 */
		EClass DCLASS = eINSTANCE.getDClass();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCLASS__INSTANCES = eINSTANCE.getDClass_Instances();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCLASS__ATTRIBUTES = eINSTANCE.getDClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCLASS__METHODS = eINSTANCE.getDClass_Methods();

		/**
		 * The meta object literal for the '{@link feature.statics.impl.DMethodImpl <em>DMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.statics.impl.DMethodImpl
		 * @see feature.statics.impl.StaticsPackageImpl#getDMethod()
		 * @generated
		 */
		EClass DMETHOD = eINSTANCE.getDMethod();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMETHOD__INSTANCES = eINSTANCE.getDMethod_Instances();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMETHOD__RETURN_VALUE = eINSTANCE.getDMethod_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMETHOD__PARAMETERS = eINSTANCE.getDMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMETHOD__PARENT = eINSTANCE.getDMethod_Parent();

		/**
		 * The meta object literal for the '{@link feature.statics.impl.DAttributeImpl <em>DAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.statics.impl.DAttributeImpl
		 * @see feature.statics.impl.StaticsPackageImpl#getDAttribute()
		 * @generated
		 */
		EClass DATTRIBUTE = eINSTANCE.getDAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATTRIBUTE__TYPE = eINSTANCE.getDAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATTRIBUTE__VALUE = eINSTANCE.getDAttribute_Value();

	}

} //StaticsPackage
