package cau.se.chw.view.city.behaviors;

import javax.media.j3d.Bounds;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Node;
import javax.media.j3d.PickInfo;
import javax.media.j3d.Shape3D;
import javax.swing.SwingUtilities;

import cau.se.chw.controller.ISelectionController;

import com.sun.j3d.utils.pickfast.behaviors.PickMouseBehavior;

public class MouseSelection extends PickMouseBehavior {

	private final ISelectionController selCtrl;

	/**
	 * Constructs a new instance of {@link MouseSelection}.
	 * 
	 * @param canvas
	 * @param root
	 * @param bounds
	 * @param selCtrl
	 */
	public MouseSelection(Canvas3D canvas, BranchGroup root, Bounds bounds,
			ISelectionController selCtrl) {
		super(canvas, root, bounds);
		this.selCtrl = selCtrl;
		// this.setSchedulingBounds(bounds);
		configurePickCanvas();
	}

	private void configurePickCanvas() {
		pickCanvas.setTolerance(0);
		pickCanvas.setMode(PickInfo.PICK_GEOMETRY);
		pickCanvas.setFlags(PickInfo.NODE);
	}

	@Override
	public void updateScene(int xpos, int ypos) {
		selCtrl.unselectShape();
		selCtrl.removePopup();

		if (mevent.isPopupTrigger()) {
			// no effect?
		} else if (SwingUtilities.isLeftMouseButton(mevent)) {
			if (mevent.isControlDown()) {
				Shape3D shape = pickObject(xpos, ypos);
				if (null != shape) {
					selCtrl.selectShape(shape);
				}
			}
		} else if (SwingUtilities.isRightMouseButton(mevent)) {
			Shape3D shape = pickObject(xpos, ypos);
			if (null != shape) {
				selCtrl.selectShape(shape);
				selCtrl.spawnPopup(mevent, shape);
			}
		}
	}

	/**
	 * Returns the closest <code>Shape3D</code> object at position
	 * <code>(xpos, ypos)</code>.
	 * 
	 * @param xpos
	 * @param ypos
	 * @return
	 */
	private Shape3D pickObject(int xpos, int ypos) {
		pickCanvas.setShapeLocation(xpos, ypos);
		PickInfo pick = pickCanvas.pickClosest();
		if (null != pick) {
			Node node = pick.getNode();
			if (node instanceof Shape3D) {
				Shape3D shape = (Shape3D) node;
				return shape;
			}
		}
		return null;
	}

}
