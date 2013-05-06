package cau.se.chw.view.city;

import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;

import metaphor.dataTypes.StaticElement;

public class ViewLogger {
	
	private ViewLogger() {
	}

	public static void printVworld(Node node) {
		Transform3D real = new Transform3D();
		node.getLocalToVworld(real);
		System.out.println(real);
	}

	public static void printStaticElement(StaticElement ele) {
		System.out.println(ele.getClass().getName() + ".name:\t\t " + ele.getName());
		System.out.println(ele.getClass().getName() + ".pos:\t\t " + ele.getRelPosition().getX()
				+ ", " + ele.getRelPosition().getY() + ", " + ele.getRelPosition().getZ());
		System.out.println(ele.getClass().getName() + ".color:\t\t " + ele.getColor());
		System.out.println(ele.getClass().getName() + ".length+width:\t" + ele.getLength() + ", "
				+ ele.getWidth());
		System.out.println("-----------------------------------------------------");
	}
}
