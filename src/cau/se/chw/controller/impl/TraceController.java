package cau.se.chw.controller.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import prototypes.observer.IObserver;
import cau.se.chw.controller.AbstractTraceController;
import cau.se.chw.controller.ISceneController;
import cau.se.chw.importers.UnhandledSwitchBranch;
import cau.se.chw.main.utils.Configuration;
import cau.se.chw.model.IFeatureModel;
import cau.se.chw.model.ISourceModel;
import cau.se.chw.model.impl.SourceModel;
import cau.se.chw.observers.ObsDynamicsLoaded;
import cau.se.chw.observers.ObsMovieStarted;
import cau.se.chw.observers.ObsMovieStopped;
import cau.se.chw.observers.ObsNavigationModeChanged;
import feature.common.ITraceElement;
import feature.dynamics.DMethodInstance;

public class TraceController extends AbstractTraceController {

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(TraceController.class.getName());
	private static final int UNSELECTED = -1;

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final TraceController INSTANCE = new TraceController();
	}

	/**
	 * Private constructor.
	 */
	private TraceController() {
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static TraceController getInstance() {
		return InstanceHolder.INSTANCE;
	}

	// TODO remove this comparator because the sub classes of ITraceEvent are
	// already comparable
	private class ComparatorTin implements Comparator<ITraceElement> {
		@Override
		public int compare(ITraceElement o1, ITraceElement o2) {
			return new Long(o1.getTin()).compareTo(o2.getTin());
		}
	}

	/**
	 * the comparison key used by binary search
	 */
//	private DClassInstance key;
	private final Comparator<? super ITraceElement> compaTin = new ComparatorTin();

	/**
	 * all trace elements sorted by <code>tin</code> in ascending order.
	 */
	private List<ITraceElement> LINE_TIME;

	private IFeatureModel featureModel;
	private ISourceModel sourceModel;
	private ISceneController sceneCtrl;

	private List<ITraceElement> traceElements;
	private TraceNavigation navStatus;
	private PlayMode playMode = Configuration.getInstance().getPlayMode();
	/**
	 * the next task is executed every each <code>movie interval</code> (in ms)
	 */
	private long movieInterval = Configuration.getInstance().getMovieInterval();
	private long currentTraceId;
	/**
	 * Indicates the current trace element.<br>
	 * <i>(Range: -1 to number of trace elements -1)</i>
	 */
	private int currentIndex;
	private long currentTimeUnitInNs = Configuration.getInstance().getTimeUnit();
	private long currentPointInTime;

	private Timer timer;
	private TimerTask taskRealBack, taskRealForward;
	private TimerTask taskEventBack, taskEventForward;

	private volatile boolean replayEnabled = Configuration.getInstance().isReplay();
	private volatile boolean showExecutionPath = Configuration.getInstance().isExecutionPath();

	public void init(IFeatureModel featureModel, SourceModel sourceModel, ISceneController sceneCtrl) {
		// TODO move logger properties into file
		// logger.setLevel(Level.OFF);
		this.featureModel = featureModel;
		this.sceneCtrl = sceneCtrl;
		this.sourceModel = sourceModel;
		// createTimerTasks();
		sceneCtrl.addListener(this);
//		this.key = DynamicsFactoryImpl.eINSTANCE.createDClassInstance();
	}

	private void createTimerTasks() {
		taskRealBack = new TimerTask() {

			@Override
			public void run() {
				if (hasPreviousTime()) {
					backOneTimeUnit();
				} else if (replayEnabled) {
					jumpToPointInTime(getEndTin());
				} else {
					stopMovie();
				}
			}
		};
		taskRealForward = new TimerTask() {
			@Override
			public void run() {
				if (hasNextTime()) {
					forwardOneTimeUnit();
				} else if (replayEnabled) {
					jumpToPointInTime(0);
				} else {
					stopMovie();
				}
			}
		};
		taskEventBack = new TimerTask() {
			@Override
			public void run() {
				if (hasPreviousEvent()) {
					backOneEvent();
				} else if (replayEnabled) {
					jumpToPointInTime(getEndTin());
				} else {
					stopMovie();
				}
			}
		};
		taskEventForward = new TimerTask() {
			@Override
			public void run() {
				if (hasNextEvent()) {
					forwardOneEvent();
				} else if (replayEnabled) {
					jumpToPointInTime(0);
				} else {
					stopMovie();
				}
			}
		};
	}

	@Override
	public void setTraceNavigation(TraceNavigation traceNavigation) {
		if (navStatus == traceNavigation) {
			return;
		}
		this.navStatus = traceNavigation;

		if (isDynamicsLoaded()) {
			loadNavigationMode();
		}
	}

	@Override
	public synchronized void forwardOneEvent() {
		int tempIndex = currentIndex + 1;
		updateTime(traceElements.get(tempIndex).getTin());
		updateIndex(tempIndex);
		addTraceElementsByIndex(tempIndex, tempIndex);
		if (!showExecutionPath && currentIndex > 0) {
			// trace tail should be invisible, so remove last
			removeTraceElementsByIndex(currentIndex - 1, currentIndex - 1);
		}
	}

	@Override
	public synchronized void backOneEvent() {
		int tempIndex = currentIndex;
		if (0 == tempIndex) {
			updateTime(0);
		} else {
			updateTime(traceElements.get(tempIndex - 1).getTin());
		}
		updateIndex(tempIndex - 1);
		removeTraceElementsByIndex(tempIndex, tempIndex);
		if (!showExecutionPath && currentIndex != UNSELECTED) {
			// trace tail was removed, so add the last again
			addTraceElementsByIndex(currentIndex, currentIndex);
		}
	}

	@Override
	public synchronized void forwardOneTimeUnit() {
		long to = currentPointInTime + currentTimeUnitInNs;
		int oldIndex = currentIndex;
//		updateTime(to);
		addTraceElementsByTime(oldIndex, to);
		if (!showExecutionPath && currentIndex != oldIndex) {
			if (oldIndex < 0) {
				oldIndex = 0;
			}
			removeTraceElementsByIndex(oldIndex, currentIndex - 1);
		}
	}

	@Override
	public synchronized void backOneTimeUnit() {
		final long from = currentPointInTime - currentTimeUnitInNs;
		final int oldIndex = currentIndex;
//		updateTime(from);
		removeTraceElementsByTime(from, oldIndex);
		if (!showExecutionPath && currentIndex != oldIndex && currentIndex != UNSELECTED) {
			addTraceElementsByIndex(currentIndex, currentIndex);
		}
	}

	@Override
	public synchronized void jumpToEvent(long traceId, int eoi) {
		logger.info("JUMP eoi = " + eoi);
		int from_eoi;
		int to_eoi;
		int tempIndex = currentIndex;
		int index = retrieveIndexForEOI(eoi);

		updateTimeByIndex(index);
		updateIndex(index);

		if (tempIndex < index) {
			from_eoi = tempIndex + 1;
			to_eoi = index;
			addTraceElementsByIndex(from_eoi, to_eoi);
		} else {
			from_eoi = index + 1;
			to_eoi = tempIndex;
			removeTraceElementsByIndex(from_eoi, to_eoi);
		}
	}

	@Override
	public synchronized void jumpToPointInTime(long timeInNs) {
		checkTimeInNsParameter(timeInNs);

		if (timeInNs == currentPointInTime) {
			return;
		}

		long lastPiT = currentPointInTime;
		int oldIndex = currentIndex;

//		updateIndex(UNSELECTED);
//		updateTime(timeInNs);

		if (lastPiT < timeInNs) {
			addTraceElementsByTime(oldIndex, timeInNs);
		} else {
			removeTraceElementsByTime(timeInNs, oldIndex);
		}
	}

	@Override
	public long getTimeUnit() {
		return this.currentTimeUnitInNs;
	}

	@Override
	public void setTimeUnit(long timeInNs) {
		checkTimeInNsParameter(timeInNs);
		this.currentTimeUnitInNs = timeInNs;
		Configuration.getInstance().setTimeUnit(timeInNs);
	}

	@Override
	public void stopMovie() {
		timer.cancel();
		timer = null; // gc & set timer state to 'stopped'
		notifyListeners(ObsMovieStopped.class, null);
	}

	@Override
	public boolean hasNextEvent() {
		return (isDynamicsLoaded() && currentIndex < traceElements.size() - 1);
	}

	@Override
	public boolean hasNextTime() {
		return (isDynamicsLoaded() && currentPointInTime < getEndTin());
	}

	@Override
	public boolean isDynamicsLoaded() {
		return null != LINE_TIME;
	}

	@Override
	public boolean hasPreviousEvent() {
		return (isDynamicsLoaded() && currentIndex > UNSELECTED);
	}

	@Override
	public boolean hasPreviousTime() {
		return (isDynamicsLoaded() && getBeginTin() < currentPointInTime);
	}

	@Override
	public boolean isPlaying() {
		return (isTimerScheduling());
	}

	@Override
	public boolean canPlay() {
		return isDynamicsLoaded() && hasNextEvent();
	}

	// ----------------------------------------------------------------

	private long getBeginTin() {
		return traceElements.get(0).getTin();
	}

	private long getEndTin() {
		return traceElements.get(traceElements.size() - 1).getTin();
	}

	/**
	 * Converts the given <code>eoi</code> to the corresponding index of the
	 * <code>traceElements</code> list.
	 * 
	 * @param eoi
	 * @return
	 */
	private int retrieveIndexForEOI(int eoi) {
		int index = -1;
		// TODO improve performance
		for (int i = 0; i < traceElements.size(); i++) {
			ITraceElement te = traceElements.get(i);
			if (te.getEoi() == eoi) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			throw new IllegalArgumentException();
		}
		return index;
	}

	/**
	 * Sets the <code>currentPointInTime</code> to the given
	 * <code>newTime</code> and keeps it within the valid range (begin - end).
	 * 
	 * @param newTime
	 */
	private void updateTime(long newTime) {
		currentPointInTime = newTime;
		forceTimeRange();
		// logger.info("time = " + currentPointInTime);
	}

	private void updateTimeByIndex(int index) {
		long newTime = traceElements.get(index).getTin();
		updateTime(newTime);
	}

	/**
	 * Keeps the current point in time within the valid range (begin - end).
	 */
	private void forceTimeRange() {
		if (currentPointInTime < 0) { // getBegin()
			currentPointInTime = getBeginTin();
		} else if (currentPointInTime > getEndTin()) {
			currentPointInTime = getEndTin();
		}
	}

	/**
	 * Returns true, if the timer is active, i.e. scheduling; otherwise false.
	 * 
	 * @return
	 */
	private boolean isTimerScheduling() {
		return null != timer;
	}

	private void checkTimeInNsParameter(long timeInNs) {
		if (timeInNs < 0) {
			throw new IllegalArgumentException("timeInNs may not be negative. Current value: "
					+ timeInNs);
		}
	}

	/**
	 * Adds all trace elements from <code>fromTime</code> to <code>toTime</code>
	 * (incl.).
	 * 
	 * @param fromTime
	 * @param toTime
	 */
	private void addTraceElementsByTime(int fromIndex, long toTime) {
		// key.setTin(fromTime);
		// int index = Collections.binarySearch(traceElements, key, compaTin);
		// if (index < 0) {
		// index = -index - 1;
		// }
		
//		updateIndex(UNSELECTED);
		updateTime(toTime);

		for (int i = fromIndex + 1; i < traceElements.size(); i++) {
			ITraceElement te = traceElements.get(i);
			if (te.getTin() > toTime) { // incl.
				break;
			}
			updateIndex(i);
			addTraceElement(te);
		}
	}

	/**
	 * Removes all trace elements from <code>toTime</code> downto
	 * <code>fromTime</code> (excl.).
	 * 
	 * @param fromTime
	 * @param fromIndex
	 */
	private void removeTraceElementsByTime(long fromTime, int fromIndex) {
//		updateIndex(UNSELECTED);
		updateTime(fromTime);
		
		for (int removeIndex = fromIndex; removeIndex >= 0; removeIndex--) {
			ITraceElement te = traceElements.get(removeIndex);
			if (te.getTin() <= fromTime) { // excl.
				break;
			}
			updateIndex(removeIndex - 1);
			removeTraceElement(te);
		}
	}

	private synchronized void addTraceElementsByIndex(int fromIndex, int toIndex) {
		for (int i = fromIndex; i <= toIndex; i++) {
			ITraceElement te = traceElements.get(i);
			addTraceElement(te);
		}
	}

	private synchronized void removeTraceElementsByIndex(int fromIndex, int toIndex) {
		for (int i = toIndex; i >= fromIndex; i--) {
			ITraceElement te = traceElements.get(i);
			removeTraceElement(te);
		}
	}

	private synchronized void addTraceElement(ITraceElement te) {
		sourceModel.addTraceElement(te);
	}

	private synchronized void removeTraceElement(ITraceElement te) {
		sourceModel.removeTraceElement(te);
	}

	/**
	 * Just sets the <code>currentIndex</code>.
	 * 
	 * @param index
	 */
	private void updateIndex(int index) {
		currentIndex = index;
		// if (null != traceElements) {
		// logger.info("index = " + currentIndex + " / " + (traceElements.size()
		// - 1));
		// }
	}

	private void loadNavigationMode() {
		switch (navStatus) {
		case GLOBAL:
			// use "current time" from local mode
			reloadSceneByTime(currentPointInTime);
			break;
		case LOCAL:
			// use "current index" from global mode
			reloadSceneByIndex(currentIndex);
			break;
		default:
			throw new UnhandledSwitchBranch("Unknown element of enum 'TraceNavigation' ("
					+ navStatus + ")");
		}

		// especially, if nothing is added to or removed from the scene, let
		// listeners update their buttons etc.
		notifyListeners(ObsNavigationModeChanged.class, null);
	}

	private void reloadSceneByTime(long pointInTime) {
		traceElements = LINE_TIME;

		resetScene();
		jumpToPointInTime(pointInTime);
	}

	private void reloadSceneByIndex(int index) {
		ITraceElement te = loadNextTraceElement(index);
		traceElements = featureModel.getAllTraceElements(te.getTraceId());
		selectTrace(te.getTraceId());

		resetScene();
		jumpToEvent(te.getTraceId(), te.getEoi());
	}

	private synchronized void resetScene() {
		sourceModel.resetScene();
		// reset values in order to not remove already removed elements
		currentIndex = UNSELECTED;
		currentPointInTime = 0;
		logger.info("RESET scene");
	}

	private ITraceElement loadNextTraceElement(int startIndex) {
		for (int index = startIndex; index >= 0; index--) {
			ITraceElement te = traceElements.get(index);
			if (te instanceof DMethodInstance) {
				return te;
			}
		}
		for (int index = startIndex + 1; index < traceElements.size(); index++) {
			ITraceElement te = traceElements.get(index);
			if (te instanceof DMethodInstance) {
				return te;
			}
		}

		throw new IllegalStateException("There is no trace that contains any method calls.");
	}

	@Override
	public PlayMode getPlayMode() {
		return playMode;
	}

	@Override
	public void setPlayMode(PlayMode mode) {
		this.playMode = mode;
		Configuration.getInstance().setPlayMode(playMode);
	}

	@Override
	public synchronized void playMovie() {
		if (isPlaying()) {
			throw new IllegalStateException("Movie is still being played.");
		}
		createTimerTasks();
		timer = new Timer();
		switch (playMode) {
		case EVENT_BACK:
			timer.schedule(taskEventBack, 0, movieInterval);
			break;
		case EVENT_FORWARD:
			timer.schedule(taskEventForward, 0, movieInterval);
			break;
		case TIME_BACK:
			timer.schedule(taskRealBack, 0, movieInterval);
			break;
		case TIME_FORWARD:
			timer.schedule(taskRealForward, 0, movieInterval);
			break;
		default:
			break;
		}
		notifyListeners(ObsMovieStarted.class, null);
	}

	@Override
	public void setMovieIntervall(long intervalInMs) {
		this.movieInterval = intervalInMs;
		Configuration.getInstance().setMovieInterval(intervalInMs);
	}

	@Override
	public long getMovieIntervall() {
		return movieInterval;
	}

	@Override
	public boolean isReplayEnabled() {
		return replayEnabled;
	}

	@Override
	public void setReplayEnabled(boolean replayEnabled) {
		this.replayEnabled = replayEnabled;
		Configuration.getInstance().setReplay(replayEnabled);
	}

	@Override
	public boolean isShowExecutionPath() {
		return showExecutionPath;
	}

	@Override
	public void setShowExecutionPath(boolean showTraceTail) {
		this.showExecutionPath = showTraceTail;
		Configuration.getInstance().setExecutionPath(showTraceTail);
		if (isDynamicsLoaded() && currentIndex != UNSELECTED) {
			if (showTraceTail) {
				// add all trace elements until the current one exclusively
				addTraceElementsByIndex(0, currentIndex - 1);
			} else {
				// remove all trace elements except the current one
				removeTraceElementsByIndex(0, currentIndex - 1);
			}
		}
	}

	@Override
	public int getCurrentIndex() {
		return currentIndex;
	}

	@Override
	public int getNumTraceElements() {
		return traceElements.size();
	}

	@Override
	public void selectTraceElement(long traceId, ITraceElement te) {
		switch (navStatus) {
		case GLOBAL:
			jumpToPointInTime(te.getTin());
			break;
		case LOCAL:
			if (currentTraceId != traceId) {
				selectTrace(traceId);
				resetScene();
			}
			if (te.getTraceId() != traceId) {
				jumpToEvent(traceId, 0);
				// jumpToPointInTime(0);
			} else {
				jumpToEvent(traceId, te.getEoi());
			}
			break;
		default:
			break;
		}
	}

	private void selectTrace(long traceId) {
		traceElements = featureModel.getAllTraceElements(traceId);
		if (null == traceElements) {
			throw new IllegalArgumentException("The trace (" + traceId + ") does not exist");
		}

		currentTraceId = traceId;
		logger.info("CHANGED trace to id = " + traceId);
	}

	private void printState() {
		logger.info("index = " + currentIndex);
		logger.info("time = " + currentPointInTime);
	}

	private void resetState() {
		updateIndex(UNSELECTED);
		currentPointInTime = 0;
		navStatus = TraceNavigation.GLOBAL;
	}

	@Override
	public List<Class<? extends IObserver>> getRegisterableObserverGroups() {
		List<Class<? extends IObserver>> list = new ArrayList<Class<? extends IObserver>>();
		list.add(ObsDynamicsLoaded.class);
		return list;
	}

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		resetState();

		LINE_TIME = featureModel.getTraceEvents();
		Collections.sort(LINE_TIME, compaTin);
		logger.info("Events sorted by tin. " + LINE_TIME.size());

		loadNavigationMode();
	}

}
