package cau.se.chw.model.impl;

import javax.media.j3d.Behavior;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Group;
import javax.media.j3d.Node;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Matrix3d;
import javax.vecmath.Vector3d;

import cau.se.chw.controller.impl.GUIController;
import cau.se.chw.view.city.Camera;
import cau.se.chw.view.city.Navigator;
import cau.se.chw.view.city.SceneCreator;
import cau.se.chw.view.city.behaviors.MouseSelection;

import com.sun.j3d.utils.universe.SimpleUniverse;

public class SceneModel {

	private SimpleUniverse universe;
	private BranchGroup rootBG;
	/**
	 * The current main branch group. Is replaced by a new one when loading a
	 * new statics.
	 */
	private BranchGroup current = new BranchGroup();
	private final Matrix3d identity = new Matrix3d();

	/**
	 * Constructs a new instance of {@link SceneModel}.
	 */
	public SceneModel() {
		identity.setIdentity();
		createRootBG();
	}

	private void createRootBG() {
		rootBG = new BranchGroup();
		rootBG.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
		rootBG.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);
	}

	public void load(final Canvas3D canvas) {
		universe = new SimpleUniverse(canvas);

		// enable navigation
		Navigator.getInstance().setNavigation(universe, rootBG);

		// enable mouse selection
		Behavior selection = new MouseSelection(canvas, rootBG, Navigator.BIG_BOUNDS, GUIController
				.getInstance().getSelection());
		selection.setSchedulingBounds(Navigator.BIG_BOUNDS);
		rootBG.addChild(selection);

		// test();

		// look towards the scene
		Camera.getInstance().reset(universe);

		universe.addBranchGraph(rootBG);
	}

	// private void test() {
	// FlexiblePipe pipe = new FlexiblePipe(0.05f, new Vector3d(-1, 1, 0), new
	// Vector3d(-1, 2, 0),
	// new Vector3d(1, 2, 0), new Vector3d(1, 1, 0));
	// pipe.setColor(Color.BLUE.getRGB());
	// rootBG.addChild(pipe);
	// }

	public void reloadScene(BranchGroup group) {
		// remove old branch group
		current.detach();

		group.compile();
		current = group;
		rootBG.addChild(current);

		// look towards the scene
		Camera.getInstance().reset(universe);
	}

	public void unload() {
		universe.cleanup();
	}

	public void addAsBranchGroup(Node child, Vector3d relPosition, Node parent) {
		BranchGroup posBG = SceneCreator.addNodeToNewBG(child, relPosition, identity);

		TransformGroup tg = (TransformGroup) parent.getParent();
		tg.addChild(posBG);
	}

	public void addAsBranchGroup(Vector3d relPosition, Node parent, Node... children) {
		BranchGroup posBG = SceneCreator.addNodesToNewBG(children, relPosition, identity);

		TransformGroup tg = (TransformGroup) parent.getParent();
		tg.addChild(posBG);
	}

	public void addAsBranchGroup(Node node, Vector3d absPosition, Matrix3d rot) {
		BranchGroup posBG = SceneCreator.addNodeToNewBG(node, absPosition, rot);
		current.addChild(posBG);
	}

	public void addAsBranchGroup(Group group) {
		BranchGroup bg = SceneCreator.createBG();
		bg.addChild(group);
		current.addChild(bg);
	}

	public static void removeFromBranchGroup(Node node) {
		Node parent = node.getParent();
		while (!(parent instanceof BranchGroup)) {
			parent = parent.getParent();
		}
		((BranchGroup) parent).detach();
	}

	public BranchGroup getRootBG() {
		return rootBG;
	}

}
