package cau.se.chw.probes.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import cau.se.chw.probes.aspectj.helpers.ObjectIdGenerator;
import cau.se.chw.probes.records.DyVisExecutionRecord;

@Aspect
public class DyVisExecutionProbe extends AbstractDyVisExecutionProbe {

	protected static final ObjectIdGenerator idGenerator = ObjectIdGenerator.getInstance();

	// @Pointcut("call(* *.*(..)) && !call(@kieker.tpmon.annotation.TpmonInternal * *.*(..))")

	 @Pointcut("execution(* *.*(..))" +
	 "&& !execution(@kieker.tpmon.annotation.TpmonInternal * *.*(..))")
//	@Pointcut("execution(@kieker.tpmon.annotation.TpmonExecutionMonitoringProbe * *.*(..))"
//			+ "&& !execution(@kieker.tpmon.annotation.TpmonInternal * *.*(..))")
	public void monitoredMethod() {
	}

	@Around("monitoredMethod()")
	@Override
	public Object doBasicProfiling(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		if (!ctrlInst.isMonitoringEnabled()) {
			return thisJoinPoint.proceed();
		}

		DyVisExecutionRecord dyVisRecord = this.initExecutionData(thisJoinPoint);
		dyVisRecord.calleeId = getObjectId(thisJoinPoint.getTarget());

		int eoi = 0;
		int ess = 0;
		if (dyVisRecord.isEntryPoint) {
			cfRegistry.storeThreadLocalEOI(0); // current execution's eoi is 0
			cfRegistry.storeThreadLocalESS(1); // *current* execution's ess is 0
		} else {
			eoi = cfRegistry.incrementAndRecallThreadLocalEOI(); // ess > 1
			ess = cfRegistry.recallAndIncrementThreadLocalESS(); // ess >= 0
		}
		try {
			this.proceedAndMeasure(thisJoinPoint, dyVisRecord);
		} catch (Exception e) {
			throw e; // exceptions are forwarded
		} finally {
			/*
			 * note that proceedAndMeasure(...) even sets the variable name in
			 * case the execution of the joint point resulted in an exception!
			 */
			dyVisRecord.eoi = eoi;
			dyVisRecord.ess = ess;
			ctrlInst.logMonitoringRecord(dyVisRecord);

			if (dyVisRecord.isEntryPoint) {
				cfRegistry.unsetThreadLocalEOI();
				cfRegistry.unsetThreadLocalESS();
			} else {
				cfRegistry.storeThreadLocalESS(ess);
			}
		}
		return dyVisRecord.retVal;
	}

	private Long getObjectId(Object obj) {
		if (null != obj) {
			Long objId = idGenerator.getObjectId(obj);
			if (null == objId) {
				objId = idGenerator.generateUniqueId(obj);
			}
			return objId;
		}
		return null; // if obj is a static class
	}

}
