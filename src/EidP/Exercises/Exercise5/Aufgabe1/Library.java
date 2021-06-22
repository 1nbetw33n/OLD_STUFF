package EidP.Exercises.Exercise5.Aufgabe1;

public class Library {
	
	public static void main(String[] args) {
		final Person LIBRARY = new LegalPerson();
		final Person CITIZEN = new User();
		System.err.println(LIBRARY);
		System.err.println(CITIZEN);
		
		final Media MEDIUM1 = new Book();
		final Media MEDIUM2 = new Book("Papyri Graecae magicae");
		final Media MEDIUM3 = new Book("Ars Notoria");
		final Media MEDIUM4 = new Book("Liber Juratus");
		final Media MEDIUM5 = new Book("Conjurationes adversus principem tenebrarum");
		final Media MEDIUM6 = new DVD("Frozen");
		final Media MEDIUM7 = new DVD("FightClub");
		final Media MEDIUM8 = new DVD("Avatar");
		final Media MEDIUM9 = new DVD("Inception");
		final Media MEDIUM10 = new DVD("Bambi");
		final Media MEDIUM11 = new DVD("Metropolis");
		
		System.err.println(MEDIUM1);
		
		final User SELENE = new User("Selene");
		System.err.println(SELENE);
		System.err.println(MEDIUM1);
		System.err.println(MEDIUM2);
		System.err.println(MEDIUM3);
		System.err.println(MEDIUM4);
		System.err.println(MEDIUM5);
		System.err.println(MEDIUM6);
		System.err.println(MEDIUM7);
		System.err.println(MEDIUM8);
		System.err.println(MEDIUM9);
		System.err.println(MEDIUM10);
		
		SELENE.lendMedium(MEDIUM1);
		System.err.println(MEDIUM1 + "\n");
		SELENE.lendMedium(MEDIUM2);
		SELENE.lendMedium(MEDIUM3);
		SELENE.lendMedium(MEDIUM4);
		SELENE.lendMedium(MEDIUM5);
		SELENE.lendMedium(MEDIUM6);
		SELENE.lendMedium(MEDIUM7);
		SELENE.lendMedium(MEDIUM8);
		SELENE.lendMedium(MEDIUM9);
		SELENE.lendMedium(MEDIUM10);
		
		SELENE.showLendList();
		
		System.err.println(SELENE.getLendListCount());
		SELENE.lendMedium(MEDIUM11);
		System.err.println(MEDIUM11);
		
		SELENE.returnAll();
		System.err.println(SELENE);
		
		System.err.println(MEDIUM1);
		System.err.println(MEDIUM1.signature());
		System.err.println(MEDIUM11.signature());
	}

}
