package cau.se.chw.comparators;

import java.util.Comparator;

import javax.swing.tree.DefaultMutableTreeNode;

import cau.se.chw.view.TraceView;
import feature.common.ITraceElement;

public class ComparatorNodeTraceElement implements Comparator<DefaultMutableTreeNode> {
	
	private final ITraceElement te;

	public ComparatorNodeTraceElement(ITraceElement te) {
		this.te = te;
	}

	@Override
	public boolean equals(Object obj) {
		return TraceView.getTraceElementFromTreeNode((DefaultMutableTreeNode) obj) == te;
	}

	@Override
	public int compare(DefaultMutableTreeNode o1, DefaultMutableTreeNode o2) {
		throw new UnsupportedOperationException();
	}

}
