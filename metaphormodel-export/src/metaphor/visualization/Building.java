/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.visualization;

import metaphor.dataTypes.StaticElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metaphor.visualization.Building#getTexture <em>Texture</em>}</li>
 *   <li>{@link metaphor.visualization.Building#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link metaphor.visualization.Building#getHeight <em>Height</em>}</li>
 *   <li>{@link metaphor.visualization.Building#getFloors <em>Floors</em>}</li>
 * </ul>
 * </p>
 *
 * @see metaphor.visualization.VisualizationPackage#getBuilding()
 * @model
 * @generated
 */
public interface Building extends StaticElement {
	/**
	 * Returns the value of the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' attribute.
	 * @see #setTexture(String)
	 * @see metaphor.visualization.VisualizationPackage#getBuilding_Texture()
	 * @model
	 * @generated
	 */
	String getTexture();

	/**
	 * Sets the value of the '{@link metaphor.visualization.Building#getTexture <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture</em>' attribute.
	 * @see #getTexture()
	 * @generated
	 */
	void setTexture(String value);

	/**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #setTransparency(float)
	 * @see metaphor.visualization.VisualizationPackage#getBuilding_Transparency()
	 * @model
	 * @generated
	 */
	float getTransparency();

	/**
	 * Sets the value of the '{@link metaphor.visualization.Building#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #getTransparency()
	 * @generated
	 */
	void setTransparency(float value);

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
	 * @see metaphor.visualization.VisualizationPackage#getBuilding_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link metaphor.visualization.Building#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Floors</b></em>' reference list.
	 * The list contents are of type {@link metaphor.visualization.Floor}.
	 * It is bidirectional and its opposite is '{@link metaphor.visualization.Floor#getBuilding <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floors</em>' reference list.
	 * @see metaphor.visualization.VisualizationPackage#getBuilding_Floors()
	 * @see metaphor.visualization.Floor#getBuilding
	 * @model opposite="building"
	 * @generated
	 */
	EList<Floor> getFloors();

} // Building
