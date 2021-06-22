package EidP.Exercises.Exercise5.Aufgabe1;

public class User extends NaturalPerson{
	
	private static int count;
	private int iDNumber;
	private Media[] lendList;
	private int lendListCount;
	
	public User() {
		super();
		this.iDNumber = ++count;
		lendList = new Media[10];
		
	}
	
	public User(final String NAME) {
		super(NAME);
		this.iDNumber = ++count;
		lendList = new Media[10];
	}
	
	public void lendMedium(final Media MEDIUM) {
		if (MEDIUM.getAvailable() == false) {
			System.err.println("ERROR: Medium not available.");
		}else if (this.lendListCount >= this.lendList.length) {
			System.err.println("You already borrowed 10 media articles."
					+ " First return your borrowed articles,"
					+ " before you're able to borrow another article.");
		}else {
			this.lendList[lendListCount++] = MEDIUM; 
			MEDIUM.setCurrentOwner(this);
		}
		
	}
	
	public void showLendList() {
		String output = "";
		for (int index = 0; index < lendList.length; index++) {
			output += this.lendList[index] != null ? this.lendList[index] + "\n" : " ";
		}
		System.err.println(output);
	}
	
	public void returnAll(){
		for (int index = 0; index < lendList.length; index++) {
			if(this.lendList[index] != null) {
			this.lendList[index].setCurrentOwner(new LegalPerson("Library"));
			this.lendList[index] = null;
			}
		}
	}
	
	public int getIDNumber() {return this.iDNumber;}
	
	public void setIDNumber(final int NUMBER) {this.iDNumber = NUMBER;}
	
	public int getLendListCount() {return this.lendListCount;}
	
	public String toString() {return this.getName() + ", (UserNo." + this.iDNumber + ")";}
	
	
	
}
