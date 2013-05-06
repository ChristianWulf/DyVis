package prototypes.observer.impl;

import prototypes.observer.AbstractObservable;
import prototypes.observer.IObserver;
import prototypes.observer.ItemCreatedListener;
import prototypes.observer.ItemDestroyedListener;


public class Subject extends AbstractObservable {

	/**
	 * Example method
	 */
	private void createSomething() {
		notifyListeners(ItemCreatedListener.class, "ItemCreatedListener");
	}

	/**
	 * Example method
	 */
	private void destroySomething() {
		notifyListeners(ItemDestroyedListener.class, "ItemDestroyedListener");
	}

	public static void main(String[] args) {
		Subject subject = new Subject();

		IObserver obs = new CreateDestroyObserver();
		subject.addListener(ItemCreatedListener.class, obs);
		subject.addListener(ItemDestroyedListener.class, obs);
		obs = new CreateObserver();
		subject.addListener(ItemCreatedListener.class, obs);

		subject.createSomething();
		System.out.println("----------------------------");
		subject.createSomething();
		System.out.println("----------------------------");
		subject.destroySomething();
		System.out.println("----------------------------");
	}
}
