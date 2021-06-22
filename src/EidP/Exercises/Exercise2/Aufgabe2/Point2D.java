/* copyright (c) 2019-2022 xx63ll4 Labs
 * St. Augustin, North Rhine Westphalia, 53757 F.R.G.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of 
 * xx63ll4 Labs ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * xx63ll4 Labs.
 */

package EidP.Exercises.Exercise2.Aufgabe2;

/**
 * @author Bella Abshagen
 *
 */

public class Point2D {
	
	private double x, y;
	
	public Point2D() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public Point2D(final double X, final double Y) {
		this.x = X;
		this.y = Y;
	}
	
	//makes DeepCopies of P
	public Point2D(final Point2D P) {
		this.x = P.x;
		this.y = P.y;
	}
	
	public final double getX() {return this.x;}
	
	public final double getY() {return this.y;}
	
	//moves this.Point2D by the passed coordinates
	public final Point2D moveAround(final double X, final double Y) {
		return new Point2D(this.x + X, this.y + Y);
	}
	
	//moves this.Point2D to the passed coordinates
	public final Point2D moveTo(final double X, final double Y) {
		return new Point2D(X, Y);
	}
	
	public final String toString() {return "(" + this.x + ", " + this.y + ")";}
}