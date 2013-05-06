/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.metrics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NOM Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.metrics.NOMMetric#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.metrics.MetricsPackage#getNOMMetric()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NOMMetric extends IStaticsMetric {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(int)
	 * @see feature.metrics.MetricsPackage#getNOMMetric_Nom()
	 * @model
	 * @generated
	 */
	int getNom();

	/**
	 * Sets the value of the '{@link feature.metrics.NOMMetric#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(int value);

} // NOMMetric
