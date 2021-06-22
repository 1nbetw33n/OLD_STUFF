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

package Prog2.Exercises.Exercise2.Iterator;

import Prog2.Exercises.Exercise1.Dish;

/**
 * @author Bella Abshagen, 
 * 		   Aug 4, 2020
 *
 */
public final class MyUtil {
	
	public static final void printAll(final Iterator1DArray<Dish> ITERATOR) {
		while (ITERATOR.hasNext()) {
			System.err.println(ITERATOR.next() + "\n");
		}
	}
	
	public static final void printAll(final Iterator1DArray<Dish> ITERATOR1, final Iterator1DArray<Dish> ITERATOR2) {
		while (ITERATOR1.hasNext()) {
			while (ITERATOR2.hasNext()) {
			System.err.println(ITERATOR1.next() + "\t" + ITERATOR2.next() + "\n");
			}
		}
	}
	
}
