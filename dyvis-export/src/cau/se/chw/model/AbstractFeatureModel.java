package cau.se.chw.model;

import java.util.List;

import prototypes.observer.AbstractObservable;
import feature.dynamics.DClassInstance;

public abstract class AbstractFeatureModel extends AbstractObservable implements IFeatureModel {

	public abstract List<DClassInstance> getStaticClassInstances();
}
