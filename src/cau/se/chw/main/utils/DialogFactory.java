package cau.se.chw.main.utils;

import javax.swing.JOptionPane;

public class DialogFactory {

	private DialogFactory() {
		// should not be constructible
	}

	public static void showErrorDialog(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
	}

	public static void showInfoDialog(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
	}
}
