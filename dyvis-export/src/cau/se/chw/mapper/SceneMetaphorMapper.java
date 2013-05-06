package cau.se.chw.mapper;

import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Group;
import javax.media.j3d.Node;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3d;

import metaphor.dataTypes.SceneElement;
import metaphor.dataTypes.StaticElement;
import metaphor.visualization.Building;
import metaphor.visualization.District;
import metaphor.visualization.Floor;
import metaphor.visualization.Street;
import prototypes.observer.IObserver;
import prototypes.observer.IRegisterableObserver;
import cau.se.chw.model.impl.MetaphorModel;
import cau.se.chw.model.impl.SceneModel;
import cau.se.chw.observers.ObsDynamicsCleared;
import cau.se.chw.observers.ObsFloorAdded;
import cau.se.chw.observers.ObsFloorRemoved;
import cau.se.chw.observers.ObsStaticsLoaded;
import cau.se.chw.observers.ObsStreetAdded;
import cau.se.chw.observers.ObsStreetRemoved;
import cau.se.chw.view.city.FlexiblePipe;
import cau.se.chw.view.city.MyBox;
import cau.se.chw.view.city.SceneCreator;

import com.sun.j3d.utils.geometry.Box;

public class SceneMetaphorMapper implements IRegisterableObserver {

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(SceneMetaphorMapper.class.getName());
	private static final float CYLINDER_RADIUS = 0.01f;
	private static final float OFFSET_PIPE = .05f;
	private final Highlighter highlighter = new Highlighter();
	private final MetaphorModel metaphor;
	private final SceneModel scene;

	/**
	 * Constructs a new instance of {@link SceneMetaphorMapper}.
	 * 
	 * @param scene
	 * @param metaphor
	 */
	public SceneMetaphorMapper(SceneModel scene, MetaphorModel metaphor) {
		this.scene = scene;
		this.metaphor = metaphor;
	}

	@Override
	public void update(Object caller, java.lang.Class<? extends IObserver> clazz, Object arg) {
		if (ObsFloorAdded.class.isAssignableFrom(clazz)) {
			onFloorAdded((Floor) arg);
		} else if (ObsFloorRemoved.class.isAssignableFrom(clazz)) {
			onFloorRemoved((Floor) arg);
		} else if (ObsStreetAdded.class.isAssignableFrom(clazz)) {
			onStreetAdded((Street) arg);
		} else if (ObsStreetRemoved.class.isAssignableFrom(clazz)) {
			onStreetRemoved((Street) arg);
		} else if (ObsStaticsLoaded.class.isAssignableFrom(clazz)) {
			onStaticsLoaded((District) arg);
		} else if (ObsDynamicsCleared.class.isAssignableFrom(clazz)) {
			OnDynamicsCleared();
		} else {
			logger.warning("Unknown observer group: " + clazz);
		}
	}

	private void OnDynamicsCleared() {
		// TODO Auto-generated method stub
		highlighter.reset();
	}

	private void onStaticsLoaded(District district) {
		BranchGroup bg = SceneCreator.createBG();
		bg.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
		bg.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);

		traversPreOrder(bg, district);

