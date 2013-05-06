package cau.se.chw.view.dialogs.options;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import cau.se.chw.controller.ITraceController;
import cau.se.chw.controller.ITraceController.PlayMode;
import cau.se.chw.main.Main;

public class MovieSettingsTab extends JPanel implements ActionListener {

	private ButtonGroup bg;
	private JRadioButton backInTime;
	private JRadioButton forwardInTime;
	private JRadioButton backOneEvent;
	private JRadioButton forwardOneEvent;
	private final ITraceController traceCtrl;
	private JTextField editMovieInterval;
	private JLabel lblMovieInterval;
	private JPanel radioPanel;
	private JPanel intervalPanel;
	private JLabel lblApplyNotification;
	private JPanel notiPanel;
	private Container replayPanel;
	private JCheckBox ckbReplay;
	private JCheckBox ckbTail;
	private JPanel timeUnitPanel;
	private JTextField editTimeUnit;
	private JLabel lblTimeUnit;

	/**
	 * Constructs a new instance of {@link MovieSettingsTab}.
	 * 
	 * @param trace
	 */
	public MovieSettingsTab(ITraceController trace) {
		traceCtrl = trace;
		this.setName(Main.getLanguageString("tab.movie"));
		createComponents();
		addComponentListeners();
		configureComponents();
		addComponentsToContainers();
		addContainersToThisPanel();
		setPreferences();
	}

	private void createComponents() {
		radioPanel = new JPanel();
		backInTime = new JRadioButton(Main.getLanguageString("radio.backtime"));
		forwardInTime = new JRadioButton(Main.getLanguageString("radio.forwardtime"));
		backOneEvent = new JRadioButton(Main.getLanguageString("radio.backevent"));
		forwardOneEvent = new JRadioButton(Main.getLanguageString("radio.forwardevent"));

		intervalPanel = new JPanel();
		editMovieInterval = new JTextField(8);
		lblMovieInterval = new JLabel(Main.getLanguageString("label.movieinterval"));
		
		timeUnitPanel = new JPanel();
		editTimeUnit = new JTextField(8);
		lblTimeUnit  = new JLabel(Main.getLanguageString("label.timeunit"));

		notiPanel = new JPanel();
		lblApplyNotification = new JLabel();

		replayPanel = new JPanel();
		ckbReplay = new JCheckBox(Main.getLanguageString("checkbox.replay"));
		ckbTail = new JCheckBox(Main.getLanguageString("checkbox.tail"));
		// FIXME there is a bug when not displaying the execution path 
		ckbTail.setEnabled(false);
	}

	private void addComponentListeners() {
		backInTime.addActionListener(this);
		forwardInTime.addActionListener(this);
		backOneEvent.addActionListener(this);
		forwardOneEvent.addActionListener(this);
		editMovieInterval.addActionListener(this);
		editTimeUnit.addActionListener(this);
		ckbReplay.addActionListener(this);
		ckbTail.addActionListener(this);
	}

	private void configureComponents() {
		lblMovieInterval.setLabelFor(editMovieInterval);
		editMovieInterval.setDocument(new NumberDocument(1, 10000));
		// text must be set after setting document settings
		editMovieInterval.setText(Long.toString(traceCtrl.getMovieIntervall()));
		
		lblTimeUnit.setLabelFor(editTimeUnit);
		editTimeUnit.setDocument(new NumberDocument(1, 1000000));	// max. 1 sec.
		editTimeUnit.setText(Long.toString(traceCtrl.getTimeUnit()));
		
		lblApplyNotification.setForeground(Color.GREEN.darker());
		ckbReplay.setSelected(traceCtrl.isReplayEnabled());
		ckbTail.setSelected(traceCtrl.isShowExecutionPath());
	}

	private void addComponentsToContainers() {
		bg = new ButtonGroup();
		bg.add(backInTime);
		bg.add(forwardInTime);
		bg.add(backOneEvent);
		bg.add(forwardOneEvent);
		setButtonGroupSelection();

		radioPanel.setLayout(new GridLayout(0, 1));
		radioPanel.setBorder(BorderFactory.createTitledBorder(Main
				.getLanguageString("border.playmode")));
		radioPanel.add(backInTime);
		radioPanel.add(forwardInTime);
		radioPanel.add(backOneEvent);
		radioPanel.add(forwardOneEvent);

		intervalPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		intervalPanel.add(lblMovieInterval);
		intervalPanel.add(editMovieInterval);
		
		timeUnitPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		timeUnitPanel.add(lblTimeUnit);
		timeUnitPanel.add(editTimeUnit);

		notiPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		notiPanel.setBorder(BorderFactory.createTitledBorder(Main
				.getLanguageString("border.notification")));
		notiPanel.setPreferredSize(new Dimension(0, 55));
		notiPanel.add(lblApplyNotification);

		replayPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		replayPanel.add(ckbReplay);
		replayPanel.add(ckbTail);
	}

	private void setButtonGroupSelection() {
		switch (traceCtrl.getPlayMode()) {
		case EVENT_BACK:
			bg.setSelected(backOneEvent.getModel(), true);
			break;
		case EVENT_FORWARD:
			bg.setSelected(forwardOneEvent.getModel(), true);
			break;
		case TIME_BACK:
			bg.setSelected(backInTime.getModel(), true);
			break;
		case TIME_FORWARD:
			bg.setSelected(forwardInTime.getModel(), true);
			break;
		default:
			break;
		}
	}

	private void addContainersToThisPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(notiPanel);
		this.add(radioPanel);
		this.add(intervalPanel);
		this.add(timeUnitPanel);
		this.add(replayPanel);
	}

	private void setPreferences() {
		this.setMinimumSize(getPreferredSize());
		this.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				editMovieInterval.requestFocusInWindow();
				super.focusGained(e);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backInTime) {
			traceCtrl.setPlayMode(PlayMode.TIME_BACK);
		} else if (e.getSource() == forwardInTime) {
			traceCtrl.setPlayMode(PlayMode.TIME_FORWARD);
		} else if (e.getSource() == backOneEvent) {
			traceCtrl.setPlayMode(PlayMode.EVENT_BACK);
		} else if (e.getSource() == forwardOneEvent) {
			traceCtrl.setPlayMode(PlayMode.EVENT_FORWARD);
		} else if (e.getSource() == editMovieInterval) {
			traceCtrl.setMovieIntervall(Long.valueOf(editMovieInterval.getText()));
			lblApplyNotification.setText(Main.getLanguageString("notification.intervalset"));
		} else if (e.getSource() == ckbReplay) {
			traceCtrl.setReplayEnabled(ckbReplay.isSelected());
		} else if (e.getSource() == ckbTail) {
			traceCtrl.setShowExecutionPath(ckbTail.isSelected());
		} else if (e.getSource() == editTimeUnit) {
			traceCtrl.setTimeUnit(Long.valueOf(editTimeUnit.getText()));
			lblApplyNotification.setText(Main.getLanguageString("notification.timeunitset"));
		}
	}

	/**
	 * Clears the current notification label.
	 */
	public void clearNotification() {
		lblApplyNotification.setText("");
	}

}
