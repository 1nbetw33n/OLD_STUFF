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
 * 		   Oct 1, 2020
 *
 */
public final class Pair<F, S> {
	
	private F first;
	private S second;
	
	Pair() {
		this.first = null;
		this.second = null;
	}
	
	Pair(final F FIRST, final S SECOND) {
		this.first = FIRST;
		this.second = SECOND;
	}
	
	//compares Pair.first and Pair.second for equality
		final static  <F, S> boolean equals(Pair<F, S> PAIR) {
			return (PAIR.getFirst().equals(PAIR.getSecond()));
		}
	
	//returns Pair.first
	final F getFirst() {return this.first;}
	
	//returns Pair.second
	final S getSecond() {return this.second; }
	
	//sets new value to Pair.first and returns old value
	final F setFirst(final F FIRST) {
		F tmp = this.first;
		this.first = FIRST;
		return tmp;
	}
	
	//sets new value to Pair.second and returns old value
	final S setSecond(final S SECOND) {
		S tmp = this.second;
		this.second = SECOND;
		return tmp;
	}
	
	public final String toString() {
		return "(" + this.first + ", " + this.second + ")";
	}
	
	
	
	
	

}
