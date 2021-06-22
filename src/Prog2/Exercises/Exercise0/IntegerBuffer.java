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

package Prog2.Exercises.Exercise0;

/**
 * @author Bella Abshagen
 *
 */

public interface IntegerBuffer {
	
	void push(final Integer I) throws Exception;
	
	Integer pop() throws Exception;
	
	int size();
	
	int capacity();

}
