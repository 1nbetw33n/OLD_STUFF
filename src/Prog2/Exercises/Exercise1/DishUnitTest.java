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
public final class DishUnitTest {
	
	private Dish dish;

	@BeforeEach
	void setup() {this.dish = new Dish();}
	
	@AfterEach
	void teardown() {this.dish = null;}
	
	@Test
	void testGetCourse() {
		assertEquals(this.dish.getCourse(), "Spaghetti Bolgnese", "Dish.getCourse() works not properly-No.1");
	}
	
	@Test
	void testPrice() {
		assertTrue(this.dish.getPrice() - 95 < 0.000000001, "Dish.getPrice() works not properly-No.1");
	}
	
	@Test
	void testToString() {
		assertEquals(this.dish.toString(), "Spaghetti Bolognese\t11€", "Dish.toString() works not properly-No.1");
	}
	
}
