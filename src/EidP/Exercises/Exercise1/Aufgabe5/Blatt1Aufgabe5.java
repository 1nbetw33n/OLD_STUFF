package EidP.Exercises.Exercise1.Aufgabe5;


public class Blatt1Aufgabe5 {
	public static boolean logImplies(final boolean A, final boolean B) {return !A || B;}

	public static void druckeTabelle() {
		System.err.println("a\tb\ta -> b\t" + "\n" +
						"______________________\n" +
						"false\tfalse\t" + logImplies(false, false) +
						"\n" + "false\ttrue\t" + logImplies(false, true) +
						"\n" + "true\tfalse\t" + logImplies(true, false) +
						"\n" + "true\ttrue\t" + logImplies(true, true));
	}

}