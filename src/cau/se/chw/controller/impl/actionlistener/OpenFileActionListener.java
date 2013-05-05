package cau.se.chw.controller.impl.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import cau.se.chw.controller.impl.SelectionController;
import cau.se.chw.main.Main;
import cau.se.chw.main.utils.DialogFactory;
import cau.se.chw.main.utils.FileSystem;
import feature.common.CodeElement;

public class OpenFileActionListener implements ActionListener {

	private CodeElement userData;
	private final SelectionController selCtrl;

	/**
	 * Constructs a new instance of {@link OpenFileActionListener}.
	 * @param selCtrl
	 */
	public OpenFileActionListener(SelectionController selCtrl) {
		this.selCtrl = selCtrl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String filename = userData.getFilename();
		try {
			selCtrl.removePopup();
			FileSystem.getInstance().openFile(filename);
		} catch (FileNotFoundException e1) {
			DialogFactory.showErrorDialog(Main.getLanguageString("dialog.filenotfound.error.msg")
					+ " (" + filename + ")", Main
					.getLanguageString("dialog.filenotfound.error.title"));
		} catch (IOException e2) {
			DialogFactory.showErrorDialog(Main.getLanguageString("dialog.openfile.error.msg"), Main
					.getLanguageString("dialog.openfile.error.title"));
		}
	}

	public void setUserData(CodeElement userData) {
		if (null == userData) {
			throw new IllegalArgumentException("Parameter 'userData' may not be null.");
		}
		this.userData = userData;
	}

}
