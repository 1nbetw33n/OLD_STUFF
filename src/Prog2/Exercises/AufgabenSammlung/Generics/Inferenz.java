/* copyright (c) 2019-2022 xx63ll4 Labs
 * St. Augustin, North Rhine Westphalia, 53757 F.R.G.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of 
 * xx63ll4 Labs ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * xx63ll4 Labs.
 */

package Prog2.Exercises.AufgabenSammlung.Generics;

/**
 * @author Bella Abshagen, 
 * 		   Oct 5, 2020
 *
 */


class A{}
class B extends A{}
class C extends A{}
class D extends C{}
class E{}

public final class Inferenz {

	public static <T> T		f(T x, T y) {return null;}
	public static <T> T 	g(T[] x, T[] y) {return null;}
	public static <T> T[]	h(T x, T[] y) {return null;}
	public static <T, U> U  k(U[] x, T y) {return null;}
	
	
	
	public static void main(String[] args) {
		
	
		A			z03 = f(new B(), new D());
		B 			z06 = f(new C(), new D());
		E			z07 = f(new E(), new A());
		Object		z08 = f(new B(), new E());
		C			z09 = f(new B(), new D());
		A[]			z10 = f(new B[1], new C[1]);
		B[]			z11 = f(new B[1], new C[1]);
		Object[]	z13 = f(new B[1], new D[1]);
		Object		z14 = f(new D[1], new E[1]);
		A[]			z17 = g(new B[1], new D[1]);
		A			z18 = g(new C[1], new D[1]);
		A			z19 = g(new B[1], new E[1]);
		Object		z22 = g(new B[1], new int[1]);
		A[]			z24 = h(new B(), new B[1]);
		A[]			z27 = h(new B(), new D[1]);
		C[][]		z30 = h(new C(), new C[1]);
		E			z31 = k(new E[1], new E());
		B			z34 = k(new C[1], new B());
	}
	
	
	
	
	
	
	
}




