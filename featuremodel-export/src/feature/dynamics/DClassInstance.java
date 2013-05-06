/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.dynamics;

import feature.common.IInfoElement;
import feature.common.ITraceElement;

import feature.statics.DClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DClass Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.dynamics.DClassInstance#getAction <em>Action</em>}</li>
 *   <li>{@link feature.dynamics.DClassInstance#getObjectID <em>Object ID</em>}</li>
 *   <li>{@link feature.dynamics.DClassInstance#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.dynamics.DynamicsPackage#getDClassInstance()
 * @model
 * @generated
 */
public interface DClassInstance extends ITraceElement, IInfoElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link feature.dynamics.InstanceAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see feature.dynamics.InstanceAction
	 * @see #setAction(InstanceAction)
	 * @see feature.dynamics.DynamicsPackage#getDClassInstance_Action()
	 * @model
	 * @generated
	 */
	InstanceAction getAction();

	/**
	 * Sets the value of the '{@link feature.dynamics.DClassInstance#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see feature.dynamics.InstanceAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(InstanceAction value);

	/**
	 * Returns the value of the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object ID</em>' attribute.
	 * @see #setObjectID(Long)
	 * @see feature.dynamics.DynamicsPackage#getDClassInstance_ObjectID()
	 * @model
	 * @generated
	 */
	Long getObjectID();

	/**
	 * Sets the value of the '{@link feature.dynamics.DClassInstance#getObjectID <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object ID</em>' attribute.
	 * @see #getObjectID()
	 * @generated
	 */
	void setObjectID(Long value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link feature.statics.DClass#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(DClass)
	 * @see feature.dynamics.DynamicsPackage#getDClassInstance_Parent()
	 * @see feature.statics.DClass#getInstances
	 * @model opposite="instances" required="true"
	 * @generated
	 */
	DClass getParent();

	/**
	 * Sets the value of the '{@link feature.dynamics.DClassInstance#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DClass value);

} // DClassInstance
