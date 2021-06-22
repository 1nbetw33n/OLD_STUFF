package EidP.Exercises.Exercise3.Aufgabe4;
import EidP.Exercises.Exercise2.Aufgabe2.Point2D;

public class RoboWalk {
	
	public static void main(String[] args) {
		
		final Robot R1D1 = new Robot();
		final Robot R2D2 = new Robot(new Point2D(10, 10), 2);
		
		System.err.println(R1D1 + "\n" + R2D2);
		R1D1.setDirection(0);
		R1D1.spiral(22);
		System.err.println(R1D1);
		R1D1.setDirection(3);
		R1D1.spiral(22);
		System.err.println(R1D1);
		R2D2.step();
		System.err.println(R2D2);
		
	}

}