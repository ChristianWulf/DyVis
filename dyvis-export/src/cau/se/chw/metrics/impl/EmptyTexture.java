package cau.se.chw.metrics.impl;

import statics.Class;
import cau.se.chw.metrics.ITextureMetric;

public class EmptyTexture implements ITextureMetric<Class> {

	@Override
	public long getTexture(Class object) {
		return 0;
	}

}
