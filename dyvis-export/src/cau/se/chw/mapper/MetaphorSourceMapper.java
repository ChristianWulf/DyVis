package cau.se.chw.mapper;

import java.util.ArrayList;
import java.util.List;

import metaphor.dataTypes.SceneElement;
import metaphor.visualization.Building;
import metaphor.visualization.District;
import metaphor.visualization.Floor;
import metaphor.visualization.Street;
import metaphor.visualization.VisualizationFactory;
import metaphor.visualization.impl.VisualizationFactoryImpl;
import metaphor.visualization.impl.VisualizationPackageImpl;
import prototypes.observer.IObserver;
import prototypes.observer.IRegisterableObserver;
import cau.se.chw.model.impl.MetaphorModel;
import cau.se.chw.model.impl.SourceModel;
import cau.se.chw.observers.ObsClassInstanceAdded;
import cau.se.chw.observers.ObsClassInstanceRemoved;
import cau.se.chw.observers.ObsDynamicsCleared;
import cau.se.chw.observers.ObsMethodInstanceAdded;
import cau.se.chw.observers.ObsMethodInstanceRemoved;
import cau.se.chw.observers.ObsStaticsLoaded;
import feature.common.IComponent;
import feature.common.IInfoElement;
import feature.dynamics.DClassInstance;
import feature.dynamics.DMethodInstance;
import feature.statics.DClass;
import feature.statics.DPackage;

public class MetaphorSourceMapper implements IRegisterableObserver {

	private final static java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(MetaphorSourceMapper.class.getName());
	private final SourceModel source;
	private final MetaphorModel metaphor;
	private final CityMetricApplier metric = new CityMetricApplier();
	private final CityLayoutManager layout = new CityLayoutManager();
	private final VisualizationFactory factory;

	/**
	 * Constructs a new instance of {@link MetaphorSourceMapper}.
	 * 
	 * @param metaphor
	 * @param source
	 */
	public MetaphorSourceMapper(MetaphorModel metaphor, SourceModel source) {
		this.source = source;
		this.metaphor = metaphor;
		VisualizationPackageImpl.init();
		this.factory = VisualizationFactoryImpl.eINSTANCE;
	}

	@Override
	public void update(Object caller, java.lang.Class<? extends IObserver> clazz, Object arg) {
		if (ObsMethodInstanceAdded.class.isAssignableFrom(clazz)) {
			onMethodInstanceAdded((DMethodInstance) arg);
		} else if (ObsMethodInstanceRemoved.class.isAssignableFrom(clazz)) {
			onMethodInstanceRemoved((DMethodInstance) arg);
		} else if (ObsClassInstanceAdded.class.isAssignableFrom(clazz)) {
			onClassInstanceAdded((DClassInstance) arg);
		} else if (ObsClassInstanceRemoved.class.isAssignableFrom(clazz)) {
			onClassInstanceRemoved((DClassInstance) arg);
		} else if (ObsStaticsLoaded.class.isAssignableFrom(clazz)) {
			onStaticsLoaded((DPackage) arg);
		} else if (ObsDynamicsCleared.class.isAssignableFrom(clazz)) {
			OnDynamicsCleared();
		} else {
			logger.warning("Unknown observer group: " + clazz);
		}
	}

	private void OnDynamicsCleared() {
		// TODO Auto-generated method stub
		metaphor.clearDynamics();
	}

	private void onMethodInstanceAdded(DMethodInstance arg) {
		Street street = factory.createStreet();
		street.setName(arg.getParent().getName());

		setFloors(street, arg);
		map1To1(street, arg);

		metric.apply(street, arg);
		layout.arrange(street);
		metaphor.addStreet(street);
	}

	private void onMethodInstanceRemoved(DMethodInstance arg) {
		metaphor.removeStreet((Street) arg.getMetaphorObject());
	}

	private void onClassInstanceAdded(DClassInstance arg) {
		Floor floor = factory.createFloor();
		floor.setName(arg.getParent().getName());

		setBuilding(floor, arg);
		map1To1(floor, arg);

		metric.apply(floor);
		layout.arrange(floor);
		metaphor.addFloor(floor);
	}

	private void onClassInstanceRemoved(DClassInstance arg) {
		metaphor.removeFloor((Floor) arg.getMetaphorObject());
	}

	private void onStaticsLoaded(DPackage package1) {
		District district = traversePackage(package1);

		layout.arrange(district);
		metaphor.setRoot(district);
	}

	// ------------------------------------------------------------------

	private void map1To1(SceneElement scene, IInfoElement info) {
		scene.setSourceObject(info);
		info.setMetaphorObject(scene);
	}

	private void setBuilding(Floor floor, DClassInstance arg) {
		Building building = (Building) arg.getParent().getMetaphorObject();
		floor.setBuilding(building);
	}

	private District traversePackage(DPackage parent) {
		// process parent package
		District district = createAndMapDistrict(parent);

		// process children
		for (IComponent child : parent.getChildren()) {
			if (child instanceof DPackage) {
				// recursive call
				District subdistrict = traversePackage((DPackage) child);
				district.getChildren().add(subdistrict);
			} else if (child instanceof DClass) {
				Building building = createAndMapBuilding((DClass) child);
				district.getChildren().add(building);
			} else {
				logger.warning("Unknown static element: " + child);
			}
		}

		return district;
	}

	private District createAndMapDistrict(DPackage package1) {
		District district = factory.createDistrict();
		district.setName(package1.getName());

		map1To1(district, package1);
		metric.apply(district);
		return district;
	}

	private Building createAndMapBuilding(DClass class1) {
		Building building = factory.createBuilding();
		building.setName(class1.getName());

		map1To1(building, class1);
		metric.apply(building, class1);
		return building;
	}

	private void setFloors(Street street, DMethodInstance arg) {
		Floor callee = (Floor) arg.getCalleeClassInstance().getMetaphorObject();

		if (null == callee) {
			throw new IllegalStateException(
					"Corresponding class instance has not been added yet. ("
							+ arg.getCalleeClassInstance().getParent().getName() + ")");
		}

		Floor caller;
		if (null != arg.getCallerClassInstance()) {
			caller = (Floor) arg.getCallerClassInstance().getMetaphorObject();
		} else {
			caller = createEntryPointFloor(callee);
		}

		street.setCalleeFloor(callee);
		street.setCallerFloor(caller);
	}

	private Floor createEntryPointFloor(Floor callee) {
		Floor dummy = factory.createFloor();
		dummy.setBuilding(callee.getBuilding()); // TODO describe reason
		dummy.setSourceObject(null); // to identify dummy/entry floor
		return dummy;
	}

	@Override
	public List<Class<? extends IObserver>> getRegisterableObserverGroups() {
		List<Class<? extends IObserver>> list = new ArrayList<Class<? extends IObserver>>();
		list.add(ObsMethodInstanceAdded.class);
		list.add(ObsMethodInstanceRemoved.class);
		list.add(ObsClassInstanceAdded.class);
		list.add(ObsClassInstanceRemoved.class);
		list.add(ObsStaticsLoaded.class);
		list.add(ObsDynamicsCleared.class);
		return list;
	}
}
