/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.metrics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Duration Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.metrics.AbsoluteDurationMetric#getDurAbsolute <em>Dur Absolute</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.metrics.MetricsPackage#getAbsoluteDurationMetric()
 * @model
 * @generated
 */
public interface AbsoluteDurationMetric extends IDynamicsMetric {
	/**
	 * Returns the value of the '<em><b>Dur Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dur Absolute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dur Absolute</em>' attribute.
	 * @see #setDurAbsolute(long)
	 * @see feature.metrics.MetricsPackage#getAbsoluteDurationMetric_DurAbsolute()
	 * @model
	 * @generated
	 */
	long getDurAbsolute();

	/**
	 * Sets the value of the '{@link feature.metrics.AbsoluteDurationMetric#getDurAbsolute <em>Dur Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dur Absolute</em>' attribute.
	 * @see #getDurAbsolute()
	 * @generated
	 */
	void setDurAbsolute(long value);

} // AbsoluteDurationMetric
