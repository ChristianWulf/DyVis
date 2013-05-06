/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.metrics.impl;

import feature.metrics.MetricsPackage;
import feature.metrics.PercentDurationMetric;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Percent Duration Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link feature.metrics.impl.PercentDurationMetricImpl#getDurPercent <em>Dur Percent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PercentDurationMetricImpl extends EObjectImpl implements PercentDurationMetric {
	/**
	 * The default value of the '{@link #getDurPercent() <em>Dur Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurPercent()
	 * @generated
	 * @ordered
	 */
	protected static final float DUR_PERCENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDurPercent() <em>Dur Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurPercent()
	 * @generated
	 * @ordered
	 */
	protected float durPercent = DUR_PERCENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PercentDurationMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.PERCENT_DURATION_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDurPercent() {
		return durPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurPercent(float newDurPercent) {
		float oldDurPercent = durPercent;
		durPercent = newDurPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.PERCENT_DURATION_METRIC__DUR_PERCENT, oldDurPercent, durPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.PERCENT_DURATION_METRIC__DUR_PERCENT:
				return getDurPercent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetricsPackage.PERCENT_DURATION_METRIC__DUR_PERCENT:
				setDurPercent((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetricsPackage.PERCENT_DURATION_METRIC__DUR_PERCENT:
				setDurPercent(DUR_PERCENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetricsPackage.PERCENT_DURATION_METRIC__DUR_PERCENT:
				return durPercent != DUR_PERCENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (durPercent: ");
		result.append(durPercent);
		result.append(')');
		return result.toString();
	}

} //PercentDurationMetricImpl
