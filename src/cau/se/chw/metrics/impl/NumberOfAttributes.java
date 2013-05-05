/**
 * 
 */
package cau.se.chw.metrics.impl;

import cau.se.chw.metrics.ILengthMetric;
import cau.se.chw.metrics.IWidthMetric;


/**
 * @author chw
 *
 */
public class NumberOfAttributes implements ILengthMetric<statics.Class>, IWidthMetric<statics.Class> {

	@Override
	public float getLength(statics.Class object) {
		int size = object.getAttributes().size();
		//TODO categorization
		return .05f;
	}

	@Override
	public float getWidth(statics.Class object) {
		return getLength(object);
	}

}
