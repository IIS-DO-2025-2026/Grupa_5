package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;
import composite.Vojvodina;

public class DrawingController {
	private DrawingModel model;
	private DrawingFrame frame;
	private Color color1 = Color.black;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}
	
	public void drawPoint(MouseEvent e) {
		
		// MVC i command testiranje
		 
		/*Point p1 = new Point(e.getX(), e.getY(), color1);
		
		// model.add(p1);
		// test command obrasca
		AddPointCmd addPointCmd = new AddPointCmd(p1, model);
		addPointCmd.execute();
		System.out.println(p1);
		
		frame.repaint(); */
		
		
		
		// Composite testiranje
		Vojvodina vojvodina = new Vojvodina();
		
		Point srem = new Point(e.getX(), e.getY(), Color.BLACK);
		Point backa = new Point(e.getX() + 10, e.getY(), Color.BLACK);
		Point banat = new Point(e.getX() + 5, e.getY() - 8, Color.BLACK);
		
		vojvodina.add(srem);
		vojvodina.add(backa);
		vojvodina.add(banat);
		
		model.add(vojvodina);
		frame.repaint();
		
		
	}


}
