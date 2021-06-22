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
public class Fifo extends AbstractIntegerBuffer{
	
	public Fifo() {super();}
	
	public Fifo(final int SIZE) {super(SIZE);}
	
	public Integer pop() throws Exception {
		if (!(this.size() > 0) || !(this.capacity() > 0)) {
			throw new Exception("There is nothing to pop from this IntegerBuffer");
		}else {
			Integer output = this.array[this.array.length - this.size];
			this.array[this.array.length - this.size--] = null;
			return output;
		}
	}
	
}
