package cau.se.chw.metrics.impl;

import cau.se.chw.metrics.ITransparencyMetric;

public class NoTransparency implements ITransparencyMetric<Class> {

	@Override
	public float getTransparency(Class object) {
		return 0;
	}

}
