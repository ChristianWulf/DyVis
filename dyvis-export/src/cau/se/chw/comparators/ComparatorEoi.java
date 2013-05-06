package cau.se.chw.comparators;

import java.util.Comparator;

import feature.common.ITraceElement;

public class ComparatorEoi implements Comparator<ITraceElement> {
	@Override
	public int compare(ITraceElement o1, ITraceElement o2) {
		return new Integer(o1.getEoi()).compareTo(o2.getEoi());
	}
}