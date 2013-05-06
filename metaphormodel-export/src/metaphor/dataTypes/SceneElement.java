/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.dataTypes;

import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metaphor.dataTypes.SceneElement#getName <em>Name</em>}</li>
 *   <li>{@link metaphor.dataTypes.SceneElement#getColor <em>Color</em>}</li>
 *   <li>{@link metaphor.dataTypes.SceneElement#getRelPosition <em>Rel Position</em>}</li>
 *   <li>{@link metaphor.dataTypes.SceneElement#getAbsPosition <em>Abs Position</em>}</li>
 *   <li>{@link metaphor.dataTypes.SceneElement#getSceneObject <em>Scene Object</em>}</li>
 *   <li>{@link metaphor.dataTypes.SceneElement#getSourceObject <em>Source Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see metaphor.dataTypes.DataTypesPackage#getSceneElement()
 * @model
 * @generated
 */
public interface SceneElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metaphor.dataTypes.DataTypesPackage#getSceneElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metaphor.dataTypes.SceneElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(int)
	 * @see metaphor.dataTypes.DataTypesPackage#getSceneElement_Color()
	 * @model
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link metaphor.dataTypes.SceneElement#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

	/**
	 * Returns the value of the '<em><b>Rel Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Position</em>' attribute.
	 * @see #setRelPosition(Vector3d)
	 * @see metaphor.dataTypes.DataTypesPackage#getSceneElement_RelPosition()
	 * @model dataType="metaphor.dataTypes.Position"
	 * @generated
	 */
	Vector3d getRelPosition();

	/**
	 * Sets the value of the '{@link metaphor.dataTypes.SceneElement#getRelPosition <em>Rel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Position</em>' attribute.
	 * @see #getRelPosition()
	 * @generated
	 */
	void setRelPosition(Vector3d value);

	/**
	 * Returns the value of the '<em><b>Abs Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abs Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs Position</em>' attribute.
	 * @see #setAbsPosition(Vector3d)
	 * @see metaphor.dataTypes.DataTypesPackage#getSceneElement_AbsPosition()
	 * @model dataType="metaphor.dataTypes.Position"
	 * @generated
	 */
	Vector3d getAbsPosition();

	/**
	 * Sets the value of the '{@link metaphor.dataTypes.SceneElement#getAbsPosition <em>Abs Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs Position</em>' attribute.
	 * @see #getAbsPosition()
	 * @generated
	 */
	void setAbsPosition(Vector3d value);

	/**
	 * Returns the value of the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene Object</em>' attribute.
	 * @see #setSceneObject(Object)
	 * @see metaphor.dataTypes.DataTypesPackage#getSceneElement_SceneObject()
	 * @model
	 * @generated
	 */
	Object getSceneObject();

	/**
	 * Sets the value of the '{@link metaphor.dataTypes.SceneElement#getSceneObject <em>Scene Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene Object</em>' attribute.
	 * @see #getSceneObject()
	 * @generated
	 */
	void setSceneObject(Object value);

	/**
	 * Returns the value of the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Object</em>' attribute.
	 * @see #setSourceObject(Object)
	 * @see metaphor.dataTypes.DataTypesPackage#getSceneElement_SourceObject()
	 * @model
	 * @generated
	 */
	Object getSourceObject();

	/**
	 * Sets the value of the '{@link metaphor.dataTypes.SceneElement#getSourceObject <em>Source Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Object</em>' attribute.
	 * @see #getSourceObject()
	 * @generated
	 */
	void setSourceObject(Object value);

} // SceneElement
