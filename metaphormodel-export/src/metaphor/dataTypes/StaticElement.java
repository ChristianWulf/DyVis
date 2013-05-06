/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metaphor.dataTypes.StaticElement#getWidth <em>Width</em>}</li>
 *   <li>{@link metaphor.dataTypes.StaticElement#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see metaphor.dataTypes.DataTypesPackage#getStaticElement()
 * @model
 * @generated
 */
public interface StaticElement extends SceneElement {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see metaphor.dataTypes.DataTypesPackage#getStaticElement_Width()
	 * @model default="-1"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link metaphor.dataTypes.StaticElement#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see metaphor.dataTypes.DataTypesPackage#getStaticElement_Length()
	 * @model
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link metaphor.dataTypes.StaticElement#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

} // StaticElement
