package cau.se.chw.view;

import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.Canvas3D;

import prototypes.observer.IObserver;
import prototypes.observer.IRegisterableObserver;
import cau.se.chw.main.utils.Configuration;
import cau.se.chw.model.impl.SceneModel;
import cau.se.chw.observers.ObsAntiAliasingChanged;

import com.sun.j3d.utils.universe.SimpleUniverse;

@SuppressWarnings("serial")
public class My3DSurface extends Canvas3D implements IRegisterableObserver {

	private final SceneModel sceneModel;

	public My3DSurface(SceneModel sceneModel) {
		super(SimpleUniverse.getPreferredConfiguration());
		this.sceneModel = sceneModel;

		loadScene();
		setAntiAliasing(Configuration.getInstance().isAntiAliasing());
		this.getView().setBackClipDistance(40);
	}

	private void loadScene() {
		this.sceneModel.load(this);
	}

	private void setAntiAliasing(Boolean aa) {
		this.getView().setSceneAntialiasingEnable(aa);
	}

	/**
	 * Releases resources.
	 */
	public void cleanUpScene() {
		this.sceneModel.unload();
	}

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		if (ObsAntiAliasingChanged.class.isAssignableFrom(clazz)) {
			setAntiAliasing((Boolean) arg);
		}
	}

	@Override
	public List<Class<? extends IObserver>> getRegisterableObserverGroups() {
		List<Class<? extends IObserver>> list = new ArrayList<Class<? extends IObserver>>();
		list.add(ObsAntiAliasingChanged.class);
		return list;
	}
}
