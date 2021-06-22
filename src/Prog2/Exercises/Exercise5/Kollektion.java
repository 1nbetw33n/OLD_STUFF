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

/**
 * @author Bella Abshagen, 
 * 		   Aug 24, 2020
 *
 */
public interface Kollektion<E> {
	
	int size();
	
	boolean isEmpty();
	
	boolean add(E e);
	
	boolean remove(E e);

}
