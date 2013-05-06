package cau.se.chw.view.dialogs;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;

import prototypes.observer.IObserver;
import prototypes.observer.IRegisterableObserver;
import cau.se.chw.observers.ObsDynamicsLoaded;
import cau.se.chw.observers.ObsStaticsLoaded;

public class LoadingDialog extends JDialog implements IRegisterableObserver {

	private JLabel lblDescription;

	public LoadingDialog() {
		createComponents();
		configureComponents();
		addComponentsToThis();
		setPreferences();
	}

	private void configureComponents() {
		lblDescription.setHorizontalAlignment(JLabel.CENTER);
	}

	private void createComponents() {
		lblDescription = new JLabel();
	}

	private void addComponentsToThis() {
		this.setLayout(new BorderLayout());
		this.add(lblDescription);
		this.pack();
	}

	private void setPreferences() {
		this.setResizable(false);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setLocationRelativeTo(null);
		this.setPreferredSize(new Dimension(150, 80));
		this.setMinimumSize(this.getPreferredSize());
	}

	public void setDescription(String text) {
		lblDescription.setText(text);
	}

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		if (ObsStaticsLoaded.class.isAssignableFrom(clazz)) {
			onStaticsLoaded();
		} else if (ObsDynamicsLoaded.class.isAssignableFrom(clazz)) {
			onDynamicsLoaded();
		}
	}

	private void onStaticsLoaded() {
		this.setVisible(false);
	}

	private void onDynamicsLoaded() {
		this.setVisible(false);
	}

	@Override
	public List<Class<? extends IObserver>> getRegisterableObserverGroups() {
		List<Class<? extends IObserver>> list = new ArrayList<Class<? extends IObserver>>();
		list.add(ObsStaticsLoaded.class);
		list.add(ObsDynamicsLoaded.class);
		return list;
	}
}
