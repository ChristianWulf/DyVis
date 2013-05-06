package cau.se.chw.main.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import prototypes.observer.AbstractObservable;
import cau.se.chw.controller.ITraceController.PlayMode;
import cau.se.chw.main.Main;
import cau.se.chw.observers.ObsAntiAliasingChanged;
import cau.se.chw.observers.ObsInterspaceChanged;

/**
 * <code>Configuration</code> holds all distributed data that has to be saved.
 * 
 * @author chw
 * 
 */
public class Configuration extends AbstractObservable implements Serializable {

	private static final long serialVersionUID = 2689721974769881875L;
	private static final Logger logger = Logger.getLogger(Configuration.class.getName());
	private static final String CONFIG_FILENAME = Main.getRuntimeFolder() + "config.conf";

	public enum ELanguage {
		EN
	}

	private ELanguage language = ELanguage.EN;
	private float interspace = 0.05f;
	private boolean antiAliasing = false;
	private boolean replay = false;
	private boolean executionPath = true;
	private PlayMode playMode = PlayMode.EVENT_FORWARD;
	private long timeUnit = 100000; // 100 ms
	private long movieInterval = 100;

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final Configuration INSTANCE = loadConfig();
	}

	/**
	 * Private constructor.
	 */
	private Configuration() {
	}

	/**
	 * Returns the only instance of this class.
	 * 
	 * @return
	 */
	public static Configuration getInstance() {
		return InstanceHolder.INSTANCE;
	}

	private static Configuration loadConfig() {
		Configuration confi = new Configuration();

		ObjectInputStream oin = null;
		try {
			oin = new ObjectInputStream(new FileInputStream(CONFIG_FILENAME));
			confi = (Configuration) oin.readObject();
		} catch (FileNotFoundException e) {
			// creates a new one
		} catch (IOException e) {
			// creates a new one
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE, "Could not find class: " + Configuration.class.getName(), e);
		} finally {
			try {
				if (oin != null) {
					oin.close();
				}
			} catch (IOException ex) {
				logger.log(Level.SEVERE, null, ex);
			}
		}
		return confi;
	}

	/**
	 * Saves the configuration to the filesystem
	 * 
	 * @param config
	 * 
	 */
	public void saveConfig() {
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(CONFIG_FILENAME));
			oout.writeObject(this);
			oout.close();
		} catch (IOException ex) {
			logger.log(Level.SEVERE, null, ex);
		}

	}

	public void setAntiAliasing(boolean aa) {
		this.antiAliasing = aa;
		notifyListeners(ObsAntiAliasingChanged.class, new Boolean(antiAliasing));
	}

	public boolean isAntiAliasing() {
		return antiAliasing;
	}

	public void setInterspace(float interspace) {
		if (interspace <= 0) {
			throw new IllegalArgumentException("Parameter 'interspace' must be positive.");
		}
		this.interspace = interspace;
		notifyListeners(ObsInterspaceChanged.class, new Float(interspace));
	}

	public float getInterspace() {
		return interspace;
	}

	public boolean isReplay() {
		return replay;
	}

	public void setReplay(boolean replay) {
		this.replay = replay;
	}

	public boolean isExecutionPath() {
		return executionPath;
	}

	public void setExecutionPath(boolean executionPath) {
		this.executionPath = executionPath;
	}

	public ELanguage getLanguage() {
		return language;
	}

	public void setLanguage(ELanguage language) {
		this.language = language;
	}

	public PlayMode getPlayMode() {
		return playMode;
	}

	public void setPlayMode(PlayMode playMode) {
		this.playMode = playMode;
	}

	public void setTimeUnit(long timeInNs) {
		this.timeUnit = timeInNs;
	}

	public void setMovieInterval(long intervalInMs) {
		this.movieInterval = intervalInMs;
	}

	public long getTimeUnit() {
		return timeUnit;
	}

	public long getMovieInterval() {
		return movieInterval;
	}

}
