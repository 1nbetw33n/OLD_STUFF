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

package Prog2.Exercises.Exercise2.Generics;

import java.util.Iterator;
import java.util.NoSuchElementException;

import Prog2.Exercises.Exercise1.TableSpaceOutOfBoundsException;

/**
 * @author Bella Abshagen, 
 * 		   Jul 27, 2020
 *
 */
public class GroupOfFourG<T> implements GroupIFG<T>{
	
	/*
	 * size indicates the current position;
	 * size = 0 -> firstPlace;
	 * size = 3 -> fourthPlace, etc.
	 */
	private int size;
	
	protected T no1,
				no2;
	
	private T   no3,
				no4;
	
	private T[] elements;
	
	/*
	 * default constructor
	 */
	public GroupOfFourG() {}
	 
	public GroupOfFourG(final T[] OBJECTS){
		//ensure that, no objects with same references are included
		copyCatKiller(OBJECTS);
		this.elements = OBJECTS;
		//creates an Array of T's
		@SuppressWarnings("unchecked")
		T[] tmpObjects = (T[]) new Object[] {this.no1, this.no2, this.no3, this.no4};
		for (int indexTMP = 0, indexO = 0; indexTMP < tmpObjects.length; indexTMP++, indexO++) {
			//increments index, while OBJECTS[objectsIndex] == null and index < length
			if (indexO < OBJECTS.length - 1) {
				while(OBJECTS[indexO] == null) {
					indexO++;
				}
			}
			tmpObjects[indexTMP] = indexO < OBJECTS.length ? OBJECTS[indexO] : null;
		}
		//ensures that the GroupOfFourG-Object isn't occupied by all the same object,
		//in case of OBJECTS consists of only one object
		copyCatKiller(tmpObjects);
		this.no1 = tmpObjects[0];
		this.no2 = tmpObjects[1];
		this.no3 = tmpObjects[2];
		this.no4 = tmpObjects[3];
		//increments this.size for every slot, that is not null
		for (int index = 0; index < tmpObjects.length; index++) {
			this.size = tmpObjects[index] != null ? ++this.size : this.size;
			}
		}
	
	/*
	 * constructor that creates deep copies
	 */
	public GroupOfFourG(final GroupIFG<T> GIFG) {
		try {
			this.no1 = GIFG.get(0) != null ? GIFG.get(0) : null; // hier jeweils mit new operator arbeiten
			this.no2 = GIFG.get(1) != null ? GIFG.get(1) : null;
			this.no3 = GIFG.get(2) != null ? GIFG.get(2) : null;
			this.no4 = GIFG.get(3) != null ? GIFG.get(3) : null;
		} catch (Exception E) {
			E.printStackTrace();
		}
	}
	
	
	
	//removes every object, that appears more than once in this T[] based on object's reference
	private final void copyCatKiller(T[] OBJECTS) {
		for (int indexA = 0; indexA < OBJECTS.length; indexA++) {
			/*
			 * compares index with every index from index+1 to last index for doubled references and
			 * exits the inner loop if OBJECT[indexA] == null
			 */
			for (int indexB = indexA + 1; indexB < OBJECTS.length && OBJECTS[indexA] != null; indexB++) {
				/*
				 * in case of a positive double reference, the object at OBJECT[indexA] is removed and that results
				 * in exiting the inner loop
				 */
				OBJECTS[indexA] = OBJECTS[indexA] == OBJECTS[indexB] ? null : OBJECTS[indexA]; 
			}
		}
	}
		
	public final int size() {return this.size;}
	
	public final boolean isEmpty() {return this.size == 0;}
	
	public final void append(final T D) throws TableSpaceOutOfBoundsException{
		if (this.size > 3) {
			throw new TableSpaceOutOfBoundsException("this group has no more free slots");
		}else if (D == null) {
			throw new NullPointerException();
		}else {
			switch (this.size++) {
				case 0:{
					this.no1 = D;
					break;
				}
				case 1:{
					this.no2 = D;
					break;
				}
				case 2:{
					this.no3 = D;
					break;
				}
				case 3:{
					this.no4 = D;
					break;
				}
			}
		}
	}
	
