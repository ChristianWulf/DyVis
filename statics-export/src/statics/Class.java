/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package statics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link statics.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link statics.Class#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see statics.StaticsPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends CodeElement, IStaticElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link statics.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see statics.StaticsPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link statics.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see statics.StaticsPackage#getClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

} // Class
