/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.metrics.util;

import feature.metrics.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see feature.metrics.MetricsPackage
 * @generated
 */
public class MetricsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetricsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsSwitch() {
		if (modelPackage == null) {
			modelPackage = MetricsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetricsPackage.ISTATICS_METRIC: {
				IStaticsMetric iStaticsMetric = (IStaticsMetric)theEObject;
				T result = caseIStaticsMetric(iStaticsMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.IDYNAMICS_METRIC: {
				IDynamicsMetric iDynamicsMetric = (IDynamicsMetric)theEObject;
				T result = caseIDynamicsMetric(iDynamicsMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.NOA_METRIC: {
				NOAMetric noaMetric = (NOAMetric)theEObject;
				T result = caseNOAMetric(noaMetric);
				if (result == null) result = caseIStaticsMetric(noaMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.NOM_METRIC: {
				NOMMetric nomMetric = (NOMMetric)theEObject;
				T result = caseNOMMetric(nomMetric);
				if (result == null) result = caseIStaticsMetric(nomMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.PERCENT_DURATION_METRIC: {
				PercentDurationMetric percentDurationMetric = (PercentDurationMetric)theEObject;
				T result = casePercentDurationMetric(percentDurationMetric);
				if (result == null) result = caseIDynamicsMetric(percentDurationMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.ABSOLUTE_DURATION_METRIC: {
				AbsoluteDurationMetric absoluteDurationMetric = (AbsoluteDurationMetric)theEObject;
				T result = caseAbsoluteDurationMetric(absoluteDurationMetric);
				if (result == null) result = caseIDynamicsMetric(absoluteDurationMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStatics Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStatics Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStaticsMetric(IStaticsMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDynamics Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDynamics Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDynamicsMetric(IDynamicsMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOA Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOA Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOAMetric(NOAMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOM Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOM Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOMMetric(NOMMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Percent Duration Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Percent Duration Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePercentDurationMetric(PercentDurationMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Duration Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Duration Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteDurationMetric(AbsoluteDurationMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //MetricsSwitch
