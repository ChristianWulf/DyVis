package cau.se.chw.main;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

import cau.se.chw.controller.ISceneController;
import cau.se.chw.controller.impl.MenuBarController;
import cau.se.chw.controller.impl.SceneController;
import cau.se.chw.controller.impl.TraceController;
import cau.se.chw.importers.IDynamicsImporter;
import cau.se.chw.importers.IStaticsImporter;
import cau.se.chw.importers.KDMImporter_v1_1;
import cau.se.chw.importers.KiekerImporter;
import cau.se.chw.main.utils.Configuration;
import cau.se.chw.main.utils.Configuration.ELanguage;
import cau.se.chw.mapper.MetaphorSourceMapper;
import cau.se.chw.mapper.SceneMetaphorMapper;
import cau.se.chw.model.AbstractFeatureModel;
import cau.se.chw.model.impl.FeatureModel;
import cau.se.chw.model.impl.MetaphorModel;
import cau.se.chw.model.impl.SceneModel;
import cau.se.chw.model.impl.SourceModel;
import cau.se.chw.view.GUI;

public class Main {

	private static final Properties languageData = new Properties();

	public static String getRuntimeFolder() {
		return System.getProperty("user.dir") + File.separatorChar;
	}

	private static void loadLanguageFile(final ELanguage language) {
		Locale locale;
		switch (language) {
		/*
		 * case DE: locale = new Locale("de", "DE"); break;
		 */
		case EN:
			locale = new Locale("en", "EN");
			break;
		default:
			locale = new Locale("en", "EN");
		}

		// src/resource/...
		String fileName = "/resource/language_" + locale.getLanguage() + "_" + locale.getCountry()
				+ ".properties";

		try {
			languageData.load(Main.class.getResourceAsStream(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getLanguageString(final String key) {
		return languageData.getProperty(key);
	}

	public static void main(String[] args) {
		Configuration config = Configuration.getInstance();
		loadLanguageFile(config.getLanguage());
		// ---------------------------------------------------------------
		final AbstractFeatureModel featureModel = new FeatureModel();
		final SourceModel sourceModel = new SourceModel();
		final MetaphorModel metaphorModel = new MetaphorModel();
		final SceneModel sceneModel = new SceneModel();
		// ---------------------------------------------------------------
		// IStaticsImporter staImporter = new StaticsImporter(featureModel);
		IStaticsImporter staImporter = new KDMImporter_v1_1(featureModel);
//		IStaticsImporter staImporter = new KDMImporter_v1_2(featureModel);
//		IStaticsImporter staImporter = new KDMImporterJiBX(featureModel);
		IDynamicsImporter dynImporter = new KiekerImporter(featureModel);
		// ---------------------------------------------------------------
		final ISceneController sceneCtrl = new SceneController(featureModel, sourceModel);
		// ---------------------------------------------------------------
		MetaphorSourceMapper metaphorSourceMapper = new MetaphorSourceMapper(metaphorModel,
				sourceModel);
		SceneMetaphorMapper sceneMetaphorMapper = new SceneMetaphorMapper(sceneModel, metaphorModel);
		// ---------------------------------------------------------------
		featureModel.addListener(sceneCtrl);
		sourceModel.addListener(metaphorSourceMapper);
		metaphorModel.addListener(sceneMetaphorMapper);
		// ---------------------------------------------------------------
		TraceController.getInstance().init(featureModel, sourceModel, sceneCtrl);
		MenuBarController.getInstance().init(sceneCtrl, staImporter, dynImporter);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI(sceneCtrl, sourceModel, sceneModel).setVisible(true);
			}
		});
	}

}
