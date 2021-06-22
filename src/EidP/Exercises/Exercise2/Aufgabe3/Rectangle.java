package EidP.Exercises.Exercise2.Aufgabe3;

import EidP.Exercises.Exercise2.Aufgabe2.Point2D;
import EidP.Exercises.Exercise6.Aufgabe2.NotPositiveException;

public class Rectangle{
	 private Point2D lowerLeft,
	 				 lowerRight,
	 				 upperLeft,
	 				 upperRight;
	 
	 public Rectangle() {
		 this.lowerLeft = new Point2D(0.0, 0.0);
		 this.lowerRight = new Point2D(0.0, 0.0);
		 this.upperLeft = new Point2D(0.0, 0.0);
		 this.upperRight = new Point2D(0.0, 0.0);
	 }
	 
	 public Rectangle(final Point2D P, final double L, final double W) throws NotPositiveException {
		 if (L < 0 || W < 0) {
			throw new NotPositiveException();
		}else {
		 this.lowerLeft = P;
		 this.lowerRight = P.moveAround(L, 0.0);
		 this.upperLeft = P.moveAround(0.0, W);
		 this.upperRight = P.moveAround(L, W);
		}
	 }
	 
	 public Rectangle(final Point2D LL, final Point2D UR) throws NotPositiveException {
		 if (LL.getX() < 0 || LL.getY() < 0 || UR.getX() < 0 || UR.getY() < 0) {
			throw new NotPositiveException();
		}else {
		 this.lowerLeft = LL;
		 this.lowerRight = new Point2D(UR.getY(), LL.getY());
		 this.upperLeft = new Point2D(LL.getX(), UR.getY());
		 this.upperRight = UR;
		}
	 }
	 
	 public double area() {return (this.upperRight.getX() - this.lowerLeft.getX()) * (this.upperRight.getY() - this.lowerLeft.getY());}
	 
	 public double perimeter() {return 2 * ((this.upperRight.getX() - this.lowerLeft.getX()) + this.upperRight.getY() - this.lowerLeft.getY());}
	 
	 public Point2D center() {
		 return new Point2D(this.lowerLeft.getX() + (0.5 * (this.upperRight.getX() - this.lowerLeft.getX())),
				 this.upperRight.getY() - (0.5 * (this.upperRight.getY() - this.lowerLeft.getY())));
	 }
	 
	 public boolean squareTest() {
		 return (this.upperRight.getX() - this.lowerLeft.getX()) == this.upperRight.getY() - this.lowerLeft.getY();
	 }
	 
	 public Rectangle moveAround(final double LENGTH, final double WIDTH) throws NotPositiveException {
		 return new Rectangle(this.lowerLeft.moveAround(new Point2D(LENGTH, WIDTH)), LENGTH, WIDTH);
	 }
	 
	 public String toString() {
		 return "lower left: " + lowerLeft + ", lower right: " + lowerRight + ", upper left: " + upperLeft + ", upper rigth: " + upperRight;
	 }
}