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

/**
 * @author Bella Abshagen, 
 * 		   Oct 6, 2020
 *
 */
public final class EVL<T> {
	
	private final class Node{
		
		T element;
		Node next;
		
		public Node(final T ELEMENT) {
			this.element = ELEMENT;
			this.next = null;
		}
		
	}
	
	
	private Node first;
	
	public final boolean isEmpty() {return this.first == null;}
	
	public final Node getFirst() {return this.first;}
	
	public final void setFirst(final Node FIRST) {
		Node tmp = this.first;
		this.first = FIRST;
		this.first.next = tmp.next;
	}
	
	public final void insertFirst(final Node FIRST) {
		Node tmp = this.first;
		this.first = FIRST;
		this.first.next = tmp;
	}
	
	public final void removeFirst() {this.first = this.first.next;}
	
	public final void splice(final EVL<T> OTHER) {
		while(!OTHER.isEmpty()) {
			this.
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
