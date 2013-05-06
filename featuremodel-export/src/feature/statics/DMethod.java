/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.statics;

import feature.common.CodeElement;

import feature.dynamics.DMethodInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.statics.DMethod#getInstances <em>Instances</em>}</li>
 *   <li>{@link feature.statics.DMethod#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link feature.statics.DMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link feature.statics.DMethod#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.statics.StaticsPackage#getDMethod()
 * @model
 * @generated
 */
public interface DMethod extends CodeElement {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link feature.dynamics.DMethodInstance}.
	 * It is bidirectional and its opposite is '{@link feature.dynamics.DMethodInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see feature.statics.StaticsPackage#getDMethod_Instances()
	 * @see feature.dynamics.DMethodInstance#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<DMethodInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' attribute.
	 * @see #setReturnValue(String)
	 * @see feature.statics.StaticsPackage#getDMethod_ReturnValue()
	 * @model
	 * @generated
	 */
	String getReturnValue();

	/**
	 * Sets the value of the '{@link feature.statics.DMethod#getReturnValue <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' attribute.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link feature.statics.DAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see feature.statics.StaticsPackage#getDMethod_Parameters()
	 * @model
	 * @generated
	 */
	EList<DAttribute> getParameters();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link feature.statics.DClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(DClass)
	 * @see feature.statics.StaticsPackage#getDMethod_Parent()
	 * @see feature.statics.DClass#getMethods
	 * @model opposite="methods"
	 * @generated
	 */
	DClass getParent();

	/**
	 * Sets the value of the '{@link feature.statics.DMethod#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DClass value);

} // DMethod
