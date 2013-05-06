package prototypes.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractObservable {

	// TODO synchronize per value (i.e. observer group)

	private transient final Map<Class<? extends IObserver>, List<IObserver>> listeners = new HashMap<Class<? extends IObserver>, List<IObserver>>();

	/**
	 * Registers all available observer groups of the given
	 * <code>listener</code>.
	 * 
	 * @param listener
	 */
	public void addListener(IRegisterableObserver listener) {
		for (Class<? extends IObserver> group : listener.getRegisterableObserverGroups()) {
			addListener(group, listener);
		}
	}

	/**
	 * Adds the given <code>listener</code> to the observer group
	 * <code>clazz</code>, if not already added.
	 * 
	 * @param clazz
	 *            the observer group
	 * @param listener
	 * 
	 */
	public void addListener(Class<? extends IObserver> clazz, IObserver listener) {
		List<IObserver> list = listeners.get(clazz);
		if (null == list) {
			list = new ArrayList<IObserver>();
			listeners.put(clazz, list);
		}
		if (!list.contains(listener)) { // TODO search could be optimized
			list.add(listener);
		}
	}

	/**
	 * Removes the given <code>listener</code> from the observer group
	 * <code>clazz</code>.
	 * 
	 * @param clazz
	 *            the observer group
	 * @param listener
	 */
	public void removeListener(Class<? extends IObserver> clazz, IObserver listener) {
		List<IObserver> list = listeners.get(clazz);
		if (null != list) {
			list.remove(listener);
		}
	}

	/**
	 * Notifies each listener of the given observer group <code>clazz</code> and
	 * passes it the given parameter <code>arg</code>.
	 * 
	 * @param clazz
	 *            the observer group
	 * @param arg
	 *            an arbitrary parameter
	 */
	protected void notifyListeners(Class<? extends IObserver> clazz, final Object arg) {
		List<IObserver> list = listeners.get(clazz);
		if (null != list) {
			for (IObserver el : list) {
				el.update(this, clazz, arg);
			}
		}
	}

	/**
	 * Notifies each listener of the default observer group and passes it the
	 * given parameter <code>arg</code>.
	 * 
	 * @param arg
	 */
	/*
	 * protected void notifyListeners(final Object arg) { notifyListeners(clazz,
	 * arg); }
	 */
}
