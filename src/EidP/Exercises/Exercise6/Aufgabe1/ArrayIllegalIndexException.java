package EidP.Exercises.Exercise6.Aufgabe1;

public class ArrayIllegalIndexException extends ArrayException {

	private static final long serialVersionUID = 1L;
	
	public ArrayIllegalIndexException() {super("ArrayIllegalIndexException");}
	
	public ArrayIllegalIndexException(final String MESSAGE) {super(MESSAGE);}

}
