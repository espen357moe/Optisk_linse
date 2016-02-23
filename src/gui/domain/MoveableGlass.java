package gui.domain;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

public class MoveableGlass extends MoveableComponent implements Observer {

	final float LA = 0.10f;
	final float HA = 0.30f;
	float alpha = LA;
	Helper helper = null;

	public MoveableGlass() {
		setSize(200, 150);
		addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				alpha = HA;
				repaint();
			}
			public void mouseExited(MouseEvent e) {
				alpha = LA;
				repaint();
			}			
		});
		helper = new Helper(this);
	}

	public void paint(Graphics g) {
		AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
				alpha);
		((Graphics2D) g).setComposite(ac);
		helper.paint(g);
	}

	public void selectGlassColor() {
		helper.selectColor();
	}

	public void selectShape() {
		helper.selectShape();
		repaint();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
