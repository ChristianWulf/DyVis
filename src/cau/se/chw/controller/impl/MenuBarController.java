package cau.se.chw.controller.impl;

import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import cau.se.chw.controller.ISceneController;
import cau.se.chw.importers.IDynamicsImporter;
import cau.se.chw.importers.IStaticsImporter;
import cau.se.chw.importers.ImportExeption;
import cau.se.chw.main.Main;
import cau.se.chw.main.utils.DialogFactory;
import cau.se.chw.view.dialogs.LoadingDialog;

public class MenuBarController {

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final MenuBarController INSTANCE = new MenuBarController();
	}

	private static final FileFilter FILEFILTER_MAP = new FileNameExtensionFilter(Main
			.getLanguageString("dialog.ext.map.description"), "map");
	private static final FileFilter FILEFILTER_XML = new FileNameExtensionFilter(Main
			.getLanguageString("dialog.ext.xml.description"), "xml");
	private LoadingDialog loadingDialog;
	private IStaticsImporter staImporter;
	private IDynamicsImporter dynImporter;

	/**
	 * Private constructor.
	 */
	private MenuBarController() {
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static MenuBarController getInstance() {
		return InstanceHolder.INSTANCE;
	}

	public void init(ISceneController sceneCtrl, IStaticsImporter staImporter,
			IDynamicsImporter dynImporter) {
		this.staImporter = staImporter;
		this.dynImporter = dynImporter;
		this.loadingDialog = new LoadingDialog();

		sceneCtrl.addListener(loadingDialog);
	}

	public void openLoadStaticsDialog() {
		JFileChooser fc = new JFileChooser();
		fc.setFileFilter(FILEFILTER_XML);

		int returnVal = fc.showOpenDialog(null);

		if (JFileChooser.APPROVE_OPTION == returnVal) {
			this.loadStaticsFromFile(fc.getSelectedFile().getAbsolutePath());
		}
	}

	public void openLoadDynamicsDialog() {
		JFileChooser fc = new JFileChooser();
		fc.setFileFilter(FILEFILTER_MAP);

		int returnVal = fc.showOpenDialog(null);

		if (JFileChooser.APPROVE_OPTION == returnVal) {
			this.loadDynamicsFromFile(fc.getSelectedFile().getParent());
		}
	}

	public void openSaveSnapshotDialog() {
		JFileChooser fc = new JFileChooser();

		int returnVal = fc.showSaveDialog(null);

		if (JFileChooser.APPROVE_OPTION == returnVal) {
			this.saveSnapshotToFile(fc.getSelectedFile().getAbsolutePath());
		}
	}

	// ---------------------------------------------------------------------

	private void loadStaticsFromFile(final String absolutePath) {
		loadingDialog.setTitle(Main.getLanguageString("dialog.loading.statics"));
		loadingDialog.setDescription(loadingDialog.getTitle());
		loadingDialog.setVisible(true);

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					staImporter.loadFromFile(absolutePath);
				} catch (java.lang.OutOfMemoryError e) {
					loadingDialog.setVisible(false);
					DialogFactory.showErrorDialog(Main
							.getLanguageString("dialog.loader.statics.memory.error.msg"), Main
							.getLanguageString("dialog.loader.statics.memory.error.title"));
				}
			}
		});
		thread.start();
	}

	private void loadDynamicsFromFile(final String absolutePath) {
		loadingDialog.setTitle(Main.getLanguageString("dialog.loading.dynamics"));
		loadingDialog.setDescription(loadingDialog.getTitle());
		loadingDialog.setVisible(true);

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					dynImporter.loadFromFile(absolutePath);
				} catch (ImportExeption e) {
					loadingDialog.setVisible(false);
					DialogFactory.showErrorDialog(Main
							.getLanguageString("dialog.logreader.error.msg"), Main
							.getLanguageString("dialog.logreader.error.title"));
				}
			}
		});
		thread.start();
	}

	private void saveSnapshotToFile(final String absolutePath) {
		try {
			SnapshotController.getInstance().makeAndSaveSnapshot(absolutePath);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					Main.getLanguageString("dialog.snapshot.error.msg"), Main
							.getLanguageString("dialog.snapshot.error.title"),
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
