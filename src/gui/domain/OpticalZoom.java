package gui.domain;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import controller.WindowObservable;

public class OpticalZoom extends MoveableGlass implements Observer {		
	
	/*Point position;
	private ZoomController zoomController;
	private int zoomFactor = 0;
	
	public OpticalZoom() {
		position = this.getLocation();
		zoomController = new ZoomController(position);
	}
	
	public void setZoomFactor(int zoomFactor) {
		this.zoomFactor = zoomController.getZoomFactor();
	}
	
	@Override
	public void selectGlassColor(){
		// "Un-implement" superclass method 
	}
	
	@Override
	public void selectShape(){
		// "Un-implement" superclass method
	}*/
	
	private Point location;
	private final ZoomController zoomController;
	private Rectangle rectangle = new Rectangle(0, 0, 200, 200);	
	private WindowObservable windowObservable = new WindowObservable();
	
	private int resize = 50;
	private int width = 220;
	private int height = 220;

	private Image image;	
	
	public OpticalZoom(Background background){				
		location = this.getLocation();
		zoomController = new ZoomController(location);
		image = background.getImage();				
	}
	
	public void paint(Graphics g) {
		if (image != null) {			
			g.drawImage(image, 0, 0, getWidth(), getHeight(), 
					rectangle.x + recalculate(width), rectangle.y + recalculate(height), 
					rectangle.x + height, rectangle.y + width, 
					null);
		}		
	}
	
	private int recalculate(int q) {
		double d = q * resize / 100;
		return (int)Math.round(d);
	}
	
	public void addObserver(Background background) {
		windowObservable.addObserver(this);		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		resize = zoomController.getZoomFactor();
		rectangle = (Rectangle)arg1;
		repaint();	
		System.out.println(resize);
	}
	
	@Override
	public void selectGlassColor(){
		// "Un-implement" superclass method 
	}
	
	@Override
	public void selectShape(){
		// "Un-implement" superclass method
	}

}
