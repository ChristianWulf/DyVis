package prototypes.generics;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Reflect {
	public List<Number> list;

	public static void main(String[] args) {
		Reflect reflect = new Reflect();
		reflect.list = new ArrayList<Number>();
		try {
			Field[] fields = reflect.getClass().getFields();
			for (int i = 0; i < fields.length; i++) {
				System.out.println("Field " + i + " " + fields[i].getGenericType().toString());
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}