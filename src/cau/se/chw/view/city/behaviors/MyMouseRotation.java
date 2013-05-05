package cau.se.chw.view.city.behaviors;

import java.awt.AWTEvent;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.WakeupCriterion;
import javax.media.j3d.WakeupOnAWTEvent;
import javax.swing.SwingUtilities;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.Vector3d;

import com.sun.j3d.utils.behaviors.mouse.MouseBehavior;

public class MyMouseRotation extends MouseBehavior {

	private final Point lastPos = new Point();
	private final Transform3D trans = new Transform3D();
	private final Transform3D rotation = new Transform3D();
	private final AxisAngle4d FIXED_DIRECTION = new AxisAngle4d(1, 0, 0, Math.toRadians(50));
	private final Transform3D cameraRotationUp = new Transform3D();
	private final Transform3D cameraRotationDown = new Transform3D();
	private final Transform3D leftRotation = new Transform3D();
	private final Transform3D rightRotation = new Transform3D();

	Transform3D currentCamera = new Transform3D();

	public MyMouseRotation(TransformGroup tg) {
		super(tg);
		this.cameraRotationUp.set(FIXED_DIRECTION); // TODO dynamically
		this.cameraRotationDown.invert(cameraRotationUp);
		this.leftRotation.rotY(Math.toRadians(+2));
		this.rightRotation.invert(leftRotation);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void processStimulus(Enumeration criteria) {
		while (criteria.hasMoreElements()) {
			WakeupCriterion ev = (WakeupCriterion) criteria.nextElement();
			if (ev instanceof WakeupOnAWTEvent) {
				AWTEvent[] events = ((WakeupOnAWTEvent) ev).getAWTEvent();

				for (AWTEvent e : events) {
					if (e instanceof MouseEvent) {
						processMyMouseEvent((MouseEvent) e);
					}
				}
			}
			wakeupOn(super.getWakeupCondition());
		}
	}

	private void processMyMouseEvent(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e)) {
			transformGroup.getTransform(currentCamera);

			switch (e.getID()) {
			case MouseEvent.MOUSE_PRESSED:
				// System.out.println("MOUSE_PRESSED");
				lastPos.setLocation(e.getPoint());
				break;
			case MouseEvent.MOUSE_DRAGGED:
				// System.out.println("MOUSE_DRAGGED");
				int diff = lastPos.x - e.getPoint().x;
				if (diff > 0) {
					rotation.set(leftRotation);
				} else if (diff < 0) {
					rotation.set(rightRotation);
				}
				lastPos.setLocation(e.getPoint());
				
				rotate();
				break;
			default:
				break;
			}
		}
	}

	private void rotate() {
		Vector3d translationCamera = new Vector3d();
		currentCamera.get(translationCamera);

		getPositionInFront(translationCamera);

		Transform3D transformPos = new Transform3D();
		transformPos.setTranslation(translationCamera);

		Transform3D newCamera = new Transform3D();

		rotateAroundArbitraryPoint(newCamera, transformPos, rotation);
		newCamera.mul(currentCamera);

		transformGroup.setTransform(newCamera);
	}

	private void getPositionInFront(Vector3d translationCamera) {
		Transform3D temp = new Transform3D();
		temp.setTranslation(new Vector3d(0, 0, -1.1));

		Transform3D transformPos = new Transform3D();
		// go to front within local coordinate system
		transformPos.mul(currentCamera, temp);
		transformPos.get(translationCamera);
		// translationCamera.y = 0;
	}

	/**
	 * 
	 * @param result
	 * @param pos
	 *            rotation point
	 * @param rot
	 *            rotation
	 */
	private void rotateAroundArbitraryPoint(Transform3D result, Transform3D pos, Transform3D rot) {
		result.mul(pos);
		result.mul(rot);
		result.mulInverse(pos);
	}
}
