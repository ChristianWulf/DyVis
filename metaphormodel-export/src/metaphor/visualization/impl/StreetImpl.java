/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.visualization.impl;

import metaphor.dataTypes.impl.SceneElementImpl;

import metaphor.visualization.Floor;
import metaphor.visualization.Street;
import metaphor.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Street</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metaphor.visualization.impl.StreetImpl#getCallerFloor <em>Caller Floor</em>}</li>
 *   <li>{@link metaphor.visualization.impl.StreetImpl#getCalleeFloor <em>Callee Floor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreetImpl extends SceneElementImpl implements Street {
	/**
	 * The cached value of the '{@link #getCallerFloor() <em>Caller Floor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerFloor()
	 * @generated
	 * @ordered
	 */
	protected Floor callerFloor;

	/**
	 * The cached value of the '{@link #getCalleeFloor() <em>Callee Floor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalleeFloor()
	 * @generated
	 * @ordered
	 */
	protected Floor calleeFloor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.STREET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor getCallerFloor() {
		if (callerFloor != null && callerFloor.eIsProxy()) {
			InternalEObject oldCallerFloor = (InternalEObject)callerFloor;
			callerFloor = (Floor)eResolveProxy(oldCallerFloor);
			if (callerFloor != oldCallerFloor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.STREET__CALLER_FLOOR, oldCallerFloor, callerFloor));
			}
		}
		return callerFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor basicGetCallerFloor() {
		return callerFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallerFloor(Floor newCallerFloor) {
		Floor oldCallerFloor = callerFloor;
		callerFloor = newCallerFloor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.STREET__CALLER_FLOOR, oldCallerFloor, callerFloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor getCalleeFloor() {
		if (calleeFloor != null && calleeFloor.eIsProxy()) {
			InternalEObject oldCalleeFloor = (InternalEObject)calleeFloor;
			calleeFloor = (Floor)eResolveProxy(oldCalleeFloor);
			if (calleeFloor != oldCalleeFloor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.STREET__CALLEE_FLOOR, oldCalleeFloor, calleeFloor));
			}
		}
		return calleeFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor basicGetCalleeFloor() {
		return calleeFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalleeFloor(Floor newCalleeFloor) {
		Floor oldCalleeFloor = calleeFloor;
		calleeFloor = newCalleeFloor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.STREET__CALLEE_FLOOR, oldCalleeFloor, calleeFloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.STREET__CALLER_FLOOR:
				if (resolve) return getCallerFloor();
				return basicGetCallerFloor();
			case VisualizationPackage.STREET__CALLEE_FLOOR:
				if (resolve) return getCalleeFloor();
				return basicGetCalleeFloor();
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
			case VisualizationPackage.STREET__CALLER_FLOOR:
				setCallerFloor((Floor)newValue);
				return;
			case VisualizationPackage.STREET__CALLEE_FLOOR:
				setCalleeFloor((Floor)newValue);
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
			case VisualizationPackage.STREET__CALLER_FLOOR:
				setCallerFloor((Floor)null);
				return;
			case VisualizationPackage.STREET__CALLEE_FLOOR:
				setCalleeFloor((Floor)null);
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
			case VisualizationPackage.STREET__CALLER_FLOOR:
				return callerFloor != null;
			case VisualizationPackage.STREET__CALLEE_FLOOR:
				return calleeFloor != null;
		}
		return super.eIsSet(featureID);
	}

} //StreetImpl
