package EidP.Exercises.Exercise3.Aufgabe2;


public class MobileTariffTest {
	
	public static void main(String[] args) {
		
		
		final MobileTariff T1 = new MobileTariff("TeleStarM", 25.00, 30, 40);
		final MobileTariff T2 = new MobileTariff("TeleStarXXXXL", 32.00, 50, 40);
		System.err.println(T1.makeBill());
		MobileTariff.setPricePerMinute(0.12);
		System.err.println(T1.makeBill() + "\n" + T1 + "\n" + T2 + "\n" + T2.makeBill());
		
	
	}

}