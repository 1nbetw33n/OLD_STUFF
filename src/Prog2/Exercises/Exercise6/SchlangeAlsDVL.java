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

package Prog2.Exercises.Exercise6;

import java.util.Comparator;

/**
 * @author Bella Abshagen, 
 * 		   Aug 24, 2020
 *
 */
public final class SchlangeAlsDVL<E> implements Schlange<E> {
	//FIFO 
	
	private Node first = null;
	private Node last = null;
	
	private int size;
	
	
	public final int size() {return this.size;}

	
	public final boolean isEmpty() {return this.first == null;}

	
	public final boolean add(final E ELEMENT) {
		//creates a new Node that consists only of ELEMENT without pointer to next or previous Nodes
		Node newNode = new Node(ELEMENT);
		
		//in case of first == last == null
		if (this.first == null && this.last == null) {
		
			this.first = newNode;
			this.last  = newNode;
			this.size++;
			return true;
			
		//else puts the new nod at the tail of the queue
		}else {
			this.last.next = newNode;
			newNode.previous = this.last;
			this.size++;
			return true;
		}
	}

	//removes the handed over element from (and also the Node) from the doubly linked list
	public final boolean remove(final E ELEMENT) {
		boolean successBit = false;
		//creates a new Node that consists only of ELEMENT without pointer to next or previous Nodes
			Node removeThisNode = new Node(ELEMENT);
			
			//if to be removed element matches first's element
			if (removeThisNode.element.equals(this.first.element)) {
				this.first = this.first.next;
				this.first.next.previous = null;
				successBit = true;
				this.size--;
				
				//if to be removed element matches last's element
			}else if(removeThisNode.element.equals(this.last.element)){
				this.last = this.last.previous;
				this.last.previous.next = null;
				successBit = true;
				this.size--;
				
				//starts from second first Node and iterates till second first Node to find to be removed element
			}else {
				removeThisNode = new Node(this.last.next);
				//as long as element doesn't match with Node's element, the previous Node gets selected
				while (!ELEMENT.equals(removeThisNode.element)) {
					removeThisNode = removeThisNode.previous;
				}
				//if found: success bit is tagged with true
				if (ELEMENT.equals(removeThisNode.element)) {
					removeThisNode.previous.next = removeThisNode.next;
					removeThisNode.next.previous = removeThisNode.previous;
					successBit = true;
					this.size--;
				}
				//else: success bit stays false
				// this.size is not reduced by 1
			} 
			return successBit;
	}
	
	//returns the next elements; due to FIFO implementation next element is always first Node's element
	public final E peek() throws Exception{
		if (this.first == null || this.first.element == null) {
			throw new NullPointerException();
		}else {
			return this.first.element;
		}
	}

	//returns the next elements and removes the Node that contains the element from List; due to FIFO implementation next element is always first Node's element
	//reduces size by 1
	public final E remove() throws Exception{
		if (this.first == null || this.first.element == null) {
			throw new NullPointerException();
		}
		Node removeThisNode = new Node(this.first);
		E removedElement = removeThisNode.element;
		this.first = this.first.next;
		this.first.previous = null;
		this.size--;
		return removedElement;
	}
	
	
	//sorts the double linked list starting with first Node
	public final void sort(final Comparator<? super E> COMP) {
		Node tmp; //for triangle swap
		Node node = this.first; // for comparing with nextNode
		Node nextNode = node.next; // for iterating over structure
		
		//while node has minimum 1 next Node
		//iterates similar to a doubly nested for-loop for an array type
		while (node.next != null) {
			while (nextNode != null) {
				if (COMP.compare(node.element, nextNode.element) > 0) {
					tmp = node;
					node = nextNode;
					nextNode = tmp;
				}
				nextNode = nextNode.next;
			}
			node = node.next;
			nextNode = node.next;
		}
			
		
		
					
		
		}
	
	private class Node{
		
		E element;
		
		Node next,
			 previous;
		
		private Node(final E ELEMENT) {
			this.element  = ELEMENT;
			this.next	  = null;
			this.previous = null;
		}
		
		private Node(final Node NODE) {
			this.element  = NODE.element;
			this.next 	  = NODE.next;
			this.previous = NODE.previous;
		}
		
		private Node(final E ELEMENT, final Node NEXT, final Node PREVIOUS) {
			this.element  = ELEMENT;
			this.next 	  = NEXT;
			this.previous = PREVIOUS;
		}
		
		
		
	}
	
	
	
	

}
