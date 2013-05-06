package prototypes.observer.impl;

import prototypes.observer.IObserver;
import prototypes.observer.ItemCreatedListener;
import prototypes.observer.ItemDestroyedListener;

public class CreateDestroyObserver implements ItemCreatedListener, ItemDestroyedListener {

	@Override
	public void update(Object caller, Class<? extends IObserver> clazz, Object arg) {
		if (ItemCreatedListener.class.isAssignableFrom(clazz)) {
			System.out.println("CreateDestroyObserver.update(create)");			
		} else if (ItemDestroyedListener.class.isAssignableFrom(clazz)) {
			System.out.println("CreateDestroyObserver.update(destroy)");
		}
	}

}
