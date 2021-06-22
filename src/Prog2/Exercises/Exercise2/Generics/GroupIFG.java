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

package Prog2.Exercises.Exercise2.Generics;

import Prog2.Exercises.Exercise1.TableSpaceOutOfBoundsException;

/**
 * @author Bella Abshagen, 
 * 		   Jul 28, 2020
 *
 */
public interface GroupIFG<T> extends Iterable<T>{
	
	/**
	 * 
	 * @TODO: 
	 */

	/*
	 * returns the size of occupied slots
	 * requirements: 
	 * range of values: 0 - 3
	 */
	int size();

	/*
	 * returns if all slots are empty or not
	 * requirements: 
	 * range of values: true / false
	 * possible errors:
	 */
	boolean isEmpty();
	
	/*
	 * inserts the handed over dish at the end of the dish array
	 * requirements: min. one free slot
	 * range of values: void / exception
	 * possible errors: -no free slot
	 * 
	 */
	void append(final T D) throws TableSpaceOutOfBoundsException;
	
	/*
	 * removes the last dish of the dish array and returns it
	 * requirements: min. occupied slot
	 * range of values: first- - fourthPlace / exception
	 * possible error: there is no object to remove (all dishes are null)
	 */
	T removeLast() throws Exception;
	
	/*
	 * returns the dish at handed over position
	 * requirements: -legal position as parameter
	 * 				 -object at given position unequal null
	 * range of values: first- - fourthPlace
	 * possible error: -illegal positions
	 * 				   -object is null
	 */
	T get(final int POSITION) throws Exception;
	
	/*
	 * swaps the dishes at given positions of dish array
	 * requirements: -legal positions
	 * 				 -both objects unequal null 
	 * range of values: void / excxeption
	 * possible error: -illegal positions
	 */
	void swap(final int POS1, final int POS2) throws Exception;
}
