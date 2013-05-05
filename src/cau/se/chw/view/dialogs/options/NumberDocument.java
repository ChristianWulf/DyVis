package cau.se.chw.view.dialogs.options;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class NumberDocument extends PlainDocument {

	private final int min;
	private final int max;

	public NumberDocument(int min, int max) {
		this.min = min;
		this.max = max;
	}

	@Override
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		String wholeString = getText(0, getLength()) + str;

		if (!isValidInput(wholeString)) {
			java.awt.Toolkit.getDefaultToolkit().beep();
			return;
		}

		super.insertString(offs, str, a);
	}

	private boolean isValidInput(String str) {
		try {
			int intValue = Integer.parseInt(str);
			if (min > intValue || intValue > max) {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

}
