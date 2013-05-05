package cau.se.chw.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import cau.se.chw.controller.ITraceController.TraceNavigation;
import cau.se.chw.controller.impl.GUIController;
import cau.se.chw.main.Main;

public class TraceNavigationModePanel extends JPanel {

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(TraceNavigationModePanel.class.getName());
	private ButtonGroup btnGroup;
	private JRadioButton globalSel;
	private JRadioButton localSel;
	private final GUI gui;
	private final GUIController controller;

	/**
	 * Constructs a new instance of {@link TraceNavigationModePanel}.
	 * @param gui
	 */
	public TraceNavigationModePanel(GUI gui) {
		logger.setLevel(Level.OFF);
		this.gui = gui;
		this.controller = GUIController.getInstance();
		createComponents();
		addButtonListeners();
		addRadioButtonsToButtonGroup();
		selectDefault();
		addComponentsToPanel();
	}

	private void createComponents() {
		btnGroup = new ButtonGroup();
		globalSel = new JRadioButton(Main.getLanguageString("button.radio.global"));
		localSel = new JRadioButton(Main.getLanguageString("button.radio.local"));
	}

	private void addButtonListeners() {
		globalSel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.getTraceController().setTraceNavigation(TraceNavigation.GLOBAL);
				logger.info("SELECT: GLOBAL");
				gui.focusSurface3D();
			}
		});
		localSel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.getTraceController().setTraceNavigation(TraceNavigation.LOCAL);
				logger.info("SELECT: LOCAL");
				gui.focusSurface3D();
			}
		});
	}

	private void addRadioButtonsToButtonGroup() {
		btnGroup.add(globalSel);
		btnGroup.add(localSel);
	}

	private void selectDefault() {
		btnGroup.setSelected(globalSel.getModel(), true);
		//globalSel.doClick();
	}
	
	private void addComponentsToPanel() {
		this.setLayout(new FlowLayout());
		this.add(globalSel);
		this.add(localSel);
	}
}
