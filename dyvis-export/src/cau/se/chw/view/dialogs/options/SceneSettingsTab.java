package cau.se.chw.view.dialogs.options;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cau.se.chw.controller.impl.GUIController;
import cau.se.chw.main.Main;
import cau.se.chw.main.utils.Configuration;

public class SceneSettingsTab extends JPanel implements ActionListener {

	private JCheckBox ckbAntiAliasing;
	private JLabel lblInterspace;
	private JTextField txfInterspace;
	private JPanel notiPanel;
	private JLabel lblApplyNotification;
	private JPanel pnlInterspace;
	private final Configuration config;
	private JPanel aaPanel;

	/**
	 * Constructs a new instance of {@link SceneSettingsTab}.
	 */
	public SceneSettingsTab() {
		this.setName(Main.getLanguageString("tab.scene"));
		this.config = Configuration.getInstance();
		createComponents();
		addComponentListeners();
		configureComponents();
		addComponentsToContainers();
		addContainersToThisPanel();
		setPreferences();
	}

	private void createComponents() {
		notiPanel = new JPanel();
		lblApplyNotification = new JLabel();
		aaPanel = new JPanel();
		ckbAntiAliasing = new JCheckBox(Main.getLanguageString("checkbox.antialiasing"));
		pnlInterspace = new JPanel();
		lblInterspace = new JLabel(Main.getLanguageString("label.interspace"));
		txfInterspace = new JTextField(8);
	}

	private void addComponentListeners() {
		ckbAntiAliasing.addActionListener(this);
		txfInterspace.addActionListener(this);
	}

	private void configureComponents() {
		notiPanel.setBorder(BorderFactory.createTitledBorder(Main
				.getLanguageString("border.notification")));
		notiPanel.setPreferredSize(new Dimension(0, 55));

		ckbAntiAliasing.setSelected(config.isAntiAliasing());

		txfInterspace.setDocument(new NumberDocument(1, 100));
		txfInterspace.setText(Float.toString(config.getInterspace()));

		lblInterspace.setLabelFor(txfInterspace);
	}

	private void addComponentsToContainers() {
		notiPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		notiPanel.add(lblApplyNotification);

		aaPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		aaPanel.add(ckbAntiAliasing);
		
		pnlInterspace.setLayout(new FlowLayout(FlowLayout.LEADING));
		pnlInterspace.add(lblInterspace);
		pnlInterspace.add(txfInterspace);
	}

	private void addContainersToThisPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(notiPanel);
		this.add(aaPanel);
		this.add(pnlInterspace);
	}

	private void setPreferences() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ckbAntiAliasing) {
			GUIController.getInstance().getOptions().setAntiAliasing(ckbAntiAliasing.isSelected());
		} else if (e.getSource() == txfInterspace) {
			GUIController.getInstance().getOptions().setInterspace(
					Integer.valueOf(txfInterspace.getText()));
			lblApplyNotification.setText(Main.getLanguageString("notification.intervalset"));
		}
	}

	/**
	 * Clears the current notification label.
	 */
	public void clearNotification() {
		lblApplyNotification.setText("");
	}
}
