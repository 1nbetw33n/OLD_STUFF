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

import java.util.Random;

/**
 * @author Bella Abshagen
 *
 */
public abstract class AbstractIntegerBuffer implements IntegerBuffer{
	
	protected static final Random random = new Random();
	protected int size;
	protected Integer[] array;
	
	public AbstractIntegerBuffer() {this.array = new Integer[((random.nextInt() * 100) + 3)];}
	
	public AbstractIntegerBuffer(final int SIZE) {this.array = new Integer[SIZE];}
	
	public void push(final Integer I) throws Exception {
		if (!(this.size() < this.capacity())) {
			throw new Exception("Buffer already full");
		}else {
			this.array[this.size++] = I;
		}
	}
	
	public int size() {return this.size;}
	
	public int capacity() {return this.array.length;}

}
