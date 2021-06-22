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
public final class Salad extends Dish {
	
	/*
	 * weight of salad
	 */
	private int weight;
	
	/*
	 * default constructor
	 */
	public Salad() {
		super("Bella's Salad", 10);
		this.weight = 250;
		}
	
	/*
	 * constructor with price, weight as parameters
	 */
	public Salad(final int PRICE, final int WEIGHT) {
		super("Common Salad", PRICE);
		this.weight = WEIGHT;
	}
	
	
	/*
	 * returns salad's weight
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final int getWeight() {return this.weight;}
	
	/*
	 * sets salad's weight
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final void setWeight(final int WEIGHT) {this.weight = WEIGHT;}
	
	/*
	 * returns salad object as String
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final String toString() {return this.getCourse() + "\t" + this.getWeight() + "g\t" + this.getPrice() + "€\n";}

}
