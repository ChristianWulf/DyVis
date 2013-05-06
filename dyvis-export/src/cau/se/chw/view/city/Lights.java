package cau.se.chw.view.city;

import java.awt.Color;

import javax.media.j3d.AmbientLight;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.DirectionalLight;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;

public class Lights {

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final Lights INSTANCE = new Lights();
	}

	/**
	 * Private constructor.
	 */
	private Lights() {
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static Lights getInstance() {
		return InstanceHolder.INSTANCE;
	}

	public void addAmbientLight(BranchGroup group) {
		BoundingSphere worldBounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 1000.0);

		AmbientLight light = new AmbientLight();
		light.setInfluencingBounds(worldBounds);
		light.setColor(new Color3f(Color.RED));
		group.addChild(light);
	}

	public void addDirLight(BranchGroup group) {
		BoundingSphere worldBounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 1000.0);

		DirectionalLight light = new DirectionalLight();
		light.setInfluencingBounds(worldBounds);
		light.setColor(new Color3f(Color.WHITE));
		group.addChild(light);
	}
}
