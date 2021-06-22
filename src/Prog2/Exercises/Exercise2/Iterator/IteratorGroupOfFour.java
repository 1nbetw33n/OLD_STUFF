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

import Prog2.Exercises.Exercise1.GroupOfFour;
import Prog2.Exercises.Exercise2.Generics.GroupIFG;


/**
 * @author Bella Abshagen, 
 * 		   Aug 3, 2020
 *
 */
public final class IteratorGroupOfFour<E> implements Iterator<E> {
	
	private int index;
	
	private E[] elements = (E[]) new Object[4];
	
	
	public IteratorGroupOfFour(final GroupIFG GOF) {
		try {
			this.elements[0] = (E) GOF.get(0);
			this.elements[1] = (E) GOF.get(1);
			this.elements[2] = (E) GOF.get(2);
			this.elements[3] = (E) GOF.get(3);
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	public IteratorGroupOfFour(final GroupIFG GOF, final int START) {
		this.index = START;
		try {
			this.elements[0] = (E) GOF.get(0);
			this.elements[1] = (E) GOF.get(1);
			this.elements[2] = (E) GOF.get(2);
			this.elements[3] = (E) GOF.get(3);
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	
	
	public final boolean hasNext() {return this.index < this.elements.length;}
	
	public final E next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}else {
			return this.elements[this.index++];
		}
	}

}
