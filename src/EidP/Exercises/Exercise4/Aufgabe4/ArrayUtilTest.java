package EidP.Exercises.Exercise4.Aufgabe4;

import java.util.Arrays;

import EidP.Exercises.Exercise6.Aufgabe1.ArrayEmptyException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayIllegalIndexException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayIllegalIntervalException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayIllegalValueException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayParameterLessOneException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayZeroLengthException;

public class ArrayUtilTest {
	
	public static final void main(final String[] ARGS) {
		int[] array1 = null;
		try {
			array1 = ArrayUtil.createRandom(99);
		} catch (ArrayParameterLessOneException e) {
			e.printStackTrace();
		}
		try {
			ArrayUtil.putRandom(array1, 1, 23);
		} catch (ArrayEmptyException | ArrayZeroLengthException | ArrayIllegalIntervalException e) {
			e.printStackTrace();
		}
		try {
			ArrayUtil.show(array1);
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			ArrayUtil.shuffle(array1);
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			ArrayUtil.show(array1);
		} catch (ArrayEmptyException | ArrayZeroLengthException e1) {
			e1.printStackTrace();
		}
		try {
			ArrayUtil.reset(array1);
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			ArrayUtil.show(array1);
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		int[] array2 = null;
		try {
			array2 = ArrayUtil.clone(array1);
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			System.err.println(ArrayUtil.equals(array1, array2));
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		int[] array3 = null;
		try {
			array3 = ArrayUtil.createSequence(23);
		} catch (ArrayParameterLessOneException e) {
			e.printStackTrace();
		}
		try {
			System.err.println(ArrayUtil.contains(array3, 23));
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			System.err.println(ArrayUtil.contains(array3, 0));
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			System.err.println(ArrayUtil.occurence(array3, 23));
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			System.err.println(ArrayUtil.occurence(array3, 0) + "\n");
		} catch (ArrayEmptyException | ArrayZeroLengthException e1) {
			e1.printStackTrace();
		}
		try {
			System.err.println(ArrayUtil.max(array3));
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			System.err.println(ArrayUtil.min(array3));
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			System.err.println(ArrayUtil.sum(array3) + "\n");
		} catch (ArrayEmptyException | ArrayZeroLengthException e1) {
			e1.printStackTrace();
		}
		try {
			ArrayUtil.swap(array3, 0, array3.length - 1);
		} catch (ArrayIllegalIndexException | ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			ArrayUtil.show(array3);
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		int[] array4 = null;
		try {
			array4 = ArrayUtil.createSequence(46);
		} catch (ArrayParameterLessOneException e) {
			e.printStackTrace();
		}
		try {
			ArrayUtil.show(ArrayUtil.concat(array3, array4));
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
		try {
			ArrayUtil.show(ArrayUtil.count(array3, 23));
		} catch (ArrayEmptyException | ArrayZeroLengthException | ArrayIllegalValueException e) {
			e.printStackTrace();
		}
		try {
			System.err.println(Arrays.deepToString((ArrayUtil.countAsAStringArray(array3, 23))));
		} catch (ArrayIllegalValueException e1) {
			e1.printStackTrace();
		}
		try {
			ArrayUtil.show(array3.clone());
		} catch (ArrayEmptyException | ArrayZeroLengthException e) {
			e.printStackTrace();
		}
	}
}
	