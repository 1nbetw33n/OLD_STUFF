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

package Prog2.Exercises.Exercise2.Comparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import Prog2.Exercises.Exercise2.Generics.*;
import java.util.Comparator;

/**
 * @author Bella Abshagen, 
 * 		   Jul 30, 2020
 *
 */
public final class ComparatorUnitTest {
	
	private Dish dish1,
				 dish2;
	
	private Pizza pizza1,
				  pizza2;
	
	private Salad salad1,
				  salad2;
	
	private String s1;
	private String s2;
	
	private Comparator<Dish> compD;
	private Comparator<Pizza> compP;
	private Comparator<Salad> compS;
	private Comparator<String> compString;
	
	@BeforeEach
	void setup() {
		this.dish1 = new Dish<>("Dürüm Döner", 5);
		this.dish2 = new Dish<>("Shawarma", 6);
		this.pizza1 = new Pizza<>();
		this.pizza2 = new Pizza<>(10, 30);
		this.salad1 = new Salad<>();
		this.salad2 = new Salad<>(12, 250);
		compD = new ComparatorDishPrice();
		compP = new ComparatorPizzaDiameter();
		compS = new ComparatorSaladWeight();
		compString = new ComparatorHashCode();
	}
	
	@AfterEach
	void teardown() {
		this.dish1 = null;
		this.dish2 = null;
		this.pizza1 = null;
		this.pizza1 = null;
		this.salad1 = null;
		this.salad2 = null;
		compD = null;
		compP = null;
		compS = null;
	}
	
	@Test
	void testComparators() {
		assertTrue(compD.compare(dish1, dish2) < 0, "ComparatorDishPrice() works not properly-no.1");
		assertTrue(compP.compare(pizza1, pizza2) > 0, "ComparatorPizzaDiameter() works not properly-no.1");
		assertTrue(compS.compare(salad1, salad2) == 0, "ComparatorSaladWeigh() works not properly-no.1");
		
		s1 = new String("Hallo");
		s2 = new String("Welt");
		
		assertTrue(compString.compare(s1, s2) > 0, "ComparatorHashCode works not properly-no.1");
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
