/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.common;

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
 * @see feature.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.chw-thesis-WS09.de/root/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "c";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = feature.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link feature.common.ITraceElement <em>ITrace Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.common.ITraceElement
	 * @see feature.common.impl.CommonPackageImpl#getITraceElement()
	 * @generated
	 */
	int ITRACE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Tin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRACE_ELEMENT__TIN = 0;

	/**
	 * The feature id for the '<em><b>Trace Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRACE_ELEMENT__TRACE_ID = 1;

	/**
	 * The feature id for the '<em><b>Eoi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRACE_ELEMENT__EOI = 2;

	/**
	 * The number of structural features of the '<em>ITrace Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITRACE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link feature.common.IComponent <em>IComponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.common.IComponent
	 * @see feature.common.impl.CommonPackageImpl#getIComponent()
	 * @generated
	 */
	int ICOMPONENT = 1;

	/**
	 * The number of structural features of the '<em>IComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMPONENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link feature.common.IInfoElement <em>IInfo Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.common.IInfoElement
	 * @see feature.common.impl.CommonPackageImpl#getIInfoElement()
	 * @generated
	 */
	int IINFO_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Metaphor Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINFO_ELEMENT__METAPHOR_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINFO_ELEMENT__CONTENTS = 1;

	/**
	 * The feature id for the '<em><b>Row Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINFO_ELEMENT__ROW_DESCRIPTIONS = 2;

	/**
	 * The number of structural features of the '<em>IInfo Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINFO_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link feature.common.impl.CodeElementImpl <em>Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.common.impl.CodeElementImpl
	 * @see feature.common.impl.CommonPackageImpl#getCodeElement()
	 * @generated
	 */
	int CODE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__FILENAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__LINE = 2;

	/**
	 * The number of structural features of the '<em>Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '<em>String Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.common.impl.CommonPackageImpl#getStringArray()
	 * @generated
	 */
	int STRING_ARRAY = 4;


	/**
	 * Returns the meta object for class '{@link feature.common.ITraceElement <em>ITrace Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITrace Element</em>'.
	 * @see feature.common.ITraceElement
	 * @generated
	 */
	EClass getITraceElement();

	/**
	 * Returns the meta object for the attribute '{@link feature.common.ITraceElement#getTin <em>Tin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tin</em>'.
	 * @see feature.common.ITraceElement#getTin()
	 * @see #getITraceElement()
	 * @generated
	 */
	EAttribute getITraceElement_Tin();

	/**
	 * Returns the meta object for the attribute '{@link feature.common.ITraceElement#getTraceId <em>Trace Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Id</em>'.
	 * @see feature.common.ITraceElement#getTraceId()
	 * @see #getITraceElement()
	 * @generated
	 */
	EAttribute getITraceElement_TraceId();

	/**
	 * Returns the meta object for the attribute '{@link feature.common.ITraceElement#getEoi <em>Eoi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eoi</em>'.
	 * @see feature.common.ITraceElement#getEoi()
	 * @see #getITraceElement()
	 * @generated
	 */
	EAttribute getITraceElement_Eoi();

	/**
	 * Returns the meta object for class '{@link feature.common.IComponent <em>IComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IComponent</em>'.
	 * @see feature.common.IComponent
	 * @generated
	 */
	EClass getIComponent();

	/**
	 * Returns the meta object for class '{@link feature.common.IInfoElement <em>IInfo Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IInfo Element</em>'.
	 * @see feature.common.IInfoElement
	 * @generated
	 */
	EClass getIInfoElement();

	/**
	 * Returns the meta object for the attribute '{@link feature.common.IInfoElement#getMetaphorObject <em>Metaphor Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metaphor Object</em>'.
	 * @see feature.common.IInfoElement#getMetaphorObject()
	 * @see #getIInfoElement()
	 * @generated
	 */
	EAttribute getIInfoElement_MetaphorObject();

	/**
	 * Returns the meta object for the attribute '{@link feature.common.IInfoElement#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see feature.common.IInfoElement#getContents()
	 * @see #getIInfoElement()
	 * @generated
	 */
	EAttribute getIInfoElement_Contents();

	/**
	 * Returns the meta object for the attribute '{@link feature.common.IInfoElement#getRowDescriptions <em>Row Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Descriptions</em>'.
	 * @see feature.common.IInfoElement#getRowDescriptions()
	 * @see #getIInfoElement()
	 * @generated
	 */
	EAttribute getIInfoElement_RowDescriptions();

	/**
	 * Returns the meta object for class '{@link feature.common.CodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Element</em>'.
	 * @see feature.common.CodeElement
	 * @generated
	 */
	EClass getCodeElement();

	/**
	 * Returns the meta object for the attribute '{@link feature.common.CodeElement#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see feature.common.CodeElement#getFilename()
	 * @see #getCodeElement()
	 * @generated
	 */
	EAttribute getCodeElement_Filename();

	/**
	 * Returns the meta object for the attribute '{@link feature.common.CodeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see feature.common.CodeElement#getName()
	 * @see #getCodeElement()
	 * @generated
	 */
	EAttribute getCodeElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link feature.common.CodeElement#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see feature.common.CodeElement#getLine()
	 * @see #getCodeElement()
	 * @generated
	 */
	EAttribute getCodeElement_Line();

	/**
	 * Returns the meta object for data type '<em>String Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Array</em>'.
	 * @model instanceClass="java.lang.String[]"
	 * @generated
	 */
	EDataType getStringArray();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link feature.common.ITraceElement <em>ITrace Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.common.ITraceElement
		 * @see feature.common.impl.CommonPackageImpl#getITraceElement()
		 * @generated
		 */
		EClass ITRACE_ELEMENT = eINSTANCE.getITraceElement();

		/**
		 * The meta object literal for the '<em><b>Tin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITRACE_ELEMENT__TIN = eINSTANCE.getITraceElement_Tin();

		/**
		 * The meta object literal for the '<em><b>Trace Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITRACE_ELEMENT__TRACE_ID = eINSTANCE.getITraceElement_TraceId();

		/**
		 * The meta object literal for the '<em><b>Eoi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITRACE_ELEMENT__EOI = eINSTANCE.getITraceElement_Eoi();

		/**
		 * The meta object literal for the '{@link feature.common.IComponent <em>IComponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.common.IComponent
		 * @see feature.common.impl.CommonPackageImpl#getIComponent()
		 * @generated
		 */
		EClass ICOMPONENT = eINSTANCE.getIComponent();

		/**
		 * The meta object literal for the '{@link feature.common.IInfoElement <em>IInfo Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.common.IInfoElement
		 * @see feature.common.impl.CommonPackageImpl#getIInfoElement()
		 * @generated
		 */
		EClass IINFO_ELEMENT = eINSTANCE.getIInfoElement();

		/**
		 * The meta object literal for the '<em><b>Metaphor Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IINFO_ELEMENT__METAPHOR_OBJECT = eINSTANCE.getIInfoElement_MetaphorObject();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IINFO_ELEMENT__CONTENTS = eINSTANCE.getIInfoElement_Contents();

		/**
		 * The meta object literal for the '<em><b>Row Descriptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IINFO_ELEMENT__ROW_DESCRIPTIONS = eINSTANCE.getIInfoElement_RowDescriptions();

		/**
		 * The meta object literal for the '{@link feature.common.impl.CodeElementImpl <em>Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.common.impl.CodeElementImpl
		 * @see feature.common.impl.CommonPackageImpl#getCodeElement()
		 * @generated
		 */
		EClass CODE_ELEMENT = eINSTANCE.getCodeElement();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_ELEMENT__FILENAME = eINSTANCE.getCodeElement_Filename();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_ELEMENT__NAME = eINSTANCE.getCodeElement_Name();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_ELEMENT__LINE = eINSTANCE.getCodeElement_Line();

		/**
		 * The meta object literal for the '<em>String Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.common.impl.CommonPackageImpl#getStringArray()
		 * @generated
		 */
		EDataType STRING_ARRAY = eINSTANCE.getStringArray();

	}

} //CommonPackage
