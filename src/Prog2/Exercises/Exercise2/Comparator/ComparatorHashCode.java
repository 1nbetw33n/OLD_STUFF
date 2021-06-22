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

import java.util.Comparator;

/**
 * @author Bella Abshagen, 
 * 		   Jul 30, 2020
 *
 */
public final class ComparatorHashCode implements Comparator<String>{
	
	public final int compare(final String STRING1, final String STRING2) {
		return STRING1.hashCode() - STRING2.hashCode();
	}
	
	

}
