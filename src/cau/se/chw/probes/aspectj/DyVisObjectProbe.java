package cau.se.chw.probes.aspectj;

import kieker.tpmon.core.ControlFlowRegistry;
import kieker.tpmon.core.TpmonController;
import kieker.tpmon.probe.IKiekerMonitoringProbe;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import cau.se.chw.probes.aspectj.helpers.ObjectIdGenerator;
import cau.se.chw.probes.records.DyVisObjectRecord;
import cau.se.chw.probes.records.DyVisObjectRecord.ObjectAction;

@Aspect
public class DyVisObjectProbe implements IKiekerMonitoringProbe {

	protected static final TpmonController CTRL = TpmonController.getInstance();
	protected static final ControlFlowRegistry cfRegistry = ControlFlowRegistry.getInstance();
	protected static final ObjectIdGenerator idGenerator = ObjectIdGenerator.getInstance();

	@Around(value = "execution(new(..))")
	public Object probe(ProceedingJoinPoint j) throws Throwable {
		DyVisObjectRecord record = (DyVisObjectRecord) DyVisObjectRecord.getInstance();
		record.action = ObjectAction.CREATE;
		record.actionTime = CTRL.getTime();
		record.componentName = j.getSignature().getDeclaringTypeName();
		record.objectId = idGenerator.generateUniqueId(j.getTarget());
		record.traceId = cfRegistry.recallThreadLocalTraceId();
		
		boolean isEntryPoint = false;
		if (record.traceId == -1) {
			isEntryPoint = true;
			record.traceId = cfRegistry.getAndStoreUniqueThreadLocalTraceId();
			cfRegistry.storeThreadLocalEOI(0);
			record.eoi = 0;
		} else {
			record.eoi = cfRegistry.incrementAndRecallThreadLocalEOI();
		}

		CTRL.logMonitoringRecord(record);

		try {
			return j.proceed();
		} catch (Exception e) {
			throw e; // exceptions are forwarded
		} finally {
			if (isEntryPoint) {
				cfRegistry.unsetThreadLocalTraceId();
				cfRegistry.unsetThreadLocalEOI();
			}
		}

	}
}
