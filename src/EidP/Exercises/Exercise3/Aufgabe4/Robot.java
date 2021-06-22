package EidP.Exercises.Exercise3.Aufgabe4;
import EidP.Exercises.Exercise2.Aufgabe2.Point2D;

public class Robot {
	
	private static double count;
	private int iD;
	private Point2D position;
	private int direction;
	
	public Robot() {
		this.iD = (int) ++count;
		this.position = new Point2D();
		this.direction = 0;
	}
	
	public Robot(final Point2D STARTPOSITION, final int DIRECTION) {
		this.iD = (int) ++count;
		this.position = new Point2D(STARTPOSITION);
		this.direction = DIRECTION;
	}
	
	public void step() {
		switch(this.direction) {
		case 1:
			this.position = this.position.moveTo(this.position.getX() + 1, this.position.getY() + 0);
			break;
		case 2:
			this.position = this.position.moveTo(this.position.getX() + 0,this.position.getY() - 1);
			break;
		case 3:
			this.position = this.position.moveTo(this.position.getX() -1, this.position.getY() + 0);
			break;
		default:
			this.position = this.position.moveAround(this.position.getX() + 0, this.position.getY() + 1);
		}
	}
	
	public void step(final int NUMBEROFSTEPS) {
		switch(this.direction) {
		case 1:
			this.position = this.position.moveAround(NUMBEROFSTEPS, 0);
			break;
		case 2:
			this.position = this.position.moveAround(0, -NUMBEROFSTEPS);
			break;
		case 3:
			this.position = this.position.moveAround(-NUMBEROFSTEPS, 0);
			break;
		default:
			this.position = this.position.moveAround(0, NUMBEROFSTEPS);
		}
	}
	
	public void turn() {
	this.direction = this.direction < 3 ?  ++this.direction : 0;      
	}
	
	public void spiral(final int MAXNUMBEROFSTEPS) {
		int c = 1;
		int numberOfSteps = 0;
		while (numberOfSteps <= MAXNUMBEROFSTEPS) {
			this.step(c);
			numberOfSteps += c;
			if(numberOfSteps >= MAXNUMBEROFSTEPS) {
				break;
			}else {
			this.turn();
			this.step(c);
			this.turn();
			numberOfSteps += c++;
			}
		}
	}
	
	public int getID() {return this.iD;}
	
	public Point2D getPosition() {return this.position;}
	
	public void setPosition(final double X, final double Y) {this.position = this.position.moveTo(X, Y);}
	
	public int getDirection() {return this.direction;}
	
	public void setDirection(final int NEWDIRECTION) {this.direction = NEWDIRECTION;}
	
	public String toString() {
		return "No." + this.iD + " - " + this.position + " - " + this.direction;
	}

}