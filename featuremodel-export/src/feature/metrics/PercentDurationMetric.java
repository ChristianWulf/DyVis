/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.metrics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Percent Duration Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.metrics.PercentDurationMetric#getDurPercent <em>Dur Percent</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.metrics.MetricsPackage#getPercentDurationMetric()
 * @model
 * @generated
 */
public interface PercentDurationMetric extends IDynamicsMetric {
	/**
	 * Returns the value of the '<em><b>Dur Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dur Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dur Percent</em>' attribute.
	 * @see #setDurPercent(float)
	 * @see feature.metrics.MetricsPackage#getPercentDurationMetric_DurPercent()
	 * @model
	 * @generated
	 */
	float getDurPercent();

	/**
	 * Sets the value of the '{@link feature.metrics.PercentDurationMetric#getDurPercent <em>Dur Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dur Percent</em>' attribute.
	 * @see #getDurPercent()
	 * @generated
	 */
	void setDurPercent(float value);

} // PercentDurationMetric
