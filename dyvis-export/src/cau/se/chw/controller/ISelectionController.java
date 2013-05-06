package cau.se.chw.controller;

import java.awt.event.MouseEvent;

import javax.media.j3d.Shape3D;

/**
 * Handles selection actions. (Un)Selects and (un)colors the scene object and
 * shows/hides a popup window at the position of the selected scene object.
 * 
 * @author chw
 * 
 */
public interface ISelectionController {

	void spawnPopup(MouseEvent mevent, Shape3D shape);

	void removePopup();

	/**
	 * Selects and colors the given <code>shape</code>.
	 * 
	 * @param shape
	 */
	void selectShape(Shape3D shape);

	/**
	 * Unselects and restores the color of the currently selected
	 * <code>Shape3D</code> object.
	 */
	void unselectShape();
}
