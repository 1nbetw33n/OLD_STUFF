package EidP.Exercises.Exercise7.Aufgabe2;

/* copyright (c) 2019-2022 xx63ll4 Labs
 * St. Augustin, North Rhine Westphalia, 53757 F.R.G.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of 
 * xx63ll4 Labs ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * xx63ll4.
 */
/*                
 * @version xxxxxx
 * @author Bella Abshagen 23.6.20
 */

import java.util.Random;

public class IntMengeGet implements MengeGet<Integer> {

	protected static final Random RANDOM = new Random();
	protected Integer[] elements;
	
	public IntMengeGet() {this.elements = new Integer[0];}
	
	public IntMengeGet(final Integer[] ELEMENTS) {this.elements = ELEMENTS;}
	
	//making DeepCopies
	public IntMengeGet(final MengeGet<Integer> INTEGERSET) {this(((IntMengeGet) INTEGERSET).elements);}
	
	//checks if INTEGER exists in the set
	public final boolean contains(final Integer INTEGER) throws MengeGetException{
		if (this.elements ==  null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("The empty set is always empty");
		} else {
			this.normalize();
			int counter = 0;
			for (int index = 0; index < this.elements.length; index++) {
				//comparing references doesn't work for Integer > 128 or < -127 to check for equality
				counter = this.elements[index].equals(INTEGER) ? ++counter : counter;
			}
			return counter > 0;
		}
	}
	
	//checks if INTEGER exists more than once in the set
	public final boolean containsTwo(final Integer INTEGER) throws MengeGetException{
		if (this.elements ==  null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("The empty set is always empty");
		} else {
			this.normalize();
			int counter = 0;
			for (int index = 0; index < this.elements.length; index++) {
				//comparing references doesn't work for Integer > 128 or < -127 to check for equality
				counter = this.elements[index].equals(INTEGER) ? ++counter : counter;
			}
			return counter > 1;
		}
	}
				
	//creates a set with length+1 and inserts NUMBER at last index of the created set
	public final void insert(final Integer INTEGER) throws MengeGetException{
		if (this.containsTwo(INTEGER)) {
			throw new MengeGetException("Integer is already included in this set");
		}
		Integer[] elementsExtended = new Integer[this.elements.length + 1];
		for (int index = 0; index < this.elements.length; index++) {
			elementsExtended[index] = this.elements[index];
		}
		elementsExtended[elementsExtended.length - 1] = INTEGER;
		this.elements = elementsExtended;
		this.normalize();
	}
		
	//removes INTEGER from the set
	public final void remove(final Integer INTEGER) throws MengeGetException{
		if (this.elements == null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("You can't remove elements if the set is already empty ;)");
		}else if (!this.contains(INTEGER)) {
			throw new MengeGetException("There is nothing to remove from this set, since the Integer isn't included in this set");
		}else {
			for (int index = 0; index < this.elements.length; index++) {
				this.elements[index] = this.elements[index].equals(INTEGER) ? this.elements[index] = null : this.elements[index];
			}
			this.normalize();
		}
	}
	
	//returns the size of the set
	public final int size() throws MengeGetException {
		if (this.elements ==  null) {
			throw new MengeGetException("NullPointerException");
		}else {
			return this.elements.length;
		}
	}
		
	//returns the Integer located at a pseudo-random index-number
	public final Integer get() throws MengeGetException{
		if (this.elements ==  null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("The empty set doesn't contain any elements ;)");
		}else {
			return this.elements[RANDOM.nextInt(this.elements.length)];
		}
	}
		
	//creates a DeepCopy of MengeGet <?>
	@SuppressWarnings("finally")
	public MengeGet<Integer> clone() {
		try {
		this.normalize();
		}catch (final MengeGetException E) {
			E.printStackTrace();
		} finally {
			return new IntMengeGet(this);
		}
	}
		
	
	//eliminates duplicates
	public final void copyCatKiller() throws MengeGetException {
		if (this.elements == null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("There is nothing to normalize in an empty set ;)");
		}else {
			this.normalize();
			for (int index = 0; index < this.elements.length; index++) {
				if (this.containsTwo(this.elements[index])) {
					Integer temporary = this.elements[index];
					this.remove(this.elements[index--]);
					this.insert(temporary);
				}
			}
		}
	}
		
	//eliminates null elements
	public final void normalize() throws MengeGetException {
		if (this.elements == null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("There is nothing to normalize in an empty set ;)");
		}else {
			int size = this.elements.length;
			for (int index = 0; index < this.elements.length; index++) {
				size = this.elements[index] == null ? --size : size;	
			}
			Integer[] elementsShrinked = new Integer[size];
		for (int indexES = 0, indexE = 0; indexES < elementsShrinked.length; indexES++, indexE++) {
			elementsShrinked[indexES] = this.elements[indexE = this.elements[indexE] == null ? ++indexE : indexE];
		}
		this.elements = elementsShrinked;
		}
	}
	
	//unions two sets to a third set
	public static final MengeGet<Integer> union(final MengeGet<Integer> SETA, final MengeGet<Integer> SETB) throws MengeGetException{
		SETA.copyCatKiller();
		SETB.copyCatKiller();
		Integer[] elementsExtended = new Integer[SETA.size() + SETB.size()];
		for (int index = 0, indexB = 0; index < elementsExtended.length; index++) {
			elementsExtended[index] = index < ((IntMengeGet) SETA).elements.length ? 
					((IntMengeGet) SETA).elements[index] : ((IntMengeGet) SETB).elements[indexB++];
		}
		IntMengeGet unionedSet = new IntMengeGet(elementsExtended);
		unionedSet.copyCatKiller();
		return unionedSet;
	}
	
	//returns the minimum of the set
	public final Integer min() {
		Integer min = this.elements[0];
		for (int index = 0; index < this.elements.length; index++) {
			min = this.elements[index].intValue() < min.intValue() ? this.elements[index] : min;
		}
		return min;
	}
		
	public final Integer[] getElements() {return this.elements;}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
		MengeGet<Integer> set1 = new IntMengeGet(new Integer[] {128, null, 127, 5, null, 37, 2, 127, 128});
		MengeGet<Integer> set2 = new IntMengeGet(new Integer[] {6, 45, 9, null, 1, null, 9, 6});
		MengeGet<Integer> union = IntMengeGet.union(set1, set2);	
		MengeGet<Integer> set3 = (IntMengeGet) union.clone();
		} catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
		
}
