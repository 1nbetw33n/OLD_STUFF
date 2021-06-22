package EidP.Exercises.Exercise2.Aufgabe3;

import EidP.Exercises.Exercise2.Aufgabe2.Point2D;
import EidP.Exercises.Exercise6.Aufgabe2.NotPositiveException;

public class RectangleTest {
	
	public static final void main(String[] args) {
		
		try {
			System.err.println(new Rectangle(new Point2D(1,1), 4, 3).area());
			System.err.println(new Rectangle(new Point2D(1,1), 4, 3).perimeter());
		} catch (final NotPositiveException E) {
			E.printStackTrace();
		}
	}
}
