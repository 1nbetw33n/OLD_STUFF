package EidP.Exercises.Exercise5.Aufgabe1;

public class Book extends Media {
	
	public Book() {
		super();
	}
	
	public Book(final String TITLE) {
		super(TITLE);
	}

	public String signature() {	return "B" + getIDNumber();}

}
