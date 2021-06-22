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

import Prog2.Exercises.Exercise2.Comparator.ComparatorDishPrice;

/**
 * @author Bella Abshagen, 
 * 		   Jul 28, 2020
 *
 */
public class Dish<T> implements Comparable<Dish<? super T>>{
	
	/*
	 * name of the dish; 
	 */
	private String name;
	/*
	 * price of the dish
	 */
	private int price;
	
	/*
	 * course:
	 * 		   "1 - appetizer" for salad's
	 * 		   "2 - main course" for pizza's
	 */
	protected String course = "";
	
	/*
	 * default constructor
	 */
	public Dish() {
		this.name = "Spaghetti Bolognese";
		this.price = 11;
	}
	
	/*
	 * constructor with String, int as parameters
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public Dish(final String NAME, final int PRICE) {
		this.name = NAME;
		this.price = PRICE;
	}
	
	/*
	 * constructor that creates deep copies
	 */
	public Dish(final Dish DISH) {
		this.name = DISH.name;
		this.price = DISH.price;
	}
	
	
	/*
	 * returns most expensive dish (according to Dish.getPrice()
	 * requirements: object not null
	 * range of values: 0 < Dish.getPrice() < infinity
	 * possible errors: object is null
	 */
	public static final <T extends Dish> T getMoreExpensive(final T DISH1, final T DISH2) throws Exception{
		if (DISH1 == null && DISH2 == null) {
			throw new Exception("Both dishes haven't been initialized yet.");
		}else{
			if (DISH1 == null) {
				return DISH2;
			}else if (DISH2 == null) {
				
				return DISH1;
			}else {
				ComparatorDishPrice compDishP = new ComparatorDishPrice();
				return compDishP.compare(DISH1, DISH2) > 0.0000001 ? DISH1 : DISH2;
			}
		}
	}
	
	/*
	 * compares to dishes totally and creates a natural order
	 * returns a negative value if this is smaller than DISH
	 * 		   a if both are the same object
	 * 		   a positive value if this is bigger than DISH
	 * requirements: 
	 * range of values: < 0
	 * 					  0
	 * 					> 0
	 * possible errors: 
	 */
	public final int compareTo(final Dish DISH) {
		int courseComp = this.course.compareTo(DISH.getCourse());
		return (courseComp != 0) ?
				courseComp : (this.getPrice() - DISH.getPrice() != 0) ?
						this.getPrice() - DISH.getPrice() : (this instanceof Salad) ? 
								(((((Salad) this).getWeight() / 10) - ((DISH instanceof Salad) ?
																((Salad) DISH).getWeight() / 10 : ((Pizza) DISH).getDiameter()))) :  ((Pizza) this).getDiameter() - ((DISH instanceof Salad) ? 
																																								((Salad) DISH).getWeight() / 10 : ((Pizza) DISH).getDiameter());
									
	}
	
	/*
	 * returns course (name) of the dish
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final String getName() {return this.name;}
	
	/*
	 * returns price of the dish
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final int getPrice() {return this.price;}
	
	/*
	 * returns price of the dish
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public final String getCourse() {return this.course;}
	
	/*
	 * returns object as String
	 * requirements:
	 * range of values:
	 * possible errors:
	 */
	public String toString() {return this.name + "\t" + this.price + "€\n";}

}
