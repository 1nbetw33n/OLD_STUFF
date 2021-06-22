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

package Prog2.Exercises.Exercise5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Bella Abshagen, 
 * 		   Aug 24, 2020
 *
 */
public final class ListeAlsFeld<E> implements Liste<E>{
	
	final static int maxSize = 10;
	
	private E[] elements;
	
	private int size;
	
	public ListeAlsFeld() {this.elements = (E[]) new Object[ListeAlsFeld.maxSize];}

	public final int size() {return this.size;}
	
	public final boolean isEmpty() {return this.size == 0;}
	
	public final boolean add(final E E) {
		if (this.size < ListeAlsFeld.maxSize) {
			this.elements[this.size++] = E;
			return true;
		}else {
			return false;
		}
	}
	
	public final boolean remove(final E E) {
		for (int index = 0; index < this.elements.length; index++) {
			if (this.elements[index] != null && this.elements[index].equals(E)) {
				this.elements[index] = null;
				return true;
			}
		}
		return false;
	}
	
	public final boolean add(final int INDEX, final E E) {
		if (this.elements[INDEX] == null) {
			this.elements[INDEX] = E;
			return true;
		}else {
			return false;
		}
	}
	
	public final E get(final int INDEX) throws IndexOutOfBoundsException{
		if (!(INDEX < ListeAlsFeld.maxSize) || !(INDEX > -1)) {
			throw new IndexOutOfBoundsException();
		}else if(this.elements[INDEX] == null){
			throw new NullPointerException();
		} else {
			return this.elements[INDEX];
		}
	}
	
	public final E remove(final int INDEX) throws IndexOutOfBoundsException{
		if (!(INDEX < ListeAlsFeld.maxSize) || !(INDEX > -1)) {
			throw new IndexOutOfBoundsException();
		}else if(this.elements[INDEX] == null){
			throw new NullPointerException();
		} else {
			E tmp = this.elements[INDEX];
			this.elements[INDEX] = null;
			return tmp;
		}
	}
	
	public final void sort(final Comparator<? super E> COMP) {
		E tmp;
		for (int indexA = 0; indexA < this.elements.length; indexA++) {
			for (int indexB = indexA; indexB < this.elements.length; indexB++) {
				if(COMP.compare(this.elements[indexA], this.elements[indexB]) > 0) {
					tmp = this.elements[indexB];
					this.elements[indexB] = this.elements[indexA];
					this.elements[indexA] = tmp;
					}
				}
		}
		
	}
	
	private final class MyIterator implements Iterator<E>{
		
		private int index = 0;
		
		public MyIterator() {this.index = 0;}
		
		public MyIterator(final int INDEX) {this.index = INDEX;}
		
		public final boolean hasNext() {return this.index < elements.length;}
		
		public final E next() throws NoSuchElementException{
			if (!hasNext()) {
				throw new NoSuchElementException();
			}else {
				return elements[this.index++];
			}
		}
	}
	
	public final Iterator<E> iterator(){return new MyIterator();}
	
	public final Iterator<E> iterator(final int START){return new MyIterator(START);}
}
