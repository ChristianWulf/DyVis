package cau.se.chw.importers;

import java.util.logging.Logger;

import kieker.common.logReader.IKiekerRecordConsumer;
import kieker.common.logReader.LogReaderExecutionException;
import kieker.common.logReader.RecordConsumerExecutionException;
import kieker.common.logReader.filesystemReader.FSMergeReader;
import kieker.tpan.TpanInstance;
import kieker.tpmon.monitoringRecord.AbstractKiekerMonitoringRecord;
import cau.se.chw.model.IFeatureModel;
import cau.se.chw.probes.records.DyVisExecutionRecord;
import cau.se.chw.probes.records.DyVisObjectRecord;
import cau.se.chw.probes.records.DyVisObjectRecord.ObjectAction;
import feature.dynamics.DClassInstance;
import feature.dynamics.DMethodInstance;
import feature.dynamics.DynamicsFactory;
import feature.dynamics.InstanceAction;
import feature.dynamics.impl.DynamicsFactoryImpl;
import feature.dynamics.impl.DynamicsPackageImpl;
import feature.statics.DClass;
import feature.statics.DMethod;

public class KiekerImporter implements IDynamicsImporter, IKiekerRecordConsumer {

	private final static Logger logger = Logger.getLogger(KiekerImporter.class.getName());
	private final IFeatureModel featureModel;
	/**
	 * This boolean prevents from notifying the feature model more than once
	 * after termination.<br>
	 * <i>(Reader is invoked once per record type.)</i>
	 */
	private boolean terminated;
	private final DynamicsFactory factory;
	// private AbstractKiekerMonitoringLogReader reader = new FSMergeReader();
	private final TpanInstance analysisInstance = new TpanInstance();

	/**
	 * Constructs a new instance of {@link KiekerImporter}.
	 * 
	 * @param featureModel
	 */
	public KiekerImporter(IFeatureModel featureModel) {
		this.featureModel = featureModel;
		DynamicsPackageImpl.init();
		factory = DynamicsFactoryImpl.eINSTANCE;

		enableLogReading();
	}

	private void enableLogReading() {
		// System.setProperty("tpmon.configuration","META-INF/tpmon.properties");
		// analysisInstance.setLogReader(reader);
		analysisInstance.addRecordConsumer(this);
	}

	@Override
	public void consumeMonitoringRecord(AbstractKiekerMonitoringRecord monitoringRecord)
			throws RecordConsumerExecutionException {
		if (monitoringRecord instanceof DyVisExecutionRecord) {
			DyVisExecutionRecord record = (DyVisExecutionRecord) monitoringRecord;
			addToFeatureModel(record);
		} else if (monitoringRecord instanceof DyVisObjectRecord) {
			DyVisObjectRecord record = (DyVisObjectRecord) monitoringRecord;
			addToFeatureModel(record);
		}
		logger.info(monitoringRecord.toString());
	}

	private void addToFeatureModel(DyVisExecutionRecord record) {
		// DClass caller = featureModel.getDClass(record.callerComponentName);
		DClass callee = featureModel.getDClass(record.calleeComponentName);

		if (null == callee) {
			throw new IllegalStateException("The static model must contain the class: "
					+ record.calleeComponentName);
		}

		DMethod parent = getParentMethod(record, callee);

		DMethodInstance methodInstance = factory.createDMethodInstance();
		methodInstance.setEoi(record.eoi);
		methodInstance.setEss(record.ess);
		methodInstance.setTin(record.tin);
		methodInstance.setTout(record.tout);
		methodInstance.setTraceId(record.traceId);
		methodInstance.setParent(parent);
		methodInstance.setCalleeId(record.calleeId);
		// callee link
		methodInstance.setCalleeClassInstance(callee.getInstances().get(0));

		featureModel.addMethodInstance(methodInstance);
	}

	private void addToFeatureModel(DyVisObjectRecord record) {
		DClass parent = featureModel.getDClass(record.componentName);

		if (null == parent) {
			// throw new
			// IllegalStateException("The static model must contain the class: "
			// + record.componentName);
			return;
		}

		DClassInstance classInstance = factory.createDClassInstance();
		classInstance.setAction(getCompatibleAction(record.action));
		classInstance.setTin(record.actionTime);
		classInstance.setObjectID(record.objectId);
		classInstance.setParent(parent);

		// writer.write(classInstance);
		featureModel.addClassInstance(classInstance);
	}

	private DMethod getParentMethod(DyVisExecutionRecord record, DClass callee) {
		// TODO what's up with overloaded methods?
		return featureModel.getDMethod(callee, record.methodName);
	}

	private InstanceAction getCompatibleAction(ObjectAction action) {
		switch (action) {
		case CREATE:
			return InstanceAction.CREATE;
		case DESTROY:
			return InstanceAction.DESTROY;
		default:
			logger.warning("Unhandled branch: " + action);
			return null;
		}
	}

	@Override
	public boolean execute() throws RecordConsumerExecutionException {
		terminated = false;
		return true;
	}

	@Override
	public String[] getRecordTypeSubscriptionList() {
		return new String[] { DyVisExecutionRecord.class.getName(),
				DyVisObjectRecord.class.getName() };
	}

	@Override
	public void terminate() {
		if (!terminated) {
			if (featureModel.getAllTraceIds().size() == 0) {
				// TODO close loading dialog
				logger.warning("Incompatible or no records loaded.");
			} else {
				featureModel.setDynamicsLoaded();
			}
			terminated = true;
		}
	}

	@Override
	public void loadFromFile(String absolutePath) throws ImportExeption {
		featureModel.clearDynamics();

		FSMergeReader reader = new FSMergeReader();
		reader.init(FSMergeReader.PROP_NAME_INPUTDIRS + "=" + absolutePath);

		analysisInstance.setLogReader(reader);

		try {
			analysisInstance.run();
		} catch (RecordConsumerExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ImportExeption();
		} catch (LogReaderExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ImportExeption();
		}
	}

}