		scene.reloadScene(bg);
	}

	private void onFloorAdded(Floor floor) {
		MyBox box = new MyBox(floor.getHeight(), floor.getBuilding().getLength(), floor
				.getBuilding().getWidth());
		box.setColor(floor.getColor());

		map1To1(floor, box);

		Box buildingBox = (Box) floor.getBuilding().getSceneObject();
		scene.addAsBranchGroup(floor.getRelPosition(), buildingBox, box, box.getBorder());
	}

	private void onFloorRemoved(Floor floor) {
		removeSceneElementFromScene(floor);
	}

	private void onStreetAdded(Street street) {
		FlexiblePipe pipe;
		if (hasSameCallerAndCallee(street)) {
			pipe = createPrivateLink(street);
		} else if (isEntryPoint(street)) {
			pipe = createEntryLink(street);
		} else if (hasSameBuilding(street)) {
			pipe = createFamiliarLink(street);
		} else {
			pipe = createPublicLink(street);
		}
		pipe.setColor(street.getColor());

		map1To1(street, pipe);

		scene.addAsBranchGroup(pipe);
		highlighter.setNewHighlight(street);
	}

	private void onStreetRemoved(Street street) {
		highlighter.revertLastHighlight();
		removeSceneElementFromScene(street);
	}

	// ----------------------------------------------------------------

	private void traversPreOrder(Group drawSurfaceGroup, District root) {
		// root
		MyBox districtBox = new MyBox(root.getAltitude(), root.getLength(), root.getWidth());
		districtBox.setColor(root.getColor());
		this.map1To1(root, districtBox);
		// set root's relative position
		Vector3d pos = root.getRelPosition();
		TransformGroup tgParent = SceneCreator.createTG(pos);
		tgParent.addChild(districtBox);
		tgParent.addChild(districtBox.getBorder());

		Vector3d contextTrans = root.getContextTransformation();
		TransformGroup tg = SceneCreator.createTG(contextTrans);
		tgParent.addChild(tg);

		for (StaticElement child : root.getChildren()) {
			if (child instanceof District) {
				// recursive call
				traversPreOrder(tg, (District) child);
			} else if (child instanceof Building) {
				TransformGroup tgBuildingPos = createBuildingBox((Building) child);
				// add to root district
				tg.addChild(tgBuildingPos);
			}
		}

		drawSurfaceGroup.addChild(tgParent); // root
	}

	private TransformGroup createBuildingBox(Building building) {
		MyBox buildingBox = new MyBox(building.getHeight(), building.getLength(), building
				.getWidth());
		buildingBox.setColor(building.getColor());
		buildingBox.setTransparency(building.getTransparency());
		// buildingBox.setTexture(b.getTexture());
		this.map1To1(building, buildingBox);

		// set relative position
		TransformGroup tgBuildingPos = SceneCreator.createTG(building.getRelPosition());
		tgBuildingPos.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
		tgBuildingPos.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);
		tgBuildingPos.addChild(buildingBox);
		tgBuildingPos.addChild(buildingBox.getBorder());

		return tgBuildingPos;
	}

	private void map1To1(SceneElement scene, Node node) {
		scene.setSceneObject(node);
		node.setUserData(scene);
	}

	private FlexiblePipe createPrivateLink(Street street) {
		Vector3d temp = new Vector3d();
		// Vector3d direction = new Vector3d();
		Box callerBox = (Box) street.getCallerFloor().getSceneObject();
		// Box calleeBox = (Box) street.getCalleeFloor().getSceneObject();

		Vector3d firstPos = street.getCallerFloor().getAbsPosition();
		Vector3d fourthPos = street.getCalleeFloor().getAbsPosition();

		temp.set(firstPos);
		temp.x += callerBox.getXdimension() + OFFSET_PIPE;
		temp.z += callerBox.getZdimension() + OFFSET_PIPE;
		Vector3d secondPos = new Vector3d(temp);

		temp.set(firstPos);
		temp.x += callerBox.getXdimension() + OFFSET_PIPE;
		temp.z -= callerBox.getZdimension() + OFFSET_PIPE;
		Vector3d thirdPos = new Vector3d(temp);
		return new FlexiblePipe(CYLINDER_RADIUS, firstPos, secondPos, thirdPos, fourthPos);
	}

	private FlexiblePipe createEntryLink(Street street) {
		Vector3d temp = new Vector3d();
		Vector3d direction = new Vector3d();
		Box calleeBox = (Box) street.getCalleeFloor().getSceneObject();

		Vector3d firstPos = street.getCallerFloor().getAbsPosition();
		firstPos.x += calleeBox.getXdimension() + OFFSET_PIPE;
		Vector3d fourthPos = street.getCalleeFloor().getAbsPosition();

		temp.set(fourthPos);
		temp.x += calleeBox.getXdimension() + OFFSET_PIPE;
		Vector3d thirdPos = new Vector3d(temp);

		direction.sub(thirdPos, firstPos);
		temp.scaleAdd(.5, direction, firstPos);
		Vector3d secondPos = new Vector3d(temp);

		return new FlexiblePipe(CYLINDER_RADIUS, firstPos, secondPos, thirdPos, fourthPos);
	}

	private FlexiblePipe createFamiliarLink(Street street) {
		Vector3d temp = new Vector3d();
		Box callerBox = (Box) street.getCallerFloor().getSceneObject();
		Box calleeBox = (Box) street.getCalleeFloor().getSceneObject();

		Vector3d firstPos = street.getCallerFloor().getAbsPosition();
		Vector3d fourthPos = street.getCalleeFloor().getAbsPosition();

		temp.set(firstPos);
		temp.x += callerBox.getXdimension() + OFFSET_PIPE;
		Vector3d secondPos = new Vector3d(temp);

		temp.set(firstPos);
		temp.x += calleeBox.getXdimension() + OFFSET_PIPE;
		Vector3d thirdPos = new Vector3d(temp);
		return new FlexiblePipe(CYLINDER_RADIUS, firstPos, secondPos, thirdPos, fourthPos);
	}

	private FlexiblePipe createPublicLink(Street street) {
		return new FlexiblePipe(CYLINDER_RADIUS, street.getCallerFloor().getAbsPosition(), street
				.getCalleeFloor().getAbsPosition());
	}

	private void removeSceneElementFromScene(SceneElement se) {
		Node sceneElement = (Node) se.getSceneObject();
		se.setSceneObject(null); // for gc
		scene.removeFromBranchGroup(sceneElement);
	}

	private boolean hasSameBuilding(Street street) {
		Building callerBuilding = street.getCallerFloor().getBuilding();
		Building calleeBuilding = street.getCalleeFloor().getBuilding();
		return (callerBuilding == calleeBuilding);
	}

	private boolean isEntryPoint(Street street) {
		return (null == street.getCallerFloor().getSourceObject());
	}

	private boolean hasSameCallerAndCallee(Street street) {
		return street.getCallerFloor() == street.getCalleeFloor();
	}

	@Override
	public List<Class<? extends IObserver>> getRegisterableObserverGroups() {
		List<Class<? extends IObserver>> list = new ArrayList<Class<? extends IObserver>>();
		list.add(ObsFloorAdded.class);
		list.add(ObsFloorRemoved.class);
		list.add(ObsStreetAdded.class);
		list.add(ObsStreetRemoved.class);
		list.add(ObsStaticsLoaded.class);
		list.add(ObsDynamicsCleared.class);
		return list;
	}

}
