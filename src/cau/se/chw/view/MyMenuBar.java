package cau.se.chw.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import prototypes.observer.IObserver;
import prototypes.observer.IRegisterableObserver;
import cau.se.chw.controller.impl.GUIController;
import cau.se.chw.controller.impl.MenuBarController;
import cau.se.chw.main.Main;
import cau.se.chw.observers.ObsMovieStarted;
import cau.se.chw.observers.ObsMovieStopped;
import cau.se.chw.observers.ObsStaticsLoaded;

@SuppressWarnings("serial")
public class MyMenuBar extends JMenuBar implements IRegisterableObserver {

	private final GUI gui;
	private JMenuItem loadDynamics;
	private JMenuItem loadStatics;
	private final GUIController controller;

	public MyMenuBar(GUI gui) {
		this.gui = gui;
		this.controller = GUIController.getInstance();
		buildFileMenu();
		buildEditMenu();
		buildHelpMenu();
	}

	/**
	 * Create an JMenuItem to <code>menu</code> with the name indicated by
	 * <code>key</code> and with the MouseListener <code>ml</code>.
	 * 
	 * @param menu
	 * @param key
	 * @param enabled
	 * @param al
	 * @return
	 */
	private JMenuItem createMenuItem(JMenu menu, final String key, boolean enabled,
			ActionListener al) {
		JMenuItem item = new JMenuItem(Main.getLanguageString(key));
		item.addActionListener(al);
		item.setEnabled(enabled);
		// item.setMnemonic(KeyEvent.VK_A); //TODO
		menu.add(item);
		return item;
	}

	private void buildFileMenu() {
		JMenu file = new JMenu(Main.getLanguageString("menu.file"));

		loadStatics = createMenuItem(file, "menu.load.statics", true, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuBarController.getInstance().openLoadStaticsDialog();
			}
		});

		loadDynamics = createMenuItem(file, "menu.load.dynamics", false, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuBarController.getInstance().openLoadDynamicsDialog();
			}
		});

		createMenuItem(file, "menu.snapshot", true, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuBarController.getInstance().openSaveSnapshotDialog();
			}
		});

		createMenuItem(file, "menu.close", true, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.close();
			}
		});

		this.add(file);
	}

	private void buildEditMenu() {
		JMenu edit = new JMenu(Main.getLanguageString("menu.edit"));

		// TODO

		this.add(edit);
	}

	private void buildHelpMenu() {
		JMenu help = new JMenu(Main.getLanguageString("menu.help"));

		createMenuItem(help, "menu.options", true, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.getOptions().openOptions();
			}
		});

		// TODO

		this.add(help);
	}

	@Override
	public List<Class<? extends IObserver>> getRegisterableObserverGroups() {
		List<Class<? extends IObserver>> list = new ArrayList<Class<? extends IObserver>>();
		list.add(ObsStaticsLoaded.class);
		list.add(ObsMovieStarted.class);
		list.add(ObsMovieStopped.class);
		return list;
	}

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		if (ObsMovieStarted.class.isAssignableFrom(clazz)) {
			loadStatics.setEnabled(false);
			loadDynamics.setEnabled(false);
		} else if (ObsMovieStopped.class.isAssignableFrom(clazz)) {
			loadStatics.setEnabled(true);
			loadDynamics.setEnabled(true);
		} else {
			loadDynamics.setEnabled(true);
		}
	}
}
