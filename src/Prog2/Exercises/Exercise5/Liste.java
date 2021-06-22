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

package Prog2.Exercises.Exercise5;

import java.util.Comparator;

/**
 * @author Bella Abshagen, 
 * 		   Aug 24, 2020
 *
 */
public interface Liste<E> extends Kollektion<E>, Iterable<E>{
	
	boolean add(int index, E t);
	
	E get(int index) throws IndexOutOfBoundsException;
	
	E remove(int index) throws IndexOutOfBoundsException;
	
	void sort(Comparator<? super E> comp);

}
