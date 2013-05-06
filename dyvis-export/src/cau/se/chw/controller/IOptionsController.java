package cau.se.chw.controller;

public interface IOptionsController {

	/**
	 * Opens the Options-dialog.
	 */
	void openOptions();

	void setAntiAliasing(boolean aa);

	void setInterspace(int interspace);
}
