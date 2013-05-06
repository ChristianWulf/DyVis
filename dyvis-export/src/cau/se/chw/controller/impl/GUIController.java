package cau.se.chw.controller.impl;

import cau.se.chw.controller.AbstractSelectionController;
import cau.se.chw.controller.IOptionsController;
import cau.se.chw.controller.ISnapshotController;
import cau.se.chw.controller.ITraceController;

/**
 * 
 * Serves as facade between GUI and controllers.
 * 
 * @author chw
 * 
 */
public class GUIController {

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final GUIController INSTANCE = new GUIController();
	}

	/**
	 * Private constructor.
	 */
	private GUIController() {
	}

	/**
	 * Returns the only instance of this class.
	 * 
	 * @return
	 */
	public static GUIController getInstance() {
		return InstanceHolder.INSTANCE;
	}

	public ISnapshotController getSnapshot() {
		return SnapshotController.getInstance();
	}

	public AbstractSelectionController getSelection() {
		return SelectionController.getInstance();
	}

	public IOptionsController getOptions() {
		return OptionsController.getInstance();
	}

	public ITraceController getTraceController() {
		return TraceController.getInstance();
	}

}
