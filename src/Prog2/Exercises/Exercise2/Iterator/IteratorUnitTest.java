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

import Prog2.Exercises.Exercise2.Generics.*;

/**
 * @author Bella Abshagen, 
 * 		   Jul 30, 2020
 *
 */
public final class IteratorUnitTest {
	
	private Dish<?>[] dishes;
	private GroupOfFourG<?> gOF;
	
	private Dish<?> dish1,
				 dish2;
	
	private Pizza<?> pizza1,
				  pizza2;
	
	private Salad<?> salad1,
				  salad2;
	
	private Iterator1DArray<?> iteratorDishes1,
							   iteratorDishes2,
							   iteratorDishes3;
	
	
	@BeforeEach
	void setup() {
		this.dish1 = new Dish<>("Dürüm Döner", 5);
		this.dish2 = new Dish<>("Shawarma", 6);
		this.pizza1 = new Pizza<>();
		this.pizza2 = new Pizza<>(10, 30);
		this.salad1 = new Salad<>();
		this.salad2 = new Salad<>(12, 250);
		this.dishes = new Dish[] {dish1, dish2, pizza1, pizza2, salad1, salad2}; 
	

		
		this.iteratorDishes1 = new Iterator1DArray<>(dishes);
		this.iteratorDishes2 = new Iterator1DArray<>(dishes, 2);
		this.iteratorDishes3 = new Iterator1DArray<>(dishes, 1, 4);
	}
	
	@AfterEach
	void teardown() {
		this.dish1 = null;
		this.dish2 = null;
		this.pizza1 = null;
		this.pizza2 = null;
		this.salad1 = null;
		this.salad2 = null;
		this.iteratorDishes1 = null;
		this.iteratorDishes2 = null;
		this.iteratorDishes3 = null;
	}
	
	@Test
	void Iterator1DArray() {
		Assertions.assertTrue(this.iteratorDishes1.hasNext(), "hasNext() works not properly-no.1");
		while(this.iteratorDishes1.hasNext()){
			this.iteratorDishes1.next();
			}
		Assertions.assertFalse(this.iteratorDishes1.hasNext(), "hasNext() works not properly-no.2");
		
		
		Assertions.assertTrue(this.iteratorDishes2.hasNext(), "hasNext() works not properly-no.3");
		while(this.iteratorDishes2.hasNext()){
			this.iteratorDishes2.next();
			}
		Assertions.assertFalse(this.iteratorDishes2.hasNext(), "hasNext() works not properly-no.4");
		
		
		Assertions.assertTrue(this.iteratorDishes3.hasNext(), "hasNext() works not properly-no.5");
		while(this.iteratorDishes3.hasNext()){
			this.iteratorDishes3.next();
			}
		Assertions.assertFalse(this.iteratorDishes3.hasNext(), "hasNext() works not properly-no.6");
	}
	
	
	@Test
	void testIteratorGroupOfFour() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
