package EidP.Exercises.Exercise4.Aufgabe4;

//brauchen wir fuer den Zufallszahlengenerator
import java.util.Random;

import EidP.Exercises.Exercise6.Aufgabe1.ArrayEmptyException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayIllegalIndexException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayIllegalIntervalException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayIllegalValueException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayParameterLessOneException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayZeroLengthException;

@SuppressWarnings("unused")
public class ArrayUtil {
	
	// Zufallszahlengenerator,
	// wird in den folgenden Methoden benutzt
	private static final Random r = new Random();
	

	
	//	mit int[] als Parameter
	
	
	// erzeugt ein Array von zufaelliger Laenge < max
	// und belegt es mit beliebigen zufaelligen Werten
	public static final int[] createRandom(final int max) throws ArrayParameterLessOneException {
		if (max <= 0) {
			throw new ArrayParameterLessOneException();
		}
		int[] array = new int[r.nextInt(max)]; // laenge zwischen 0 und max-1
		for (int index : array) {
			array[index] = r.nextInt(); // beliebiger int-Wert
		}
		return array;
	}
	
	// belegt das Array a mit zufaelligen Werten
	// zwischen von (einschliesslich) und bis (ausschliesslich)
	public static final void putRandom(final int[] ARRAY, final int von, final int bis) throws ArrayEmptyException, ArrayZeroLengthException, ArrayIllegalIntervalException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else if(von >= bis) {
			throw new ArrayIllegalIntervalException();
		}
		for (int index = 0; index < ARRAY.length; index++) {
			ARRAY[index] = r.nextInt(bis-von) + von; 
		}
	}
	
	// mischt die Werte des Arrays
	// benutzt dafuer die Methode swap

	public static final void shuffle(final int[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		int x;
		for (int index = 0; index < ARRAY.length - 1; index++) {
			x = r.nextInt(ARRAY.length-index) + index;
			try {
				swap(ARRAY, index, x);
			} catch (final ArrayIllegalIndexException | ArrayEmptyException | ArrayZeroLengthException E) {
				E.printStackTrace();
			}
		}
		}
	}
	
	// zeigt den Inhalt eines Arrays auf dem Monitor an
	public static final void show(final int[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		String output = "( ";
		for (int index = 0; index < ARRAY.length; index++) {
			output += ARRAY[index] + " ";
		}
		output += ")";
		System.err.println(output);
		}
	}
	
	// setzt alle Elemente des Arrays auf 0
	public static final void reset(final int[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		for (int index = 0; index < ARRAY.length; index++) {
			ARRAY[index] = 0;
		}
		}
	}
	
	// testet zwei Arrays auf gleichen Inhalt
	public static final boolean equals(final int[] FIRSTARRAY, final int[] SECONDARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(FIRSTARRAY) || isEmpty(SECONDARRAY)) {
			throw new ArrayEmptyException();
		}else if (FIRSTARRAY.length == 0 || SECONDARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		if (FIRSTARRAY.length != SECONDARRAY.length)
			return false;
		for (int index = 0; index < FIRSTARRAY.length; index++) {
			if (FIRSTARRAY[index] != SECONDARRAY[index]) {
				return false;
			}
		}
		return true;
		}
	}
	
	// erzeugt eine Kopie von a
	public static final int[] clone(final int[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		int[] ARRAYCOPY = new int[ARRAY.length];
		
		for (int index = 0; index < ARRAYCOPY.length; index++) {
			ARRAYCOPY[index] = ARRAY[index];
		}
		
		return ARRAYCOPY;
		}
	}
	
	public static final int[] createSequence(final int NUMBER) throws ArrayParameterLessOneException {
		if (NUMBER <= 0) {
			throw new ArrayParameterLessOneException();
		}else {
			int[] newSequence = new int[NUMBER];
			for (int index = 0, count = 0; index < NUMBER; index++) {
				newSequence[index] = ++count;
			}
			return newSequence;
		}
	}
	
	public static final boolean contains(final int[] ARRAY, final int NUMBER) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
			int count = 0;
			for (int index = 0; index < ARRAY.length; index++) {
				count = ARRAY[index] == NUMBER ? count++ : count;
			}
			return count > 0;
		}
	}
	
	public static final int occurence(final int[] ARRAY, final int NUMBER) throws ArrayEmptyException, ArrayZeroLengthException{
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if(ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
			int count = 0;
			for (int index = 0; index < ARRAY.length; index++) {
				if (ARRAY[index] == NUMBER) {
					count++;
				}
			}
			return count;
		}
	}
	
	public static final int max(final int[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
			int max = ARRAY[0];
			for (int index = 0; index < ARRAY.length; index++) {
				if (ARRAY[index] > max) {
					max = ARRAY[index];
				}
			}
			return max;
		}
	}
	
	public static final int min(final int[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
			int min = ARRAY[0];
			for (int index = 0; index < ARRAY.length; index++) {
				if (ARRAY[index] < min) {
					min = ARRAY[index];
				}
			}
			return min;
		}
	}
	
	public static final int sum(final int[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
			int sum = 0;
			for (int index = 0; index < ARRAY.length; index++) {
				sum += ARRAY[index];
			}
			return sum;
		}
	}
	
	public static final boolean isEmpty(final int[] ARRAY){
		return ARRAY == null ? true : false;
		}
	
	public static final boolean isSorted(final int[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		int count = 0;
		for (int index = 0; index < ARRAY.length; index++) {
			if (ARRAY[index - 1] > ARRAY[index]) {
				count++;
			}
		}
		return count < 1;
		}
	}
	
	public static final int[] squareNumbers(final int NUMBER) throws ArrayParameterLessOneException {
		if (NUMBER <= 0) {
			throw new ArrayParameterLessOneException();
		}else {
		int[] array = new int[NUMBER];
		for (int index = 0; index < array.length; index++) {
			array[index] = (index + 1) * (index + 1);
		}
		return array;
		}
	}
	
	public static final void swap(final int[] ARRAY, final int A, final int B) throws ArrayIllegalIndexException, ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else if (A < 0 || A > ARRAY.length - 1 || B < 0 || B > ARRAY.length - 1) {
			throw new ArrayIllegalIndexException();
		}else {
		int temporary = ARRAY[B];
		ARRAY[B] = ARRAY[A];
		ARRAY[A] = temporary;
		}
	}
	
	public static final int[] concat(final int[] FIRSTARRAY, final int[] SECONDARRAY) {
		if (isEmpty(FIRSTARRAY)) {
			return FIRSTARRAY;
		}else if (isEmpty(SECONDARRAY)) {
			return SECONDARRAY;
		}else if (FIRSTARRAY.length == 0) {
			return FIRSTARRAY;
		}else if (SECONDARRAY.length == 0) {
			return SECONDARRAY;
		}else {
		int[] concatedArray = new int[FIRSTARRAY.length + SECONDARRAY.length];
		for (int index1 = 0, index2 = 0; index1 < concatedArray.length; index1++) {
			concatedArray[index1] = index1 < FIRSTARRAY.length ? FIRSTARRAY[index1] : SECONDARRAY[index2++];
		}
		return concatedArray;
		}
	}
	
	
	//returned ein Array, das zählt wie oft jeder Wert im übergebenene Array vorkommt
	public static final int[] count(final int[] ARRAY, final int NUMBER) throws ArrayIllegalValueException {
		if (NUMBER < 0 || NUMBER > ARRAY.length) {
			throw new ArrayIllegalValueException();
		}else {
		int[] countArray = new int[NUMBER + 1];
		for (int index = 0; index < ARRAY.length; index++) {
			try {
				countArray[index] = occurence(ARRAY, index);
			} catch (final ArrayEmptyException | ArrayZeroLengthException E) {
					E.printStackTrace();
			}
		}
		return countArray;
		}
	}
	
	public static final String[] countAsAStringArray(final int[] ARRAY, final int NUMBER) throws ArrayIllegalValueException {
		if (NUMBER < 0 || NUMBER > ARRAY.length) {
			throw new ArrayIllegalValueException();
		}else {
		String[] countArray = new String[NUMBER + 1];
		for (int index = 0; index < countArray.length; index++) {
			try {
				countArray[index] = occurence(ARRAY, index) + "x" + index;
			} catch (final ArrayEmptyException | ArrayZeroLengthException E) {
				E.printStackTrace();
			}  
		}
		return countArray;
		}
	}
	
	//  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	//	mit Double[] als Parameter \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    //	\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	
	// Zufallszahlengenerator,
		// wird in den folgenden Methoden benutzt
		
		// mischt die Werte des Arrays
		// benutzt dafuer die Methode swap

	public static final void shuffle(final double[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		int x;
		for (int index = 0; index < ARRAY.length - 1; index++) {
			x = r.nextInt(ARRAY.length-index) + index;
			try {
				swap(ARRAY, index, x);
			} catch (final ArrayIllegalIndexException | ArrayEmptyException | ArrayZeroLengthException E) {
				E.printStackTrace();
			}
		}
		}
	}
		
		
		// zeigt den Inhalt eines Arrays auf dem Monitor an
	public static final void show(final double[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		String output = "( ";
		for (int index = 0; index < ARRAY.length; index++) {
			output += ARRAY[index] + " ";
		}
		output += ")";
		System.err.println(output);
		}
	}
		
		// setzt alle Elemente des Arrays auf 0
	public static final void reset(final double[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		for (int index = 0; index < ARRAY.length; index++) {
			ARRAY[index] = 0;
		}
		}
	}
		
		// testet zwei Arrays auf gleichen Inhalt
	public static final boolean equals(final double[] FIRSTARRAY, final int[] SECONDARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(FIRSTARRAY) || isEmpty(SECONDARRAY)) {
			throw new ArrayEmptyException();
		}else if (FIRSTARRAY.length == 0 || SECONDARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		if (FIRSTARRAY.length != SECONDARRAY.length)
			return false;
		for (int index = 0; index < FIRSTARRAY.length; index++) {
			if (FIRSTARRAY[index] != SECONDARRAY[index]) {
				return false;
			}
		}
		return true;
		}
	}
		
		// erzeugt eine Kopie von a
	public static final double[] clone(final double[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		double[] ARRAYCOPY = new double[ARRAY.length];
		
		for (int index = 0; index < ARRAYCOPY.length; index++) {
			ARRAYCOPY[index] = ARRAY[index];
		}
		
		return ARRAYCOPY;
		}
	}
		
	public static final double[] createSequence(final double NUMBER) throws ArrayParameterLessOneException {
		if (NUMBER <= 0) {
			throw new ArrayParameterLessOneException();
		}else {
			double[] newSequence = new double[(int) NUMBER];
			for (int index = 0, count = 0; index < NUMBER; index++) {
				newSequence[index] = ++count;
			}
			return newSequence;
		}
	}
		
	public static final boolean contains(final double[] ARRAY, final int NUMBER) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
			int count = 0;
			for (int index = 0; index < ARRAY.length; index++) {
				count = ARRAY[index] == NUMBER ? count++ : count;
			}
			return count > 0;
		}
	}
		
	public static final double occurence(final double[] ARRAY, final int NUMBER) throws ArrayEmptyException, ArrayZeroLengthException{
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if(ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
			int count = 0;
			for (int index = 0; index < ARRAY.length; index++) {
				if (ARRAY[index] == NUMBER) {
					count++;
				}
			}
			return count;
		}
	}
		
	public static final double max(final double[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
			double max = ARRAY[0];
			for (int index = 0; index < ARRAY.length; index++) {
				if (ARRAY[index] > max) {
					max = ARRAY[index];
				}
			}
			return max;
		}
	}
		
	public static final double min(final double[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
			double min = ARRAY[0];
			for (int index = 0; index < ARRAY.length; index++) {
				if (ARRAY[index] < min) {
					min = ARRAY[index];
				}
			}
			return min;
		}
	}
		
	public static final double sum(final double[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
			int sum = 0;
			for (int index = 0; index < ARRAY.length; index++) {
				sum += ARRAY[index];
			}
			return sum;
		}
	}
		
	public static final boolean isEmpty(final double[] ARRAY){
		return ARRAY == null ? true : false;
		}
		
	public static final boolean isSorted(final double[] ARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else {
		int count = 0;
		for (int index = 0; index < ARRAY.length; index++) {
			if (ARRAY[index - 1] > ARRAY[index]) {
				count++;
			}
		}
		return count < 1;
		}
	}
		
		
	public static final double[] squareNumbers(final double NUMBER) throws ArrayParameterLessOneException {
		if (NUMBER <= 0) {
			throw new ArrayParameterLessOneException();
		}else {
		double[] array = new double[(int) NUMBER];
		for (int index = 0; index < array.length; index++) {
			array[index] = (index + 1) * (index + 1);
		}
		return array;
		}
	}
		
	public static final void swap(final double[] ARRAY, final double A, final double B) throws ArrayIllegalIndexException, ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(ARRAY)) {
			throw new ArrayEmptyException();
		}else if (ARRAY.length == 0) {
			throw new ArrayZeroLengthException();
		}else if (A < 0 || A > ARRAY.length - 1 || B < 0 || B > ARRAY.length - 1) {
			throw new ArrayIllegalIndexException();
		}else {
		double temporary = ARRAY[(int) B];
		ARRAY[(int) B] = ARRAY[(int) A];
		ARRAY[(int) A] = temporary;
		}
	}
		
	public static final double[] concat(final double[] FIRSTARRAY, final double[] SECONDARRAY) throws ArrayEmptyException, ArrayZeroLengthException {
		if (isEmpty(FIRSTARRAY)) {
			return FIRSTARRAY;
		}else if (isEmpty(SECONDARRAY)) {
			return SECONDARRAY;
		}else if (FIRSTARRAY.length == 0) {
			return FIRSTARRAY;
		}else if (SECONDARRAY.length == 0) {
			return SECONDARRAY;
		}else {
		double[] concatedArray = new double[FIRSTARRAY.length + SECONDARRAY.length];
		for (int index1 = 0, index2 = 0; index1 < concatedArray.length; index1++) {
			concatedArray[index1] = index1 < FIRSTARRAY.length ? FIRSTARRAY[index1] : SECONDARRAY[index2++];
		}
		return concatedArray;
		}
	}
		
	public static final double[] count(final double[] ARRAY, final double NUMBER) throws ArrayIllegalValueException {
		if (NUMBER < 0 || NUMBER > ARRAY.length) {
			throw new ArrayIllegalValueException();
		}else {
		double[] countArray = new double[(int) NUMBER + 1];
		for (int index = 0; index < ARRAY.length; index++) {
			try {
				countArray[index] = occurence(ARRAY, index);
			} catch (final ArrayEmptyException | ArrayZeroLengthException E) {
					E.printStackTrace();
			}
		}
		return countArray;
		}
	}
		
	public static final String[] countAsAStringArray(final double[] ARRAY, final double NUMBER) throws ArrayIllegalValueException {
		if (NUMBER < 0 || NUMBER > ARRAY.length) {
			throw new ArrayIllegalValueException();
		}else {
		String[] countArray = new String[(int) NUMBER + 1];
		for (int index = 0; index < countArray.length; index++) {
			try {
				countArray[index] = occurence(ARRAY, index) + "x" + index;
			} catch (final ArrayEmptyException | ArrayZeroLengthException E) {
				E.printStackTrace();
			}  
		}
		return countArray;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}