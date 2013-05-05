package prototypes.observer;

import java.util.List;

public interface IRegisterableObserver extends IObserver {

	List<Class<? extends IObserver>> getRegisterableObserverGroups();
}
