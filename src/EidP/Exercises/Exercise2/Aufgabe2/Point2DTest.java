package EidP.Exercises.Exercise2.Aufgabe2;


public class Point2DTest {
	public static void main(String[] args) {
		final Point2D A = new Point2D();
		final Point2D B = new Point2D(3.0, 5.0);
		final Point2D C = new Point2D(B);
		final Point2D D = new Point2D(new Point2D(5.0, 3.0));
		 
		 System.err.println(A +"\n" + B + "\n" + C + "\n" + D);
		 

		 System.err.println(B.moveTo(3.8, -12.4));
		 System.err.println(C.moveAround(-1.0, 1.0));
		 

	}

}