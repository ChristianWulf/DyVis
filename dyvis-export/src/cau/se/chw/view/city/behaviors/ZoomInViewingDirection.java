package cau.se.chw.view.city.behaviors;

import java.awt.AWTEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Enumeration;

import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.WakeupCriterion;
import javax.media.j3d.WakeupOnAWTEvent;
import javax.vecmath.Vector3d;

import com.sun.j3d.utils.behaviors.mouse.MouseBehavior;

public class ZoomInViewingDirection extends MouseBehavior {

	/*
	 * private final TransformGroup tg; private WakeupOnAWTEvent criterion;
	 */

	private final Transform3D trans = new Transform3D();
	private final Transform3D zoomIn = new Transform3D();
	private final Transform3D zoomOut = new Transform3D();

	/**
	 * Constructs a new instance of {@link ZoomInViewingDirection}.
	 * @param tg
	 */
	public ZoomInViewingDirection(TransformGroup tg) {
		super(tg);
		zoomIn.setTranslation(new Vector3d(0, 0, -0.7));
		zoomOut.invert(zoomIn);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void processStimulus(Enumeration criteria) {
		while (criteria.hasMoreElements()) {
			WakeupCriterion ev = (WakeupCriterion) criteria.nextElement();
			if (ev instanceof WakeupOnAWTEvent) {
				AWTEvent[] events = ((WakeupOnAWTEvent) ev).getAWTEvent();

				for (AWTEvent e : events) {
					if (e instanceof MouseWheelEvent) {
						processMouseWheel((MouseWheelEvent) e);
					}
				}
			}
			wakeupOn(super.getWakeupCondition());
		}
	}

	private void processMouseWheel(MouseWheelEvent e) {
		transformGroup.getTransform(trans);

		if (e.getWheelRotation() < 0) {
			trans.mul(zoomIn);
		} else {
			trans.mul(zoomOut);
		}

		transformGroup.setTransform(trans);
	}

}
