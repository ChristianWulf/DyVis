/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.statics.impl;

import feature.common.impl.CodeElementImpl;

import feature.dynamics.DMethodInstance;
import feature.dynamics.DynamicsPackage;

import feature.statics.DAttribute;
import feature.statics.DClass;
import feature.statics.DMethod;
import feature.statics.StaticsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link feature.statics.impl.DMethodImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link feature.statics.impl.DMethodImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link feature.statics.impl.DMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link feature.statics.impl.DMethodImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMethodImpl extends CodeElementImpl implements DMethod {
	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DMethodInstance> instances;

	/**
	 * The default value of the '{@link #getReturnValue() <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected String returnValue = RETURN_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DAttribute> parameters;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected DClass parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticsPackage.Literals.DMETHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMethodInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<DMethodInstance>(DMethodInstance.class, this, StaticsPackage.DMETHOD__INSTANCES, DynamicsPackage.DMETHOD_INSTANCE__PARENT);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(String newReturnValue) {
		String oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DMETHOD__RETURN_VALUE, oldReturnValue, returnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAttribute> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<DAttribute>(DAttribute.class, this, StaticsPackage.DMETHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DClass getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (DClass)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticsPackage.DMETHOD__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DClass basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(DClass newParent, NotificationChain msgs) {
		DClass oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StaticsPackage.DMETHOD__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(DClass newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, StaticsPackage.DCLASS__METHODS, DClass.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, StaticsPackage.DCLASS__METHODS, DClass.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DMETHOD__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticsPackage.DMETHOD__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
			case StaticsPackage.DMETHOD__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, StaticsPackage.DCLASS__METHODS, DClass.class, msgs);
				return basicSetParent((DClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticsPackage.DMETHOD__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case StaticsPackage.DMETHOD__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticsPackage.DMETHOD__INSTANCES:
				return getInstances();
			case StaticsPackage.DMETHOD__RETURN_VALUE:
				return getReturnValue();
			case StaticsPackage.DMETHOD__PARAMETERS:
				return getParameters();
			case StaticsPackage.DMETHOD__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StaticsPackage.DMETHOD__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends DMethodInstance>)newValue);
				return;
			case StaticsPackage.DMETHOD__RETURN_VALUE:
				setReturnValue((String)newValue);
				return;
			case StaticsPackage.DMETHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DAttribute>)newValue);
				return;
			case StaticsPackage.DMETHOD__PARENT:
				setParent((DClass)newValue);
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
			case StaticsPackage.DMETHOD__INSTANCES:
				getInstances().clear();
				return;
			case StaticsPackage.DMETHOD__RETURN_VALUE:
				setReturnValue(RETURN_VALUE_EDEFAULT);
				return;
			case StaticsPackage.DMETHOD__PARAMETERS:
				getParameters().clear();
				return;
			case StaticsPackage.DMETHOD__PARENT:
				setParent((DClass)null);
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
			case StaticsPackage.DMETHOD__INSTANCES:
				return instances != null && !instances.isEmpty();
			case StaticsPackage.DMETHOD__RETURN_VALUE:
				return RETURN_VALUE_EDEFAULT == null ? returnValue != null : !RETURN_VALUE_EDEFAULT.equals(returnValue);
			case StaticsPackage.DMETHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StaticsPackage.DMETHOD__PARENT:
				return parent != null;
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
		result.append(" (returnValue: ");
		result.append(returnValue);
		result.append(')');
		return result.toString();
	}

} //DMethodImpl
