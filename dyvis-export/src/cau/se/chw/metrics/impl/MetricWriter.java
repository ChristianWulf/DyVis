package cau.se.chw.metrics.impl;

import java.util.List;

import cau.se.chw.metrics.IMetricWriter;
import feature.dynamics.DMethodInstance;
import feature.statics.DClass;

/**
 * {@inheritDoc}
 * 
 * @author chw
 * 
 */
public class MetricWriter implements IMetricWriter {

	@Override
	public void write(List<DMethodInstance> events) {
		// TODO improve algorithm
		DMethodInstance first = events.get(0);
		long durGlobal = first.getTout() - first.getTin();
		for (DMethodInstance ev : events) {
			long duration = ev.getTout() - ev.getTin();
			duration = subtractChildDuration(events, ev, duration);

			ev.setDurAbsolute(duration);
			ev.setDurPercent((float) ev.getDurAbsolute() / durGlobal);
		}
	}

	@Override
	public void write(DClass cl) {
		cl.setNoa(cl.getAttributes().size());
		cl.setNom(cl.getMethods().size());
	}

	private long subtractChildDuration(List<DMethodInstance> events, DMethodInstance ev,
			long duration) {
		for (DMethodInstance child : events) {
			if (isOneLevelBelow(child, ev) && isWithinExecutionTime(child, ev)) {
				duration -= child.getTout() - child.getTin();
			}
		}
		return duration;
	}

	private boolean isWithinExecutionTime(DMethodInstance child, DMethodInstance ev) {
		return ev.getTin() < child.getTin() && child.getTout() < ev.getTout();
	}

	private boolean isOneLevelBelow(DMethodInstance child, DMethodInstance ev) {
		return child.getEss() - 1 == ev.getEss();
	}
}
