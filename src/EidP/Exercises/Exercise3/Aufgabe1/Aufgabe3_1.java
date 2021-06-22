package EidP.Exercises.Exercise3.Aufgabe1;


public class Aufgabe3_1 {

	private static String methodA(final double I, final double J) {
		if(I < 0) {
			return  " a: " + 0.0 + "\n b: " + 2.0 + "\n c: " + 3.0 + "\n";
		}else {
			if (J < 0) {
				return " a: " + 1.0 + "\n b: " + 2.0 + "\n c: " + 0.0 + "\n";
			}else {
				return " a: " + 0.0 +  "\n b: " + 2.0 + "\n c: " + 0.0 + "\n";
			}
		}
	}
	
	private static String methodB(final double I, final double J) {
		if (I < 0) {
			if (J < 0) {
				return " a: " + 1.0 + "\n b: " + 0.0 + "\n c: " + 3.0 + "\n";
			}else {
				return " a: " + 1.0 + "\n b: " + 0.0 + "\n c: " + 4.0 + "\n";
			}
		}else {
			if (J < 0) { 
				return " a: " + 0.0 + "\n b: " + 2.0 + "\n c: " + 3.0 + "\n";
			}else {
				return " a: " + 0.0 + "\n b: " + 2.0 + "\n c: " + 4.0 + "\n";
			}
		}
	}
	
	public static void main(String[] args) {
		System.err.println((Aufgabe3_1.methodA(-1.0, -1.0)));
		System.err.println((Aufgabe3_1.methodA(-1.0, 1.0)));
		System.err.println((Aufgabe3_1.methodA(1.0, -1.0)));
		System.err.println((Aufgabe3_1.methodA(1.0, 1.0)) + " ****** \n ******");
		
		System.err.println((Aufgabe3_1.methodB(-1.0, -1.0)));
		System.err.println((Aufgabe3_1.methodB(-1.0, 1.0)));
		System.err.println((Aufgabe3_1.methodB(1.0, -1.0)));
		System.err.println((Aufgabe3_1.methodB(1.0, 1.0)));
	}
}