/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.statics;

import feature.common.CodeElement;
import feature.common.IComponent;
import feature.common.IInfoElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.statics.DPackage#getChildren <em>Children</em>}</li>
 *   <li>{@link feature.statics.DPackage#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.statics.StaticsPackage#getDPackage()
 * @model
 * @generated
 */
public interface DPackage extends IComponent, CodeElement, IInfoElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link feature.common.IComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see feature.statics.StaticsPackage#getDPackage_Children()
	 * @model
	 * @generated
	 */
	EList<IComponent> getChildren();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see feature.statics.StaticsPackage#getDPackage_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link feature.statics.DPackage#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // DPackage
