package EidP.Exercises.Exercise5.Aufgabe1;

public class DVD extends Media {

	public DVD() {
		super();
	}
	
	public DVD(final String TITLE) {
		super(TITLE);
	}
	
	public String signature() {	return "DVD" + getIDNumber();}

}
