package Prog2.Misc;

interface AnInterface2{
	
	void printValue(final int I);
}

public final class Lambda2 {
	final static void doIt(final AnInterface2 I) {
		System.err.println("doIt: ");
		I.printValue(1);
	}
	
	public final static void main(final String[] ARGS) {
		
		doIt((A) -> System.err.println(2));
	}
	

}