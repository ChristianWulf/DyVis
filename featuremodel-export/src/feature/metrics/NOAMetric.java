/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.metrics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NOA Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.metrics.NOAMetric#getNoa <em>Noa</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.metrics.MetricsPackage#getNOAMetric()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NOAMetric extends IStaticsMetric {
	/**
	 * Returns the value of the '<em><b>Noa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noa</em>' attribute.
	 * @see #setNoa(int)
	 * @see feature.metrics.MetricsPackage#getNOAMetric_Noa()
	 * @model
	 * @generated
	 */
	int getNoa();

	/**
	 * Sets the value of the '{@link feature.metrics.NOAMetric#getNoa <em>Noa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noa</em>' attribute.
	 * @see #getNoa()
	 * @generated
	 */
	void setNoa(int value);

} // NOAMetric
