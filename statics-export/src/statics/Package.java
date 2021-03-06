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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link statics.Package#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see statics.StaticsPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends CodeElement, IStaticElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link statics.IStaticElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see statics.StaticsPackage#getPackage_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<IStaticElement> getChildren();

} // Package
