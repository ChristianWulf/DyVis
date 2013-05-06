/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.statics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see feature.statics.StaticsPackage
 * @generated
 */
public interface StaticsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaticsFactory eINSTANCE = feature.statics.impl.StaticsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DPackage</em>'.
	 * @generated
	 */
	DPackage createDPackage();

	/**
	 * Returns a new object of class '<em>DClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DClass</em>'.
	 * @generated
	 */
	DClass createDClass();

	/**
	 * Returns a new object of class '<em>DMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMethod</em>'.
	 * @generated
	 */
	DMethod createDMethod();

	/**
	 * Returns a new object of class '<em>DAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAttribute</em>'.
	 * @generated
	 */
	DAttribute createDAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StaticsPackage getStaticsPackage();

} //StaticsFactory
