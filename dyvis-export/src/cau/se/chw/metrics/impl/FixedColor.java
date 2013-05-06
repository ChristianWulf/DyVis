package cau.se.chw.metrics.impl;

import java.awt.Color;

import cau.se.chw.metrics.IColorMetric;


public class FixedColor<T> implements IColorMetric<T> {

	private final Color color;
	
	public FixedColor(Color color) {
		this.color = color;
	}
	
	@Override
	public int getColor(T object) {
		return color.getRGB();
	}

}
