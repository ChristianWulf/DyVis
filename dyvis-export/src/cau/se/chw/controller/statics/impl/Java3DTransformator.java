package cau.se.chw.controller.statics.impl;

import javax.vecmath.Vector3d;

import metaphor.dataTypes.StaticElement;
import metaphor.visualization.Building;
import metaphor.visualization.District;
import cau.se.chw.mapper.CityLayoutManager;

public class Java3DTransformator {

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final Java3DTransformator INSTANCE = new Java3DTransformator();
	}

	/**
	 * Private constructor.
	 */
	private Java3DTransformator() {
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static Java3DTransformator getInstance() {
		return InstanceHolder.INSTANCE;
	}

	/**
	 * Transforms the position format from <i>bottom-left</i> to
	 * <i>centered</i>, because Java3D uses centered coordinates.
	 * @param rootDistrict 
	 */
	public void transformToCenteredCoordinates(District rootDistrict) {
		transformY(rootDistrict.getRelPosition(), rootDistrict.getAltitude());
		setContextTransformation(rootDistrict);

		for (StaticElement child : rootDistrict.getChildren()) {
			Vector3d pos = child.getRelPosition();
			applyObjectTransformation(child);

			if (child instanceof District) {
				// transformY(pos, ((District) child).getAltitude());
				transformToCenteredCoordinates((District) child);
			} else if (child instanceof Building) {
				transformY(pos, ((Building) child).getHeight());
			} else {
				System.err.println("Unhandled StaticElement: " + child.getClass().getName());
			}
		}
	}

	private void setContextTransformation(District rootDistrict) {
		Vector3d trans = new Vector3d();
		trans.setX(CityLayoutManager.BORDER - rootDistrict.getWidth());
		// grows in +z direction
		trans.setZ(CityLayoutManager.BORDER - rootDistrict.getLength());
		rootDistrict.setContextTransformation(trans);
	}

	/**
	 * Sets the centered x- and z-Position.
	 * 
	 * @param child
	 */
	private void applyObjectTransformation(StaticElement child) {
		Vector3d pos = child.getRelPosition();
		pos.setX(pos.getX() * 2 + child.getWidth());
		pos.setZ(pos.getZ() * 2 + child.getLength());
	}

	private void transformY(Vector3d pos, double height) {
//		pos.setY(pos.getY() + height);
		pos.y += height;
	}

	public void transformToHalfMeasure(District rootDistrict) {
		rootDistrict.setAltitude(rootDistrict.getAltitude() / 2);

		for (StaticElement child : rootDistrict.getChildren()) {
			if (child instanceof District) {
				transformToHalfMeasure((District) child);
			} else if (child instanceof Building) {
				Building building = (Building) child;
				building.setWidth(building.getWidth() / 2);
				building.setLength(building.getLength() / 2);
				building.setHeight(building.getHeight() / 2);
			}
		}
	}

}
