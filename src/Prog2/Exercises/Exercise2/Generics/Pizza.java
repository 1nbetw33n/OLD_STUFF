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

/**
 * @author Bella Abshagen, 
 * 		   Jul 28, 2020
 *
 */
public final class Pizza<T> extends Dish<T>{
	
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
		this.course = "2 - main course";
	}
	
	/*
	 * constructor with price, diameter as parameters
	 */
	public Pizza(final int PRICE, final int DIAMETER) {
		super("Common Pizza", PRICE);
		this.diameter = DIAMETER;
		this.course = "2 - main course";
	}
	
	/*
	 * constructor that creates deep copies
	 */
	public Pizza(final Pizza PIZZA) {
		super(PIZZA);
		this.diameter = PIZZA.getDiameter();
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
	public final String toString() {return this.getName() + "\t" + this.getDiameter() + "cm\t" + this.getPrice() + "€\n";}


}
