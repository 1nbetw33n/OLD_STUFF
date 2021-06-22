package EidP.Exercises.Exercise8.Aufgabe1;

import java.math.BigInteger;

public class Fibonacci {
	
	private static long fib1Counter;
	private static int fib2Counter;
	
	
	//super slow recursive fibonacci implementation
	@SuppressWarnings("unused")
	private static final int fib1(final int N) throws Exception{
		if (N < 0) {
			throw new Exception("N needs to be equal or greater than 0");
			
		}else {
		Fibonacci.fib1Counter++;
		System.err.println("fib1Counter: " + Fibonacci.fib1Counter);
		return !(N < 2) ? fib1(N - 2) + (fib1(N - 1)) : N;
		}
	}
	
	
	//super fast iterative fibonacci implementation
	private static final BigInteger fib2(final int N) throws Exception {
		if (N < 0) {
			throw new Exception("N needs to be equal or greater than 0");
			
		}else {
		Fibonacci.fib2Counter++;
		BigInteger penultimate = BigInteger.valueOf(0);
		BigInteger previous = BigInteger.valueOf(1);
		BigInteger current = BigInteger.valueOf(1);
		
		for (int i = 1; i < N; i++) {
			current = penultimate.add(previous);
			penultimate = previous;
			previous = current;
			
			Fibonacci.fib2Counter++;
		}
			System.err.println("fib2Counter: " + Fibonacci.fib2Counter);
			return current;
		}
	}	

	public static void main(String[] args) {

		int n = 171536;
		try {
//		System.err.println(fib1(n));
		System.err.println(fib2(n));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
 

	
	
	  

	  
	