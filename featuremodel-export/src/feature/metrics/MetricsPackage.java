/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.metrics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see feature.metrics.MetricsFactory
 * @model kind="package"
 * @generated
 */
public interface MetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.chw-thesis-WS09.de/root/metrics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "m";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsPackage eINSTANCE = feature.metrics.impl.MetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link feature.metrics.IStaticsMetric <em>IStatics Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.metrics.IStaticsMetric
	 * @see feature.metrics.impl.MetricsPackageImpl#getIStaticsMetric()
	 * @generated
	 */
	int ISTATICS_METRIC = 0;

	/**
	 * The number of structural features of the '<em>IStatics Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATICS_METRIC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link feature.metrics.IDynamicsMetric <em>IDynamics Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.metrics.IDynamicsMetric
	 * @see feature.metrics.impl.MetricsPackageImpl#getIDynamicsMetric()
	 * @generated
	 */
	int IDYNAMICS_METRIC = 1;

	/**
	 * The number of structural features of the '<em>IDynamics Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDYNAMICS_METRIC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link feature.metrics.NOAMetric <em>NOA Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.metrics.NOAMetric
	 * @see feature.metrics.impl.MetricsPackageImpl#getNOAMetric()
	 * @generated
	 */
	int NOA_METRIC = 2;

	/**
	 * The feature id for the '<em><b>Noa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOA_METRIC__NOA = ISTATICS_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NOA Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOA_METRIC_FEATURE_COUNT = ISTATICS_METRIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link feature.metrics.NOMMetric <em>NOM Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.metrics.NOMMetric
	 * @see feature.metrics.impl.MetricsPackageImpl#getNOMMetric()
	 * @generated
	 */
	int NOM_METRIC = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOM_METRIC__NOM = ISTATICS_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NOM Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOM_METRIC_FEATURE_COUNT = ISTATICS_METRIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link feature.metrics.impl.PercentDurationMetricImpl <em>Percent Duration Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.metrics.impl.PercentDurationMetricImpl
	 * @see feature.metrics.impl.MetricsPackageImpl#getPercentDurationMetric()
	 * @generated
	 */
	int PERCENT_DURATION_METRIC = 4;

	/**
	 * The feature id for the '<em><b>Dur Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENT_DURATION_METRIC__DUR_PERCENT = IDYNAMICS_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Percent Duration Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENT_DURATION_METRIC_FEATURE_COUNT = IDYNAMICS_METRIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link feature.metrics.impl.AbsoluteDurationMetricImpl <em>Absolute Duration Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.metrics.impl.AbsoluteDurationMetricImpl
	 * @see feature.metrics.impl.MetricsPackageImpl#getAbsoluteDurationMetric()
	 * @generated
	 */
	int ABSOLUTE_DURATION_METRIC = 5;

	/**
	 * The feature id for the '<em><b>Dur Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DURATION_METRIC__DUR_ABSOLUTE = IDYNAMICS_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absolute Duration Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DURATION_METRIC_FEATURE_COUNT = IDYNAMICS_METRIC_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link feature.metrics.IStaticsMetric <em>IStatics Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStatics Metric</em>'.
	 * @see feature.metrics.IStaticsMetric
	 * @generated
	 */
	EClass getIStaticsMetric();

	/**
	 * Returns the meta object for class '{@link feature.metrics.IDynamicsMetric <em>IDynamics Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDynamics Metric</em>'.
	 * @see feature.metrics.IDynamicsMetric
	 * @generated
	 */
	EClass getIDynamicsMetric();

	/**
	 * Returns the meta object for class '{@link feature.metrics.NOAMetric <em>NOA Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOA Metric</em>'.
	 * @see feature.metrics.NOAMetric
	 * @generated
	 */
	EClass getNOAMetric();

	/**
	 * Returns the meta object for the attribute '{@link feature.metrics.NOAMetric#getNoa <em>Noa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noa</em>'.
	 * @see feature.metrics.NOAMetric#getNoa()
	 * @see #getNOAMetric()
	 * @generated
	 */
	EAttribute getNOAMetric_Noa();

	/**
	 * Returns the meta object for class '{@link feature.metrics.NOMMetric <em>NOM Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOM Metric</em>'.
	 * @see feature.metrics.NOMMetric
	 * @generated
	 */
	EClass getNOMMetric();

	/**
	 * Returns the meta object for the attribute '{@link feature.metrics.NOMMetric#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see feature.metrics.NOMMetric#getNom()
	 * @see #getNOMMetric()
	 * @generated
	 */
	EAttribute getNOMMetric_Nom();

	/**
	 * Returns the meta object for class '{@link feature.metrics.PercentDurationMetric <em>Percent Duration Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percent Duration Metric</em>'.
	 * @see feature.metrics.PercentDurationMetric
	 * @generated
	 */
	EClass getPercentDurationMetric();

	/**
	 * Returns the meta object for the attribute '{@link feature.metrics.PercentDurationMetric#getDurPercent <em>Dur Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur Percent</em>'.
	 * @see feature.metrics.PercentDurationMetric#getDurPercent()
	 * @see #getPercentDurationMetric()
	 * @generated
	 */
	EAttribute getPercentDurationMetric_DurPercent();

	/**
	 * Returns the meta object for class '{@link feature.metrics.AbsoluteDurationMetric <em>Absolute Duration Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Duration Metric</em>'.
	 * @see feature.metrics.AbsoluteDurationMetric
	 * @generated
	 */
	EClass getAbsoluteDurationMetric();

	/**
	 * Returns the meta object for the attribute '{@link feature.metrics.AbsoluteDurationMetric#getDurAbsolute <em>Dur Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dur Absolute</em>'.
	 * @see feature.metrics.AbsoluteDurationMetric#getDurAbsolute()
	 * @see #getAbsoluteDurationMetric()
	 * @generated
	 */
	EAttribute getAbsoluteDurationMetric_DurAbsolute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetricsFactory getMetricsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link feature.metrics.IStaticsMetric <em>IStatics Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.metrics.IStaticsMetric
		 * @see feature.metrics.impl.MetricsPackageImpl#getIStaticsMetric()
		 * @generated
		 */
		EClass ISTATICS_METRIC = eINSTANCE.getIStaticsMetric();

		/**
		 * The meta object literal for the '{@link feature.metrics.IDynamicsMetric <em>IDynamics Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.metrics.IDynamicsMetric
		 * @see feature.metrics.impl.MetricsPackageImpl#getIDynamicsMetric()
		 * @generated
		 */
		EClass IDYNAMICS_METRIC = eINSTANCE.getIDynamicsMetric();

		/**
		 * The meta object literal for the '{@link feature.metrics.NOAMetric <em>NOA Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.metrics.NOAMetric
		 * @see feature.metrics.impl.MetricsPackageImpl#getNOAMetric()
		 * @generated
		 */
		EClass NOA_METRIC = eINSTANCE.getNOAMetric();

		/**
		 * The meta object literal for the '<em><b>Noa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOA_METRIC__NOA = eINSTANCE.getNOAMetric_Noa();

		/**
		 * The meta object literal for the '{@link feature.metrics.NOMMetric <em>NOM Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.metrics.NOMMetric
		 * @see feature.metrics.impl.MetricsPackageImpl#getNOMMetric()
		 * @generated
		 */
		EClass NOM_METRIC = eINSTANCE.getNOMMetric();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOM_METRIC__NOM = eINSTANCE.getNOMMetric_Nom();

		/**
		 * The meta object literal for the '{@link feature.metrics.impl.PercentDurationMetricImpl <em>Percent Duration Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.metrics.impl.PercentDurationMetricImpl
		 * @see feature.metrics.impl.MetricsPackageImpl#getPercentDurationMetric()
		 * @generated
		 */
		EClass PERCENT_DURATION_METRIC = eINSTANCE.getPercentDurationMetric();

		/**
		 * The meta object literal for the '<em><b>Dur Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENT_DURATION_METRIC__DUR_PERCENT = eINSTANCE.getPercentDurationMetric_DurPercent();

		/**
		 * The meta object literal for the '{@link feature.metrics.impl.AbsoluteDurationMetricImpl <em>Absolute Duration Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.metrics.impl.AbsoluteDurationMetricImpl
		 * @see feature.metrics.impl.MetricsPackageImpl#getAbsoluteDurationMetric()
		 * @generated
		 */
		EClass ABSOLUTE_DURATION_METRIC = eINSTANCE.getAbsoluteDurationMetric();

		/**
		 * The meta object literal for the '<em><b>Dur Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_DURATION_METRIC__DUR_ABSOLUTE = eINSTANCE.getAbsoluteDurationMetric_DurAbsolute();

	}

} //MetricsPackage
