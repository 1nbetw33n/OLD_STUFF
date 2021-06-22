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

package Prog2.Exercises.Exercise3;

import Prog2.Exercises.Exercise2.Comparator.ComparatorString;

/**
 * @author Bella Abshagen, 
 * 		   Aug 7, 2020
 *
 */
public final class Helper {
	
	public static final <T> T stringLaenge(final T T1, final T T2) {
		ComparatorString compStr = new ComparatorString(); 
		return compStr.compare(T1.toString(), T2.toString()) > 0 ? T1 : T2;
	}

}
