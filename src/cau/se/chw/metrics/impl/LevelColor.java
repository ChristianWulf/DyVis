package cau.se.chw.metrics.impl;

import java.awt.Color;

import metaphor.visualization.District;
import cau.se.chw.metrics.IColorMetric;
import feature.statics.DPackage;

public class LevelColor<T> implements IColorMetric<District> {

	private static final Color[] COLOR_LEVELS = {
			new Color(50, 80, 80), 
			new Color(0, 70, 0), 
			new Color(0, 90, 0),
			new Color(0, 120, 0), 
			new Color(0, 150, 0), 
			new Color(80, 140, 80),
			};

	@Override
	public int getColor(District object) {
		int level = ((DPackage) object.getSourceObject()).getLevel();

		Color color;
		if (level < COLOR_LEVELS.length) {
			color = COLOR_LEVELS[level];
		} else {
			color = Color.WHITE;
		}

		return color.getRGB();
	}

}
