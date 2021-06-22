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

package Prog2.Exercises.Exercise6;

/**
 * @author Bella Abshagen, 
 * 		   Aug 26, 2020
 *
 */
public final class Pair<T> {
	
	T first;
	T second;
	
	Pair(final T T1, final T T2){
		this.first = T1;
		this.second = T2;
	}
	
	public final T first() {return this.first;}
	
	public final T second() {return this.second;}
	
}
