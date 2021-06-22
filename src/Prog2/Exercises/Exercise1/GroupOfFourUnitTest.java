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
public final class GroupOfFourUnitTest {
	
	private GroupOfFour gOF;
	private Dish dish1;
	private Dish dish2; 
	private Dish dish3;
	private Dish dish4;
	Object object;
	
	@BeforeEach
	void setup() {
		try {
			this.gOF = new GroupOfFour();
			this.dish1 = new Dish("Sushi", 13);
			this.dish2 = new Dish("Hamburger", 9);
			this.dish3 = new Pizza();
			this.dish4 = new Salad();
			this.gOF.appendLast(dish1);
			this.gOF.appendLast(dish2);
			this.gOF.appendLast(dish3);
			this.gOF.appendLast(dish4);
			object = new Object();
		}catch(final TableSpaceOutOfBoundsException E) {
			E.printStackTrace();
		}
	}
	
	@AfterEach
	void teardown() {this.gOF = null;}
	
//	@Test
//	void testSize() {
//		try {
//			assertEquals(this.gOF.size(), 4, "GroupOfFour.size() works not properly-No.1");
//		
//			gOF.removeLast();
//			assertEquals(this.gOF.size(), 3, "GroupOfFour.size() works not properly-No.2");
//		}catch(final Exception E) {
//			E.printStackTrace();
//		}
//	}
	
	@Test
	void testIsEmpty() throws Exception{
		try {
			assertFalse(this.gOF.isEmpty(), "GroufOfFour.isEmpty() works not properly-No.1");
		
			this.gOF.removeLast();
			this.gOF.removeLast();
			this.gOF.removeLast();
			this.gOF.removeLast();
			assertTrue(this.gOF.isEmpty(), "GroufOfFour.isEmpty() works not properly-No.2");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testAppendLastRemoveLast() throws TableSpaceOutOfBoundsException, Exception{
		try {
			assertThrows(TableSpaceOutOfBoundsException.class, () -> this.gOF.appendLast(dish1), "No Exception thrown?-No.1");
			assertTrue(this.gOF.removeLast().equals(dish4), "GroupOfFour.appendLast() / GroupfOfFour.removeLast() works not properly-No.1");
			assertTrue(this.gOF.removeLast().equals(dish3), "GroupOfFour.appendLast() / GroupfOfFour.removeLast() works not properly-No.2");
		
			this.gOF.removeLast();
			this.gOF.removeLast();
			this.gOF.removeLast();
			this.gOF.removeLast();
			assertThrows(Exception.class, () -> this.gOF.removeLast(), "No Exception thrown?-No.2");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testGet() throws Exception{
		try {
			assertEquals(this.gOF.get(2), dish3, "GroupOfFour.get(int) works not properly-No.1");
			assertEquals(this.gOF.get(1), dish2, "GroupOfFour.get(int) works not properly-No.2");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testSwap() {
		try {
			this.gOF.swap(2, 1);
			assertEquals(this.gOF.get(1), dish3, "GroupOfFour.swap(int, int) works not properly-No.1");
			assertEquals(this.gOF.get(2), dish2, "GroupOfFour.swap(int, int) works not properly-No.2");
		
			this.gOF.swap(0, 4);
			assertEquals(this.gOF.get(0), dish4, "GroupOfFour.swap(int, int) works not properly-No.3");
			assertEquals(this.gOF.get(4), dish1, "GroupOfFour.swap(int, int) works not properly-No.4");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testToString() throws Exception{
		try {
			assertEquals("Sushi\t13€\nHamburger\t9€\nPizza Prosciutto\t40cm\t12€\nBella's Salad\t250g\t10€\n", this.gOF.toString(), "GroupOfFour.toString() works not properly-No.1");
			assertEquals(null, object.toString(), "");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	

}
