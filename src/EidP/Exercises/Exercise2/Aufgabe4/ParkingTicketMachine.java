package EidP.Exercises.Exercise2.Aufgabe4;


public class ParkingTicketMachine {
	private String location;
	private double pricePerHour;
	
	public ParkingTicketMachine(final String LOCATION, final double PRICEPERHOUR) {
		this.location = LOCATION;
		this.pricePerHour = PRICEPERHOUR;
	}
	
	public String getLocation() {return this.location;}
	
	public double getPricePerHour() {return this.pricePerHour;}
	
	public Ticket createTicket(final double DURATION) {return new Ticket(new ParkingTicketMachine(this.location, this.pricePerHour), DURATION);}
}