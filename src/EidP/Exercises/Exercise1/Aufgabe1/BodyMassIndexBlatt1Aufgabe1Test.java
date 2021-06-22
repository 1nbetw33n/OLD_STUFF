package EidP.Exercises.Exercise1.Aufgabe1;



public class BodyMassIndexBlatt1Aufgabe1Test {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		final double GEWICHT = 73.0;
		final double GROESSE = 1.80;
		System.err.println(BodyMassIndexBlatt1Aufgabe1.bmi(73.0, 1.80));
		System.err.println(BodyMassIndexBlatt1Aufgabe1.bmi(GROESSE, GROESSE));
	}
}