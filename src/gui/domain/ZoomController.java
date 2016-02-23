package gui.domain;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class ZoomController extends JFrame {
	private final int width = 150;
	private final int height = 400;
	private int zoomFactor = 0;
	private JSlider zoomFactorSlider = new JSlider(JSlider.VERTICAL);
	
	public ZoomController(Point mainwindowLocation) {
		this.setSize(width, height);
		this.setLocation((mainwindowLocation.x + width), (mainwindowLocation.y + height));
		//zoomFactorSlider.addChangeListener(new ChangeListener()); - figure out how this thing works
		zoomFactorSlider.setMajorTickSpacing(10);
		zoomFactorSlider.setPaintTicks(true);
		zoomFactorSlider.setValue(zoomFactor);
		this.add(zoomFactorSlider);
		
		this.setVisible(true);
	}
}
