package EidP.Exercises.Exercise6.Aufgabe2;

public class NotPositiveException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NotPositiveException() { super("NotPositiveException");}
	
	public NotPositiveException(final String MESSAGE) {super(MESSAGE);}
	
}
