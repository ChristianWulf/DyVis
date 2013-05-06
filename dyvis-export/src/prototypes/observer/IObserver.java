package prototypes.observer;


public interface IObserver {

	void update(Object caller, java.lang.Class<? extends IObserver> clazz, Object arg);
}
