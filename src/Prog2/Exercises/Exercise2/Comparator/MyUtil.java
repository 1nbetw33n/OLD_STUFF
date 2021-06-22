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

package Prog2.Exercises.Exercise2.Comparator;

import Prog2.Exercises.Exercise2.Generics.*;
import Prog2.Exercises.Exercise2.Iterator.Iterator1DArray;
import Prog2.Exercises.Exercise2.Iterator.IteratorGroupOfFour;

/**
 * @author Bella Abshagen, 
 * 		   Jul 30, 2020
 *
 */
public final class MyUtil {
	
	
	
	 
	public static final String max(final String[] STRINGS, final ComparatorString COMPSTRING) {
		Iterator1DArray<String> iterator1DString = new Iterator1DArray<String>(STRINGS);
		String max = new String();
		while (iterator1DString.hasNext()) {
			String tmp = iterator1DString.next();
			max = 0 > COMPSTRING.compare(max, tmp) ? tmp : max;
		}
		return max;
	}
	
	public static final Dish max(final Dish[] DISHES, final ComparatorDishPrice COMPDISHPRICE) {
		Iterator1DArray<Dish> iterator1DDish = new Iterator1DArray<Dish>(DISHES);
		Dish max = new Dish<>();
		while (iterator1DDish.hasNext()) {
			Dish tmp = iterator1DDish.next();
			max = 0 > COMPDISHPRICE.compare(max, tmp) ? tmp : max;
		}
		return max;
	}
	
	public static final Dish max(final GroupIFG<Dish> GOFG, final ComparatorDishPrice COMPDDISHPRICE){
		IteratorGroupOfFour<Dish> iteratorGOF = new IteratorGroupOfFour<>(GOFG);
		Dish max = new Dish<>();
		while (iteratorGOF.hasNext()) {
			Dish tmp = iteratorGOF.next();
			max = 0 > COMPDDISHPRICE.compare(max, tmp) ? tmp : max;
		}
		return max;
	}

}
