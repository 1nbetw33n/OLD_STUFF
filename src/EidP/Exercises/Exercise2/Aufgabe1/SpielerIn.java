package EidP.Exercises.Exercise2.Aufgabe1;


public class SpielerIn {
	private String name;
	private double gamesPlayed, gamesWon, gamesLost;

	
	public SpielerIn(final String n) {this.name = n;}
	
	public SpielerIn() {this.name = "default";}
	
	public void spiel(final boolean WON) {
		gamesPlayed++;
		if(WON == false) {
			gamesLost++;
		}else {
			gamesWon++;
		}
	}
	
	public double winRatio() {
		if(this.gamesPlayed == 0) {
			return 0.0;
		}else {
			return (this.gamesWon / this.gamesPlayed) * 100;
			}
	}
	
	public void showBalance() {
		System.err.println("Balance for " + this.name + ":\nwon: " +
			(int) this.gamesWon + "\nlost: " + (int) this.gamesLost + "\nRatio: " +
				this.winRatio() + "%");
	}

}