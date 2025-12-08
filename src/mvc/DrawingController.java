package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;

public class DrawingController {
	private DrawingModel model;
	private DrawingFrame frame;
	private Color color1 = Color.black;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}
	
	public void drawPoint(MouseEvent e) {
		Point p1 = new Point(e.getX(), e.getY(), color1);
		
		// model.add(p1);
		// test command obrasca
		AddPointCmd addPointCmd = new AddPointCmd(p1, model);
		addPointCmd.execute();
		System.out.println(p1);
		
		frame.repaint();
	}


}
