package cau.se.chw.controller;

import prototypes.observer.IRegisterableObserver;
import cau.se.chw.model.IFeatureModel;
import cau.se.chw.model.impl.SourceModel;

/**
 * Decouples the {@link IFeatureModel} from the {@link SourceModel}.
 * 
 * @author chw
 * 
 */
public interface ISceneController extends IRegisterableObserver {

	public void addListener(IRegisterableObserver listener);
}
