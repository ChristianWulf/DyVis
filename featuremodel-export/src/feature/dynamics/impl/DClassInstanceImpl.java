/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.dynamics.impl;

import feature.common.CommonPackage;
import feature.common.IInfoElement;

import feature.dynamics.DClassInstance;
import feature.dynamics.DynamicsPackage;
import feature.dynamics.InstanceAction;

import feature.statics.DClass;
import feature.statics.StaticsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DClass Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link feature.dynamics.impl.DClassInstanceImpl#getTin <em>Tin</em>}</li>
 *   <li>{@link feature.dynamics.impl.DClassInstanceImpl#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link feature.dynamics.impl.DClassInstanceImpl#getEoi <em>Eoi</em>}</li>
 *   <li>{@link feature.dynamics.impl.DClassInstanceImpl#getMetaphorObject <em>Metaphor Object</em>}</li>
 *   <li>{@link feature.dynamics.impl.DClassInstanceImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link feature.dynamics.impl.DClassInstanceImpl#getRowDescriptions <em>Row Descriptions</em>}</li>
 *   <li>{@link feature.dynamics.impl.DClassInstanceImpl#getAction <em>Action</em>}</li>
 *   <li>{@link feature.dynamics.impl.DClassInstanceImpl#getObjectID <em>Object ID</em>}</li>
 *   <li>{@link feature.dynamics.impl.DClassInstanceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DClassInstanceImpl extends EObjectImpl implements DClassInstance {
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
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final InstanceAction ACTION_EDEFAULT = InstanceAction.CREATE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected InstanceAction action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectID() <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectID()
	 * @generated
	 * @ordered
	 */
	protected static final Long OBJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectID() <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectID()
	 * @generated
	 * @ordered
	 */
	protected Long objectID = OBJECT_ID_EDEFAULT;

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
	protected DClassInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicsPackage.Literals.DCLASS_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DCLASS_INSTANCE__TIN, oldTin, tin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DCLASS_INSTANCE__TRACE_ID, oldTraceId, traceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DCLASS_INSTANCE__EOI, oldEoi, eoi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DCLASS_INSTANCE__METAPHOR_OBJECT, oldMetaphorObject, metaphorObject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DCLASS_INSTANCE__CONTENTS, oldContents, contents));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DCLASS_INSTANCE__ROW_DESCRIPTIONS, oldRowDescriptions, rowDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(InstanceAction newAction) {
		InstanceAction oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DCLASS_INSTANCE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getObjectID() {
		return objectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectID(Long newObjectID) {
		Long oldObjectID = objectID;
		objectID = newObjectID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DCLASS_INSTANCE__OBJECT_ID, oldObjectID, objectID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicsPackage.DCLASS_INSTANCE__PARENT, oldParent, parent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicsPackage.DCLASS_INSTANCE__PARENT, oldParent, newParent);
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
				msgs = ((InternalEObject)parent).eInverseRemove(this, StaticsPackage.DCLASS__INSTANCES, DClass.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, StaticsPackage.DCLASS__INSTANCES, DClass.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicsPackage.DCLASS_INSTANCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DynamicsPackage.DCLASS_INSTANCE__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, StaticsPackage.DCLASS__INSTANCES, DClass.class, msgs);
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
			case DynamicsPackage.DCLASS_INSTANCE__PARENT:
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
			case DynamicsPackage.DCLASS_INSTANCE__TIN:
				return getTin();
			case DynamicsPackage.DCLASS_INSTANCE__TRACE_ID:
				return getTraceId();
			case DynamicsPackage.DCLASS_INSTANCE__EOI:
				return getEoi();
			case DynamicsPackage.DCLASS_INSTANCE__METAPHOR_OBJECT:
				return getMetaphorObject();
			case DynamicsPackage.DCLASS_INSTANCE__CONTENTS:
				return getContents();
			case DynamicsPackage.DCLASS_INSTANCE__ROW_DESCRIPTIONS:
				return getRowDescriptions();
			case DynamicsPackage.DCLASS_INSTANCE__ACTION:
				return getAction();
			case DynamicsPackage.DCLASS_INSTANCE__OBJECT_ID:
				return getObjectID();
			case DynamicsPackage.DCLASS_INSTANCE__PARENT:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DynamicsPackage.DCLASS_INSTANCE__TIN:
				setTin((Long)newValue);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__TRACE_ID:
				setTraceId((Long)newValue);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__EOI:
				setEoi((Integer)newValue);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__METAPHOR_OBJECT:
				setMetaphorObject(newValue);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__CONTENTS:
				setContents((String[])newValue);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__ROW_DESCRIPTIONS:
				setRowDescriptions((String[])newValue);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__ACTION:
				setAction((InstanceAction)newValue);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__OBJECT_ID:
				setObjectID((Long)newValue);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__PARENT:
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
			case DynamicsPackage.DCLASS_INSTANCE__TIN:
				setTin(TIN_EDEFAULT);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__TRACE_ID:
				setTraceId(TRACE_ID_EDEFAULT);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__EOI:
				setEoi(EOI_EDEFAULT);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__METAPHOR_OBJECT:
				setMetaphorObject(METAPHOR_OBJECT_EDEFAULT);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__CONTENTS:
				setContents(CONTENTS_EDEFAULT);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__ROW_DESCRIPTIONS:
				setRowDescriptions(ROW_DESCRIPTIONS_EDEFAULT);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__OBJECT_ID:
				setObjectID(OBJECT_ID_EDEFAULT);
				return;
			case DynamicsPackage.DCLASS_INSTANCE__PARENT:
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
			case DynamicsPackage.DCLASS_INSTANCE__TIN:
				return tin != TIN_EDEFAULT;
			case DynamicsPackage.DCLASS_INSTANCE__TRACE_ID:
				return traceId != TRACE_ID_EDEFAULT;
			case DynamicsPackage.DCLASS_INSTANCE__EOI:
				return eoi != EOI_EDEFAULT;
			case DynamicsPackage.DCLASS_INSTANCE__METAPHOR_OBJECT:
				return METAPHOR_OBJECT_EDEFAULT == null ? metaphorObject != null : !METAPHOR_OBJECT_EDEFAULT.equals(metaphorObject);
			case DynamicsPackage.DCLASS_INSTANCE__CONTENTS:
				return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
			case DynamicsPackage.DCLASS_INSTANCE__ROW_DESCRIPTIONS:
				return ROW_DESCRIPTIONS_EDEFAULT == null ? rowDescriptions != null : !ROW_DESCRIPTIONS_EDEFAULT.equals(rowDescriptions);
			case DynamicsPackage.DCLASS_INSTANCE__ACTION:
				return action != ACTION_EDEFAULT;
			case DynamicsPackage.DCLASS_INSTANCE__OBJECT_ID:
				return OBJECT_ID_EDEFAULT == null ? objectID != null : !OBJECT_ID_EDEFAULT.equals(objectID);
			case DynamicsPackage.DCLASS_INSTANCE__PARENT:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IInfoElement.class) {
			switch (derivedFeatureID) {
				case DynamicsPackage.DCLASS_INSTANCE__METAPHOR_OBJECT: return CommonPackage.IINFO_ELEMENT__METAPHOR_OBJECT;
				case DynamicsPackage.DCLASS_INSTANCE__CONTENTS: return CommonPackage.IINFO_ELEMENT__CONTENTS;
				case DynamicsPackage.DCLASS_INSTANCE__ROW_DESCRIPTIONS: return CommonPackage.IINFO_ELEMENT__ROW_DESCRIPTIONS;
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
		if (baseClass == IInfoElement.class) {
			switch (baseFeatureID) {
				case CommonPackage.IINFO_ELEMENT__METAPHOR_OBJECT: return DynamicsPackage.DCLASS_INSTANCE__METAPHOR_OBJECT;
				case CommonPackage.IINFO_ELEMENT__CONTENTS: return DynamicsPackage.DCLASS_INSTANCE__CONTENTS;
				case CommonPackage.IINFO_ELEMENT__ROW_DESCRIPTIONS: return DynamicsPackage.DCLASS_INSTANCE__ROW_DESCRIPTIONS;
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
		result.append(" (tin: ");
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
		result.append(", action: ");
		result.append(action);
		result.append(", objectID: ");
		result.append(objectID);
		result.append(')');
		return result.toString();
	}

} //DClassInstanceImpl
