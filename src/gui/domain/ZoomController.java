package gui.domain;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class ZoomController extends JFrame {
	private final int width = 50;
	private final int height = 200;
	private int zoomFactor = 0;
	private JSlider zoomFactorSlider = new JSlider(JSlider.VERTICAL);
	
	public ZoomController() {
		this.setSize(width, height);
		//this.setLocation(x, y); - set according to mainwindow location
		//zoomFactorSlider.addChangeListener(); - figure out how this thing works
		zoomFactorSlider.setMajorTickSpacing(10);
		zoomFactorSlider.setPaintTicks(true);
		zoomFactorSlider.setValue(zoomFactor);
		this.add(zoomFactorSlider);
		
		this.setVisible(true);
	}
}
