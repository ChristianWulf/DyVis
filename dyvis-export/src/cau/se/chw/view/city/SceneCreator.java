package cau.se.chw.view.city;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Matrix3d;
import javax.vecmath.Vector3d;

/**
 * Provides helper methods to construct different Java3D groups.
 * 
 * @author chw
 * 
 */
public class SceneCreator {

	private SceneCreator() {
		// should not be constructible
	}

	public static TransformGroup createTG(Vector3d pos, Matrix3d rot) {
		Transform3D transform = new Transform3D();
		transform.setTranslation(pos);
		transform.setRotation(rot);

		return new TransformGroup(transform);
	}

	public static TransformGroup createTG(Vector3d pos) {
		Transform3D transform = new Transform3D();
		transform.setTranslation(pos);

		return new TransformGroup(transform);
	}

	/**
	 * Returns a new <code>BranchGroup</code> with the capability of removing
	 * itself from the overlying scene graph.
	 * 
	 * @return
	 */
	public static BranchGroup createBG() {
		BranchGroup bg = new BranchGroup();
		bg.setCapability(BranchGroup.ALLOW_DETACH);
		return bg;
	}

	public static BranchGroup createBG(Node child) {
		BranchGroup bg = createBG();
		bg.addChild(child);
		return bg;
	}

	public static BranchGroup addNodeToNewBG(Node node, Vector3d pos, Matrix3d rot) {
		TransformGroup tg = SceneCreator.createTG(pos, rot);
		tg.addChild(node);

		return SceneCreator.createBG(tg);
	}

	public static BranchGroup addNodesToNewBG(Node[] nodes, Vector3d pos, Matrix3d rot) {
		TransformGroup tg = SceneCreator.createTG(pos, rot);
		for (Node node : nodes) {
			tg.addChild(node);
		}

		return SceneCreator.createBG(tg);
	}

}
