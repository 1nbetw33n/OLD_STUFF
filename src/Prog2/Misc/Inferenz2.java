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

package Prog2.Misc;

/**
 * @author Bella Abshagen, 
 * 		   Oct 8, 2020
 *
 */
public final class Inferenz2 {
	
	class Feld<T>{}
	class FeldFix<T> extends Feld{

		public FeldFix(int i) {
		}}
	
	
	class A{}
	class B extends A{}
	class C extends A{}
	class D extends C{}
	class E{}
	
	<T> T	 m1(Feld<? super T> f, T[]a) {return null;}
	<T> T [] m2(Feld<? extends T> f1, Feld<? super T> f2) {}
	
	B 			b 	= m1(new FeldFix<Object>(3), new C[3]);
	C[] 		ca 	= m1(new FeldFix<A[]>(3), new D[3][3]);
	A[]			a 	= m2(new FeldFix<D>(3), new FeldFix<C>(3));
	Object 		o 	= m2(new FeldFix<E>(3), new FeldFix<A>(3));
}