/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.metrics.impl;

import feature.metrics.AbsoluteDurationMetric;
import feature.metrics.MetricsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Absolute Duration Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link feature.metrics.impl.AbsoluteDurationMetricImpl#getDurAbsolute <em>Dur Absolute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbsoluteDurationMetricImpl extends EObjectImpl implements AbsoluteDurationMetric {
	/**
	 * The default value of the '{@link #getDurAbsolute() <em>Dur Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final long DUR_ABSOLUTE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDurAbsolute() <em>Dur Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurAbsolute()
	 * @generated
	 * @ordered
	 */
	protected long durAbsolute = DUR_ABSOLUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsoluteDurationMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.ABSOLUTE_DURATION_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDurAbsolute() {
		return durAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurAbsolute(long newDurAbsolute) {
		long oldDurAbsolute = durAbsolute;
		durAbsolute = newDurAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.ABSOLUTE_DURATION_METRIC__DUR_ABSOLUTE, oldDurAbsolute, durAbsolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.ABSOLUTE_DURATION_METRIC__DUR_ABSOLUTE:
				return getDurAbsolute();
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
			case MetricsPackage.ABSOLUTE_DURATION_METRIC__DUR_ABSOLUTE:
				setDurAbsolute((Long)newValue);
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
			case MetricsPackage.ABSOLUTE_DURATION_METRIC__DUR_ABSOLUTE:
				setDurAbsolute(DUR_ABSOLUTE_EDEFAULT);
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
			case MetricsPackage.ABSOLUTE_DURATION_METRIC__DUR_ABSOLUTE:
				return durAbsolute != DUR_ABSOLUTE_EDEFAULT;
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
		result.append(" (durAbsolute: ");
		result.append(durAbsolute);
		result.append(')');
		return result.toString();
	}

} //AbsoluteDurationMetricImpl
