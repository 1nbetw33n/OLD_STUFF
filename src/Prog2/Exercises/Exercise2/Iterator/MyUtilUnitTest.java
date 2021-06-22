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

package Prog2.Exercises.Exercise2.Iterator;

import org.junit.jupiter.api.*;

import Prog2.Exercises.Exercise1.*;

/**
 * @author Bella Abshagen, 
 * 		   Aug 5, 2020
 *
 */
public final class MyUtilUnitTest {
				
	private Dish[] dishes;
	
	private Dish dish1,
				 dish2,
				 salad,
				 pizza;
	
	private static Iterator1DArray<Dish> iteratorDishes1,
										 iteratorDishes2,
										 iteratorDishes3,
										 iteratorDishes4,
										 iteratorDishes5;
	
	
	@BeforeEach
	void setup() {
		this.dish1 = new Dish();
		this.dish2 = new Dish();
		this.salad = new Salad();
		this.pizza = new Pizza();
		this.dishes = new Dish[] {dish1, dish2, salad, pizza};
		iteratorDishes1 = new Iterator1DArray<>(dishes);
	}
	
	@AfterEach
	void teardown() {
		this.dish1 = null;
		this.dish2 = null;
		this.salad = null;
		this.pizza = null;
		this.dishes = null;
		iteratorDishes1 = null;
	}
	
	
	public static void main(String[] args) {
		MyUtilUnitTest.iteratorDishes1 = new Iterator1DArray<>(new Dish[] {new Dish(), new Dish(), new Salad(), new Pizza(40, 13)});
		MyUtilUnitTest.iteratorDishes2 = new Iterator1DArray<>(new Dish[] {new Pizza(44, 18), new Salad(300, 17), new Dish(), new Dish("Hamburger", 15)});
		MyUtilUnitTest.iteratorDishes3 = new Iterator1DArray<>(new Dish[] {new Dish(), new Dish(), new Salad(), new Pizza(40, 13)});
		MyUtilUnitTest.iteratorDishes4 = new Iterator1DArray<>(new Dish[] {new Pizza(44, 18), new Salad(300, 17), new Dish(), new Dish("Hamburger", 15)});
		MyUtilUnitTest.iteratorDishes5 = new Iterator1DArray<>(new Dish[] {new Pizza(), new Salad(), new Dish(), new Dish("Halloumi", 15)});

		
		MyUtil.printAll(iteratorDishes1);
		MyUtil.printAll(iteratorDishes2, iteratorDishes3);
		MyUtil.printAll(iteratorDishes5, iteratorDishes4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
