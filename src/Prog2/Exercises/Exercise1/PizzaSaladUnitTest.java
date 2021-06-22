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

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * @author Bella Abshagen
 *
 */
public final class PizzaSaladUnitTest {
	
	private Pizza pizza;
	private Salad salad;
	
	@BeforeEach
	void setup() {
		this.pizza = new Pizza();
		this.salad = new Salad();
	}
	
	@AfterEach
	void teardown() {
		this.pizza = null;
		this.salad = null;
	}
	
	@Test
	void testGetSetDiameter() {
		assertTrue(this.pizza.getDiameter() - 40 < 0.00000000001, "Pizza.getDiameter() works not properly-No.1");
	}
	
	@Test
	void testGetSetWeight() {
		assertTrue(this.salad.getWeight() - 250 < 0.0000000000001, "Salad.getWeight() works not properly-No.1");
	}
	
	@Test
	void testToString() {
		assertEquals(this.pizza.toString(), "Pizza Prosciutto\t40cm/t12€", "Dish.toString() works not properly-No.1");
		assertEquals(this.salad.toString(), "Bella's Salad\t250g/t10€", "Dish.toString() works not properly-No.2");

	}

}
