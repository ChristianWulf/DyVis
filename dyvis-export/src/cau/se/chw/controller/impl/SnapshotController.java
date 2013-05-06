package cau.se.chw.controller.impl;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.GraphicsContext3D;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Raster;

import cau.se.chw.controller.ISnapshotController;

public class SnapshotController implements ISnapshotController {

	public enum ImageType {
		JPEG;
	}

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final SnapshotController INSTANCE = new SnapshotController();
	}

	// TODO configure jpg quality
	private static final String IMAGE_FORMAT = "jpg";

	private Canvas3D canvas;

	/**
	 * Private constructor.
	 */
	private SnapshotController() {
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static SnapshotController getInstance() {
		return InstanceHolder.INSTANCE;
	}

	private BufferedImage takeScreenshot(Canvas3D canvas) {
		Dimension d = canvas.getSize();
		
		Raster ras = new Raster();
		ras.setType(Raster.RASTER_COLOR);
		ras.setCapability(Raster.ALLOW_IMAGE_READ);
		ras.setSize(d);
		ras.setImage(new ImageComponent2D(ImageComponent2D.FORMAT_RGB, d.width, d.height));

		GraphicsContext3D ctx = canvas.getGraphicsContext3D();
		ctx.readRaster(ras);
		// Now strip out the image info
		ImageComponent2D img_src = ras.getImage();
		// DepthComponent depth = ras.getDepthComponent();
		return img_src.getImage();
	}

	private void saveImage(BufferedImage bImage, String filename, ImageType imageType)
			throws IOException {
		switch (imageType) {
		case JPEG:
			File outputFile = new File(filename + ".jpeg");
			ImageIO.write(bImage, IMAGE_FORMAT, outputFile);
			break;
		default:
			break;
		}
	}

	public void makeAndSaveSnapshot(String filename) throws IOException {
		if (null == canvas) {
			throw new IllegalStateException("Canvas may not be mull.");
		}
		BufferedImage image = takeScreenshot(canvas);
		saveImage(image, filename, ImageType.JPEG);
	}

	public void setCanvas(Canvas3D canvas) {
		if (null == canvas) {
			throw new IllegalArgumentException("Parameter 'canvas' may not be null.");
		}
		this.canvas = canvas;
	}

}
