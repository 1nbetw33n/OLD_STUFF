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
public final class Pizza extends Dish {
	
	/*
	 * diameter of the pizza
	 */
	private int diameter;
	
	/*
	 * default constructor
	 */
	public Pizza() {
		super("Pizza Prosciutto", 12);
		this.diameter = 40;
	}
	
	/*
	 * constructor with price, diameter as parameters
	 */
	public Pizza(final int PRICE, final int DIAMETER) {
		super("Common Pizza", PRICE);
		this.diameter = DIAMETER;
	}
	
	/*
	 * returns pizza's diameter
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final int getDiameter() {return this.diameter;}
	
	/*
	 * sets pizza's diameter
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final void setDiameter(final int DIAMETER) {this.diameter = DIAMETER;}
	
	/*
	 * returns pizza object as String
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final String toString() {return this.getCourse() + "\t" + this.getDiameter() + "cm\t" + this.getPrice() + "€\n";}

}
