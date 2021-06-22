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
public class Lifo extends AbstractIntegerBuffer{
	
	public Lifo() {super();}
	
	public Lifo(final int SIZE) {super(SIZE);}
	
	public Integer pop() throws Exception {
		if (!(this.size() > 0) || !(this.capacity() > 0)) {
			throw new Exception("There is nothing to pop from this IntegerBuffer");
		}else {
			Integer output = this.array[this.size - 1];
			this.array[--this.size] = null;
			return output;
		}
	}

}
