package EidP.Exercises.Exercise4.Aufgabe5;

import java.util.Arrays;

public class MatrixTest {
	
	public static void main(String[] args) {
		
		final double[][] M1 = new double[3][3];
		for (int rowIndex = 0, count = 0; rowIndex < M1.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < M1.length; columnIndex++) {
				M1[rowIndex][columnIndex] = ++count;
			}
		}
		
		final double[][] M2 = new double[][]{{0.5, 0.3, 0.2},
											 {0.2, 0.4, 0.4},
											 {0.3, 0.3, 0.4}};

		
		System.err.println(Arrays.deepToString(M1));
		System.err.println(MatrixUtil.between0And1(M1));
		System.err.println(MatrixUtil.sumIs1(M1));
		System.err.println(MatrixUtil.isStochastic(M1)+ "\n");
		
		System.err.println(Arrays.deepToString(M2));
		System.err.println(MatrixUtil.between0And1(M2));
		System.err.println(MatrixUtil.sumIs1(M2));
		System.err.println(MatrixUtil.isStochastic(M2));
		
	}

}
