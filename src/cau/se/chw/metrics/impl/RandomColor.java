package cau.se.chw.metrics.impl;

import java.awt.Color;
import java.util.Random;

import cau.se.chw.metrics.IColorMetric;


public class RandomColor<T> implements IColorMetric<T> {

	private final Random rand;

	public RandomColor() {
		rand = new Random();
	}
	
	public Color randomColor()
    {
        return(new Color(rand.nextInt(256), 
                         rand.nextInt(256),
                         rand.nextInt(256)));
    }
	
	@Override
	public int getColor(T object) {
		return randomColor().getRGB();
	}

}
