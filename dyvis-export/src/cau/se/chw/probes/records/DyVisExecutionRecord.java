package cau.se.chw.probes.records;

import kieker.tpmon.annotation.TpmonInternal;
import kieker.tpmon.monitoringRecord.AbstractKiekerMonitoringRecord;

public class DyVisExecutionRecord extends AbstractKiekerMonitoringRecord {

	private static final long serialVersionUID = 4932952828202891571L;
	private static final int typeId = AbstractKiekerMonitoringRecord
			.registerMonitoringRecordType(DyVisExecutionRecord.class);
	private static final int numRecordFields = 14;
	private static final String LONG_NULL = "NULL";

	public int experimentId = -1;
	public String vmName = null;
	public String methodName = null;
	public String parameters = null;
	public String sessionId = null;

	public long traceId = -1;
	public long tin = -1;
	public long tout = -1;
	public int eoi = -1;
	public int ess = -1;

	public boolean isEntryPoint = false;
	public Object retVal = null;

	/**
	 * an unique identifier linking to an instantiated class; otherwise (static
	 * method) <code>null</code>.
	 */
	public Long calleeId = null;
	/**
	 * class name formatted as 'package.class' to identify the <i>static</i>
	 * owner/callee class, too.
	 */
	public String calleeComponentName = null;

	// TODO both can be removed, no need anymore
	private String callerComponentName = null;
	private Long callerId;

	private DyVisExecutionRecord() {
	}

	@TpmonInternal()
	public static final DyVisExecutionRecord getInstance() {
		return new DyVisExecutionRecord();
	}

	@TpmonInternal()
	public static final DyVisExecutionRecord getInstance(String callerComponentName,
			String calleeComponentName, String methodName, String parameters, long traceId) {
		DyVisExecutionRecord record = new DyVisExecutionRecord();
		record.callerComponentName = callerComponentName;
		record.calleeComponentName = calleeComponentName;
		record.methodName = methodName;
		record.parameters = parameters;
		record.traceId = traceId;
		return record;
	}

	@Override
	public int getRecordTypeId() {
		return typeId;
	}

	@Override
	public void initFromStringArray(String[] recordVector) throws IllegalArgumentException {
		if (recordVector.length != DyVisExecutionRecord.numRecordFields) {
			throw new IllegalArgumentException("Expecting vector with "
					+ DyVisExecutionRecord.numRecordFields + " elements but found:"
					+ recordVector.length);
		}

		this.experimentId = Integer.parseInt(recordVector[0]);
		this.callerComponentName = recordVector[1];
		this.calleeComponentName = recordVector[2];
		this.methodName = recordVector[3];
		this.parameters = recordVector[4];
		this.sessionId = recordVector[5];
		this.traceId = (Long.parseLong(recordVector[6]));
		this.tin = Long.parseLong(recordVector[7]);
		this.tout = Long.parseLong(recordVector[8]);
		this.vmName = recordVector[9];
		this.eoi = Integer.parseInt(recordVector[10]);
		this.ess = Integer.parseInt(recordVector[11]);
		this.callerId = getNullOrLong(recordVector[12]);
		this.calleeId = getNullOrLong(recordVector[13]);
	}

	@Override
	public String[] toStringArray() {
		String[] vec = { Integer.toString(this.experimentId),
				writeNullOrString(callerComponentName), writeNullOrString(calleeComponentName),
				writeNullOrString(methodName), writeNullOrString(parameters),
				writeNullOrString(sessionId), Long.toString(this.traceId), Long.toString(this.tin),
				Long.toString(this.tout), (this.vmName == null) ? "NULLHOST" : this.vmName,
				Integer.toString(this.eoi), Integer.toString(this.ess), writeNullOrLong(callerId),
				writeNullOrLong(calleeId), };
		return vec;
	}

	private Long getNullOrLong(String string) {
		return (string.equals(LONG_NULL) ? null : Long.parseLong(string));
	}

	private String writeNullOrLong(Long value) {
		return (null == value ? LONG_NULL : value.toString());
	}

	private String writeNullOrString(String string) {
		return (null == string || string.isEmpty() ? "NULL" : string);
	}

	@TpmonInternal()
	public int compareTo(DyVisExecutionRecord o) {
		if (this.traceId == o.traceId) {
			if (this.eoi < o.eoi) {
				return -1;
			}
			if (this.eoi > o.eoi) {
				return 1;
			}
			return 0;
		} else {
			if (this.tin < o.tin) {
				return -1;
			}
			if (this.tin > o.tin) {
				return 1;
			}
			return 0;
		}
	}

}
