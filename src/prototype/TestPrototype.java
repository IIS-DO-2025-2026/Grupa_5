package prototype;

import java.awt.Color;

import mvc.Line;
import mvc.Point;

public class TestPrototype {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.RED);
		
		LineShallow line = new LineShallow(p1, p2, Color.RED);

		//1. način ----- Pravimo shallow (plitku) kopiju linije
		LineShallow lineClone = line.clone();
		
		System.out.println(line);
		System.out.println(lineClone);
		
		//karakteristika shallow copy prototype
		line.getStartPoint().setX(555);
		System.out.println(lineClone.getStartPoint().getX());
		
		
		

		//2. način ----- Pravimo deep (duboku) kopiju linije
		LineDeep lineDeep = new LineDeep(new Point(50, 50, Color.RED), new Point(70, 70, Color.RED), Color.RED);
		LineDeep lineDeepClone = lineDeep.clone();
		
		System.out.println(lineDeep);
		System.out.println(lineDeepClone);
		
		//karakteristika deep copy prototype
		lineDeep.getStartPoint().setX(4000);    // ---> 4000
		System.out.println(lineDeepClone.getStartPoint().getX()); // ---> 50
		
	}
	

}
