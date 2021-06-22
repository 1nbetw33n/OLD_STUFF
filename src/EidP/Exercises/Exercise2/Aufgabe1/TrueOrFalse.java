package EidP.Exercises.Exercise2.Aufgabe1;


public class TrueOrFalse {
	public static void main(String[] args) {
		final SpielerIn A = new SpielerIn("Bella");
		final SpielerIn B = new SpielerIn("Otto");
		final SpielerIn C = new SpielerIn();
		
		B.spiel(true);
		A.spiel(true);
		B.spiel(false);
		A.spiel(true);
		A.spiel(true);
		B.spiel(true);
		B.spiel(false);
		A.spiel(false);
		A.spiel(false);
		A.spiel(true);
		A.showBalance();
		System.err.println();
		B.showBalance();
		System.err.println();
		C.showBalance();
	}
}