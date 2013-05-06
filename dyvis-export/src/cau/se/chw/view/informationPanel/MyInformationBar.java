package cau.se.chw.view.informationPanel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import prototypes.observer.IObserver;
import cau.se.chw.main.Main;
import cau.se.chw.observers.ObsInfoElementSelected;
import cau.se.chw.view.GUI;
import feature.common.IInfoElement;

/**
 * <code>MyInformationBar</code> shows information about the currently selected
 * scene object.
 * 
 * @author chw
 * 
 */
public class MyInformationBar extends JPanel implements ObsInfoElementSelected {

	private final GUI gui;
	private JTable table;
	private JScrollPane scrollpane;
	private DefaultTableModel model;

	public MyInformationBar(GUI gui) {
		this.gui = gui;
		createComponents();
		addComponentsToThis();
	}

	private void createComponents() {
		table = createTable();
		scrollpane = createScrollPane(table);
	}

	private JTable createTable() {
		model = new DefaultTableModel();
		model.setColumnCount(2);
		model.setColumnIdentifiers(new String[] { Main.getLanguageString("informationbar.col1"),
				Main.getLanguageString("informationbar.col2") });
		JTable table = new JTable(model);
		return table;
	}

	private JScrollPane createScrollPane(Component view) {
		JScrollPane pane = new JScrollPane(view);
		pane.setPreferredSize(new Dimension(0, 120));
		return pane;
	}

	private void addComponentsToThis() {
		this.setLayout(new BorderLayout());
		this.add(scrollpane);
	}

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		// System.out.println("MyInformationBar.update()");
		onSelection((IInfoElement) arg);
	}

	private void onSelection(IInfoElement info) {
		String[] rowStrings = info.getRowDescriptions();
		String[] contents = info.getContents();

		model.setRowCount(rowStrings.length);

		for (int row = 0; row < model.getRowCount(); row++) {
			model.setValueAt(rowStrings[row], row, 0);
			model.setValueAt(contents[row], row, 1);
		}
	}

}
