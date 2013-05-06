package cau.se.chw.view;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import prototypes.observer.IObserver;
import prototypes.observer.IRegisterableObserver;
import cau.se.chw.controller.impl.GUIController;
import cau.se.chw.model.IFeatureModel;
import cau.se.chw.observers.ObsClassInstanceAdded;
import cau.se.chw.observers.ObsClassInstanceRemoved;
import cau.se.chw.observers.ObsDynamicsLoaded;
import cau.se.chw.observers.ObsMethodInstanceAdded;
import cau.se.chw.observers.ObsMethodInstanceRemoved;
import cau.se.chw.observers.ObsStaticsLoaded;
import feature.common.ITraceElement;
import feature.dynamics.DMethodInstance;

@SuppressWarnings("serial")
public class TraceView extends JScrollPane implements IRegisterableObserver {

	private class ReadOnlyCellEditor extends DefaultTreeCellEditor {
		public ReadOnlyCellEditor(JTree tree, DefaultTreeCellRenderer renderer) {
			super(tree, renderer);
		}

		@Override
		public boolean isCellEditable(EventObject event) {
			return false;
		}
	}

	private final GUIController controller;
	private final Map<TreeNode, Long> traceMap = new HashMap<TreeNode, Long>();

	private class MyTreeSelectionListener implements TreeSelectionListener {

		@Override
		public void valueChanged(TreeSelectionEvent e) {
			DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree
					.getLastSelectedPathComponent();

			if (null == selectedNode) {
				return; // Nothing is selected.
			}

			long traceId = getTraceIdFromTreeNode(selectedNode);
			ITraceElement te = getTraceElementFromTreeNode(selectedNode);

			controller.getTraceController().selectTraceElement(traceId, te);
			gui.focusSurface3D();
		}

		private long getTraceIdFromTreeNode(DefaultMutableTreeNode selectedNode) {
			TreeNode highestParent = selectedNode.getPath()[1]; // 1 = child of
			// root
			return traceMap.get(highestParent);
		}
	}

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(TraceView.class.getName());
	private JTree tree;
	private final DefaultMutableTreeNode root = new DefaultMutableTreeNode(
			new MyUserObject<DMethodInstance>("root", null));
	private final GUI gui;
	private JTreeHelper helper;

	/**
	 * Constructs a new instance of {@link TraceView}.
	 * 
	 * @param gui
	 */
	public TraceView(GUI gui) {
		this.gui = gui;
		this.controller = GUIController.getInstance();
		createComponents();
		configureComponents();
		setPreferences();
	}

	private void createComponents() {
		DefaultTreeModel model = new DefaultTreeModel(root);
		tree = new JTree(model);
		helper = new JTreeHelper(model);
	}

	private void configureComponents() {
		DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
		Icon leafIcon = renderer.getDefaultLeafIcon();
		renderer.setOpenIcon(leafIcon);
		renderer.setClosedIcon(leafIcon);

		tree.setCellRenderer(renderer);
		tree.setCellEditor(new ReadOnlyCellEditor(tree, (DefaultTreeCellRenderer) tree
				.getCellRenderer()));
		// tree.addTreeExpansionListener(tel);
		tree.addTreeSelectionListener(new MyTreeSelectionListener());
		// tree.addTreeWillExpandListener(tel);

		tree.setEditable(true);
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.setShowsRootHandles(true);
		tree.setRootVisible(false);
	}

	private void setPreferences() {
		this.setViewportView(tree);
		this.setPreferredSize(new Dimension(200, 0));
	}

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		if (ObsDynamicsLoaded.class.isAssignableFrom(clazz)) {
			helper.removeAllChildren(root);
			traceMap.clear();
			IFeatureModel featureModel = (IFeatureModel) arg;
			this.addTraces(featureModel);
		} else if (ObsClassInstanceAdded.class.isAssignableFrom(clazz)) {
			ITraceElement te = (ITraceElement) arg;
			this.selectNode(te.getTraceId(), te.getEoi(), te);
		} else if (ObsClassInstanceRemoved.class.isAssignableFrom(clazz)) {
			ITraceElement te = (ITraceElement) arg;
			this.selectNode(te.getTraceId(), te.getEoi() - 1, te);
		} else if (ObsMethodInstanceAdded.class.isAssignableFrom(clazz)) {
			ITraceElement te = (ITraceElement) arg;
			this.selectNode(te.getTraceId(), te.getEoi(), te);
		} else if (ObsMethodInstanceRemoved.class.isAssignableFrom(clazz)) {
			ITraceElement te = (ITraceElement) arg;
			this.selectNode(te.getTraceId(), te.getEoi() - 1, te);
		} else if (ObsStaticsLoaded.class.isAssignableFrom(clazz)) {
			helper.removeAllChildren(root);
			traceMap.clear();
		}

