package cau.se.chw.view.city.behaviors;

import java.awt.AWTEvent;
import java.awt.event.KeyEvent;
import java.util.Enumeration;

import javax.media.j3d.Behavior;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.WakeupCriterion;
import javax.media.j3d.WakeupOnAWTEvent;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.Vector3d;

public class WASDKeyNavigator extends Behavior {

	private final TransformGroup tg;
	private WakeupCriterion criterion;
	private final Transform3D trans = new Transform3D();
	private final Transform3D transAddFractionOfDirection = new Transform3D();
	private final AxisAngle4d FIXED_DIRECTION = new AxisAngle4d(1, 0, 0, Math.toRadians(50));
	private final Transform3D cameraRotationUp = new Transform3D();
	private final Transform3D cameraRotationDown = new Transform3D();

	public WASDKeyNavigator(TransformGroup tg) {
		this.tg = tg;
		this.cameraRotationUp.set(FIXED_DIRECTION); // TODO dynamically
		this.cameraRotationDown.invert(cameraRotationUp);
	}

	@Override
	public void initialize() {
		// new WakeupOnElapsedFrames(0); //TODO WakeupOnElapsedFrames
		criterion = new WakeupOnAWTEvent(KeyEvent.KEY_PRESSED);
		wakeupOn(criterion);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void processStimulus(Enumeration criteria) {
		while (criteria.hasMoreElements()) {
			WakeupCriterion ev = (WakeupCriterion) criteria.nextElement();
			if (ev instanceof WakeupOnAWTEvent) {
				AWTEvent[] events = ((WakeupOnAWTEvent) ev).getAWTEvent();

				for (AWTEvent e : events) {
					if (e instanceof KeyEvent) {
						processKey((KeyEvent) e);
					}
				}
			}
			wakeupOn(criterion);
		}
	}

	private void processKey(KeyEvent keyEvent) {
		tg.getTransform(trans);
		transAddFractionOfDirection.setIdentity();

		switch (keyEvent.getKeyCode()) {
		case KeyEvent.VK_W:
			transAddFractionOfDirection.setTranslation(new Vector3d(0, 0, -0.1));
			break;
		case KeyEvent.VK_S:
			transAddFractionOfDirection.setTranslation(new Vector3d(0, 0, +0.1));
			break;
		case KeyEvent.VK_A:
			transAddFractionOfDirection.setTranslation(new Vector3d(-0.1, 0, 0));
			break;
		case KeyEvent.VK_D:
			transAddFractionOfDirection.setTranslation(new Vector3d(+0.1, 0, 0));
			break;
		default:
			break;
		}

		// revert camera rotation
		trans.mul(cameraRotationUp);
		// move in one of the four directions
		trans.mul(transAddFractionOfDirection);
		// restore camera rotation
		trans.mul(cameraRotationDown);

		tg.setTransform(trans);
	}
}
