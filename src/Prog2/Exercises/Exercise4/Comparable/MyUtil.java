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

package Prog2.Exercises.Exercise4.Comparable;


import Prog2.Exercises.Exercise2.Comparator.*;
import Prog2.Exercises.Exercise2.Generics.*;
import Prog2.Exercises.Exercise2.Iterator.IteratorGroupOfFour;

/**
 * @author Bella Abshagen, 
 * 		   Aug 20, 2020
 *
 */
public final class MyUtil<T> {
	
	public static final <T extends Comparable<? super T>> T max (final GroupIFG<T> GIFG) throws Exception {
			T max = GIFG.get(0);
			for (int index = 1; index < GIFG.size(); index++) {
				max = max.compareTo(GIFG.get(index)) > 0 ? max : GIFG.get(index);
			}
			return max;
	}
	
	public static final <T> T max (final GroupIFG<T> GIFG, final ComparatorDishPrice COMP) throws Exception {
		IteratorGroupOfFour<T> iteratorGOF = new IteratorGroupOfFour<>(GIFG, 1);
		T max =  GIFG.get(0);
		while (iteratorGOF.hasNext()) {
			T tmp = iteratorGOF.next();
			max = 0 > COMP.compare((Dish) max, (Dish) tmp) ? tmp : max;
		}
		return max;
	}
	
	
	

}
