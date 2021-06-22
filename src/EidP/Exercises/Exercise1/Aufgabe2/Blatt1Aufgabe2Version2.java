package EidP.Exercises.Exercise1.Aufgabe2;


public class Blatt1Aufgabe2Version2 {
	public static void tausch(int a, int b) {
		int x;
		
		x = a;
		a = b;
		b = x;
		
		System.err.println("a = " + a + ", b = " + b);
	}

}