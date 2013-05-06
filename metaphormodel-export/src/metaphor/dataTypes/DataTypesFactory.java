/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.dataTypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metaphor.dataTypes.DataTypesPackage
 * @generated
 */
public interface DataTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesFactory eINSTANCE = metaphor.dataTypes.impl.DataTypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scene Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene Element</em>'.
	 * @generated
	 */
	SceneElement createSceneElement();

	/**
	 * Returns a new object of class '<em>Static Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Element</em>'.
	 * @generated
	 */
	StaticElement createStaticElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataTypesPackage getDataTypesPackage();

} //DataTypesFactory
