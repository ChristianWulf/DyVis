package cau.se.chw.metrics.impl;

import java.awt.Color;

import cau.se.chw.metrics.IColorMetric;

public class VaryingColor<T> implements IColorMetric<T> {

	private Color color;

	public VaryingColor(Color color) {
		this.color = color;
	}

	@Override
	public int getColor(T object) {
		color = color.darker();
		return color.getRGB();
	}

}
