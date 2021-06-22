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

import org.junit.jupiter.api.*;

import Prog2.Exercises.Exercise2.Generics.*;

/**
 * @author Bella Abshagen, 
 * 		   Aug 18, 2020
 *
 */
public final class GroupOfFourGDishesUnitTest {
	
	private class Apfelbaum{};
	
	private GroupOfFourGDishes<Dish> gOFGDDish;
//	private GroupOfFourGDishes<Apfelbaum> gOFGDApfelbaum;						bound mismatch compiler error
	private GroupOfFourGDishes<IceCream> gOFGDIcecream;
	
	
	
	private Dish dish1,
				 dish2,
				 salad,
				 pizza;
	
	private IceCream flavour1,
					 flavour2,
					 flavour3,
					 flavour4;
	
	private Dish[] dishes;
	
	private IceCream[] flavours;
	
	
	@BeforeEach
	void setup() {
		this.dish1 = new Dish<>();
		this.dish2 = new Dish<>("Hamburger", 15);
		this.salad = new Salad<>();
		this.pizza = new Pizza<>();
		this.dishes = new Dish[] {dish1, dish2, salad, pizza};
		this.flavour1 = new IceCream<>();
		this.flavour2 = new IceCream<>();
		this.flavour3 = new IceCream<>();
		this.flavour4 = new IceCream<>();
		this.flavours = new IceCream[]{flavour1, flavour2, flavour3, flavour4};
		this.gOFGDDish = new GroupOfFourGDishes<>(dishes);
		this.gOFGDIcecream = new GroupOfFourGDishes<>(flavours);
		
	}
	
	@AfterEach
	void tearDown() {
		this.dish1 =       null;
		this.dish2 =       null;
		this.salad =       null;
		this.pizza =       null;
		this.dishes =      null;
		this.flavour1 =    null;
		this.flavour2 =    null;
		this.flavour3 =    null;
		this.flavour4 =    null;
		this.gOFGDDish =   null;
	}
	
	@Test
	void testTotalPrice() {
		Assertions.assertTrue(48 - this.gOFGDDish.totalPrice() < 0.0000001, "totalPrice works not properly-no.1");
		Assertions.assertTrue(4 - this.gOFGDIcecream.totalPrice() < 0.0000001, "totalPrice works not properyl-no.2");		
	}
	
	

}
