package cau.se.chw.main.utils;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrayList<E extends Comparable<E>> extends ArrayList<E> {

	/**
	 * Inserts <code>e</code> at the position according to <i>binarySearch()</i>.
	 * 
	 * @param e
	 */
	public void addSorted(E e) {
		int index = Collections.binarySearch(this, e);
		if (index < 0) { // if not contained yet
			index = -(index + 1);
		}
		this.add(index, e);
	}

}
