package cau.se.chw.mapper;

import java.awt.Color;

import metaphor.visualization.Building;
import metaphor.visualization.District;
import metaphor.visualization.Floor;
import metaphor.visualization.Street;
import cau.se.chw.metrics.IColorMetric;
import cau.se.chw.metrics.IHeightMetric;
import cau.se.chw.metrics.impl.FixedColor;
import cau.se.chw.metrics.impl.FixedHeight;
import cau.se.chw.metrics.impl.LevelColor;
import cau.se.chw.metrics.impl.StaticFloorColor;
import feature.metrics.AbsoluteDurationMetric;
import feature.metrics.IDynamicsMetric;
import feature.metrics.IStaticsMetric;
import feature.metrics.NOAMetric;
import feature.metrics.PercentDurationMetric;

public class CityMetricApplier {

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(CityMetricApplier.class.getName());

	private static final int COLOR_RED = new Color(220, 0, 0).getRGB();
	private static final int COLOR_ORANGE = new Color(255, 127, 36).getRGB();
	private static final int COLOR_YELLOW = new Color(238, 238, 0).getRGB();
	private static final int COLOR_BROWN = new Color(184, 134, 11).getRGB();
	private static final int COLOR_DARKBLUE = new Color(16, 78, 139).getRGB();
	private static final float WIDTH_5 = .5f;
	private static final float WIDTH_4 = .4f;
	private static final float WIDTH_3 = .3f;
	private static final float WIDTH_2 = .2f;
	private static final float WIDTH_1 = .1f;
	private static final Color DISTRICT_GREEN = new Color(0, 200, 0);
	private static final Color CLASS_BLUE = new Color(0, 0, 180);
	private static final float DISTRICT_HEIGHT = .02f;
	private static final float BUILDING_HEIGHT = .001f; // flat
	private static final float FLOOR_HEIGHT = .05f;
	private static final Color FLOOR_GRAY = new Color(100, 100, 100);
	private static final Color FLOOR_WHITE = Color.WHITE;

	private IHeightMetric<District> dheight;
	private IColorMetric<District> dcolor;
	private IHeightMetric<IStaticsMetric> bheight;
	private IColorMetric<IStaticsMetric> bcolor;
	private IHeightMetric<Floor> fheight;
	private IColorMetric<Floor> fcolor;

	public CityMetricApplier() {
		dheight = new FixedHeight<District>(DISTRICT_HEIGHT);
		dcolor = new LevelColor<District>();

		bheight = new FixedHeight<IStaticsMetric>(BUILDING_HEIGHT);
		bcolor = new FixedColor<IStaticsMetric>(CLASS_BLUE);

		fheight = new FixedHeight<Floor>(FLOOR_HEIGHT);
		// fcolor = new VaryingColor<Floor>(FLOOR_WHITE);
		fcolor = new StaticFloorColor();
	}

	public void apply(Street street, IDynamicsMetric metric) {
		if (metric instanceof PercentDurationMetric) {
			float durPercent = ((PercentDurationMetric) metric).getDurPercent();
			int color = getCategorizedColor(durPercent);
			street.setColor(color);
		} else if (metric instanceof AbsoluteDurationMetric) {

		}
	}

	public void apply(Floor floor) {
		floor.setColor(fcolor.getColor(floor));
		floor.setHeight(fheight.getHeight(floor));
	}

	private int getCategorizedColor(float durPercent) {
		if (durPercent > .8) {
			return COLOR_RED;
		} else if (durPercent > .4) {
			return COLOR_ORANGE;
		} else if (durPercent > .2) {
			return COLOR_YELLOW;
		} else if (durPercent > .1) {
			return COLOR_BROWN;
		} else {
			return COLOR_DARKBLUE;
		}
	}

	public void apply(Building building, IStaticsMetric metric) {
		building.setColor(bcolor.getColor(metric));
		building.setHeight(bheight.getHeight(metric));
		if (metric instanceof NOAMetric) {
			float width = getCategorizedWidth(((NOAMetric) metric).getNoa());
			building.setLength(width);
			building.setWidth(width);
		}
		// building.setTexture(value);
		// building.setTransparency(value);
	}

	private float getCategorizedWidth(int noa) {
		if (noa > 20) {
			return WIDTH_5;
		} else if (noa > 15) {
			return WIDTH_4;
		} else if (noa > 10) {
			return WIDTH_3;
		} else if (noa > 5) {
			return WIDTH_2;
		} else {
			return WIDTH_1;
		}
	}

	public void apply(District district) {
		district.setColor(dcolor.getColor(district));
		district.setAltitude(dheight.getHeight(district));
	}

	public IHeightMetric<District> getDheight() {
		return dheight;
	}

	public void setDheight(IHeightMetric<District> dheight) {
		this.dheight = dheight;
	}

	public IColorMetric<District> getDcolor() {
		return dcolor;
	}

	public void setDcolor(IColorMetric<District> dcolor) {
		this.dcolor = dcolor;
	}

	public IHeightMetric<IStaticsMetric> getBheight() {
		return bheight;
	}

	public void setBheight(IHeightMetric<IStaticsMetric> bheight) {
		this.bheight = bheight;
	}

	public IColorMetric<IStaticsMetric> getBcolor() {
		return bcolor;
	}

	public void setBcolor(IColorMetric<IStaticsMetric> bcolor) {
		this.bcolor = bcolor;
	}

	public IHeightMetric<Floor> getFheight() {
		return fheight;
	}

	public void setFheight(IHeightMetric<Floor> fheight) {
		this.fheight = fheight;
	}

	public IColorMetric<Floor> getFcolor() {
		return fcolor;
	}

	public void setFcolor(IColorMetric<Floor> fcolor) {
		this.fcolor = fcolor;
	}

}
