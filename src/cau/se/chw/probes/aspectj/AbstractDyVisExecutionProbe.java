package cau.se.chw.probes.aspectj;

import kieker.tpmon.annotation.TpmonInternal;
import kieker.tpmon.core.ControlFlowRegistry;
import kieker.tpmon.core.TpmonController;
import kieker.tpmon.probe.IKiekerMonitoringProbe;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

import cau.se.chw.probes.records.DyVisExecutionRecord;

@Aspect
public abstract class AbstractDyVisExecutionProbe implements IKiekerMonitoringProbe {

	protected static final TpmonController ctrlInst = TpmonController.getInstance();
	protected static final ControlFlowRegistry cfRegistry = ControlFlowRegistry.getInstance();
	protected static final String vmName = ctrlInst.getVmname();

	@TpmonInternal()
	protected DyVisExecutionRecord initExecutionData(ProceedingJoinPoint thisJoinPoint) {
		// e.g. "getBook"
		String methodname = thisJoinPoint.getSignature().getName();
		// toLongString provides e.g.
		// "public kieker.tests.springTest.Book kieker.tests.springTest.CatalogService.getBook()"
		String paramList = thisJoinPoint.getSignature().toLongString();
		int paranthIndex = paramList.lastIndexOf('(');
		paramList = paramList.substring(paranthIndex); // paramList is now
		// e.g., "()"

		//String caller = thisEnclosingJoinPointStaticPart.getSignature().getDeclaringTypeName();
		String callee = thisJoinPoint.getSignature().getDeclaringTypeName();

		DyVisExecutionRecord execData = DyVisExecutionRecord.getInstance("",
				callee, methodname, paramList, cfRegistry.recallThreadLocalTraceId());

		execData.isEntryPoint = false;
		// execData.traceId = ctrlInst.recallThreadLocalTraceId(); // -1 if
		// entry point
		if (execData.traceId == -1) {
			execData.traceId = cfRegistry.getAndStoreUniqueThreadLocalTraceId();
			execData.isEntryPoint = true;
		}
		execData.vmName = vmName;
		execData.experimentId = ctrlInst.getExperimentId();
		return execData;
	}

	@TpmonInternal()
	public abstract Object doBasicProfiling(ProceedingJoinPoint thisJoinPoint) throws Throwable;

	@TpmonInternal()
	protected void proceedAndMeasure(ProceedingJoinPoint thisJoinPoint,
			DyVisExecutionRecord execData) throws Throwable {
		execData.tin = ctrlInst.getTime(); // startint stopwatch
		try {
			execData.retVal = thisJoinPoint.proceed();
		} catch (Exception e) {
			throw e; // exceptions are forwarded
		} finally {
			execData.tout = ctrlInst.getTime();
			if (execData.isEntryPoint) {
				cfRegistry.unsetThreadLocalTraceId();
			}
		}
	}
}
