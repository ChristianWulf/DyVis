package cau.se.chw.probes.records;

import kieker.tpmon.annotation.TpmonInternal;
import kieker.tpmon.monitoringRecord.AbstractKiekerMonitoringRecord;

/**
 * Holds information about the creation or destruction of an instance of a
 * class.
 * 
 * @author chw
 * 
 */
public class DyVisObjectRecord extends AbstractKiekerMonitoringRecord implements
		Comparable<DyVisObjectRecord> {

	private static final long serialVersionUID = -157363817085141740L;
	/** Used to identify the type of CSV records */
	private static final int typeId = AbstractKiekerMonitoringRecord
			.registerMonitoringRecordType(DyVisObjectRecord.class);
	private static final int numRecordFields = 6;

	public static enum ObjectAction {
		CREATE, DESTROY;
	}

	/**
	 * package and class name separated by dots
	 */
	public String componentName;

	/**
	 * An unique identifier to distinguish between other objects.
	 */
	public long objectId;

	/**
	 * When the action of the corresponding class has been triggered
	 */
	public long actionTime;

	/**
	 * Whether the corresponding class was <i>created</i> or <i>destroyed</i>.
	 */
	public ObjectAction action;

	/**
	 * An unique identifier to distinguish between other threads.
	 */
	public long traceId;

	/**
	 * the execution order index
	 */
	public int eoi;

	@TpmonInternal()
	public static AbstractKiekerMonitoringRecord getInstance() {
		return new DyVisObjectRecord();
	}

	@TpmonInternal()
	@Override
	public int getRecordTypeId() {
		return typeId;
	}

	@TpmonInternal()
	@Override
	public void initFromStringArray(String[] recordVector) throws IllegalArgumentException {
		if (recordVector.length != DyVisObjectRecord.numRecordFields) {
			throw new IllegalArgumentException("Expecting vector with "
					+ DyVisObjectRecord.numRecordFields + " elements but found:"
					+ recordVector.length);
		}
		this.componentName = recordVector[0];
		this.objectId = Long.parseLong(recordVector[1]);
		this.actionTime = Long.parseLong(recordVector[2]);
		this.action = ObjectAction.valueOf(recordVector[3]);
		this.traceId = Long.parseLong(recordVector[4]);
		this.eoi = Integer.parseInt(recordVector[5]);
	}

	@TpmonInternal()
	@Override
	public String[] toStringArray() {
		String[] vec = { componentName, Long.toString(objectId), Long.toString(actionTime),
				action.toString(), Long.toString(traceId), Integer.toString(eoi) };
		return vec;
	}

	/**
	 * Only comparison between instances of the same componentName (i.e. the
	 * class name) are reasonable. If so, the action time is compared.
	 */
	@Override
	public int compareTo(DyVisObjectRecord o) {
		if (traceId < 0) {
			return new Integer(eoi).compareTo(o.eoi);
		} else {
			return new Long(this.actionTime).compareTo(o.actionTime);
		}
	}
}
