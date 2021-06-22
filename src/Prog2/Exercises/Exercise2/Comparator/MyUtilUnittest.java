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

import java.util.Comparator;

import org.junit.jupiter.api.*;

import Prog2.Exercises.Exercise1.TableSpaceOutOfBoundsException;
import Prog2.Exercises.Exercise2.Generics.*;

/**
 * @author Bella Abshagen, 
 * 		   Jul 30, 2020
 *
 */
public final class MyUtilUnittest {
	
	private String s1,
				   s2;
	
	private String[] strings;
	
	private Dish<Dish> d1,
				 	   d2,
				 	   d3,
				 	   d4;
	
	private Dish<Dish>[] dishes;
	
	private Salad<Salad> salad1,
						 salad2;
	
	private Salad<Salad>[] salads;
	
	private Pizza<Pizza> pizza1,
						 pizza2;
	
	private Pizza<Pizza>[]	pizzas;
	
	private GroupIFG<Dish> gOFG;
	private GroupIFG<Salad> gOFS;
	private GroupIFG<Pizza> gOFP;
	
	ComparatorString compStr;
	ComparatorDishPrice compDishPrice;
	ComparatorSaladWeight compS;
	ComparatorPizzaDiameter compD;
	
	
	
	@BeforeEach
	void setup() {
		this.s1 = new String("einGanzGanzLangerString");
		this.s2 = new String("einKurzerString");
		this.d1 = new Dish<>("Pommes", 11);
		this.d2 = new Dish<>("Hamburger", 12);
		this.d3 = new Dish<>("Curry Sausage", 13);
		this.d4 = new Dish<>("Wrap", 15);
		this.salad1 = new Salad<>(250, 15);
		this.salad2 = new Salad<>(350, 16);
		this.pizza1 = new Pizza<>(40, 17);
		this.pizza2 = new Pizza<>(35, 18);
		
		this.strings = new String[] {s1, s2};
		this.dishes = new Dish[] {d1, d2, d3, d4};
		this.gOFG = new GroupOfFourG<>(dishes);
		this.gOFS = new GroupOfFourG<>(salads);
		this.gOFP = new GroupOfFourG<>(pizzas);
			
		this.salads = new Salad[] {salad1, salad2};
		this.pizzas = new Pizza[] {pizza1, pizza2};
		this.compStr = new ComparatorString();
		this.compDishPrice = new ComparatorDishPrice();
		this.compS = new ComparatorSaladWeight();
		this.compD = new ComparatorPizzaDiameter();
	}
	
	@AfterEach
	void test() {
		this.s1 = null;
		this.s2 = null;
		this.d1 = null;
		this.d2 = null;
		this.d3 = null;
		this.d4 = null;
		this.strings = null;
		this.dishes = null;
		this.gOFG = null;
		this.compStr = null;
		this.compDishPrice = null;
	}
	
	@Test
	void testMax() {
		Assertions.assertEquals(this.s1, MyUtil.max(this.strings, compStr), "Myutil.max(String, String, ComparatorString) works not properly-no.1");
		Assertions.assertEquals(this.d4, MyUtil.max(this.dishes, compDishPrice), "MyUtil.max(Dish, Dish, compDishPrice) works not properly-no.1");
		Assertions.assertEquals(this.d4, MyUtil.max(this.gOFG, compDishPrice), "Mutil.max(GroupIF, GroupIF, ComparatorDishPrice) works not properly-no.1");
//		Assertions.assertEquals(this.salad2, MyUtil.max(salads, compS), "MyUtil.max(Salad, Salad, compS) works not properly-no.1");
//		Assertions.assertEquals(this.pizza1, MyUtil.max(pizzas, compD), "MyUtil.max(Pizza, Pizza, compD) works not properly-no.1");
		Assertions.assertEquals(this.d4, MyUtil.max(this.gOFG, compDishPrice), "Mutil.max(GroupIF, GroupIF, ComparatorDishPrice) works not properly-no.1");

		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}