package cau.se.chw.view;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class JTreeHelper {

	private final DefaultTreeModel model;

	/**
	 * Constructs a new instance of {@link JTreeHelper}.
	 * 
	 * @param model
	 */
	public JTreeHelper(DefaultTreeModel model) {
		this.model = model;
	}

	void addChildNode(DefaultMutableTreeNode parent, DefaultMutableTreeNode child) {
		model.insertNodeInto(child, parent, parent.getChildCount());
	}

	void removeAllChildren(DefaultMutableTreeNode parent) {
		while (parent.getChildCount() > 0) {
			MutableTreeNode lastChild = (MutableTreeNode) parent.getLastChild();
			lastChild.setUserObject(null);	// for gc
			model.removeNodeFromParent(lastChild);
		}
	}
}
