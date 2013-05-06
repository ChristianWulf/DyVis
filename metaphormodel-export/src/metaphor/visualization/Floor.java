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
 * A representation of the model object '<em><b>Floor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metaphor.visualization.Floor#getBuilding <em>Building</em>}</li>
 *   <li>{@link metaphor.visualization.Floor#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see metaphor.visualization.VisualizationPackage#getFloor()
 * @model
 * @generated
 */
public interface Floor extends SceneElement {
	/**
	 * Returns the value of the '<em><b>Building</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaphor.visualization.Building#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building</em>' reference.
	 * @see #setBuilding(Building)
	 * @see metaphor.visualization.VisualizationPackage#getFloor_Building()
	 * @see metaphor.visualization.Building#getFloors
	 * @model opposite="floors" required="true"
	 * @generated
	 */
	Building getBuilding();

	/**
	 * Sets the value of the '{@link metaphor.visualization.Floor#getBuilding <em>Building</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building</em>' reference.
	 * @see #getBuilding()
	 * @generated
	 */
	void setBuilding(Building value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see metaphor.visualization.VisualizationPackage#getFloor_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link metaphor.visualization.Floor#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

} // Floor
