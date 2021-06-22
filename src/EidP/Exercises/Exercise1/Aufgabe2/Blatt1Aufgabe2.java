package EidP.Exercises.Exercise1.Aufgabe2;


public class Blatt1Aufgabe2 {
	public static void tausch() {
		int a = 5;
		int b = 8;
		int x;
		
		x = a;
		a = b;
		b = x;
		System.err.println("a = " + a + " b = "  + b);
	}
	public static void main(String[] args) {
		tausch();
	}

}
