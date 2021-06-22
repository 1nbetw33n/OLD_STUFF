package EidP.Exercises.Exercise5.Aufgabe1;

public abstract class Media {
	
	private static int count;
	private int iDNumber;
	private String title;
	private Person currentOwner;
	
	
	public Media() {
		this.title = "Kybalion";
		this.iDNumber = ++count;
		this.currentOwner = new LegalPerson();
		}
	
	public Media(final String TITLE) {
		this.title = TITLE;
		this.iDNumber = ++count;
		this.currentOwner = new LegalPerson();
	}
	
	public abstract String signature();
	
	public int getIDNumber() {return this.iDNumber;}
	
	public String getTitle() {return this.title;}
	
	public boolean getAvailable() {return ((LegalPerson) this.currentOwner).getName() == "Library";}
	
	public Person getCurrentOwner() {return this.currentOwner;}
	
	public void setCurrentOwner(final Person NEWOWNER) {this.currentOwner = NEWOWNER;}
	
	public String toString() {
		return this.title + ", (ArticleNo." + this.iDNumber + "), current owner: " + this.currentOwner;
	}
	
}