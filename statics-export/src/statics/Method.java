/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package statics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link statics.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link statics.Method#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see statics.StaticsPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends CodeElement {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see statics.StaticsPackage#getMethod_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link statics.Method#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link statics.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see statics.StaticsPackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getParameters();

} // Method
