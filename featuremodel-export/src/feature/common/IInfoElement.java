/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IInfo Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.common.IInfoElement#getMetaphorObject <em>Metaphor Object</em>}</li>
 *   <li>{@link feature.common.IInfoElement#getContents <em>Contents</em>}</li>
 *   <li>{@link feature.common.IInfoElement#getRowDescriptions <em>Row Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.common.CommonPackage#getIInfoElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IInfoElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Metaphor Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaphor Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaphor Object</em>' attribute.
	 * @see #setMetaphorObject(Object)
	 * @see feature.common.CommonPackage#getIInfoElement_MetaphorObject()
	 * @model
	 * @generated
	 */
	Object getMetaphorObject();

	/**
	 * Sets the value of the '{@link feature.common.IInfoElement#getMetaphorObject <em>Metaphor Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaphor Object</em>' attribute.
	 * @see #getMetaphorObject()
	 * @generated
	 */
	void setMetaphorObject(Object value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' attribute.
	 * @see #setContents(String[])
	 * @see feature.common.CommonPackage#getIInfoElement_Contents()
	 * @model dataType="feature.common.StringArray"
	 * @generated
	 */
	String[] getContents();

	/**
	 * Sets the value of the '{@link feature.common.IInfoElement#getContents <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' attribute.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(String[] value);

	/**
	 * Returns the value of the '<em><b>Row Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Descriptions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Descriptions</em>' attribute.
	 * @see #setRowDescriptions(String[])
	 * @see feature.common.CommonPackage#getIInfoElement_RowDescriptions()
	 * @model dataType="feature.common.StringArray"
	 * @generated
	 */
	String[] getRowDescriptions();

	/**
	 * Sets the value of the '{@link feature.common.IInfoElement#getRowDescriptions <em>Row Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Descriptions</em>' attribute.
	 * @see #getRowDescriptions()
	 * @generated
	 */
	void setRowDescriptions(String[] value);

} // IInfoElement
