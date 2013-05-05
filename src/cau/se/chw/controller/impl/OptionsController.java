package cau.se.chw.controller.impl;

import cau.se.chw.controller.IOptionsController;
import cau.se.chw.main.utils.Configuration;
import cau.se.chw.view.dialogs.OptionsDialog;

public class OptionsController implements IOptionsController {

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final OptionsController INSTANCE = new OptionsController();
	}

	private final OptionsDialog options;

	/**
	 * Private constructor.
	 */
	private OptionsController() {
		this.options = new OptionsDialog();
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static OptionsController getInstance() {
		return InstanceHolder.INSTANCE;
	}

	@Override
	public void openOptions() {
		options.setVisible(true);
	}

	@Override
	public void setAntiAliasing(boolean selected) {
		Configuration.getInstance().setAntiAliasing(selected);
	}

	@Override
	public void setInterspace(int interspace) {
		float inter = interspace / 100f;
		Configuration.getInstance().setInterspace(inter);
	}

}
