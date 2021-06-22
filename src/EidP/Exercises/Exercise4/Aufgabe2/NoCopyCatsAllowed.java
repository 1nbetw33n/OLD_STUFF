package EidP.Exercises.Exercise4.Aufgabe2;

import java.util.Scanner;

public class NoCopyCatsAllowed {
	
	public static void main(String[] args) {
		noCopyCats();
	}
	
	static Scanner sc = new Scanner(System.in);
	static int[] array = new int[10];
	static int size;
	
	public static void noCopyCats() {
		for (int count = 0, index = 0; count < array.length; count++) {
			System.err.println("please enter an integer");
			int input = sc.nextInt();
			if (noCopyCatsCheck(input)) {
				array[index++] = input;
				size++;
			}
		}
		String output = "";
		for (int index = 0, outputArray[] = new int[size]; index < outputArray.length; index++) {
			outputArray[index] = array[index];
			output += index < outputArray.length - 1 ? outputArray[index] + ", " : outputArray[index] + "";
		}
		System.err.println(output); //unmöglich 0 auszugeben, da int ein primitiver DatenTyp und somit 0 ein leeres FeldElement ist
	}
	
	private static boolean noCopyCatsCheck(final int SCANNERINPUT) {
		int count = 0;
		for (int index = 0; index < array.length; index++) {
			count = SCANNERINPUT == array[index] ? ++count : count; 
		}
		return count < 1;
	}
	
}
