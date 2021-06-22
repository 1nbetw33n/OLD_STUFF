package EidP.Exercises.Exercise2.Aufgabe4;

public class Ticket {
	private ParkingTicketMachine a;
	private double price;
	private double duration;
	
	public Ticket(final ParkingTicketMachine PARKINGTICKETMACHINE, final double DURATION) {
		this.a = PARKINGTICKETMACHINE;
		this.duration = DURATION;
		this.price = this.a.getPricePerHour() * this.duration;
	}
	
	public String toString() {
		return "ParkingTicket for " + this.a.getLocation() + 
				"\n TicketPrice: " + this.price;
	}
	
	public void print() {System.err.println(this.a.createTicket(this.duration));} 
	
	
}
