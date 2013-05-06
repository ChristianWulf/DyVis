package cau.se.chw.comparators;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import feature.dynamics.DMethodInstance;

public class ComparatorKeyTin implements Comparator<Long> {

	private final Map<Long, List<DMethodInstance>> methodMap;

	/**
	 * Constructs a new instance of {@link ComparatorKeyTin}.
	 * @param methodMap
	 */
	public ComparatorKeyTin(Map<Long, List<DMethodInstance>> methodMap) {
		this.methodMap = methodMap;
	}

	@Override
	public int compare(Long o1, Long o2) {
		Long value1 = methodMap.get(o1).get(0).getTin();
		Long value2 = methodMap.get(o2).get(0).getTin();
		return value1.compareTo(value2);
	}

}
