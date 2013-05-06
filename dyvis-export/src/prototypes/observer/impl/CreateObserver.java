package prototypes.observer.impl;

import prototypes.observer.IObserver;
import prototypes.observer.ItemCreatedListener;

public class CreateObserver implements ItemCreatedListener {

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		System.out.println("CreateObserver.update()");
	}

}
