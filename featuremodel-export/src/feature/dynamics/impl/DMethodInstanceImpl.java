/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.dynamics.impl;

import feature.common.CommonPackage;
import feature.common.IInfoElement;
import feature.common.ITraceElement;

import feature.dynamics.DClassInstance;
import feature.dynamics.DMethodInstance;
import feature.dynamics.DynamicsPackage;

import feature.metrics.AbsoluteDurationMetric;
import feature.metrics.MetricsPackage;

import feature.metrics.impl.PercentDurationMetricImpl;

import feature.statics.DMethod;
import feature.statics.StaticsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMethod Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getDurAbsolute <em>Dur Absolute</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getTin <em>Tin</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getEoi <em>Eoi</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getMetaphorObject <em>Metaphor Object</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getRowDescriptions <em>Row Descriptions</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getTout <em>Tout</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getCalleeId <em>Callee Id</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getEss <em>Ess</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getCallerClassInstance <em>Caller Class Instance</em>}</li>
 *   <li>{@link feature.dynamics.impl.DMethodInstanceImpl#getCalleeClassInstance <em>Callee Class Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMethodInstanceImpl extends PercentDurationMetricImpl implements DMethodInstance {
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
	 * The default value of the '{@link #getTin() <em>Tin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTin()
	 * @generated
	 * @ordered
	 */
	protected static final long TIN_EDEFAULT = -1L;

	/**
	 * The cached value of the '{@link #getTin() <em>Tin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTin()
	 * @generated
	 * @ordered
	 */
	protected long tin = TIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceId() <em>Trace Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceId()
	 * @generated
	 * @ordered
	 */
	protected static final long TRACE_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTraceId() <em>Trace Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceId()
	 * @generated
	 * @ordered
	 */
	protected long traceId = TRACE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEoi() <em>Eoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEoi()
	 * @generated
	 * @ordered
	 */
	protected static final int EOI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEoi() <em>Eoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEoi()
	 * @generated
	 * @ordered
	 */
	protected int eoi = EOI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaphorObject() <em>Metaphor Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaphorObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object METAPHOR_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaphorObject() <em>Metaphor Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaphorObject()
	 * @generated
	 * @ordered
	 */
	protected Object metaphorObject = METAPHOR_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected static final String[] CONTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected String[] contents = CONTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowDescriptions() <em>Row Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final String[] ROW_DESCRIPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowDescriptions() <em>Row Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowDescriptions()
	 * @generated
	 * @ordered
	 */
	protected String[] rowDescriptions = ROW_DESCRIPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTout() <em>Tout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTout()
	 * @generated
	 * @ordered
	 */
	protected static final long TOUT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTout() <em>Tout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTout()
	 * @generated
	 * @ordered
	 */
	protected long tout = TOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalleeId() <em>Callee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalleeId()
	 * @generated
	 * @ordered
	 */
	protected static final Long CALLEE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalleeId() <em>Callee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalleeId()
	 * @generated
	 * @ordered
	 */
	protected Long calleeId = CALLEE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEss() <em>Ess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEss()
	 * @generated
	 * @ordered
	 */
	protected static final int ESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEss() <em>Ess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEss()
	 * @generated
	 * @ordered
	 */
	protected int ess = ESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected DMethod parent;

	/**
	 * The cached value of the '{@link #getCallerClassInstance() <em>Caller Class Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerClassInstance()
	 * @generated
	 * @ordered
	 */
	protected DClassInstance callerClassInstance;

	/**
	 * The cached value of the '{@link #getCalleeClassInstance() <em>Callee Class Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalleeClassInstance()
	 * @generated
	 * @ordered
	 */
	protected DClassInstance calleeClassInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMethodInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicsPackage.Literals.DMETHOD_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__DUR_ABSOLUTE, oldDurAbsolute, durAbsolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTin() {
		return tin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTin(long newTin) {
		long oldTin = tin;
		tin = newTin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__TIN, oldTin, tin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTraceId() {
		return traceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceId(long newTraceId) {
		long oldTraceId = traceId;
		traceId = newTraceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__TRACE_ID, oldTraceId, traceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEoi() {
		return eoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEoi(int newEoi) {
		int oldEoi = eoi;
		eoi = newEoi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__EOI, oldEoi, eoi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMetaphorObject() {
		return metaphorObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaphorObject(Object newMetaphorObject) {
		Object oldMetaphorObject = metaphorObject;
		metaphorObject = newMetaphorObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__METAPHOR_OBJECT, oldMetaphorObject, metaphorObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContents(String[] newContents) {
		String[] oldContents = contents;
		contents = newContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__CONTENTS, oldContents, contents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getRowDescriptions() {
		return rowDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowDescriptions(String[] newRowDescriptions) {
		String[] oldRowDescriptions = rowDescriptions;
		rowDescriptions = newRowDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__ROW_DESCRIPTIONS, oldRowDescriptions, rowDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTout() {
		return tout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTout(long newTout) {
		long oldTout = tout;
		tout = newTout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__TOUT, oldTout, tout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCalleeId() {
		return calleeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalleeId(Long newCalleeId) {
		Long oldCalleeId = calleeId;
		calleeId = newCalleeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__CALLEE_ID, oldCalleeId, calleeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEss() {
		return ess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEss(int newEss) {
		int oldEss = ess;
		ess = newEss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__ESS, oldEss, ess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMethod getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (DMethod)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicsPackage.DMETHOD_INSTANCE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMethod basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(DMethod newParent, NotificationChain msgs) {
		DMethod oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(DMethod newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, StaticsPackage.DMETHOD__INSTANCES, DMethod.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, StaticsPackage.DMETHOD__INSTANCES, DMethod.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DClassInstance getCallerClassInstance() {
		if (callerClassInstance != null && callerClassInstance.eIsProxy()) {
			InternalEObject oldCallerClassInstance = (InternalEObject)callerClassInstance;
			callerClassInstance = (DClassInstance)eResolveProxy(oldCallerClassInstance);
			if (callerClassInstance != oldCallerClassInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicsPackage.DMETHOD_INSTANCE__CALLER_CLASS_INSTANCE, oldCallerClassInstance, callerClassInstance));
			}
		}
		return callerClassInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DClassInstance basicGetCallerClassInstance() {
		return callerClassInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallerClassInstance(DClassInstance newCallerClassInstance) {
		DClassInstance oldCallerClassInstance = callerClassInstance;
		callerClassInstance = newCallerClassInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__CALLER_CLASS_INSTANCE, oldCallerClassInstance, callerClassInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DClassInstance getCalleeClassInstance() {
		if (calleeClassInstance != null && calleeClassInstance.eIsProxy()) {
			InternalEObject oldCalleeClassInstance = (InternalEObject)calleeClassInstance;
			calleeClassInstance = (DClassInstance)eResolveProxy(oldCalleeClassInstance);
			if (calleeClassInstance != oldCalleeClassInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicsPackage.DMETHOD_INSTANCE__CALLEE_CLASS_INSTANCE, oldCalleeClassInstance, calleeClassInstance));
			}
		}
		return calleeClassInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DClassInstance basicGetCalleeClassInstance() {
		return calleeClassInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalleeClassInstance(DClassInstance newCalleeClassInstance) {
		DClassInstance oldCalleeClassInstance = calleeClassInstance;
		calleeClassInstance = newCalleeClassInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DMETHOD_INSTANCE__CALLEE_CLASS_INSTANCE, oldCalleeClassInstance, calleeClassInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DynamicsPackage.DMETHOD_INSTANCE__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, StaticsPackage.DMETHOD__INSTANCES, DMethod.class, msgs);
				return basicSetParent((DMethod)otherEnd, msgs);
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
			case DynamicsPackage.DMETHOD_INSTANCE__PARENT:
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
			case DynamicsPackage.DMETHOD_INSTANCE__DUR_ABSOLUTE:
				return getDurAbsolute();
			case DynamicsPackage.DMETHOD_INSTANCE__TIN:
				return getTin();
			case DynamicsPackage.DMETHOD_INSTANCE__TRACE_ID:
				return getTraceId();
			case DynamicsPackage.DMETHOD_INSTANCE__EOI:
				return getEoi();
			case DynamicsPackage.DMETHOD_INSTANCE__METAPHOR_OBJECT:
				return getMetaphorObject();
			case DynamicsPackage.DMETHOD_INSTANCE__CONTENTS:
				return getContents();
			case DynamicsPackage.DMETHOD_INSTANCE__ROW_DESCRIPTIONS:
				return getRowDescriptions();
			case DynamicsPackage.DMETHOD_INSTANCE__TOUT:
				return getTout();
			case DynamicsPackage.DMETHOD_INSTANCE__CALLEE_ID:
				return getCalleeId();
			case DynamicsPackage.DMETHOD_INSTANCE__ESS:
				return getEss();
			case DynamicsPackage.DMETHOD_INSTANCE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DynamicsPackage.DMETHOD_INSTANCE__CALLER_CLASS_INSTANCE:
				if (resolve) return getCallerClassInstance();
				return basicGetCallerClassInstance();
			case DynamicsPackage.DMETHOD_INSTANCE__CALLEE_CLASS_INSTANCE:
				if (resolve) return getCalleeClassInstance();
				return basicGetCalleeClassInstance();
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
			case DynamicsPackage.DMETHOD_INSTANCE__DUR_ABSOLUTE:
				setDurAbsolute((Long)newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__TIN:
				setTin((Long)newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__TRACE_ID:
				setTraceId((Long)newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__EOI:
				setEoi((Integer)newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__METAPHOR_OBJECT:
				setMetaphorObject(newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__CONTENTS:
				setContents((String[])newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__ROW_DESCRIPTIONS:
				setRowDescriptions((String[])newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__TOUT:
				setTout((Long)newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__CALLEE_ID:
				setCalleeId((Long)newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__ESS:
				setEss((Integer)newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__PARENT:
				setParent((DMethod)newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__CALLER_CLASS_INSTANCE:
				setCallerClassInstance((DClassInstance)newValue);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__CALLEE_CLASS_INSTANCE:
				setCalleeClassInstance((DClassInstance)newValue);
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
			case DynamicsPackage.DMETHOD_INSTANCE__DUR_ABSOLUTE:
				setDurAbsolute(DUR_ABSOLUTE_EDEFAULT);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__TIN:
				setTin(TIN_EDEFAULT);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__TRACE_ID:
				setTraceId(TRACE_ID_EDEFAULT);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__EOI:
				setEoi(EOI_EDEFAULT);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__METAPHOR_OBJECT:
				setMetaphorObject(METAPHOR_OBJECT_EDEFAULT);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__CONTENTS:
				setContents(CONTENTS_EDEFAULT);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__ROW_DESCRIPTIONS:
				setRowDescriptions(ROW_DESCRIPTIONS_EDEFAULT);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__TOUT:
				setTout(TOUT_EDEFAULT);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__CALLEE_ID:
				setCalleeId(CALLEE_ID_EDEFAULT);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__ESS:
				setEss(ESS_EDEFAULT);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__PARENT:
				setParent((DMethod)null);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__CALLER_CLASS_INSTANCE:
				setCallerClassInstance((DClassInstance)null);
				return;
			case DynamicsPackage.DMETHOD_INSTANCE__CALLEE_CLASS_INSTANCE:
				setCalleeClassInstance((DClassInstance)null);
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
			case DynamicsPackage.DMETHOD_INSTANCE__DUR_ABSOLUTE:
				return durAbsolute != DUR_ABSOLUTE_EDEFAULT;
			case DynamicsPackage.DMETHOD_INSTANCE__TIN:
				return tin != TIN_EDEFAULT;
			case DynamicsPackage.DMETHOD_INSTANCE__TRACE_ID:
				return traceId != TRACE_ID_EDEFAULT;
			case DynamicsPackage.DMETHOD_INSTANCE__EOI:
				return eoi != EOI_EDEFAULT;
			case DynamicsPackage.DMETHOD_INSTANCE__METAPHOR_OBJECT:
				return METAPHOR_OBJECT_EDEFAULT == null ? metaphorObject != null : !METAPHOR_OBJECT_EDEFAULT.equals(metaphorObject);
			case DynamicsPackage.DMETHOD_INSTANCE__CONTENTS:
				return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
			case DynamicsPackage.DMETHOD_INSTANCE__ROW_DESCRIPTIONS:
				return ROW_DESCRIPTIONS_EDEFAULT == null ? rowDescriptions != null : !ROW_DESCRIPTIONS_EDEFAULT.equals(rowDescriptions);
			case DynamicsPackage.DMETHOD_INSTANCE__TOUT:
				return tout != TOUT_EDEFAULT;
			case DynamicsPackage.DMETHOD_INSTANCE__CALLEE_ID:
				return CALLEE_ID_EDEFAULT == null ? calleeId != null : !CALLEE_ID_EDEFAULT.equals(calleeId);
			case DynamicsPackage.DMETHOD_INSTANCE__ESS:
				return ess != ESS_EDEFAULT;
			case DynamicsPackage.DMETHOD_INSTANCE__PARENT:
				return parent != null;
			case DynamicsPackage.DMETHOD_INSTANCE__CALLER_CLASS_INSTANCE:
				return callerClassInstance != null;
			case DynamicsPackage.DMETHOD_INSTANCE__CALLEE_CLASS_INSTANCE:
				return calleeClassInstance != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbsoluteDurationMetric.class) {
			switch (derivedFeatureID) {
				case DynamicsPackage.DMETHOD_INSTANCE__DUR_ABSOLUTE: return MetricsPackage.ABSOLUTE_DURATION_METRIC__DUR_ABSOLUTE;
				default: return -1;
			}
		}
		if (baseClass == ITraceElement.class) {
			switch (derivedFeatureID) {
				case DynamicsPackage.DMETHOD_INSTANCE__TIN: return CommonPackage.ITRACE_ELEMENT__TIN;
				case DynamicsPackage.DMETHOD_INSTANCE__TRACE_ID: return CommonPackage.ITRACE_ELEMENT__TRACE_ID;
				case DynamicsPackage.DMETHOD_INSTANCE__EOI: return CommonPackage.ITRACE_ELEMENT__EOI;
				default: return -1;
			}
		}
		if (baseClass == IInfoElement.class) {
			switch (derivedFeatureID) {
				case DynamicsPackage.DMETHOD_INSTANCE__METAPHOR_OBJECT: return CommonPackage.IINFO_ELEMENT__METAPHOR_OBJECT;
				case DynamicsPackage.DMETHOD_INSTANCE__CONTENTS: return CommonPackage.IINFO_ELEMENT__CONTENTS;
				case DynamicsPackage.DMETHOD_INSTANCE__ROW_DESCRIPTIONS: return CommonPackage.IINFO_ELEMENT__ROW_DESCRIPTIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbsoluteDurationMetric.class) {
			switch (baseFeatureID) {
				case MetricsPackage.ABSOLUTE_DURATION_METRIC__DUR_ABSOLUTE: return DynamicsPackage.DMETHOD_INSTANCE__DUR_ABSOLUTE;
				default: return -1;
			}
		}
		if (baseClass == ITraceElement.class) {
			switch (baseFeatureID) {
				case CommonPackage.ITRACE_ELEMENT__TIN: return DynamicsPackage.DMETHOD_INSTANCE__TIN;
				case CommonPackage.ITRACE_ELEMENT__TRACE_ID: return DynamicsPackage.DMETHOD_INSTANCE__TRACE_ID;
				case CommonPackage.ITRACE_ELEMENT__EOI: return DynamicsPackage.DMETHOD_INSTANCE__EOI;
				default: return -1;
			}
		}
		if (baseClass == IInfoElement.class) {
			switch (baseFeatureID) {
				case CommonPackage.IINFO_ELEMENT__METAPHOR_OBJECT: return DynamicsPackage.DMETHOD_INSTANCE__METAPHOR_OBJECT;
				case CommonPackage.IINFO_ELEMENT__CONTENTS: return DynamicsPackage.DMETHOD_INSTANCE__CONTENTS;
				case CommonPackage.IINFO_ELEMENT__ROW_DESCRIPTIONS: return DynamicsPackage.DMETHOD_INSTANCE__ROW_DESCRIPTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", tin: ");
		result.append(tin);
		result.append(", traceId: ");
		result.append(traceId);
		result.append(", eoi: ");
		result.append(eoi);
		result.append(", metaphorObject: ");
		result.append(metaphorObject);
		result.append(", contents: ");
		result.append(contents);
		result.append(", rowDescriptions: ");
		result.append(rowDescriptions);
		result.append(", tout: ");
		result.append(tout);
		result.append(", calleeId: ");
		result.append(calleeId);
		result.append(", ess: ");
		result.append(ess);
		result.append(')');
		return result.toString();
	}

} //DMethodInstanceImpl
