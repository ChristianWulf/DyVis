/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.visualization.impl;

import java.util.Collection;

import metaphor.dataTypes.impl.StaticElementImpl;

import metaphor.visualization.Building;
import metaphor.visualization.Floor;
import metaphor.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metaphor.visualization.impl.BuildingImpl#getTexture <em>Texture</em>}</li>
 *   <li>{@link metaphor.visualization.impl.BuildingImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link metaphor.visualization.impl.BuildingImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link metaphor.visualization.impl.BuildingImpl#getFloors <em>Floors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildingImpl extends StaticElementImpl implements Building {
	/**
	 * The default value of the '{@link #getTexture() <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexture() <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected String texture = TEXTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSPARENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected float transparency = TRANSPARENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFloors() <em>Floors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloors()
	 * @generated
	 * @ordered
	 */
	protected EList<Floor> floors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.BUILDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTexture() {
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexture(String newTexture) {
		String oldTexture = texture;
		texture = newTexture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.BUILDING__TEXTURE, oldTexture, texture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTransparency() {
		return transparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(float newTransparency) {
		float oldTransparency = transparency;
		transparency = newTransparency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.BUILDING__TRANSPARENCY, oldTransparency, transparency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.BUILDING__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Floor> getFloors() {
		if (floors == null) {
			floors = new EObjectWithInverseResolvingEList<Floor>(Floor.class, this, VisualizationPackage.BUILDING__FLOORS, VisualizationPackage.FLOOR__BUILDING);
		}
		return floors;
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
			case VisualizationPackage.BUILDING__FLOORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFloors()).basicAdd(otherEnd, msgs);
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
			case VisualizationPackage.BUILDING__FLOORS:
				return ((InternalEList<?>)getFloors()).basicRemove(otherEnd, msgs);
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
			case VisualizationPackage.BUILDING__TEXTURE:
				return getTexture();
			case VisualizationPackage.BUILDING__TRANSPARENCY:
				return getTransparency();
			case VisualizationPackage.BUILDING__HEIGHT:
				return getHeight();
			case VisualizationPackage.BUILDING__FLOORS:
				return getFloors();
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
			case VisualizationPackage.BUILDING__TEXTURE:
				setTexture((String)newValue);
				return;
			case VisualizationPackage.BUILDING__TRANSPARENCY:
				setTransparency((Float)newValue);
				return;
			case VisualizationPackage.BUILDING__HEIGHT:
				setHeight((Float)newValue);
				return;
			case VisualizationPackage.BUILDING__FLOORS:
				getFloors().clear();
				getFloors().addAll((Collection<? extends Floor>)newValue);
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
			case VisualizationPackage.BUILDING__TEXTURE:
				setTexture(TEXTURE_EDEFAULT);
				return;
			case VisualizationPackage.BUILDING__TRANSPARENCY:
				setTransparency(TRANSPARENCY_EDEFAULT);
				return;
			case VisualizationPackage.BUILDING__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case VisualizationPackage.BUILDING__FLOORS:
				getFloors().clear();
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
			case VisualizationPackage.BUILDING__TEXTURE:
				return TEXTURE_EDEFAULT == null ? texture != null : !TEXTURE_EDEFAULT.equals(texture);
			case VisualizationPackage.BUILDING__TRANSPARENCY:
				return transparency != TRANSPARENCY_EDEFAULT;
			case VisualizationPackage.BUILDING__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case VisualizationPackage.BUILDING__FLOORS:
				return floors != null && !floors.isEmpty();
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
		result.append(" (texture: ");
		result.append(texture);
		result.append(", transparency: ");
		result.append(transparency);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //BuildingImpl
