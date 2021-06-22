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

package Prog2.Exercises.Exercise4.Generics;

import Prog2.Exercises.Exercise2.Generics.*;

import org.junit.jupiter.api.*;

/**
 * @author Bella Abshagen, 
 * 		   Aug 19, 2020
 *
 */
public final class DishUnitTest {
	
	private Dish dish1,
				 dish2;
	
	private Pizza pizza1,
				  pizza2;
	
	private Salad salad1,
				  salad2;
	
	@BeforeEach
	void setup() {
		this.dish1  = new Dish<>();
		this.dish2  = new Dish<>("Hamburger", 15);
		this.pizza1 = new Pizza<>();
		this.pizza2 = new Pizza<>(30, 40);
		this.salad1 = new Salad<>(18, 430);
		this.salad2 = new Salad<>();
	}
	
	
	@AfterEach
	void teardown() {
		this.dish1  = null;
		this.dish2  = null;
		this.pizza1 = null;
		this.pizza2 = null;
		this.salad1 = null;
		this.salad2 = null;
	}
	
	
	@Test
	void testGetMoreExpensive() {
		try {
			Assertions.assertTrue(Dish.getMoreExpensive(dish1, dish2).equals(dish2), "Dish.getMoreExpensive() works not properly-no.1");
			Assertions.assertTrue(Dish.getMoreExpensive(pizza1, pizza2).equals(pizza2), "Dish.getMoreExpensive() works not properly-no.2");
			Assertions.assertTrue(Dish.getMoreExpensive(salad1, salad2).equals(salad1), "Dish.getMoreExpensive() works not properly-no.3");
			Assertions.assertTrue(Dish.getMoreExpensive(salad1, pizza2).equals(pizza2), "Dish.getMoreExpensive() works not properly-no.4");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testCompareTo() {
		Assertions.assertTrue(dish1.compareTo(dish2) < 0.000000001, "compareTo(Dish) works not properly-no.1");
		Assertions.assertTrue(salad1.compareTo(pizza1) < 0.000000001, "compareTo(Dish) works not properly-no.2");

	}
	
	
	
	

}