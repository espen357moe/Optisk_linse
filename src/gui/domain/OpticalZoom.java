package gui.domain;

import java.awt.Point;

public class OpticalZoom extends MoveableGlass {		
	
	Point position;
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
	}

}
