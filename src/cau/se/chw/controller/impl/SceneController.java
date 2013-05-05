package cau.se.chw.controller.impl;

import java.util.ArrayList;
import java.util.List;

import prototypes.observer.AbstractObservable;
import prototypes.observer.IObserver;
import cau.se.chw.controller.ISceneController;
import cau.se.chw.model.AbstractFeatureModel;
import cau.se.chw.model.impl.SourceModel;
import cau.se.chw.observers.ObsDynamicsLoaded;
import cau.se.chw.observers.ObsStaticsLoaded;
import feature.dynamics.DClassInstance;

/**
 * {@inheritDoc}
 * @author chw
 *
 */
public class SceneController extends AbstractObservable implements ISceneController {

	private final static java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(SceneController.class.getName());
	private final AbstractFeatureModel featureModel;
	private final SourceModel sourceModel;

	/**
	 * Constructs a new instance of {@link SceneController}.
	 * @param featureModel
	 * @param sourceModel
	 */
	public SceneController(AbstractFeatureModel featureModel, SourceModel sourceModel) {
		this.featureModel = featureModel;
		this.sourceModel = sourceModel;
	}

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		if (ObsStaticsLoaded.class.isAssignableFrom(clazz)) {
			onStaticsLoaded();
		} else if (ObsDynamicsLoaded.class.isAssignableFrom(clazz)) {
			onDynamicsLoaded();
		} else {
			logger.warning("Unknown observer group: " + clazz);
		}
	}

	private void onStaticsLoaded() {
		sourceModel.clear();
		sourceModel.setRootPackage(featureModel.getFirstPackage());
		
		notifyListeners(ObsStaticsLoaded.class, featureModel);
	}

	private void onDynamicsLoaded() {
		sourceModel.clearDynamics();
		
		List<DClassInstance> staticInstances = featureModel.getStaticClassInstances();
		for (DClassInstance ci : staticInstances) {
			sourceModel.addClassInstance(ci);
		}
		
		notifyListeners(ObsDynamicsLoaded.class, featureModel);
	}

	@Override
	public List<Class<? extends IObserver>> getRegisterableObserverGroups() {
		List<Class<? extends IObserver>> list = new ArrayList<Class<? extends IObserver>>();
		list.add(ObsStaticsLoaded.class);
		list.add(ObsDynamicsLoaded.class);
		return list;
	}

}
