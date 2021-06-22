package EidP.Exercises.Exercise2.Aufgabe6;


public class Member {
	private String name;
	private double num;
	private static double c;
	private static double fee;
	private static double feeInput;
	private boolean paid;
	
	public Member(final String N) {
		
		this.name = N;
		this.num = ++c;
	}
	
	public void paying() {
		this.paid = true;
		feeInput += fee;
	}
	
	public boolean hasPaid() {return this.paid == true;}
	
	public static void setFee(final double F) {fee = F;}
	
	public static double getFeeInput() {return feeInput;}
	
	public String toString() {
		return this.name + ", " + (int) this.num + ": " + this.hasPaid();
	}
	
	
	

}