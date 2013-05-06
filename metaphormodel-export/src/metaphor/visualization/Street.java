/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.visualization;

import metaphor.dataTypes.SceneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Street</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metaphor.visualization.Street#getCallerFloor <em>Caller Floor</em>}</li>
 *   <li>{@link metaphor.visualization.Street#getCalleeFloor <em>Callee Floor</em>}</li>
 * </ul>
 * </p>
 *
 * @see metaphor.visualization.VisualizationPackage#getStreet()
 * @model
 * @generated
 */
public interface Street extends SceneElement {
	/**
	 * Returns the value of the '<em><b>Caller Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller Floor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller Floor</em>' reference.
	 * @see #setCallerFloor(Floor)
	 * @see metaphor.visualization.VisualizationPackage#getStreet_CallerFloor()
	 * @model required="true"
	 * @generated
	 */
	Floor getCallerFloor();

	/**
	 * Sets the value of the '{@link metaphor.visualization.Street#getCallerFloor <em>Caller Floor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller Floor</em>' reference.
	 * @see #getCallerFloor()
	 * @generated
	 */
	void setCallerFloor(Floor value);

	/**
	 * Returns the value of the '<em><b>Callee Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee Floor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee Floor</em>' reference.
	 * @see #setCalleeFloor(Floor)
	 * @see metaphor.visualization.VisualizationPackage#getStreet_CalleeFloor()
	 * @model required="true"
	 * @generated
	 */
	Floor getCalleeFloor();

	/**
	 * Sets the value of the '{@link metaphor.visualization.Street#getCalleeFloor <em>Callee Floor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee Floor</em>' reference.
	 * @see #getCalleeFloor()
	 * @generated
	 */
	void setCalleeFloor(Floor value);

} // Street