		tree.expandPath(new TreePath(root.getPath()));
		resizePane();
	}

	private void selectNode(long traceId, int eoi, ITraceElement te) {
		// if nothing is selected
		// TreePath path = tree.getSelectionPath();
		// if (null == path) {
		// return;
		// }
		//
		// DefaultMutableTreeNode firstTraceNode = (DefaultMutableTreeNode)
		// path.getPath()[1];
		// Long currentTraceId = traceMap.get(firstTraceNode);
		// // if current trace id is a different one
		// if (traceId != currentTraceId) {
		// // iterate children
		// Enumeration<DefaultMutableTreeNode> children = root.children();
		// while (children.hasMoreElements()) {
		// DefaultMutableTreeNode child = children.nextElement();
		// if (getTraceElementFromTreeNode(child).getTraceId() == traceId) {
		// firstTraceNode = child;
		// break;
		// }
		// }
		// }
		//
		// // search te and select corresponding node
		// DefaultMutableTreeNode node;
		// if (getTraceElementFromTreeNode(firstTraceNode) == te) {
		// node = firstTraceNode;
		// } else {
		// node = searchNode(firstTraceNode, new
		// ComparatorNodeTraceElement(te));
		// }
		// if (null != node) {
		// tree.setSelectionPath(new TreePath(node.getPath()));
		// }
	}

//	private DefaultMutableTreeNode searchNode(DefaultMutableTreeNode parent,
//			Comparator<DefaultMutableTreeNode> compa) {
//		Enumeration<DefaultMutableTreeNode> children = parent.children();
//		while (children.hasMoreElements()) {
//			DefaultMutableTreeNode child = children.nextElement();
//			if (compa.equals(child)) {
//				return child;
//			} else {
//				DefaultMutableTreeNode result = searchNode(child, compa);
//				if (null != result) {
//					return result;
//				}
//			}
//		}
//
//		return null;
//	}

	private void resizePane() {
		((JComponent) this.getParent()).revalidate();
	}

	private void addTraces(IFeatureModel featureModel) {
		List<Long> traces = featureModel.getAllTraceIds();
		for (long traceId : traces) {
			List<ITraceElement> events = featureModel.getAllMethodCalls(traceId);

			DefaultMutableTreeNode firstTraceNode = createNode(events.get(0));
			helper.addChildNode(root, firstTraceNode);
			traceMap.put(firstTraceNode, traceId);
			for (int i = 1; i < events.size(); i++) {
				ITraceElement te = events.get(i);
				addEvent(firstTraceNode, te);
			}
		}
	}

	private void addEvent(DefaultMutableTreeNode branch, ITraceElement te) {
		if (te instanceof DMethodInstance) {
			// TODO use only ITraceElement
			DMethodInstance mi = (DMethodInstance) te;
			DefaultMutableTreeNode parent = branch;
			for (int i = 1; i < mi.getEss() - 1; i++) {
				parent = (DefaultMutableTreeNode) parent.getLastChild();
			}
			helper.addChildNode(parent, createNode(te));
		} else {
			logger.warning("NOT ADDED: " + te);
		}

		// tree.expandPath(new TreePath(parent.getPath()));
		// tree.collapsePath(tree.getPathForRow(0));
	}

	private DefaultMutableTreeNode createNode(ITraceElement te) {
		String displayName = "unknown";
		// TODO use only ITraceElement
		if (te instanceof DMethodInstance) {
			displayName = ((DMethodInstance) te).getParent().getName();
		} else {
			throw new IllegalStateException("TraceView should only display method calls.");
		}

		MyUserObject<ITraceElement> userObject = new MyUserObject<ITraceElement>(displayName, te);
		return new DefaultMutableTreeNode(userObject);
	}

	@SuppressWarnings("unchecked")
	public static ITraceElement getTraceElementFromTreeNode(DefaultMutableTreeNode node) {
		MyUserObject<ITraceElement> userObject = (MyUserObject<ITraceElement>) node.getUserObject();
		return userObject.getGenericObject();
	}

	@Override
	public List<Class<? extends IObserver>> getRegisterableObserverGroups() {
		List<Class<? extends IObserver>> list = new ArrayList<Class<? extends IObserver>>();
		list.add(ObsStaticsLoaded.class);
		list.add(ObsDynamicsLoaded.class);
		list.add(ObsClassInstanceAdded.class);
		list.add(ObsClassInstanceRemoved.class);
		list.add(ObsMethodInstanceAdded.class);
		list.add(ObsMethodInstanceRemoved.class);
		return list;
	}

}
