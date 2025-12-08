package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		Point p1 = new Point(10,10,Color.black);
		DrawingModel model = new DrawingModel();
		
		// Testiranje AddPoint
		AddPointCmd addPointCmd = new AddPointCmd(p1, model);
		addPointCmd.execute();
		
		System.out.println(model.getShapes());
		
		addPointCmd.unexecute();
		System.out.println("Nakon unexecute, stanje u modelu je: " + model.getShapes().size());
		
		addPointCmd.execute();
		System.out.println("Nakon novog execute, stanje u modelu je: " + model.getShapes().size());
		
		
		// Testiranje RemovePoint
		RemovePointCmd removePointCmd = new RemovePointCmd(p1, model);
		removePointCmd.execute();
		
		System.out.println("Nakon remove, veličina liste je: " + model.getShapes().size());
		
		removePointCmd.unexecute();
		System.out.println("Nakon unexecute, veličina liste je: " + model.getShapes().size());
		
		
		// Testiranje UpdatePointCmd
		Point p2 = new Point(20,20,Color.black);
		
		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);
		updatePointCmd.execute();
		System.out.println(model.getShapes());
		
		updatePointCmd.unexecute();
		System.out.println(model.getShapes());
		
		updatePointCmd.execute();
		System.out.println(model.getShapes());
		
	}

}
