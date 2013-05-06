package cau.se.chw.controller.statics.impl;

import java.util.Comparator;

import metaphor.dataTypes.StaticElement;

public class StaticElementAreaComparator implements Comparator<StaticElement> {

	@Override
	public int compare(StaticElement o1, StaticElement o2) {
		double area1 = o1.getLength() * o1.getWidth();
		double area2 = o2.getLength() * o2.getWidth();
		return -Double.compare(area1, area2);
	}

}
