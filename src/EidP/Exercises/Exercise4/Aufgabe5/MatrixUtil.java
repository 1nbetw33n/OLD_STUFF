package EidP.Exercises.Exercise4.Aufgabe5;

public class MatrixUtil {

	public static final boolean between0And1(final double[][] ARRAY) {
		int count = 0;
		for (int rowIndex = 0; rowIndex < ARRAY.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < ARRAY[rowIndex].length; columnIndex++) {
				count = 0 < ARRAY[rowIndex][columnIndex] && ARRAY[rowIndex][columnIndex] < 1 ? count : ++count;
			}
		}
		return count == 0;
	}

	public static final boolean sumIs1(final double[][] ARRAY) {
		int count = 0;
		for (int rowIndex = 0; rowIndex < ARRAY.length; rowIndex++) {
			count = (Math.abs(ARRAY[rowIndex][0] + ARRAY[rowIndex][1] + ARRAY[rowIndex][2] - 1) <= 0.00000001) ? count : ++count;
		}
		for (int columnIndex = 0; columnIndex < ARRAY.length; columnIndex++) {
			count = (Math.abs(ARRAY[0][columnIndex] + ARRAY[1][columnIndex] + ARRAY[2][columnIndex] - 1) <= 0.00000001) ? count : ++count;
		}
		return count == 0;
	}

	public static final boolean isStochastic(final double[][] ARRAY) {
		return between0And1(ARRAY) && sumIs1(ARRAY);
	}

}
