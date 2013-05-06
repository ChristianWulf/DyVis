package cau.se.chw.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import cau.se.chw.controller.AbstractTraceController;
import cau.se.chw.controller.ISceneController;
import cau.se.chw.controller.impl.GUIController;
import cau.se.chw.main.utils.Configuration;
import cau.se.chw.model.impl.SceneModel;
import cau.se.chw.model.impl.SourceModel;
import cau.se.chw.observers.ObsInfoElementSelected;
import cau.se.chw.view.informationPanel.MyInformationBar;
import cau.se.chw.view.informationPanel.MyStatusBar;

/**
 * <code>GUI</code> creates and displays all visual components. It also serves
 * as facade in order to access the visual sub components.
 * 
 * @author chw
 * 
 */
@SuppressWarnings("serial")
public class GUI extends JFrame {

	private static final String TITLE = "DyVis";
	private My3DSurface surface3D;
	private MyMenuBar menubar;
	private MyStatusBar statusbar;
	private JPanel visPanel;
	private TraceControlBar traceControls;
	private TraceView traceView;
	private JPanel infoPanel;
	private MyInformationBar informationBar;
	private final ISceneController sceneCtrl;
	private final SourceModel sourceModel;
	private final SceneModel sceneModel;
	private JSplitPane splitpaneBottom;
	private JSplitPane splitpaneRight;
	private JPanel traceViewPanel;
	private JPanel panelSelection;
	private final GUIController controller;

	/**
	 * Constructs a new instance of {@link GUI}.
	 * 
	 * @param sceneCtrl
	 * @param sourceModel
	 * @param sceneModel
	 */
	public GUI(ISceneController sceneCtrl, SourceModel sourceModel, SceneModel sceneModel) {
		this.sceneCtrl = sceneCtrl;
		this.sourceModel = sourceModel;
		this.sceneModel = sceneModel;

		this.controller = GUIController.getInstance();

		preventPopupOverlap();
		setSystemLookAndFeel();
		createComponents();
		registerComponents();
		addComponentsToGUI();
		setWindowPreferences();
	}

	private void createComponents() {
		menubar = new MyMenuBar(this);
		visPanel = createVisualSurface();
		infoPanel = createInformationPanel();
		splitpaneBottom = createSplitPane(visPanel, infoPanel, JSplitPane.VERTICAL_SPLIT);
	}

	private JSplitPane createSplitPane(Component topCompo, Component bottomCompo, int newOrientation) {
		// workaround to resize canvas3d properly
		topCompo.setMaximumSize(new Dimension(0, 0));
		topCompo.setMinimumSize(new Dimension(0, 0));

		JSplitPane splitpane = new JSplitPane(newOrientation, topCompo, bottomCompo);
		splitpane.setOneTouchExpandable(true);
		// when resizing whole frame, the left/top component is fully resized
		splitpane.setResizeWeight(1);
		return splitpane;
	}

	private JPanel createInformationPanel() {
		JPanel info = new JPanel();
		informationBar = new MyInformationBar(this);
		statusbar = new MyStatusBar();
		return info;
	}

	private JPanel createVisualSurface() {
		JPanel panel = new JPanel();
		traceControls = new TraceControlBar(this);
		surface3D = new My3DSurface(sceneModel);
		traceViewPanel = createViewPanel();
		splitpaneRight = createSplitPane(surface3D, traceViewPanel, JSplitPane.HORIZONTAL_SPLIT);
		return panel;
	}

	private JPanel createViewPanel() {
		JPanel panel = new JPanel();
		panelSelection = new TraceNavigationModePanel(this);
		traceView = new TraceView(this);
		return panel;
	}

	private void registerComponents() {
		sceneCtrl.addListener(traceView);
		sceneCtrl.addListener(menubar);

		sourceModel.addListener(traceView);
		sourceModel.addListener(traceControls);
		sourceModel.addListener(statusbar);

		// TODO perhaps use listener of sceneModel
		controller.getSelection().addListener(ObsInfoElementSelected.class, informationBar);

		AbstractTraceController trace = (AbstractTraceController) controller.getTraceController();
		trace.addListener(traceControls);
		trace.addListener(menubar);
		trace.addListener(statusbar);

		controller.getSnapshot().setCanvas(surface3D);

		Configuration.getInstance().addListener(surface3D);
	}

	private void addComponentsToGUI() {
		addComponentsToViewPanel();
		addComponentsToVisualSurface();
		addComponentsToInformationPanel();

		this.setLayout(new BorderLayout());
		this.add(menubar, BorderLayout.PAGE_START);
		this.add(splitpaneBottom);
		this.pack();
	}

	private void addComponentsToViewPanel() {
		traceViewPanel.setLayout(new BorderLayout());
		traceViewPanel.add(panelSelection, BorderLayout.PAGE_START);
		traceViewPanel.add(traceView);
	}

	private void addComponentsToVisualSurface() {
		visPanel.setLayout(new BorderLayout());
		visPanel.add(traceControls, BorderLayout.PAGE_START);
		visPanel.add(splitpaneRight);
	}

	private void addComponentsToInformationPanel() {
		infoPanel.setLayout(new BorderLayout());
		infoPanel.add(informationBar, BorderLayout.CENTER);
		infoPanel.add(statusbar, BorderLayout.PAGE_END);
	}

	private void setWindowPreferences() {
		this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		this.setTitle(TITLE);
		this.setMinimumSize(this.getPreferredSize());
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				close();
			}
		});
	}

	/**
	 * Prevents popups from being hidden by adjacent gui components, e.g. by
	 * Canvas3D.
	 */
	private void preventPopupOverlap() {
		JPopupMenu.setDefaultLightWeightPopupEnabled(false);
	}

	protected void close() {
		// TODO save config etc.
		surface3D.cleanUpScene();
		Configuration.getInstance().saveConfig();
		System.exit(0);
	}

	private void setSystemLookAndFeel() {
		try {
			// Set System L&F
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}
	}

	public void focusSurface3D() {
		surface3D.requestFocus();
	}

}
