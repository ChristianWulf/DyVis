package cau.se.chw.comparators;

import java.util.Comparator;

import feature.statics.DPackage;

public class ComparatorPackage implements Comparator<DPackage> {

	@Override
	public int compare(DPackage o1, DPackage o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
