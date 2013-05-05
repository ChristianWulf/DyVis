package cau.se.chw.view;

import java.awt.GridLayout;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import prototypes.observer.IObserver;
import prototypes.observer.IRegisterableObserver;
import cau.se.chw.controller.ITraceController;
import cau.se.chw.controller.impl.GUIController;
import cau.se.chw.main.Main;
import cau.se.chw.observers.ObsClassInstanceAdded;
import cau.se.chw.observers.ObsClassInstanceRemoved;
import cau.se.chw.observers.ObsMethodInstanceAdded;
import cau.se.chw.observers.ObsMethodInstanceRemoved;
import cau.se.chw.observers.ObsMovieStarted;
import cau.se.chw.observers.ObsMovieStopped;
import cau.se.chw.observers.ObsNavigationModeChanged;

/**
 * <code>TraceControlBar</code> represents the button bar that provides
 * functionality to control the view of a trace.
 * 
 * @author chw
 * 
 */
@SuppressWarnings("serial")
public class TraceControlBar extends JPanel implements IRegisterableObserver, ActionListener,
		KeyEventDispatcher {

	// private static final Object navigationAction = new Object();
	private final String PLAY = Main.getLanguageString("button.play");
	private final String PAUSE = Main.getLanguageString("button.pause");
	private JButton prevTime;
	private JButton prevEvent;
	private JButton playPause;
	private JButton nextEvent;
	private JButton nextTime;
	private final GUIController controller;
	private final GUI gui;

	/**
	 * Constructs a new instance of {@link TraceControlBar}.
	 * @param gui
	 */
	public TraceControlBar(GUI gui) {
		this.gui = gui;
		this.controller = GUIController.getInstance();
		createComponents();
		addListenerToComponents();
		addComponentsToGUI();
		setPreferences();
		synchButtons();
	}

	private void setPreferences() {
		KeyboardFocusManager keyManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		keyManager.addKeyEventDispatcher(this);
	}

	private void createComponents() {
		prevTime = new JButton(Main.getLanguageString("button.prevTime"));
		prevEvent = new JButton(Main.getLanguageString("button.prevEvent"));
		playPause = new JButton(PLAY);
		nextEvent = new JButton(Main.getLanguageString("button.nextEvent"));
		nextTime = new JButton(Main.getLanguageString("button.nextTime"));
	}

	private void addListenerToComponents() {
		prevTime.addActionListener(this);
		prevEvent.addActionListener(this);
		playPause.addActionListener(this);
		nextEvent.addActionListener(this);
		nextTime.addActionListener(this);
	}

	private void addComponentsToGUI() {
		this.setLayout(new GridLayout(0, 5)); // equal, constant width
		this.add(prevTime);
		this.add(prevEvent);
		this.add(playPause);
		this.add(nextEvent);
		this.add(nextTime);
	}

	/**
	 * Synchronizes the state of each button with the state of the corresponding
	 * controller.
	 */
	protected void synchButtons() {
		ITraceController contr = controller.getTraceController();
		prevTime.setEnabled(contr.hasPreviousTime());
		prevEvent.setEnabled(contr.hasPreviousEvent());
		playPause.setEnabled(contr.canPlay());
		nextEvent.setEnabled(contr.hasNextEvent());
		nextTime.setEnabled(contr.hasNextTime());
	}

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		if (ObsMovieStarted.class.isAssignableFrom(clazz)) {
			prevTime.setEnabled(false);
			prevEvent.setEnabled(false);
			nextEvent.setEnabled(false);
			nextTime.setEnabled(false);
		} else if (!controller.getTraceController().isPlaying()) {
			synchButtons();
			playPause.setText(PLAY);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ITraceController traceCtrl = controller.getTraceController();

		if (e.getSource() == prevTime) {
			traceCtrl.backOneTimeUnit();
		} else if (e.getSource() == nextTime) {
			traceCtrl.forwardOneTimeUnit();
		} else if (e.getSource() == prevEvent) {
			traceCtrl.backOneEvent();
		} else if (e.getSource() == nextEvent) {
			traceCtrl.forwardOneEvent();
		} else if (e.getSource() == playPause) {
			if (traceCtrl.isPlaying()) {
				traceCtrl.stopMovie();
				playPause.setText(PLAY);
			} else {
				traceCtrl.playMovie();
				playPause.setText(PAUSE);
			}
		}

		gui.focusSurface3D();
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		Window window = SwingUtilities.getWindowAncestor(this);
		if (!window.isFocused()) {
			return false;
		}

		if (e.getID() == KeyEvent.KEY_PRESSED) {
			boolean shiftDown = (e.getModifiers() & KeyEvent.SHIFT_MASK) > 0;

			switch (e.getKeyCode()) {
			case KeyEvent.VK_RIGHT:
				if (shiftDown) {
					nextTime.doClick();
				} else {
					nextEvent.doClick();
				}
				break;
			case KeyEvent.VK_LEFT:
				if (shiftDown) {
					prevTime.doClick();
				} else {
					prevEvent.doClick();
				}
				break;
			default:
				break;
			}
		}

		return false;
	}

	@Override
	public List<Class<? extends IObserver>> getRegisterableObserverGroups() {
		List<Class<? extends IObserver>> list = new ArrayList<Class<? extends IObserver>>();
		list.add(ObsMethodInstanceAdded.class);
		list.add(ObsMethodInstanceRemoved.class);
		list.add(ObsClassInstanceAdded.class);
		list.add(ObsClassInstanceRemoved.class);
		list.add(ObsNavigationModeChanged.class);
		list.add(ObsMovieStarted.class);
		list.add(ObsMovieStopped.class);
		return list;
	}
}
