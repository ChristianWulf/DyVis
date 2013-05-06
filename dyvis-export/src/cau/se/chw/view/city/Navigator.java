package cau.se.chw.view.city;

import javax.media.j3d.Behavior;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Point3d;

import cau.se.chw.view.city.behaviors.MyMouseRotation;
import cau.se.chw.view.city.behaviors.WASDKeyNavigator;
import cau.se.chw.view.city.behaviors.ZoomInViewingDirection;

import com.sun.j3d.utils.universe.SimpleUniverse;

public class Navigator {

	public static final BoundingSphere BIG_BOUNDS = new BoundingSphere(new Point3d(), Float.MAX_VALUE);

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final Navigator INSTANCE = new Navigator();
	}

	/**
	 * Private constructor.
	 */
	private Navigator() {
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static Navigator getInstance() {
		return InstanceHolder.INSTANCE;
	}

	public void setNavigation(SimpleUniverse universe, BranchGroup root) {
		TransformGroup viewTG = universe.getViewingPlatform().getViewPlatformTransform();
		
		viewTG.setCapabilityIsFrequent(TransformGroup.ALLOW_TRANSFORM_READ);
		viewTG.setCapabilityIsFrequent(TransformGroup.ALLOW_TRANSFORM_WRITE);

		//MouseTranslate mtranslate = new MouseTranslate(viewTG);
		MyMouseRotation mtranslate = new MyMouseRotation(viewTG);
		mtranslate.setSchedulingBounds(BIG_BOUNDS);
		root.addChild(mtranslate);

		ZoomInViewingDirection mzoom = new ZoomInViewingDirection(viewTG);
		mzoom.setSchedulingBounds(BIG_BOUNDS);
		root.addChild(mzoom);

		Behavior wasd = new WASDKeyNavigator(viewTG);
		wasd.setSchedulingBounds(BIG_BOUNDS);
		root.addChild(wasd);
	}
}
