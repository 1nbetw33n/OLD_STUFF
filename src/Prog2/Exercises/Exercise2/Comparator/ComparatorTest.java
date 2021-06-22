package Prog2.Exercises.Exercise2.Comparator;

import java.math.BigInteger;

public final class ComparatorTest {

	public static void main(String[] args) {
	
		
		String s1 = new String("Hallo");
		String s2 = new String("Welt");
		String s3 = new String("HALLOMeineLieben");
		String s4 = new String("HalloWelt");
		System.err.println(BigInteger.valueOf(s1.hashCode()) + "\n" + BigInteger.valueOf(s2.hashCode()) + "\n"
		+ BigInteger.valueOf(s3.hashCode()) + "\n" + BigInteger.valueOf(s4.hashCode()));
		
		
	}
}
