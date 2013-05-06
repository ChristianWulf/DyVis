/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.dynamics;

import feature.common.IInfoElement;
import feature.common.ITraceElement;

import feature.metrics.AbsoluteDurationMetric;
import feature.metrics.PercentDurationMetric;

import feature.statics.DMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMethod Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.dynamics.DMethodInstance#getTout <em>Tout</em>}</li>
 *   <li>{@link feature.dynamics.DMethodInstance#getCalleeId <em>Callee Id</em>}</li>
 *   <li>{@link feature.dynamics.DMethodInstance#getEss <em>Ess</em>}</li>
 *   <li>{@link feature.dynamics.DMethodInstance#getParent <em>Parent</em>}</li>
 *   <li>{@link feature.dynamics.DMethodInstance#getCallerClassInstance <em>Caller Class Instance</em>}</li>
 *   <li>{@link feature.dynamics.DMethodInstance#getCalleeClassInstance <em>Callee Class Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.dynamics.DynamicsPackage#getDMethodInstance()
 * @model
 * @generated
 */
public interface DMethodInstance extends PercentDurationMetric, AbsoluteDurationMetric, ITraceElement, IInfoElement {
	/**
	 * Returns the value of the '<em><b>Tout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tout</em>' attribute.
	 * @see #setTout(long)
	 * @see feature.dynamics.DynamicsPackage#getDMethodInstance_Tout()
	 * @model
	 * @generated
	 */
	long getTout();

	/**
	 * Sets the value of the '{@link feature.dynamics.DMethodInstance#getTout <em>Tout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tout</em>' attribute.
	 * @see #getTout()
	 * @generated
	 */
	void setTout(long value);

	/**
	 * Returns the value of the '<em><b>Callee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee Id</em>' attribute.
	 * @see #setCalleeId(Long)
	 * @see feature.dynamics.DynamicsPackage#getDMethodInstance_CalleeId()
	 * @model
	 * @generated
	 */
	Long getCalleeId();

	/**
	 * Sets the value of the '{@link feature.dynamics.DMethodInstance#getCalleeId <em>Callee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee Id</em>' attribute.
	 * @see #getCalleeId()
	 * @generated
	 */
	void setCalleeId(Long value);

	/**
	 * Returns the value of the '<em><b>Ess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ess</em>' attribute.
	 * @see #setEss(int)
	 * @see feature.dynamics.DynamicsPackage#getDMethodInstance_Ess()
	 * @model
	 * @generated
	 */
	int getEss();

	/**
	 * Sets the value of the '{@link feature.dynamics.DMethodInstance#getEss <em>Ess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ess</em>' attribute.
	 * @see #getEss()
	 * @generated
	 */
	void setEss(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link feature.statics.DMethod#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(DMethod)
	 * @see feature.dynamics.DynamicsPackage#getDMethodInstance_Parent()
	 * @see feature.statics.DMethod#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	DMethod getParent();

	/**
	 * Sets the value of the '{@link feature.dynamics.DMethodInstance#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DMethod value);

	/**
	 * Returns the value of the '<em><b>Caller Class Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller Class Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller Class Instance</em>' reference.
	 * @see #setCallerClassInstance(DClassInstance)
	 * @see feature.dynamics.DynamicsPackage#getDMethodInstance_CallerClassInstance()
	 * @model
	 * @generated
	 */
	DClassInstance getCallerClassInstance();

	/**
	 * Sets the value of the '{@link feature.dynamics.DMethodInstance#getCallerClassInstance <em>Caller Class Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller Class Instance</em>' reference.
	 * @see #getCallerClassInstance()
	 * @generated
	 */
	void setCallerClassInstance(DClassInstance value);

	/**
	 * Returns the value of the '<em><b>Callee Class Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee Class Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee Class Instance</em>' reference.
	 * @see #setCalleeClassInstance(DClassInstance)
	 * @see feature.dynamics.DynamicsPackage#getDMethodInstance_CalleeClassInstance()
	 * @model
	 * @generated
	 */
	DClassInstance getCalleeClassInstance();

	/**
	 * Sets the value of the '{@link feature.dynamics.DMethodInstance#getCalleeClassInstance <em>Callee Class Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee Class Instance</em>' reference.
	 * @see #getCalleeClassInstance()
	 * @generated
	 */
	void setCalleeClassInstance(DClassInstance value);

} // DMethodInstance
