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

package Prog2.Exercises.Exercise4.Comparable;

import java.util.Comparator;

import org.junit.jupiter.api.*;

import Prog2.Exercises.Exercise2.Comparator.ComparatorDishPrice;
import Prog2.Exercises.Exercise2.Generics.*;

/**
 * @author Bella Abshagen, 
 * 		   Aug 20, 2020
 *
 */
public final class MyUtilUnitTest {
	
	private Dish dish1,
				 dish2;
	
	private Salad salad;
	
	private Pizza pizza;
	
	private Dish[] dishes;
	
	private GroupIFG<Dish> gifg;
	
	private ComparatorDishPrice comp;
	
	
	@BeforeEach
	void setup() {
		this.dish1  = new Dish<>();
		this.dish2  = new Dish<>();
		this.salad  = new Salad<>();
		this.pizza  = new Pizza<>();
		this.dishes = new Dish[] {dish1, dish2, salad, pizza};
		this.gifg   = new GroupOfFourG<>(dishes);
		this.comp   = new ComparatorDishPrice();
	}
	
	@AfterEach
	void teardown() {
		 this.dish1  = null;
		 this.dish2  = null;
		 this.salad  = null;
		 this.pizza  = null;
		 this.dishes = null;
		 this.gifg   = null;
		 this.comp   = null;
	}
	
	@Test
	void testMax() {
		try {
			Assertions.assertTrue(MyUtil.max(this.gifg).equals(this.pizza), "MyUtil.max(GroupIFG) works not properly no.1");
			Assertions.assertTrue(MyUtil.max(this.gifg, comp).equals(this.pizza), "MyUtil.max(GroupIFG) works not properly no.2");		
		} catch (Exception E) {
			E.printStackTrace();
		}
	}
	
	

}
