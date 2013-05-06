package cau.se.chw.comparators;

import java.util.Comparator;

import feature.common.ITraceElement;
import feature.dynamics.DMethodInstance;

public class ComparatorTrace implements Comparator<ITraceElement> {

	@Override
	public int compare(ITraceElement o1, ITraceElement o2) {
		if (o1.getTraceId() == o2.getTraceId()) {
			return new Integer(o1.getEoi()).compareTo(o2.getEoi());
		} else {
			if (o1 instanceof DMethodInstance) {
				if (((DMethodInstance) o1).getCalleeClassInstance() == o2) {
					return 1;
				}
			} else if (o2 instanceof DMethodInstance) {
				if (((DMethodInstance) o2).getCalleeClassInstance() == o1) {
					return -1;
				}
			}

			return new Long(o1.getTin()).compareTo(o2.getTin());
		}
	}
}
