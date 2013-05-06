/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metaphor.visualization.impl;

import java.util.Collection;

import javax.vecmath.Vector3d;

import metaphor.dataTypes.StaticElement;
import metaphor.dataTypes.impl.StaticElementImpl;

import metaphor.visualization.Building;
import metaphor.visualization.District;
import metaphor.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>District</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metaphor.visualization.impl.DistrictImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link metaphor.visualization.impl.DistrictImpl#getContextTransformation <em>Context Transformation</em>}</li>
 *   <li>{@link metaphor.visualization.impl.DistrictImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistrictImpl extends StaticElementImpl implements District {
	/**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final float ALTITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected float altitude = ALTITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextTransformation() <em>Context Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextTransformation()
	 * @generated
	 * @ordered
	 */
	protected static final Vector3d CONTEXT_TRANSFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextTransformation() <em>Context Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextTransformation()
	 * @generated
	 * @ordered
	 */
	protected Vector3d contextTransformation = CONTEXT_TRANSFORMATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticElement> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistrictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.DISTRICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitude(float newAltitude) {
		float oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.DISTRICT__ALTITUDE, oldAltitude, altitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d getContextTransformation() {
		return contextTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextTransformation(Vector3d newContextTransformation) {
		Vector3d oldContextTransformation = contextTransformation;
		contextTransformation = newContextTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.DISTRICT__CONTEXT_TRANSFORMATION, oldContextTransformation, contextTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticElement> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<StaticElement>(StaticElement.class, this, VisualizationPackage.DISTRICT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.DISTRICT__ALTITUDE:
				return getAltitude();
			case VisualizationPackage.DISTRICT__CONTEXT_TRANSFORMATION:
				return getContextTransformation();
			case VisualizationPackage.DISTRICT__CHILDREN:
				return getChildren();
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
			case VisualizationPackage.DISTRICT__ALTITUDE:
				setAltitude((Float)newValue);
				return;
			case VisualizationPackage.DISTRICT__CONTEXT_TRANSFORMATION:
				setContextTransformation((Vector3d)newValue);
				return;
			case VisualizationPackage.DISTRICT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends StaticElement>)newValue);
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
			case VisualizationPackage.DISTRICT__ALTITUDE:
				setAltitude(ALTITUDE_EDEFAULT);
				return;
			case VisualizationPackage.DISTRICT__CONTEXT_TRANSFORMATION:
				setContextTransformation(CONTEXT_TRANSFORMATION_EDEFAULT);
				return;
			case VisualizationPackage.DISTRICT__CHILDREN:
				getChildren().clear();
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
			case VisualizationPackage.DISTRICT__ALTITUDE:
				return altitude != ALTITUDE_EDEFAULT;
			case VisualizationPackage.DISTRICT__CONTEXT_TRANSFORMATION:
				return CONTEXT_TRANSFORMATION_EDEFAULT == null ? contextTransformation != null : !CONTEXT_TRANSFORMATION_EDEFAULT.equals(contextTransformation);
			case VisualizationPackage.DISTRICT__CHILDREN:
				return children != null && !children.isEmpty();
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
		result.append(" (altitude: ");
		result.append(altitude);
		result.append(", contextTransformation: ");
		result.append(contextTransformation);
		result.append(')');
		return result.toString();
	}

} //DistrictImpl
