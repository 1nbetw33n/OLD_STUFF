package EidP.Exercises.Exercise4.Aufgabe4;

import java.util.Arrays;

import EidP.Exercises.Exercise6.Aufgabe1.ArrayEmptyException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayIllegalIndexException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayIllegalIntervalException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayIllegalValueException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayParameterLessOneException;
import EidP.Exercises.Exercise6.Aufgabe1.ArrayZeroLengthException;

public class ArrayUtilTest2 {
	
	public static final void main(final String[] ARGS) throws ArrayParameterLessOneException, ArrayEmptyException, ArrayZeroLengthException, ArrayIllegalIntervalException, ArrayIllegalValueException, ArrayIllegalIndexException {
		int[] array1 = ArrayUtil.createRandom(99);
		ArrayUtil.putRandom(array1, 1, 23);
		ArrayUtil.show(array1);
		ArrayUtil.shuffle(array1);
		ArrayUtil.show(array1);
		ArrayUtil.reset(array1);
		ArrayUtil.show(array1);
		int[] array2 = ArrayUtil.clone(array1);
		System.err.println(ArrayUtil.equals(array1, array2));
		int[] array3 = ArrayUtil.createSequence(23);
		ArrayUtil.show(array3);
		System.err.println(ArrayUtil.contains(array3, 23));
		System.err.println(ArrayUtil.contains(array3, 0));
		System.err.println(ArrayUtil.occurence(array3, 23));
		System.err.println(ArrayUtil.occurence(array3, 0) + "\n");
		System.err.println(ArrayUtil.max(array3));
		System.err.println(ArrayUtil.min(array3));
		System.err.println(ArrayUtil.sum(array3) + "\n");
		ArrayUtil.swap(array3, 0, array3.length - 1);
		ArrayUtil.show(array3);
		int[] array4 = ArrayUtil.createSequence(46);
		ArrayUtil.show(ArrayUtil.concat(array3, array4));
		ArrayUtil.show(ArrayUtil.count(array3, 23));
		System.err.println(Arrays.deepToString((ArrayUtil.countAsAStringArray(array3, 23))));
		
		ArrayUtil.show(array3.clone());
		
		
	}
	
	
	

}



