package cau.se.chw.controller.impl;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Node;
import javax.media.j3d.Shape3D;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.vecmath.Color3f;

import metaphor.dataTypes.SceneElement;
import cau.se.chw.controller.AbstractSelectionController;
import cau.se.chw.controller.impl.actionlistener.OpenFileActionListener;
import cau.se.chw.main.Main;
import cau.se.chw.observers.ObsInfoElementSelected;

import com.sun.j3d.utils.geometry.Primitive;

import feature.common.CodeElement;
import feature.dynamics.DClassInstance;
import feature.dynamics.DMethodInstance;

/**
 * {@inheritDoc}
 * 
 * @author chw
 * 
 */
public class SelectionController extends AbstractSelectionController {

	private static final Color3f COLOR_SELECT = new Color3f(new Color(255, 255, 0));
	private final JPopupMenu popup = new JPopupMenu();
	private Shape3D curShape;
	private final Color3f curColor = new Color3f();
	private final OpenFileActionListener openFileAction;

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final SelectionController INSTANCE = new SelectionController();
	}

	/**
	 * Private constructor.
	 */
	private SelectionController() {
		this.openFileAction = new OpenFileActionListener(this);
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static SelectionController getInstance() {
		return InstanceHolder.INSTANCE;
	}

	@Override
	public void spawnPopup(MouseEvent mevent, Shape3D shape) {
		List<JMenuItem> items = addMenuItems(shape);

		for (JMenuItem item : items) {
			popup.add(item);
		}
		popup.setLocation(mevent.getLocationOnScreen());
		popup.setVisible(true);
	}

	@Override
	public void removePopup() {
		popup.setVisible(false);
		popup.removeAll();
	}

	@Override
	public void selectShape(Shape3D shape) {
		saveOriginalAppearance(shape);

		ColoringAttributes cAttr = shape.getAppearance().getColoringAttributes();
		cAttr.setColor(COLOR_SELECT);

		notifyListeners(ObsInfoElementSelected.class, this.extractUserData(shape));
	}

	@Override
	public void unselectShape() {
		if (curShape != null) {
			curShape.getAppearance().getColoringAttributes().setColor(curColor);
			curShape = null;
		}
	}

	private List<JMenuItem> addMenuItems(final Shape3D shape) {
		List<JMenuItem> items = new ArrayList<JMenuItem>();

		final Object userData = extractUserData(shape);

		CodeElement codeElement = null;
		if (userData instanceof CodeElement) {
			codeElement = (CodeElement) userData;
		} else if (userData instanceof DMethodInstance) {
			codeElement = ((DMethodInstance) userData).getParent();
		} else if (userData instanceof DClassInstance) {
			codeElement = ((DClassInstance) userData).getParent();
		}

		if (null != codeElement) {
			openFileAction.setUserData(codeElement);
			addMenuItem(items, "popup.selection.open", openFileAction);
		}

		// TODO feel free to add more items

		return items;
	}

	/**
	 * Returns the UserData-Object from the given <code>shape</code>'s parent.
	 * 
	 * @param shape
	 * @return
	 */
	private Object extractUserData(Shape3D shape) {
		Node parent = shape.getParent();

		if (parent instanceof Primitive) {
			Object userData = parent.getUserData();
			if (userData instanceof SceneElement) {
				return ((SceneElement) userData).getSourceObject();
			}
		}

		throw new IllegalStateException("Shape3D's parent must contain a non-null UserData-Object.");
	}

	private void addMenuItem(List<JMenuItem> items, final String key, ActionListener actionListener) {
		JMenuItem item = new JMenuItem(Main.getLanguageString(key));
		// item.setMnemonic(mnemonic);
		item.addActionListener(actionListener);

		items.add(item);
	}

	private void saveOriginalAppearance(Shape3D shape) {
		curShape = shape;
		shape.getAppearance().getColoringAttributes().getColor(curColor);
	}

}
