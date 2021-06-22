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
public class Dish {
	
	/*
	 * name of the dish; 
	 */
	private String course;
	/*
	 * price of the dish
	 */
	private int price;
	
	/*
	 * default constructor
	 */
	public Dish() {
		this.course = "Spaghetti Bolognese";
		this.price = 11;
	}
	
	/*
	 * constructor with String, int as parameters
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public Dish(final String COURSE, final int PRICE) {
		this.course = COURSE;
		this.price = PRICE;
	}
	
	/*
	 * returns course (name) of the dish
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final String getCourse() {return this.course;}
	
	/*
	 * returns price of the dish
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final int getPrice() {return this.price;}
	
	/*
	 * returns object as String
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public String toString() {return this.course + "\t" + this.price + "€\n";}

}
