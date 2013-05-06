package cau.se.chw.view;

public class MyUserObject<T> {

	private final String name;
	private final T object;
	/**
	 * @param name
	 * @param object
	 */
	public MyUserObject(String name, T object) {
		super();
		this.name = name;
		this.object = object;
	}
	public String getName() {
		return name;
	}
	public T getGenericObject() {
		return object;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
