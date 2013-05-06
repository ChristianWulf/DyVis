/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.dynamics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see feature.dynamics.DynamicsPackage
 * @generated
 */
public interface DynamicsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DynamicsFactory eINSTANCE = feature.dynamics.impl.DynamicsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DClass Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DClass Instance</em>'.
	 * @generated
	 */
	DClassInstance createDClassInstance();

	/**
	 * Returns a new object of class '<em>DMethod Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMethod Instance</em>'.
	 * @generated
	 */
	DMethodInstance createDMethodInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DynamicsPackage getDynamicsPackage();

} //DynamicsFactory