	public final T removeLast() throws Exception{
		if (this.isEmpty()) {
			throw new Exception("there is nothing to remove, since this group of empty");
		}else {
			//temporary dish
			T tmp;
			switch (this.size--) {
				case 1:{
					//creates shallow copy of dish, before nulling original dish
					tmp = this.no1;
					this.no3 = null;
					return tmp;
				}
				case 2:{
					tmp = this.no2;
					this.no2 = null;
					return tmp;
				}
				case 3:{
					tmp = this.no3;
					this.no3 = null;
					return tmp;
				}
				default:{
					tmp = this.no4;
					this.no4 = null;
					return tmp;
				}
			}
		}
	}
	
	public final T get(final int POSITION) throws Exception{
		if (this.size == 0 || POSITION < 0 || POSITION > 3) {
			throw new Exception("index value is illegal or the group is empty");
		}else {
			switch (POSITION) {
				default:{
					return this.no1;
				}
				case 1:{
					return this.no2;
				}
				case 2:{
					return this.no3;
				}
				case 3:{
					return this.no4;
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public final void swap(final int POS1, final int POS2) throws Exception{
		if (POS1 < 0 || POS1 > 3 || POS2 < 0 || POS2 > 3) {
			throw new Exception("one or both index values are illegal");
		}else {
			T[] tmpArray = (T[]) new Object[] {this.no1, this.no2, this.no3, this.no4};
			T tmpDish = tmpArray[POS1];
			tmpArray[POS1] = tmpArray[POS2];
			tmpArray[POS2] = tmpDish;
			this.no1 = tmpArray[0];
			this.no2 = tmpArray[1];
			this.no3 = tmpArray[2];
			this.no4 = tmpArray[3];
		}
	}
	
	/*
	 * clears all entries including first to (inclusive) fourth
	 * requirements: non-final objects
	 * range of values: void / exception
	 * possible errors: object is final 
	 */
	public final void clear() {
		this.no1 = null;
		this.no2 = null;
		this.no3 = null;
		this.no4 = null;
		this.size = 0;
	}
	
	/*
	 * returns the GroupOfFour object as String
	 * requirements:
	 * range of values:
	 * possible errors: Object is null, but handled by ternary operators :)
	 */
	public final String toString() {		
		return ((this.no1 != null) ? this.no1.toString() : null) + ((this.no2 != null) ? this.no2.toString() : null)
				+ ((this.no3 != null) ? this.no3.toString() : null) + ((this.no4 != null) ? this.no4.toString() : null);
	}

	
	private final class MyIterator implements Iterator<T>{
		
		private int index;
		
		private MyIterator() {this.index = 0;}
		
		private MyIterator(final int START) {this.index = START;}
		
		public final boolean hasNext() {return this.index < elements.length;}
		
		public final T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}else {
				return elements[this.index++];
			}
		}
		
	}

	public final Iterator<T> iterator() {return new MyIterator();}
	
	public final Iterator<T> iterator(final int START){return new MyIterator(START);
	
	}
	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public static void main(String[] args) {
//		Dish<Dish>[] dishes = new Dish[] {new Dish<>(), new Dish<>(), new Dish<>()};
//		Salad<Salad>[] salads = new Salad[] {new Salad<>(), new Salad<>(), new Salad<>()};
//		Pizza<Pizza>[] pizzas = new Pizza[] {new Pizza<>(), new Pizza<>(), new Pizza<>()};
//		GroupOfFourG<?> dishG = new GroupOfFourG<>(dishes);
//		dishG = new GroupOfFourG<>(salads);
//		dishG = new GroupOfFourG<>(pizzas);
//		System.err.println(dishG);
//	}
}
