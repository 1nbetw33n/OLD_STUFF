package EidP.Exercises.Exercise3.Aufgabe2;


public class MobileTariff {
	
	private String name;
	private double basicCharge;
	private double freeMinutes;
	private double usedMinutes;
	private static double pricePerMinute;
	
	public MobileTariff(final String NAME, final double BASICCHARGE, final double FREEMINUTES, final double USEDMINUTES) {
		this.name = NAME;
		this.basicCharge = BASICCHARGE;
		this.freeMinutes = FREEMINUTES;
		this.usedMinutes = USEDMINUTES;
	}
	
	public String getName() {return this.name;}
	
	public double getBasicCharge() {return this.basicCharge;}
	
	public double getFreeMinutes() {return this.freeMinutes;}
	
	public double getUsedMinutes() {return this.freeMinutes;}
	
	public double getPricePerMinute() {return pricePerMinute;}
	
	public static void setPricePerMinute(final double PRICEPERMINUTE) {pricePerMinute = PRICEPERMINUTE;}
	
	public double makeBill() {
		double difference = 0;
		if (this.usedMinutes - this.freeMinutes > 0) {
			difference = this.usedMinutes - this.freeMinutes;
		}
		return this.basicCharge + (difference * pricePerMinute);
	}
	
	public String toString() {return this.name + " - " + this.basicCharge + "0€ BasicCharge - " + this.freeMinutes + " FreeMinutes - " + this.usedMinutes + " UsedMinutes";}
	
	

}