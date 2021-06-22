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

import java.util.List;
import java.util.LinkedList;

/**
 * @author Bella Abshagen, 
 * 		   Oct 8, 2020
 *
 */
public final class Inferenz1 {
	
	class A{}
	class B{}
	class C extends B{}
	class D extends C{}
	class E extends A{}
	
	
	<T> T f1(List<? extends T> l) {return l.get(3);}
	<T> void f2(List<? super T> l, T e) {l.append(e);}
	
	public void doit() {
		C c1 = f1(new LinkedList<B>());
		C c2 = f1(new LinkedList<C>());
		C c3 = f1(new LinkedList<D>());
		B b1 = f1(new LinkedList<C>());
		D d1 = f1(new LinkedList<C>());
		
		f2(new LinkedList<A>(), new A());
		f2(new LinkedList<A>(), new E());
		f2(new LinkedList<E>(), new A());
		f2(new LinkedList<E>(), new E());
		f2(new LinkedList<Object>(), new A());
		
	}
	

}
