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

package Prog2.Exercises.Exercise2.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Bella Abshagen, 
 * 		   Jul 30, 2020
 *
 */

public final class Iterator1DArray<E> implements Iterator<E>{
	
	private int index,
				end;
	
	private E[] elements;
	
	public Iterator1DArray(final E[] ELEMENTS, final int START, final int END) {
		this.elements = ELEMENTS;
		this.index = START;
		this.end = END;
	}
	
	public Iterator1DArray(final E[] ELEMENTS, final int END) {
		this(ELEMENTS, 0, END);
	}
	
	public Iterator1DArray(final E[] ELEMENTS){this(ELEMENTS, 0, ELEMENTS.length);}
		
	public final boolean hasNext() {return this.index < this.end;}
	
	public final E next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		} else {
			return this.elements[this.index++];
		}
	}
	
	
	

}
