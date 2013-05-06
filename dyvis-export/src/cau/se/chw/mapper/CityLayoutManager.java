package cau.se.chw.mapper;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import javax.vecmath.Vector3d;

import metaphor.dataTypes.StaticElement;
import metaphor.visualization.District;
import metaphor.visualization.Floor;
import metaphor.visualization.Street;

import org.eclipse.emf.common.util.EList;

import cau.se.chw.controller.statics.impl.Java3DTransformator;
import cau.se.chw.controller.statics.impl.StaticElementAreaComparator;
import cau.se.chw.main.utils.Configuration;

/**
 * <code>CityLayoutManager</code> arranges each metaphor object.
 * 
 * @author chw
 * 
 */
public class CityLayoutManager {

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(CityLayoutManager.class.getName());
	private static final double ENTRY_POSITION = 1.0;
	public static final double BORDER = .03;
	private static final double DEFAULT_SIDELENGTH = .2;
	private static final Comparator<? super StaticElement> areaComparator = new StaticElementAreaComparator();

	// private final float interspace = .05f;

	public void arrange(Street street) {
		Vector3d pos2 = street.getCalleeFloor().getAbsPosition();

		Floor caller = street.getCallerFloor();
		Vector3d pos1 = new Vector3d();
		// draw entry point separately
		if (isEntryPoint(caller)) {
			pos1.set(pos2.x, pos2.y + ENTRY_POSITION, pos2.z);
			caller.setAbsPosition(pos1);
		} else {
			pos1 = caller.getAbsPosition();
		}

		// (pos2-pos1) * 1/2 + pos1
		Vector3d pos = new Vector3d(pos2);
		pos.sub(pos1);
		pos.scale(0.5);
		pos.add(pos1);

		street.setAbsPosition(pos);
	}

	private boolean isEntryPoint(Floor caller) {
		return (null == caller.getSourceObject());
	}

	public void arrange(Floor floor) {
		EList<Floor> floors = floor.getBuilding().getFloors();
		double relHeight = 0;
		float offset = floor.getBuilding().getHeight();

		for (Floor other : floors) {
			relHeight += offset + other.getHeight();
			offset = other.getHeight();
		}

		Vector3d relPos = new Vector3d();
		relPos.y += relHeight;
		floor.setRelPosition(relPos); // relative to underlying building

		Vector3d absPos = new Vector3d(floor.getBuilding().getAbsPosition());
		absPos.y += relHeight;
		floor.setAbsPosition(absPos);
	}

	/**
	 * Sets the absolute and relative position of each static scene object by
	 * generating a simple rectangular layout. The position of an scene object
	 * is relative to its parent (and the corresponding border). The position
	 * describes the bottom-left corner of the scene object.
	 * 
	 * @param district
	 */
	public void arrange(District district) {
		// 1.
		traversePostOrder(district);
		// 2.
		Java3DTransformator.getInstance().transformToCenteredCoordinates(district);
		// 3.
		district.setAbsPosition(new Vector3d());
		setAbsolutePositions(district);
	}

	public void traversePostOrder(District parent) {
		List<StaticElement> directChildren = new LinkedList<StaticElement>();
		// first, go down to the leaves
		for (StaticElement child : parent.getChildren()) {
			if (child instanceof District) {
				traversePostOrder((District) child);
			}
			directChildren.add(child);
		}

		// 1.
		float sideLength = positioning(directChildren);
		// 2.
		encloseWithDistrict(parent, sideLength);
		// 3.
		raiseChildren(directChildren, parent.getAltitude());
	}

	private float positioning(List<StaticElement> elements) {
		if (elements.size() > 0) {
			Collections.sort(elements, areaComparator);

			StaticElement maxElement = elements.get(0);
			double maxSideWidth = maxElement.getWidth();

			double area = getSurfaceArea(elements);
			double preferredSideWidth = 1.5 * Math.sqrt(area);

			double guessedSideWidth = Math.max(maxSideWidth, preferredSideWidth);
			return (float) nextFitDecreasingHeight(elements, guessedSideWidth);
		}
		return -1;
	}

	/**
	 * Sets the relative position, length and width of the given
	 * <code>district</code>.
	 * 
	 * @param district
	 * @param sideLength
	 */
	private void encloseWithDistrict(District district, double sideLength) {
		district.setRelPosition(new Vector3d());
		// if this district contains no children
		if (sideLength == -1) {
			sideLength = DEFAULT_SIDELENGTH;
		}
		float sideLength2 = (float) (sideLength + 2 * BORDER);

		district.setLength(sideLength2);
		district.setWidth(sideLength2);
	}

	/**
	 * Adds <code>altitude</code> to the y-position of each child of
	 * <code>directChildren</code>.
	 * 
	 * @param directChildren
	 * @param altitude
	 */
	private void raiseChildren(List<StaticElement> directChildren, double altitude) {
		for (StaticElement se : directChildren) {
			se.getRelPosition().y += altitude;
		}
	}

	/**
	 * 
	 * @param elements
	 *            sorted in descending order
	 * @param maxSideWidth
	 *            the maximum acceptable width before placing the next element
	 *            in the next row
	 * @return the biggest length or width, respectively, that the
	 *         <code>elements</code> comprise.
	 */
	private double nextFitDecreasingHeight(List<StaticElement> elements, final double maxSideWidth) {
		double currentSideWidth = 0, currentSideLength = 0, nextLeftPos_Length = 0, maxRealSideWidth = 0;
		// forces to enter if-clause in first iteration; prevents from using an
		// extra boolean condition
		double maxSideWidth_loc = -1;
		float interspace = Configuration.getInstance().getInterspace();

		for (int i = 0; i < elements.size(); i++) {
			StaticElement selement = elements.get(i);
			// return to left
			if (currentSideWidth + selement.getWidth() > maxSideWidth_loc) {
				maxSideWidth_loc = maxSideWidth;
				if (currentSideWidth - interspace > maxRealSideWidth) {
					maxRealSideWidth = currentSideWidth - interspace;
				}
				currentSideWidth = 0;
				currentSideLength = nextLeftPos_Length;
				nextLeftPos_Length += selement.getLength() + interspace;
			}
			// set position (bottom left)
			Vector3d p = new Vector3d(currentSideWidth, 0, currentSideLength);
			selement.setRelPosition(p);
			// logger.info("Position set for " + selement.getName() + ": " + p);
			// set cursor one step to the right
			currentSideWidth += selement.getWidth() + interspace;
		}

		currentSideWidth -= interspace;

		/*
		 * if there is only one row filled, then currentSideWidth >
		 * maxRealSideWidth
		 */
		double maxWidth = Math.max(currentSideWidth, maxRealSideWidth);
		return Math.max(maxWidth, nextLeftPos_Length);
	}

	private double getSurfaceArea(List<StaticElement> elements) {
		double area = 0;
		for (StaticElement element : elements) {
			area += element.getLength() * element.getWidth();
		}
		return area;
	}

	/**
	 * Assumption: root.absPos = (0,0,0)
	 * 
	 * @param rootDistrict
	 */
	private void setAbsolutePositions(District rootDistrict) {
		final Vector3d leftBottom = new Vector3d(rootDistrict.getAbsPosition());
		leftBottom.add(rootDistrict.getContextTransformation());

		for (StaticElement child : rootDistrict.getChildren()) {
			Vector3d absPos = (Vector3d) leftBottom.clone();
			absPos.add(child.getRelPosition());
			child.setAbsPosition(absPos);
			if (child instanceof District) {
				setAbsolutePositions((District) child); // recursive call
			}
		}
	}

}
