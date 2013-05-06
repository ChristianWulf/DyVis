package cau.se.chw.view.city;

import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.AxisAngle4f;
import javax.vecmath.Vector3f;

import com.sun.j3d.utils.universe.SimpleUniverse;

/**
 * Provides methods to transform the camera.
 * 
 * @author chw
 * 
 */
public class Camera {

	private static final Vector3f CAMERA_STARTPOS = new Vector3f(0, 3, 2);
	private static final double CAMERA_ANGLE = -50;

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final Camera INSTANCE = new Camera();
	}

	/**
	 * Private constructor.
	 */
	private Camera() {
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static Camera getInstance() {
		return InstanceHolder.INSTANCE;
	}

	public void setViewingPosition(SimpleUniverse universe, Vector3f pos, double angle) {
		Transform3D ViewT3D = new Transform3D();

		TransformGroup ViewTG = universe.getViewingPlatform().getViewPlatformTransform();
		ViewTG.getTransform(ViewT3D);
		// get existing transformation
		ViewT3D.setTranslation(pos);
		ViewT3D.setRotation(new AxisAngle4f(1, 0, 0, (float) Math.toRadians(angle)));
		// overwrite existing transformation
		ViewTG.setTransform(ViewT3D);
	}

	/**
	 * Resets the camera to its original position and angle.
	 * 
	 * @param universe
	 */
	public void reset(SimpleUniverse universe) {
		setViewingPosition(universe, CAMERA_STARTPOS, CAMERA_ANGLE);
	}

	public void setViewingDirection() {

	}
}
