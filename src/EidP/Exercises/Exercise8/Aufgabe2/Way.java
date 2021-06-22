package EidP.Exercises.Exercise8.Aufgabe2;


public class Way {
	
	protected static final int numberOfWays(int x, int y, final int X, final int Y) {
		return x == X || y == Y ?
				1 : 
					numberOfWays(x + 1, y, X, Y) + numberOfWays(x, y + 1, X, Y);
	}
	
	public static void main(String[] args) {
		
		System.err.println(numberOfWays(0, 0, 1, 2));
		System.err.println(numberOfWays(5, 7, 8, 9));
		System.err.println(numberOfWays(5, 7, 5, 9));
	}
	
}
