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

package Prog2.Exercises.AufgabenSammlung.ADTS;

import java.util.Iterator;

/**
 * @author Bella Abshagen, 
 * 		   Oct 6, 2020
 *
 */
public final class RDVL<E> implements Iterable<E> {

	private Node entry = null;
	
	private int size = 0;
	
	
	public boolean isEmpty() {return this.entry == null;}
	
	public int size() {return this.size;}
	
	public final E removeLast() {
		if (this.isEmpty()) {
			throw new java.util.NoSuchElementException();
		}else {
			E removedElement;
		}
	}
	
	public Iterator<E> iterator(){return new MyIterator();}
	
	/////////////////////////////////////////////////////////////////////////////
	private final class Node{
		
		private E element;
		
		private Node next, 
					 previous;
		
		public Node(final E ELEMENT) {
			this.element = ELEMENT;
			this.next = null;
			this.previous = null;
		}
	}
	//////////////////////////////////////////////////////////////////////////////
	
	
	//////////////////////////////////////////////////////////////////////////////
	private final class MyIterator implements Iterator<E>{
		
		
		private int index = 0;
		private Node current = entry;
		
		private MyIterator() {this.index = 0;}
		
		
		

		public final boolean hasNext() {return this.current.next != null;}
		
		public final boolean hasNext(final int k) {
			int count = 0;
			while (count < k) {
				if (this.hasNext()) {
					this.current = this.current.next;
					count++;
				}else {
					return this.current.next != null;
				}
			}
			return this.current.next != null;
		}
		
		public final boolean hasPrev() {return this.current.previous != null;}
		
		public final boolean hasPrev(final int k) {
			int count = 0;
			while(count < k) {
				if (this.hasPrev()) {
					this.current = this.current.previous;
					count++;
				}else {
					return this.current.previous != null;
				}
			}
			return this.current.next != null;
		}
		
		public final E next() {
			if (!this.hasNext()) {
				throw new java.util.NoSuchElementException();
			}else {
				this.current = this.current.next;
				return this.current.element;
			}
		}
		
		public final E next(final int k) {
			if (!this.hasNext(k)) {
				throw new java.util.NoSuchElementException();
			}else {
				int count = 0;
				while(count < k) {
					if (this.hasNext()) {
						this.current = this.current.next;
						count++;
					}
				}
				return this.current.element;
			}
		}
		
		private final E prev() {
			if (!this.hasPrev()) {
				throw new java.util.NoSuchElementException();
			}else {
				this.current = this.current.next;
				return this.current.element;
			}
		}
		
		private final E prev(final int k) {
			if (!this.hasPrev()) {
				throw new java.util.NoSuchElementException();
			}else {
				int count = 0;
				while(count < k) {
					if (this.hasPrev()) {
						this.current = this.current.previous;
						count++;
					}
				}
				return this.current.element;
			}
		}
		
	}
	/////////////////////////////////////////////////////////////////////////////	
}
