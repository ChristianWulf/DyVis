/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.metrics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see feature.metrics.MetricsPackage
 * @generated
 */
public interface MetricsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsFactory eINSTANCE = feature.metrics.impl.MetricsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Percent Duration Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Percent Duration Metric</em>'.
	 * @generated
	 */
	PercentDurationMetric createPercentDurationMetric();

	/**
	 * Returns a new object of class '<em>Absolute Duration Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Duration Metric</em>'.
	 * @generated
	 */
	AbsoluteDurationMetric createAbsoluteDurationMetric();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetricsPackage getMetricsPackage();

} //MetricsFactory
