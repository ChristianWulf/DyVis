/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.statics.impl;

import feature.statics.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticsFactoryImpl extends EFactoryImpl implements StaticsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaticsFactory init() {
		try {
			StaticsFactory theStaticsFactory = (StaticsFactory)EPackage.Registry.INSTANCE.getEFactory("www.chw-thesis-WS09.de/root/statics"); 
			if (theStaticsFactory != null) {
				return theStaticsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StaticsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StaticsPackage.DPACKAGE: return createDPackage();
			case StaticsPackage.DCLASS: return createDClass();
			case StaticsPackage.DMETHOD: return createDMethod();
			case StaticsPackage.DATTRIBUTE: return createDAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPackage createDPackage() {
		DPackageImpl dPackage = new DPackageImpl();
		return dPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DClass createDClass() {
		DClassImpl dClass = new DClassImpl();
		return dClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMethod createDMethod() {
		DMethodImpl dMethod = new DMethodImpl();
		return dMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAttribute createDAttribute() {
		DAttributeImpl dAttribute = new DAttributeImpl();
		return dAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticsPackage getStaticsPackage() {
		return (StaticsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StaticsPackage getPackage() {
		return StaticsPackage.eINSTANCE;
	}

} //StaticsFactoryImpl
