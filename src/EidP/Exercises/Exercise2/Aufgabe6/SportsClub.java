package EidP.Exercises.Exercise2.Aufgabe6;


public class SportsClub {
	public static void main(String[] args) {
		Member.setFee(99.99);
		final Member A = new Member("Clary Clarkson");
		final Member B = new Member("Joey Jenkins");
		
		System.err.println(A + "\n" + B + "\n" + Member.getFeeInput());
		B.paying();
		System.err.println(Member.getFeeInput());
		System.err.println(B.hasPaid());
		
		
	}

}