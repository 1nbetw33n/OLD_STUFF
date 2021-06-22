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

package Prog2.Exercises.Exercise1;

/**
 * @author Bella Abshagen
 *
 */

/*
 * 
 * implements the interface GroupIF for a variation with 4 storage slots
 *
 */
public class GroupOfFour implements GroupIF{

	/*
	 * size indicates the current position;
	 * size = 0 -> firstPlace;
	 * size = 3 -> fourthPlace, etc.
	 */
	private int size;
	protected Dish firstPlace,
				   secondPlace;
	private Dish   thirdPlace,
				   fourthPlace;
	
	/*
	 * default constructor
	 */
	public GroupOfFour() {}
	
	public int size() {return this.size;}
	
	public final boolean isEmpty() {return this.size == 0;}
	
	public final void appendLast(final Dish D) throws TableSpaceOutOfBoundsException{
		if (this.size > 3) {
			throw new TableSpaceOutOfBoundsException("this group has no more free slots");
		}else {
			switch (this.size++) {
				case 0:{
					this.firstPlace = D;
					break;
				}
				case 1:{
					this.secondPlace = D;
					break;
				}
				case 2:{
					this.thirdPlace = D;
					break;
				}
				case 3:{
					this.fourthPlace = D;
					break;
				}
			}
		}
	}
	
	public final Dish removeLast() throws Exception{
		if (this.isEmpty()) {
			throw new Exception("there is nothing to remove, since this group of empty");
		}else {
			//temporary dish
			Dish tmp;
			switch (this.size--) {
				case 1:{
					//creates shallow copy of dish, before nulling original dish
					tmp = this.thirdPlace;
					this.thirdPlace = null;
					return tmp;
				}
				case 2:{
					tmp = this.secondPlace;
					this.secondPlace = null;
					return tmp;
				}
				case 3:{
					tmp = this.thirdPlace;
					this.thirdPlace = null;
					return tmp;
				}
				default:{
					tmp = this.fourthPlace;
					this.fourthPlace = null;
					return tmp;
				}
			}
		}
	}
	
	public final Dish get(final int POSITION) throws Exception{
		if (this.size == 0 || POSITION < 0 || POSITION > 3) {
			throw new Exception("index value is illegal or the group if empty");
		}else {
			switch (POSITION) {
				default:{
					return this.firstPlace;
				}
				case 1:{
					return this.secondPlace;
				}
				case 2:{
					return this.thirdPlace;
				}
				case 3:{
					return this.fourthPlace;
				}
			}
		}
	}
	
	public final void swap(final int POS1, final int POS2) throws Exception{
		if (POS1 < 0 || POS1 > 3 || POS2 < 0 || POS2 > 3) {
			throw new Exception("one or both index values are illegal");
		}else {
			Dish[] tmpArray = new Dish[] {this.firstPlace, this.secondPlace, this.thirdPlace, this.fourthPlace};
			Dish tmpDish = tmpArray[POS1];
			tmpArray[POS1] = tmpArray[POS2];
			tmpArray[POS2] = tmpDish;
			this.firstPlace = tmpArray[0];
			this.secondPlace = tmpArray[1];
			this.thirdPlace = tmpArray[2];
			this.fourthPlace = tmpArray[3];
		}
	}
	
	/*
	 * clears all entries including first to (inclusive) fourth
	 * requirements: non-final objects
	 * range of values: void / exception
	 * possible errors: object is final 
	 */
	public final void clear() {
		this.firstPlace = null;
		this.secondPlace = null;
		this.thirdPlace = null;
		this.fourthPlace = null;
		this.size = 0;
	}
	
	/*
	 * returns the GroupOfFour object as String
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final String toString() {return this.firstPlace.toString() + this.secondPlace.toString() + this.thirdPlace.toString() + this.fourthPlace.toString();}
	
}
