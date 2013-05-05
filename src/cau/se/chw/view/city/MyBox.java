package cau.se.chw.view.city;

import java.awt.Color;

import javax.media.j3d.Appearance;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.LineAttributes;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransparencyAttributes;
import javax.vecmath.Color3f;

import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.Primitive;

/**
 * A j3d default Box with the following additional properties:
 * <ul>
 * <li>enabled picking report, i.e. pickable/selectable
 * <li>wrapper method to easily (re)set the color
 * </ul>
 * 
 * @author chw
 * 
 */
public class MyBox extends Box {

	private static final Color3f COLOR_BORDER = new Color3f(Color.BLACK);
	private Primitive border;

	/**
	 * Constructs a new instance of {@link MyBox}.
	 * 
	 * @param height
	 * @param length
	 * @param width
	 */
	public MyBox(float height, float length, float width) {
		super(width, height, length, new Appearance());
		this.setCapability(ENABLE_PICK_REPORTING);
		enableSelectionColoring();
		createBorderBox();
	}

	private void enableSelectionColoring() {
		Appearance app = this.getAppearance();
		app.setCapability(Shape3D.ALLOW_APPEARANCE_READ);
		app.setCapability(Shape3D.ALLOW_APPEARANCE_WRITE);
		app.setCapability(Appearance.ALLOW_COLORING_ATTRIBUTES_READ);
		app.setCapability(Appearance.ALLOW_COLORING_ATTRIBUTES_WRITE);
//		this.setAppearance(app);
		ColoringAttributes cAttr = new ColoringAttributes();
		cAttr.setShadeModel(ColoringAttributes.FASTEST);
		cAttr.setCapability(ColoringAttributes.ALLOW_COLOR_READ);
		cAttr.setCapability(ColoringAttributes.ALLOW_COLOR_WRITE);
		app.setColoringAttributes(cAttr);
	}

	private void createBorderBox() {
		PolygonAttributes polygonAttributes = new PolygonAttributes();
		polygonAttributes.setPolygonMode(PolygonAttributes.POLYGON_LINE);
		polygonAttributes.setCullFace(PolygonAttributes.CULL_BACK);

		ColoringAttributes coloringAttributes = new ColoringAttributes();
		coloringAttributes.setColor(COLOR_BORDER);
		coloringAttributes.setShadeModel(ColoringAttributes.FASTEST);

		LineAttributes lineAttributes = new LineAttributes();
		lineAttributes.setLineWidth(.5f);
		lineAttributes.setLinePattern(LineAttributes.PATTERN_SOLID);
		lineAttributes.setLineAntialiasingEnable(true);

		Appearance app = new Appearance();
		app.setPolygonAttributes(polygonAttributes);
		app.setColoringAttributes(coloringAttributes);
		app.setLineAttributes(lineAttributes);

		border = new Cuboid(this.getXdimension(), this.getYdimension(), this.getZdimension(), app);
		border.setPickable(false);
	}

	public void setColor(int color) {
		Color3f c = new Color3f(new Color(color));
		this.getAppearance().getColoringAttributes().setColor(c);
	}

	public void setTransparency(float transparency) {
		TransparencyAttributes ta = new TransparencyAttributes();
		ta.setTransparencyMode(TransparencyAttributes.BLENDED);
		ta.setTransparency(transparency);

		Appearance app = this.getAppearance();
		app.setTransparencyAttributes(ta);
	}

//	public static Appearance createMatAppear(Color3f dColor, Color3f sColor, float shine) {
//		Material material = new Material();
//		material.setDiffuseColor(dColor);
//		material.setSpecularColor(sColor);
//		material.setShininess(shine);
//
//		Appearance app = new Appearance();
//		app.setMaterial(material);
//		return app;
//	}

	/**
	 * Returns the border box of this box.
	 * 
	 * @return
	 */
	public Primitive getBorder() {
		return border;
	}

}
