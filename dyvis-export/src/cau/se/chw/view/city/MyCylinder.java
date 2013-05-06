package cau.se.chw.view.city;

import java.awt.Color;

import javax.media.j3d.Appearance;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Shape3D;
import javax.vecmath.Color3f;

import com.sun.j3d.utils.geometry.Cylinder;

public class MyCylinder extends Cylinder {

	public MyCylinder(float cylinderRadius, double length) {
		super(cylinderRadius, (float) length);
		this.setCapability(ENABLE_PICK_REPORTING);
	}

	public void setColor(int color) {
		Appearance app = createAppearance(color);
		this.setAppearance(app);
	}
	
	public static Appearance createAppearance(int color) {
		Color3f c = new Color3f(new Color(color));

		ColoringAttributes cAttr = new ColoringAttributes(c, ColoringAttributes.FASTEST);
		cAttr.setCapability(ColoringAttributes.ALLOW_COLOR_READ);
		cAttr.setCapability(ColoringAttributes.ALLOW_COLOR_WRITE);

		Appearance app = new Appearance();
		app.setCapability(Shape3D.ALLOW_APPEARANCE_READ);
		app.setCapability(Shape3D.ALLOW_APPEARANCE_WRITE);
		app.setCapability(Appearance.ALLOW_COLORING_ATTRIBUTES_READ);
		app.setCapability(Appearance.ALLOW_COLORING_ATTRIBUTES_WRITE);
		app.setColoringAttributes(cAttr);
		
		return app;
	}

	public void setTransparency(float transparency) {
		// TODO Auto-generated method stub

	}
}
