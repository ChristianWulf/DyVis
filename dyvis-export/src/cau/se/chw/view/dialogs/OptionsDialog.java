package cau.se.chw.view.dialogs;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JTabbedPane;

import cau.se.chw.controller.ITraceController;
import cau.se.chw.controller.impl.TraceController;
import cau.se.chw.main.Main;
import cau.se.chw.view.dialogs.options.MovieSettingsTab;
import cau.se.chw.view.dialogs.options.SceneSettingsTab;

public class OptionsDialog extends JDialog {

	private JTabbedPane tabbedPane;
	private MovieSettingsTab movieSettingsTab;
	private final ITraceController trace;
	private SceneSettingsTab sceneSettingsTab;

	/**
	 * Constructs a new instance of {@link OptionsDialog}.
	 */
	public OptionsDialog() {
		trace = TraceController.getInstance();
		createComponents();
		addComponentsToTabbedPane();
		addComponentsToThisWindow();
		setWindowPreferences();
	}

	private void createComponents() {
		tabbedPane = new JTabbedPane();
		movieSettingsTab = new MovieSettingsTab(trace);
		sceneSettingsTab = new SceneSettingsTab();
	}

	private void addComponentsToTabbedPane() {
		tabbedPane.addTab(movieSettingsTab.getName(), movieSettingsTab);
		tabbedPane.addTab(sceneSettingsTab.getName(), sceneSettingsTab);
	}

	private void addComponentsToThisWindow() {
		this.setLayout(new GridLayout(1, 0));
		this.add(tabbedPane);
		this.pack();
	}

	private void setWindowPreferences() {
		this.setTitle(Main.getLanguageString("dialog.options.name"));
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(getMinimumSize());
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				movieSettingsTab.requestFocusInWindow();
				super.windowOpened(e);
			}
			@Override
			public void windowClosing(WindowEvent e) {
				movieSettingsTab.clearNotification();
				super.windowClosing(e);
			}
		});
	}
}
