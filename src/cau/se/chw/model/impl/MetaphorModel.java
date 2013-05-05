package cau.se.chw.model.impl;

import metaphor.visualization.District;
import metaphor.visualization.Floor;
import metaphor.visualization.Street;
import prototypes.observer.AbstractObservable;
import cau.se.chw.observers.ObsDynamicsCleared;
import cau.se.chw.observers.ObsFloorAdded;
import cau.se.chw.observers.ObsFloorRemoved;
import cau.se.chw.observers.ObsStaticsLoaded;
import cau.se.chw.observers.ObsStreetAdded;
import cau.se.chw.observers.ObsStreetRemoved;

public class MetaphorModel extends AbstractObservable {

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(MetaphorModel.class.getName());
	private District root;
	
	public void setRoot(District root) {
		this.root = root;
		notifyListeners(ObsStaticsLoaded.class, root);
	}

	public District getRoot() {
		return root;
	}

	public void addStreet(Street street) {
		notifyListeners(ObsStreetAdded.class, street);
	}

	public void removeStreet(Street street) {
		notifyListeners(ObsStreetRemoved.class, street);
	}

	public void addFloor(Floor floor) {
		notifyListeners(ObsFloorAdded.class, floor);
	}

	public void removeFloor(Floor floor) {
		floor.setBuilding(null); // removes itself from building's floors
		notifyListeners(ObsFloorRemoved.class, floor);
	}

	public void clearDynamics() {
		// TODO Auto-generated method stub
		notifyListeners(ObsDynamicsCleared.class, null);
	}

}
