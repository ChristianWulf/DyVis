package cau.se.chw.controller;

import feature.common.ITraceElement;

public interface ITraceController {

	/**
	 * The <code>TraceNavigation</code> describes the different modi available
	 * to display a trace.
	 * 
	 * @author chw
	 * 
	 */
	public enum TraceNavigation {
		/**
		 * The <code>GLOBAL</code> mode comprises all traces available sorted by
		 * the time in ascending order.
		 */
		GLOBAL,
		/**
		 * The <code>LOCAL</code> mode comprises one single trace sorted by the
		 * execution order in ascending order.
		 */
		LOCAL
	}

	public enum PlayMode {
		TIME_BACK, TIME_FORWARD, EVENT_BACK, EVENT_FORWARD
	}

	/**
	 * Sets the mode of the {@link TraceNavigation}.
	 * 
	 * @param traceNavigation
	 */
	void setTraceNavigation(TraceNavigation traceNavigation);

	long getTimeUnit();

	void setTimeUnit(long timeInNs);

	void forwardOneEvent();

	void backOneEvent();

	void forwardOneTimeUnit();

	void backOneTimeUnit();

	void jumpToPointInTime(long timeInNs);

	void jumpToEvent(long traceId, int eoi);

	/**
	 * Stops the currently playing movie.
	 */
	void stopMovie();

	/**
	 * Starts playing the movie.
	 */
	void playMovie();

	boolean canPlay();

	boolean hasPreviousTime();

	boolean hasPreviousEvent();

	/**
	 * Returns true, if a trace is available; otherwise false.
	 * 
	 * @return
	 */
	boolean isDynamicsLoaded();

	/**
	 * Return true, if a next trace event is available to display; otherwise
	 * false.
	 * 
	 * @return
	 */
	boolean hasNextEvent();

	boolean hasNextTime();

	/**
	 * Returns true, if the movie is currently playing; otherwise false.
	 * 
	 * @return
	 */
	boolean isPlaying();

	PlayMode getPlayMode();

	void setPlayMode(PlayMode mode);

	long getMovieIntervall();

	void setMovieIntervall(long intervalInMs);

	boolean isReplayEnabled();

	void setReplayEnabled(boolean replayEnabled);

	boolean isShowExecutionPath();

	void setShowExecutionPath(boolean showExecutionPath);

	int getCurrentIndex();

	int getNumTraceElements();

	/**
	 * Selects the trace indicated by <code>traceId</code> and the
	 * <code>eoi</code> or <code>tin</code> of the given trace element
	 * <code>te</code>.
	 * 
	 * @param traceId
	 * @param te
	 */
	void selectTraceElement(long traceId, ITraceElement te);

}
