package cau.se.chw.view.city;

import java.awt.Color;
import java.util.Enumeration;

import javax.media.j3d.Appearance;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Matrix3d;
import javax.vecmath.Vector3d;

import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Primitive;

public class FlexiblePipe extends Primitive {

	private class CylinderData {
		float length;
		Vector3d position;
		Matrix3d rotation;
		TransformGroup group;

		void setPosition(Cylinder cyl) {
			this.group = SceneCreator.createTG(this.position, this.rotation);
			this.group.addChild(cyl);
		}
	}

	private final float cylinderRadius;
	private final Vector3d firstPos;
	private final Vector3d secondPos;
	private final Vector3d thirdPos;
	private final Vector3d fourthPos;

	private Appearance sharedApp = new Appearance();
	private MyCylinder firstEndCylinder;
	private MyCylinder secondEndCylinder;
	private MyCylinder connectorCylinder;
	private final CylinderData endOne = new CylinderData();
	private final CylinderData endTwo = new CylinderData();
	private final CylinderData connector = new CylinderData();

	/**
	 * Constructs a new instance of {@link FlexiblePipe}. Looks like three
	 * lines.
	 * 
	 * @param cylinderRadius
	 * @param firstPos
	 * @param secondPos
	 * @param thirdPos
	 * @param fourthPos
	 */
	public FlexiblePipe(float cylinderRadius, Vector3d firstPos, Vector3d secondPos,
			Vector3d thirdPos, Vector3d fourthPos) {
		this.cylinderRadius = cylinderRadius;
		this.firstPos = firstPos;
		this.secondPos = secondPos;
		this.thirdPos = thirdPos;
		this.fourthPos = fourthPos;
		callSharedConstructor();
	}

	/**
	 * Constructs a new instance of {@link FlexiblePipe}. Looks like a line.
	 * 
	 * @param cylinderRadius
	 * @param start
	 * @param end
	 */
	public FlexiblePipe(float cylinderRadius, Vector3d start, Vector3d end) {
		Vector3d temp = new Vector3d();
		Vector3d direction = new Vector3d();
		direction.sub(end, start);

		this.cylinderRadius = cylinderRadius;
		this.firstPos = start;
		temp.scaleAdd(0.3, direction, start);
		this.secondPos = new Vector3d(temp);
		temp.scaleAdd(0.6, direction, start);
		this.thirdPos = new Vector3d(temp);
		this.fourthPos = end;
		callSharedConstructor();
	}

	private void callSharedConstructor() {
		setCapabilities();
		computeLengths();
		computePositions();
		computeRotation();
		constructCylinders();
		configureAppearance();
		setPositions();
		addCylinders();
	}

	private void setCapabilities() {
		// this.setCapability(ALLOW_CHILDREN_WRITE);
		// this.setCapability(ALLOW_CHILDREN_EXTEND);
		// this.setCapability(ALLOW_DETACH);
		// already set in Primitive
		// this.setCapability(ENABLE_PICK_REPORTING);
	}

	private void computeLengths() {
		Vector3d temp = new Vector3d();

		temp.sub(firstPos, secondPos);
		endOne.length = (float) temp.length();
		temp.sub(thirdPos, fourthPos);
		endTwo.length = (float) temp.length();
		temp.sub(secondPos, thirdPos);
		connector.length = (float) temp.length();
	}

	private void computePositions() {
		Vector3d temp = new Vector3d();
		Vector3d diff = new Vector3d();

		diff.sub(secondPos, firstPos);
		temp.scaleAdd(.5, diff, firstPos);
		endOne.position = new Vector3d(temp);
		diff.sub(thirdPos, fourthPos);
		temp.scaleAdd(.5, diff, fourthPos);
		endTwo.position = new Vector3d(temp);
		diff.sub(thirdPos, secondPos);
		temp.scaleAdd(.5, diff, secondPos);
		connector.position = new Vector3d(temp);
	}

	private void computeRotation() {
		Vector3d direction = new Vector3d();

		direction.sub(secondPos, firstPos);
		Matrix3d rot = StreetHelper.getRotationMatrix(direction);
		endOne.rotation = rot;
		direction.sub(thirdPos, fourthPos);
		rot = StreetHelper.getRotationMatrix(direction);
		endTwo.rotation = rot;
		direction.sub(thirdPos, secondPos);
		rot = StreetHelper.getRotationMatrix(direction);
		connector.rotation = rot;
	}

	private void constructCylinders() {
		firstEndCylinder = new MyCylinder(cylinderRadius, endOne.length);
		secondEndCylinder = new MyCylinder(cylinderRadius, endTwo.length);
		connectorCylinder = new MyCylinder(cylinderRadius, connector.length);
	}

	private void configureAppearance() {
		sharedApp = MyCylinder.createAppearance(Color.WHITE.getRGB());
		firstEndCylinder.setAppearance(sharedApp);
		secondEndCylinder.setAppearance(sharedApp);
		connectorCylinder.setAppearance(sharedApp);
	}

	private void setPositions() {
		endOne.setPosition(firstEndCylinder);
		endTwo.setPosition(secondEndCylinder);
		connector.setPosition(connectorCylinder);
	}

	private void addCylinders() {
		this.addChild(endOne.group);
		this.addChild(endTwo.group);
		this.addChild(connector.group);
	}

	public void setColor(int color) {
		// firstEndCylinder.setColor(color);
		// secondEndCylinder.setColor(color);
		// connectorCylinder.setColor(color);
		sharedApp.getColoringAttributes().setColor(new Color3f(new Color(color)));
	}

	@Override
	public void setUserData(Object userData) {
		firstEndCylinder.setUserData(userData);
		secondEndCylinder.setUserData(userData);
		connectorCylinder.setUserData(userData);
	}

	@Override
	public Appearance getAppearance(int partId) {
		return getShape(partId).getAppearance();
	}

	@Override
	public Shape3D getShape(int partid) {
		return (Shape3D) getChild(partid);
	}

	@Override
	public void setAppearance(Appearance ap) {
		Enumeration<Shape3D> children = this.getAllChildren();
		while (children.hasMoreElements()) {
			children.nextElement().setAppearance(ap);
		}
	}
}
