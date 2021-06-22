package EidP.Exercises.Exercise4.Aufgabe1;

import java.util.Arrays;

public class Aufgabe1{

	public static void test1(){
		int a[] = {2, 4, 6};
		int b[] = {2, 4, 6};
		if(a == b){
			System.err.println("equal");
		}else{
			System.err.println("not equal");
		}
	}

	public static void test2(){
		int[] a = {2, 4, 6};
		int[] b = a;
		b[0] = 5;
		System.err.println(Arrays.toString(a));
		if(a == b){
			System.err.println("equal");
		}else{
			System.err.println("not equal");
		}
	}

	public static void main (String[] args){
		test1();
		test2();
	}
}
