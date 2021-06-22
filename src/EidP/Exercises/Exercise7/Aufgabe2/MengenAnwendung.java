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

public class MengenAnwendung<T> implements MengeGet<Number> {
	
	protected static final Random RANDOM = new Random();
	protected Number[] elements;
	
	public MengenAnwendung() {this.elements = new Number[0];}
	
	public MengenAnwendung(final Number[] ELEMENTS) {this.elements = ELEMENTS;}
	
	//making DeepCopies
	public MengenAnwendung(final MengeGet<Number> SET) {this(((MengenAnwendung<?>) SET).elements);}
	
	//checks if NUMBER exists in the set
	public final boolean contains(final Number NUMBER) throws MengeGetException{
		if (this.elements ==  null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("The empty set is always empty");
		} else {
			this.normalize();
			int counter = 0;
			for (int index = 0; index < this.elements.length; index++) {
				//comparing references doesn't work for Doubles, Integer > 128 or < -127 and mixed types to check for equality
				counter = this.elements[index].equals(NUMBER) ? ++counter : counter;
			}
			return counter > 0;
		}
	}
	
	//checks if NUMBER exists more than once in the set
	public final boolean containsTwo(final Number NUMBER) throws MengeGetException{
		if (this.elements ==  null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("The empty set is always empty");
		} else {
			this.normalize();
			int counter = 0;
			for (int index = 0; index < this.elements.length; index++) {
				//comparing references doesn't work for Doubles, Integer > 128 or < -127 and mixed types to check for equality
				counter = this.elements[index].equals(NUMBER) ? ++counter : counter;
			}
			return counter > 1;
		}
	}
	
	//creates a set with length+1 and inserts NUMBER at last index of the created set
	public final void insert(final Number NUMBER) throws MengeGetException{
		if (this.containsTwo(NUMBER)) {
			throw new MengeGetException("Number is already included in this set");
		}
		Number[] elementsExtended = new Number[this.elements.length + 1];
		for (int index = 0; index < this.elements.length; index++) {
			elementsExtended[index] = this.elements[index];
		}
		elementsExtended[elementsExtended.length - 1] = NUMBER;
		this.elements = elementsExtended;
		this.normalize();
	}
	
	//removes NUMBER from the set
	public final void remove(final Number NUMBER) throws MengeGetException{
		if (this.elements == null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("You can't remove elements if the set is already empty ;)");
		}else if (!this.contains(NUMBER)) {
			throw new MengeGetException("There is nothing to remove from this set, since the Number isn't included in this set");
		}else {
			for (int index = 0; index < this.elements.length; index++) {
				this.elements[index] = this.elements[index].equals(NUMBER) ? this.elements[index] = null : this.elements[index];
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
	
	//return the Number at a pseudo-random index
	public final Number get() throws MengeGetException{
		if (this.elements ==  null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("The empty set doesn't contain any elements ;)");
		}else {
			return this.elements[RANDOM.nextInt(this.elements.length)];
		}
	}
	
	//creates a DeepCopy of MengeGet
	@SuppressWarnings("finally")
	public MengeGet<Number> clone() {
		try {
		this.normalize();
		}catch (final MengeGetException E) {
			E.printStackTrace();
		} finally {
			return new MengenAnwendung<>(this);
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
					Number temporary = this.elements[index];
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
		Number[] elementsShrinked = new Number[size];
		for (int indexES = 0, indexE = 0; indexES < elementsShrinked.length; indexES++, indexE++) {
			elementsShrinked[indexES] = this.elements[indexE = this.elements[indexE] == null ? ++indexE : indexE];
		}
		this.elements = elementsShrinked;
		}
	}
	
	//unions two sets to a third
	public static final MengeGet<Number> union(final MengeGet<Number> SETA, final MengeGet<Number> SETB) throws MengeGetException{
		SETA.copyCatKiller();
		SETB.copyCatKiller();
		Number[] elementsExtended = new Number[SETA.size() + SETB.size()];
		for (int index = 0, indexB = 0; index < elementsExtended.length; index++) {
			elementsExtended[index] = index < ((MengenAnwendung<?>)SETA).elements.length ? 
					((MengenAnwendung<?>)SETA).elements[index] : ((MengenAnwendung<?>)SETB).elements[indexB++];
		}
		MengeGet<Number> unionedSet = new MengenAnwendung<>(elementsExtended);
		unionedSet.copyCatKiller();
		return unionedSet;
	}
	
	//returns the minimum of the set with case distinction between Integer and Double
	public final Number min() {
		Number min = this.elements[0];
		for (int index = 0; index < this.elements.length; index++) {
			min = (this.elements[index] instanceof Integer ?
					this.elements[index].intValue() : this.elements[index].doubleValue()) 
					< (min instanceof Integer ?
							min.intValue() : min.doubleValue()) ?
							this.elements[index] : min;
		}
		return min;
	}
	
	public final Number[] getElements() {return this.elements;}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
		MengeGet<Number> set1 = new MengenAnwendung<>(new Number[] {128, null, 127, 5., null, 3.7, 2, 127, 128});
		MengeGet<Number> set2 = new MengenAnwendung<>(new Number[] {6., 4.5, 9., null, 1, null, 9., 6.});
		MengeGet<Number> union = MengenAnwendung.union(set1, set2);	
		MengeGet<Number> set3 = union.clone();
		} catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
}
