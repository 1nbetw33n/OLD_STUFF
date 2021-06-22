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

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import Prog2.Exercises.Exercise1.*;
import Prog2.Exercises.Exercise2.Generics.GroupOfFourG;

/**
 * @author Bella Abshagen, 
 * 		   Aug 4, 2020
 *
 */
public final class IteratorGroupOfFourUnitTest {
	
	private Dish dish1,
				 dish2,
				 salad,
				 pizza;
	
	private GroupOfFourG<Dish> gOF;
	private IteratorGroupOfFour<Dish> iteratorGOF;
	
	@BeforeEach
	void setup() {
		try {
			this.dish1 = new Dish("Hamburger", 11);
			this.dish2 = new Dish("Curry Sausage", 13);
			this.salad = new Salad();
			this.pizza = new Pizza();
			this.gOF = new GroupOfFourG<>();
			this.gOF.append(dish1);
			this.gOF.append(dish2);
			this.gOF.append(salad);
			this.gOF.append(pizza);
			iteratorGOF = new IteratorGroupOfFour<>(gOF);
		} catch(final TableSpaceOutOfBoundsException E) {
			E.printStackTrace();
		}
	}
	
	@AfterEach
	void teardown() {
		this.dish1 = null;
		this.dish2 = null;
		this.salad = null;
		this.pizza = null;
		this.gOF   = null;
	}
	
	@Test
	void testGroupfOfFourIterator() {
		
		assertTrue(this.iteratorGOF.hasNext(), "hasNext() works not properly-no.1");
		
		while (this.iteratorGOF.hasNext()) {
			this.iteratorGOF.next();
		}
		
		assertFalse(this.iteratorGOF.hasNext(), "hasNext() works not properly-no.2");
	}
	
	
	

}
