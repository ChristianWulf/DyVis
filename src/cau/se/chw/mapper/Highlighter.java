package cau.se.chw.mapper;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import metaphor.visualization.Floor;
import metaphor.visualization.Street;
import cau.se.chw.view.city.MyBox;

/**
 * Highlights the caller and callee floor.
 * 
 * @author chw
 * 
 */
public class Highlighter {

	private int highlightCaller = new Color(20, 190, 0).getRGB();
	private int highlightCallee = new Color(20, 220, 0).getRGB();
	private final List<Street> streets = new LinkedList<Street>();

	public void setNewHighlight(Street street) {
		unhighlightOld();
		highlightNew(street);
		streets.add(street);
	}

	public void revertLastHighlight() {
		unhighlightOld();

		Street remStreet = streets.remove(streets.size() - 1);

		if (streets.size() > 0) {
			highlightNew(streets.get(streets.size() - 1));
		}
	}

	// -----------------------------------------------------------

	private void unhighlightOld() {
		if (streets.size() > 0) {
			Street street = streets.get(streets.size() - 1);
			Floor callerFloor = street.getCallerFloor();
			Floor calleeFloor = street.getCalleeFloor();
			MyBox highlightedCaller = (MyBox) callerFloor.getSceneObject();
			MyBox highlightedCallee = (MyBox) calleeFloor.getSceneObject();

			if (!isEntryCaller(highlightedCaller)) {
				highlightedCaller.setColor(callerFloor.getColor());
			}
			highlightedCallee.setColor(calleeFloor.getColor());
		}
	}

	private void highlightNew(Street street) {
		MyBox highlightedCaller = (MyBox) street.getCallerFloor().getSceneObject();
		MyBox highlightedCallee = (MyBox) street.getCalleeFloor().getSceneObject();

		if (!isEntryCaller(highlightedCaller)) {
			highlightedCaller.setColor(highlightCaller);
		}
		highlightedCallee.setColor(highlightCallee);
	}

	public void reset() {
		unhighlightOld();
		streets.clear();
	}

	private boolean isEntryCaller(MyBox caller) {
		return null == caller;
	}

	// -----------------------------------------------------------

	public int getHighlightCaller() {
		return highlightCaller;
	}

	public void setHighlightCaller(Color highlightCaller) {
		this.highlightCaller = highlightCaller.getRGB();
	}

	public int getHighlightCallee() {
		return highlightCallee;
	}

	public void setHighlightCallee(Color highlightCallee) {
		this.highlightCallee = highlightCallee.getRGB();
	}

}
