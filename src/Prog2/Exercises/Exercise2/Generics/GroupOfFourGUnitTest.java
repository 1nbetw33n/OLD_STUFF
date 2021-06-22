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

package Prog2.Exercises.Exercise2.Generics;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Prog2.Exercises.Exercise1.TableSpaceOutOfBoundsException;

/**
 * @author Bella Abshagen, 
 * 		   Jul 28, 2020
 *
 */

@SuppressWarnings({"rawtypes", "unused"})
public final class GroupOfFourGUnitTest {
	
	private GroupOfFourG<Dish> gOFGD1,
							   gOFGD2,
							   gOFGD3;
	
	private GroupOfFourG<Pizza> gOFGP;
	private GroupOfFourG<Salad> gOFGS;
	private Dish dish1,
	 			 dish2,
	 			 dish3,
	 			 dish4;
	
	
	@BeforeEach
	void setup() {
		this.dish1 = new Dish("Sushi", 13);
		this.dish2 = new Dish("Hamburger", 9);
		this.dish3 = new Pizza();
		this.dish4 = new Salad();
		this.gOFGD1 = new GroupOfFourG<>(new Dish[]{dish1, dish2, dish3, dish4});
		this.gOFGD3 = new GroupOfFourG<>();
	}
	
	@AfterEach
	void teardown() {this.gOFGD1 = null;}
	
	@Test
	void testConstructor() {
		this.gOFGD2 = new GroupOfFourG<>(new Dish[] {new Pizza(), null, null, new Salad(), null, new Dish(), null, new Dish("Hot Dog", 5)});
		
		assertEquals("\nPizza Prosciutto\t40cm\t12€\nBella's Salad\t250g\t10€\nSpaghetti Bolognese\t11€\nHot Dog\t5€\n", "\n"+this.gOFGD2.toString());
	
		//gOFGP<Pizza> is not applicable for Salad
//		assertDoesNotThrow( () -> this.gOFGP.appendLast(new Salad()), "Exception?-No.1");
		assertDoesNotThrow( () -> this.gOFGD3.append(dish4), "Exception?-No.2");
		assertDoesNotThrow( () -> this.gOFGD3.removeLast(), "Exception?-No.3");
		assertDoesNotThrow( () -> this.gOFGD2.removeLast() );
	}
	
	@Test
	void testSize() {
		try {
			assertEquals(4, this.gOFGD1.size(), "GroupOfFour.size() works not properly-No.1");
		
			gOFGD1.removeLast();
			assertEquals(3, this.gOFGD1.size(), "GroupOfFour.size() works not properly-No.2");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testIsEmpty() throws Exception{
		try {
			assertFalse(this.gOFGD1.isEmpty(), "GroufOfFour.isEmpty() works not properly-No.1");
		
			this.gOFGD1.removeLast();
			this.gOFGD1.removeLast();
			this.gOFGD1.removeLast();
			this.gOFGD1.removeLast();
			assertTrue(this.gOFGD1.isEmpty(), "GroufOfFour.isEmpty() works not properly-No.2");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testAppendLastRemoveLast() throws TableSpaceOutOfBoundsException, Exception{
		try {
			assertThrows(TableSpaceOutOfBoundsException.class, () -> this.gOFGD1.append(dish1), "No Exception thrown?-No.1");
			assertTrue(this.gOFGD1.removeLast().equals(dish4), "GroupOfFour.appendLast() / GroupfOfFour.removeLast() works not properly-No.1");
			assertTrue(this.gOFGD1.removeLast().equals(dish3), "GroupOfFour.appendLast() / GroupfOfFour.removeLast() works not properly-No.2");
		
			this.gOFGD1.removeLast();
			this.gOFGD1.removeLast();
			this.gOFGD1.removeLast();
			this.gOFGD1.removeLast();
			assertThrows(Exception.class, () -> this.gOFGD1.removeLast(), "No Exception thrown?-No.2");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testGet() throws Exception{
		try {
			assertEquals(dish3, this.gOFGD1.get(2), "GroupOfFour.get(int) works not properly-No.1");
			assertEquals(dish2, this.gOFGD1.get(1), "GroupOfFour.get(int) works not properly-No.2");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testSwap() {
		try {
			this.gOFGD1.swap(2, 1);
			assertEquals(this.gOFGD1.get(1), dish3, "GroupOfFour.swap(int, int) works not properly-No.1");
			assertEquals(this.gOFGD1.get(2), dish2, "GroupOfFour.swap(int, int) works not properly-No.2");
		
			this.gOFGD1.swap(0, 4);
			assertEquals(this.gOFGD1.get(0), dish4, "GroupOfFour.swap(int, int) works not properly-No.3");
			assertEquals(this.gOFGD1.get(4), dish1, "GroupOfFour.swap(int, int) works not properly-No.4");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testToString() throws Exception{
		try {
			assertEquals("Sushi\t13€\nHamburger\t9€\nPizza Prosciutto\t40cm\t12€\nBella's Salad\t250g\t10€\n", this.gOFGD1.toString(), "GroupOfFour.toString() works not properly-No.1");
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}

}
