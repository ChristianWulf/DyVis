/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.visualization;

import javax.vecmath.Vector3d;

import metaphor.dataTypes.StaticElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>District</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metaphor.visualization.District#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link metaphor.visualization.District#getContextTransformation <em>Context Transformation</em>}</li>
 *   <li>{@link metaphor.visualization.District#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see metaphor.visualization.VisualizationPackage#getDistrict()
 * @model
 * @generated
 */
public interface District extends StaticElement {
	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(float)
	 * @see metaphor.visualization.VisualizationPackage#getDistrict_Altitude()
	 * @model
	 * @generated
	 */
	float getAltitude();

	/**
	 * Sets the value of the '{@link metaphor.visualization.District#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(float value);

	/**
	 * Returns the value of the '<em><b>Context Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Transformation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Transformation</em>' attribute.
	 * @see #setContextTransformation(Vector3d)
	 * @see metaphor.visualization.VisualizationPackage#getDistrict_ContextTransformation()
	 * @model dataType="metaphor.dataTypes.Position"
	 * @generated
	 */
	Vector3d getContextTransformation();

	/**
	 * Sets the value of the '{@link metaphor.visualization.District#getContextTransformation <em>Context Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Transformation</em>' attribute.
	 * @see #getContextTransformation()
	 * @generated
	 */
	void setContextTransformation(Vector3d value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link metaphor.dataTypes.StaticElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see metaphor.visualization.VisualizationPackage#getDistrict_Children()
	 * @model
	 * @generated
	 */
	EList<StaticElement> getChildren();

} // District
