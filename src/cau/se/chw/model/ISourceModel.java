package cau.se.chw.model;

import feature.common.ITraceElement;

public interface ISourceModel {

	/**
	 * Removes all dynamic elements except the "static" class instances.
	 */
	void resetScene();

	void addTraceElement(ITraceElement te);

	void removeTraceElement(ITraceElement te);
}
