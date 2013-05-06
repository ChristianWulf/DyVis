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

import feature.dynamics.DClassInstance;

import feature.metrics.NOAMetric;
import feature.metrics.NOMMetric;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.statics.DClass#getInstances <em>Instances</em>}</li>
 *   <li>{@link feature.statics.DClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link feature.statics.DClass#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.statics.StaticsPackage#getDClass()
 * @model
 * @generated
 */
public interface DClass extends IComponent, CodeElement, IInfoElement, NOMMetric, NOAMetric {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link feature.dynamics.DClassInstance}.
	 * It is bidirectional and its opposite is '{@link feature.dynamics.DClassInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see feature.statics.StaticsPackage#getDClass_Instances()
	 * @see feature.dynamics.DClassInstance#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<DClassInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link feature.statics.DAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see feature.statics.StaticsPackage#getDClass_Attributes()
	 * @model
	 * @generated
	 */
	EList<DAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link feature.statics.DMethod}.
	 * It is bidirectional and its opposite is '{@link feature.statics.DMethod#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see feature.statics.StaticsPackage#getDClass_Methods()
	 * @see feature.statics.DMethod#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<DMethod> getMethods();

} // DClass
