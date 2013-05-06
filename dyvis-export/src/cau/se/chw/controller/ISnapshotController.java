package cau.se.chw.controller;

import java.io.IOException;

import javax.media.j3d.Canvas3D;

public interface ISnapshotController {

	void makeAndSaveSnapshot(String filename) throws IOException;

	void setCanvas(Canvas3D canvas);
}
