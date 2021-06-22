package Prog2.Misc;

interface AnInterface1{
	
	void printValue(final int I);
}

final class AClass1 implements AnInterface1{
	
	public final void printValue(final int I) {
		System.err.println(I);
	}
}

public final class Lambda1 {
	final static void doIt(final AnInterface1 I) {
		System.err.println("doIt: ");
		I.printValue(1);
	}
	
	public final static void main(final String[] ARGS) {
		final AnInterface1 A = new AClass1();
		doIt(A);
	}
	

}
