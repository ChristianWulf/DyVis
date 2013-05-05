package cau.se.chw.main.utils;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileSystem {

	private final static Logger logger = Logger.getLogger(FileSystem.class.getName());

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final FileSystem INSTANCE = new FileSystem();
	}

	private final Desktop desktop;

	/**
	 * Private constructor.
	 */
	private FileSystem() {
		if (Desktop.isDesktopSupported()) {
			desktop = Desktop.getDesktop();
		} else {
			desktop = null;
			logger.info("Desktop is not supported on this platform.");
		}
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static FileSystem getInstance() {
		return InstanceHolder.INSTANCE;
	}

	/**
	 * Launches the associated application to open the file indicated by the
	 * given <code>filename</code>.
	 * 
	 * @param filename
	 * @throws IOException
	 *             if the specified file has no associated application or the
	 *             associated application fails to be launched
	 */
	public void openFile(final String filename) throws IOException {
		if (null != desktop) {
			try {
				desktop.open(new File(filename));
			} catch (IllegalArgumentException e) {
				throw new FileNotFoundException("The specified file dosen't exist");
			}
		}

	}

	/**
	 * Opens the text file indicated by the given <code>fullfilename</code> and
	 * returns the text content.
	 * 
	 * @param fullfilename
	 * @return
	 */
	public String loadTxtFile(final String fullfilename) {
		BufferedReader breader = null;
		StringBuilder outString = new StringBuilder();
		try {
			breader = new BufferedReader(new FileReader(fullfilename));
			char[] buffer = new char[1024];
			int len;
			while ((len = breader.read(buffer)) != -1) {
				outString.append(buffer, 0, len);
			}
		} catch (FileNotFoundException ex) {
			logger.log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			logger.log(Level.SEVERE, null, ex);
		} finally {
			if (breader != null) {
				try {
					breader.close();
				} catch (IOException e) {
					// ignore
				}
			}
		}
		return outString.toString();
	}
}
