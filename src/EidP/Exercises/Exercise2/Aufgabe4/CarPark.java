package EidP.Exercises.Exercise2.Aufgabe4;


public class CarPark {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		final ParkingTicketMachine A1 = new ParkingTicketMachine("SchlossAllee", 1.5);
		final ParkingTicketMachine A2 = new ParkingTicketMachine("ParkStrasse", 2.4);
		
		final Ticket T1 = new Ticket(new ParkingTicketMachine("SchlossAllee", 1.5), 2.0);
		final Ticket T2 = new Ticket(new ParkingTicketMachine("ParkStrasse", 2.4), 1.0);
		T1.print();
		T2.print();
		
		
		
		

		
		
		
		
	}

}