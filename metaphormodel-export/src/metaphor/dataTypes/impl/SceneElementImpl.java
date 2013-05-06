/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.dataTypes.impl;

import javax.vecmath.Vector3d;

import metaphor.dataTypes.DataTypesPackage;
import metaphor.dataTypes.SceneElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metaphor.dataTypes.impl.SceneElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link metaphor.dataTypes.impl.SceneElementImpl#getColor <em>Color</em>}</li>
 *   <li>{@link metaphor.dataTypes.impl.SceneElementImpl#getRelPosition <em>Rel Position</em>}</li>
 *   <li>{@link metaphor.dataTypes.impl.SceneElementImpl#getAbsPosition <em>Abs Position</em>}</li>
 *   <li>{@link metaphor.dataTypes.impl.SceneElementImpl#getSceneObject <em>Scene Object</em>}</li>
 *   <li>{@link metaphor.dataTypes.impl.SceneElementImpl#getSourceObject <em>Source Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SceneElementImpl extends EObjectImpl implements SceneElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final int COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected int color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelPosition() <em>Rel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Vector3d REL_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelPosition() <em>Rel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelPosition()
	 * @generated
	 * @ordered
	 */
	protected Vector3d relPosition = REL_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsPosition() <em>Abs Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Vector3d ABS_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbsPosition() <em>Abs Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsPosition()
	 * @generated
	 * @ordered
	 */
	protected Vector3d absPosition = ABS_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSceneObject() <em>Scene Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCENE_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSceneObject() <em>Scene Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneObject()
	 * @generated
	 * @ordered
	 */
	protected Object sceneObject = SCENE_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceObject() <em>Source Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object SOURCE_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceObject() <em>Source Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected Object sourceObject = SOURCE_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SceneElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.SCENE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SCENE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(int newColor) {
		int oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SCENE_ELEMENT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d getRelPosition() {
		return relPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelPosition(Vector3d newRelPosition) {
		Vector3d oldRelPosition = relPosition;
		relPosition = newRelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SCENE_ELEMENT__REL_POSITION, oldRelPosition, relPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d getAbsPosition() {
		return absPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsPosition(Vector3d newAbsPosition) {
		Vector3d oldAbsPosition = absPosition;
		absPosition = newAbsPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SCENE_ELEMENT__ABS_POSITION, oldAbsPosition, absPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSceneObject() {
		return sceneObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneObject(Object newSceneObject) {
		Object oldSceneObject = sceneObject;
		sceneObject = newSceneObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SCENE_ELEMENT__SCENE_OBJECT, oldSceneObject, sceneObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSourceObject() {
		return sourceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceObject(Object newSourceObject) {
		Object oldSourceObject = sourceObject;
		sourceObject = newSourceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SCENE_ELEMENT__SOURCE_OBJECT, oldSourceObject, sourceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.SCENE_ELEMENT__NAME:
				return getName();
			case DataTypesPackage.SCENE_ELEMENT__COLOR:
				return getColor();
			case DataTypesPackage.SCENE_ELEMENT__REL_POSITION:
				return getRelPosition();
			case DataTypesPackage.SCENE_ELEMENT__ABS_POSITION:
				return getAbsPosition();
			case DataTypesPackage.SCENE_ELEMENT__SCENE_OBJECT:
				return getSceneObject();
			case DataTypesPackage.SCENE_ELEMENT__SOURCE_OBJECT:
				return getSourceObject();
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
			case DataTypesPackage.SCENE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case DataTypesPackage.SCENE_ELEMENT__COLOR:
				setColor((Integer)newValue);
				return;
			case DataTypesPackage.SCENE_ELEMENT__REL_POSITION:
				setRelPosition((Vector3d)newValue);
				return;
			case DataTypesPackage.SCENE_ELEMENT__ABS_POSITION:
				setAbsPosition((Vector3d)newValue);
				return;
			case DataTypesPackage.SCENE_ELEMENT__SCENE_OBJECT:
				setSceneObject(newValue);
				return;
			case DataTypesPackage.SCENE_ELEMENT__SOURCE_OBJECT:
				setSourceObject(newValue);
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
			case DataTypesPackage.SCENE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataTypesPackage.SCENE_ELEMENT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case DataTypesPackage.SCENE_ELEMENT__REL_POSITION:
				setRelPosition(REL_POSITION_EDEFAULT);
				return;
			case DataTypesPackage.SCENE_ELEMENT__ABS_POSITION:
				setAbsPosition(ABS_POSITION_EDEFAULT);
				return;
			case DataTypesPackage.SCENE_ELEMENT__SCENE_OBJECT:
				setSceneObject(SCENE_OBJECT_EDEFAULT);
				return;
			case DataTypesPackage.SCENE_ELEMENT__SOURCE_OBJECT:
				setSourceObject(SOURCE_OBJECT_EDEFAULT);
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
			case DataTypesPackage.SCENE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataTypesPackage.SCENE_ELEMENT__COLOR:
				return color != COLOR_EDEFAULT;
			case DataTypesPackage.SCENE_ELEMENT__REL_POSITION:
				return REL_POSITION_EDEFAULT == null ? relPosition != null : !REL_POSITION_EDEFAULT.equals(relPosition);
			case DataTypesPackage.SCENE_ELEMENT__ABS_POSITION:
				return ABS_POSITION_EDEFAULT == null ? absPosition != null : !ABS_POSITION_EDEFAULT.equals(absPosition);
			case DataTypesPackage.SCENE_ELEMENT__SCENE_OBJECT:
				return SCENE_OBJECT_EDEFAULT == null ? sceneObject != null : !SCENE_OBJECT_EDEFAULT.equals(sceneObject);
			case DataTypesPackage.SCENE_ELEMENT__SOURCE_OBJECT:
				return SOURCE_OBJECT_EDEFAULT == null ? sourceObject != null : !SOURCE_OBJECT_EDEFAULT.equals(sourceObject);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", color: ");
		result.append(color);
		result.append(", relPosition: ");
		result.append(relPosition);
		result.append(", absPosition: ");
		result.append(absPosition);
		result.append(", sceneObject: ");
		result.append(sceneObject);
		result.append(", sourceObject: ");
		result.append(sourceObject);
		result.append(')');
		return result.toString();
	}

} //SceneElementImpl
