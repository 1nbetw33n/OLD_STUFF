package EidP.Exercises.Exercise3.Aufgabe3;

import java.util.*;

public class Aufgabe3_3 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static double min() {
		System.err.println("Please insert a positive double number");
		double num = input.nextDouble();
		double min = num;
		
		if (min <= 0.0) {
			return 0.0;
		}else {
			while(min > 0) {
				System.err.println("Please insert a positive double number");
				num = input.nextDouble();
				if(num > 0) {
				min = (min < num ? min : num);
				}else {
					return min;
				}
			}
		return min;
		}
	}

}