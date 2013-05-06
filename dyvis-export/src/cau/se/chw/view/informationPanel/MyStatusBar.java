package cau.se.chw.view.informationPanel;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import prototypes.observer.IObserver;
import prototypes.observer.IRegisterableObserver;
import cau.se.chw.controller.ITraceController;
import cau.se.chw.controller.impl.GUIController;
import cau.se.chw.main.Main;
import cau.se.chw.observers.ObsClassInstanceAdded;
import cau.se.chw.observers.ObsClassInstanceRemoved;
import cau.se.chw.observers.ObsMethodInstanceAdded;
import cau.se.chw.observers.ObsMethodInstanceRemoved;
import cau.se.chw.observers.ObsNavigationModeChanged;

public class MyStatusBar extends JPanel implements IRegisterableObserver {

	private static final long serialVersionUID = -2232740565163360801L;
	private JLabel leftLabel;
	private JLabel rightLabel;

	/**
	 * Constructs a new instance of {@link MyStatusBar}.
	 */
	public MyStatusBar() {
		addComponents();
	}

	private void addComponents() {
		this.setBorder(BorderFactory.createEtchedBorder());
		this.setLayout(new GridLayout(1, 1));

		JPanel left = new JPanel();
		left.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JPanel right = new JPanel();
		right.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		leftLabel = new JLabel();
		left.add(leftLabel);
		rightLabel = new JLabel(Main.getLanguageString("statusbar.no_trace_loaded"));
		right.add(rightLabel);

		this.add(left);
		this.add(right);
	}

	@Override
	public List<Class<? extends IObserver>> getRegisterableObserverGroups() {
		List<Class<? extends IObserver>> list = new ArrayList<Class<? extends IObserver>>();
		list.add(ObsClassInstanceAdded.class);
		list.add(ObsClassInstanceRemoved.class);
		list.add(ObsMethodInstanceAdded.class);
		list.add(ObsMethodInstanceRemoved.class);
		list.add(ObsNavigationModeChanged.class);
		return list;
	}

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		ITraceController trace = GUIController.getInstance().getTraceController();
		if (trace.isDynamicsLoaded()) {
			int index = trace.getCurrentIndex();
			int num = trace.getNumTraceElements() - 1;
			rightLabel
					.setText(Main.getLanguageString("statusbar.right") + ": " + index + "/" + num);
		}
	}
}
