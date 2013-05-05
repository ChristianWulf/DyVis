package cau.se.chw.metrics.impl;

import java.awt.Color;

import metaphor.visualization.Floor;
import cau.se.chw.metrics.IColorMetric;
import feature.common.ITraceElement;

public class StaticFloorColor implements IColorMetric<Floor> {

	@Override
	public int getColor(Floor floor) {
		ITraceElement traceElement = (ITraceElement) floor.getSourceObject();
		if (0 != traceElement.getTin()) {
			return new Color(floor.getBuilding().getColor()).brighter().getRGB();
		}
		return floor.getBuilding().getColor();
	}

}
