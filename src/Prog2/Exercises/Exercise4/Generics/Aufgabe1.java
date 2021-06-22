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

package Prog2.Exercises.Exercise4.Generics;

/**
 * @author Bella Abshagen, 
 * 		   Aug 9, 2020
 *
 */
public final class Aufgabe1 {
	
	class A{};
	class B extends A{};
	class C extends B{};
	class D extends A{};
	
	private A ab = new B();
	
	private B b = (B) ab;
	
	

}
