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

package Prog2.Exercises.Exercise3;

import org.junit.jupiter.api.*;

import Prog2.Exercises.Exercise1.Pizza;
import Prog2.Exercises.Exercise1.Salad;

/**
 * @author Bella Abshagen, 
 * 		   Aug 7, 2020
 *
 */
public final class DishUnitTest {
	
	private Pizza pizza1; 
	private Pizza pizza2; 
	             
	private Salad salad1; 
	             
	private String string1;
	 
	private Integer integer1; 
	
	@BeforeEach
	void setup() {
		this.pizza1 = new Pizza();
		this.pizza2 = new Pizza();
		this.salad1 = new Salad();
		this.string1 = new String();
		this.integer1 = 1;
	}
	
	@AfterEach
	void teardown() {
		this.pizza1   = null;
		this.pizza2   = null;
		this.salad1   = null;
		this.string1  = null;
		this.integer1 = null;
	}
	
	@Test
	void testGetMoreExpensive() {
		Assertions.assertTrue(Dish.getMoreExpensive(pizza1, pizza2) instanceof Pizza, "Strange Things happen here-no.1");
		Assertions.assertTrue(Dish.getMoreExpensive(pizza1, salad1) instanceof Pizza, "Strange Things happen here-no.2");
		Assertions.assertTrue(Dish.getMoreExpensive(string1, integer1) instanceof String, "Strange Things happen here-no.3");
	}
	
	
	

}
