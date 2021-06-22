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

public class BoolMengeGet implements MengeGet<Boolean> {
		
	private static final Random RANDOM = new Random();
	protected Boolean[] elements;
		
	public BoolMengeGet() {this.elements = new Boolean[0];}
		
	public BoolMengeGet(final Boolean[] ELEMENTS) {this.elements = ELEMENTS;}
		
	//making DeepCopies
	public BoolMengeGet(final MengeGet<Boolean> BOOLEANSET) {this(((BoolMengeGet) BOOLEANSET).elements);}
	
	//checks if BOOLEAN exists in the set
	public final boolean contains(final Boolean BOOLEAN) throws MengeGetException{
		if (this.elements ==  null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("The empty set is always empty");
		} else {
			this.normalize();
			int counter = 0;
			for (int index = 0; index < this.elements.length; index++) {
				counter = this.elements[index].equals(BOOLEAN) ? ++counter : counter;
			}
			return counter > 0;
		}
	}
		
	//checks if BOOLEAN exists more than once in the set
		public final boolean containsTwo(final Boolean BOOLEAN) throws MengeGetException{
		if (this.elements ==  null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("The empty set is always empty");
		} else {
			this.normalize();
			int counter = 0;
			for (int index = 0; index < this.elements.length; index++) {
				counter = this.elements[index].equals(BOOLEAN) ? ++counter : counter;
		}
			return counter > 1;
		}
	}		

	//creates a set with length+1 and inserts BOOLEAN at last index of the created set
		public final void insert(final Boolean BOOLEAN) throws MengeGetException{
			if (this.containsTwo(BOOLEAN)) {
				throw new MengeGetException("Boolean is already included in this set");
			}
			Boolean[] elementsExtended = new Boolean[this.elements.length + 1];
			for (int index = 0; index < this.elements.length; index++) {
				elementsExtended[index] = this.elements[index];
			}
			elementsExtended[elementsExtended.length - 1] = BOOLEAN;
			this.elements = elementsExtended;
			this.normalize();
		}
		

	//removes Boolean from the set
	public final void remove(final Boolean BOOLEAN) throws MengeGetException{
		if (this.elements == null) {
			throw new MengeGetException("NullPointerException");
		}else if (this.elements.length == 0) {
			throw new MengeGetException("You can't remove elements if the set is already empty ;)");
		}else if (!this.contains(BOOLEAN)) {
			throw new MengeGetException("There is nothing to remove from this set, since the Integer isn't included in this set");
		}else {
			for (int index = 0; index < this.elements.length; index++) {
				this.elements[index] = this.elements[index].equals(BOOLEAN) ? this.elements[index] = null : this.elements[index];
			}
			this.normalize();
		}
	}
		
	public final int size() throws MengeGetException {
		if (this.elements ==  null) {
			throw new MengeGetException("NullPointerException");
		}else {
			return this.elements.length;
		}
	}
		
	//returns the Boolean located at a pseudo-random index-number
	public final Boolean get() throws MengeGetException{
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
	public MengeGet<Boolean> clone() {
		try {
		this.normalize();
		}catch (final MengeGetException E) {
			E.printStackTrace();
		} finally {
			return new BoolMengeGet(this);
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
					Boolean temporary = this.elements[index];
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
			Boolean[] elementsShrinked = new Boolean[size];
		for (int indexES = 0, indexE = 0; indexES < elementsShrinked.length; indexES++, indexE++) {
			elementsShrinked[indexES] = this.elements[indexE = this.elements[indexE] == null ? ++indexE : indexE];
		}
		this.elements = elementsShrinked;
		}
	}
		
	//unions two sets to a third set
	public static final MengeGet<Boolean> union(final MengeGet<Boolean> SETA, final MengeGet<Boolean> SETB) throws MengeGetException{
		SETA.copyCatKiller();
		SETB.copyCatKiller();
		Boolean[] elementsExtended = new Boolean[SETA.size() + SETB.size()];
		for (int index = 0, indexB = 0; index < elementsExtended.length; index++) {
			elementsExtended[index] = index < ((BoolMengeGet) SETA).elements.length ? 
					((BoolMengeGet) SETA).elements[index] : ((BoolMengeGet) SETB).elements[indexB++];
		}
		BoolMengeGet unionedSet = new BoolMengeGet(elementsExtended);
		unionedSet.copyCatKiller();
		return unionedSet;
	}
	
	//returns the "minimum" (0/false) of the set
		public final Boolean min() {
			Boolean min = this.elements[0];
			for (int index = 0; index < this.elements.length; index++) {
				min = this.elements[index].equals(false) ? this.elements[index] : min;
			}
			return min;
		}
		
		public final Boolean[] getElements() {return this.elements;}
		
	@SuppressWarnings("unused")	
	public static void main(String[] args) {
		try {
			MengeGet<Boolean> set1 = new BoolMengeGet(new Boolean[] {true, null, false, true, null, true, false, false, true});
			MengeGet<Boolean> set2 = new BoolMengeGet(new Boolean[] {true, true, false, null, true, null, false, false});
			MengeGet<Boolean> union = BoolMengeGet.union(set1, set2);	
			MengeGet<Boolean> set3 = (BoolMengeGet) union.clone();
			BoolMengeGet.union(set1, set2);	
		} catch (MengeGetException e) {
			e.printStackTrace();
		}
	}

}
