package cau.se.chw.metrics;

import java.util.List;

import cau.se.chw.model.IFeatureModel;
import feature.dynamics.DMethodInstance;
import feature.statics.DClass;

/**
 * <code>IMetricWriter</code> computes and writes the metric attributes of all
 * elements of the {@link IFeatureModel}.
 * 
 * @author chw
 * 
 */
public interface IMetricWriter {

	/**
	 * Computes and writes the metric attributes of a whole trace.
	 * 
	 * @param events
	 *            trace events sorted by eoi in ascending order
	 */
	void write(List<DMethodInstance> events);

	/**
	 * Computes and writes the metric attributes of the given
	 * <code>DClass</code> <code>cl</code>.
	 * 
	 * @param cl
	 */
	void write(DClass cl);
}
