package gui.domain;

public class OpticalZoom extends MoveableGlass {
	
	private int zoomFactor = 0;
	//private ZoomController zoomController = new ZoomController();
	
	public void setZoomFactor(int zoomFactor) {
		this.zoomFactor = zoomFactor;
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
