package cau.se.chw.metrics.impl;

import cau.se.chw.metrics.IHeightMetric;

public class FixedHeight<T> implements IHeightMetric<T> {

	private final float height;

	public FixedHeight(float height) {
		this.height = height;
	}

	@Override
	public float getHeight(T object) {
		return height;
	}

}
