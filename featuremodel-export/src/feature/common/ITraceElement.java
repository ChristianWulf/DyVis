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
 * A representation of the model object '<em><b>ITrace Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.common.ITraceElement#getTin <em>Tin</em>}</li>
 *   <li>{@link feature.common.ITraceElement#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link feature.common.ITraceElement#getEoi <em>Eoi</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.common.CommonPackage#getITraceElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ITraceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Tin</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tin</em>' attribute.
	 * @see #setTin(long)
	 * @see feature.common.CommonPackage#getITraceElement_Tin()
	 * @model default="-1"
	 * @generated
	 */
	long getTin();

	/**
	 * Sets the value of the '{@link feature.common.ITraceElement#getTin <em>Tin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tin</em>' attribute.
	 * @see #getTin()
	 * @generated
	 */
	void setTin(long value);

	/**
	 * Returns the value of the '<em><b>Trace Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Id</em>' attribute.
	 * @see #setTraceId(long)
	 * @see feature.common.CommonPackage#getITraceElement_TraceId()
	 * @model
	 * @generated
	 */
	long getTraceId();

	/**
	 * Sets the value of the '{@link feature.common.ITraceElement#getTraceId <em>Trace Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Id</em>' attribute.
	 * @see #getTraceId()
	 * @generated
	 */
	void setTraceId(long value);

	/**
	 * Returns the value of the '<em><b>Eoi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eoi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eoi</em>' attribute.
	 * @see #setEoi(int)
	 * @see feature.common.CommonPackage#getITraceElement_Eoi()
	 * @model
	 * @generated
	 */
	int getEoi();

	/**
	 * Sets the value of the '{@link feature.common.ITraceElement#getEoi <em>Eoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eoi</em>' attribute.
	 * @see #getEoi()
	 * @generated
	 */
	void setEoi(int value);

} // ITraceElement
