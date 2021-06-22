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

package Prog2.Exercises.Exercise4.Iterable;

import org.junit.jupiter.api.*;

import java.io.*;

import Prog2.Exercises.Exercise2.Generics.*;

/**
 * @author Bella Abshagen, 
 * 		   Aug 20, 2020
 *
 */
public final class MyUtilUnitTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); //stream to save the sreen output to
	private final PrintStream original = System.out; //the original stream for the screen output
	
	private Dish[] dishes;
	
	private Salad[] salads;
	
	private Dish dish1,
				 dish2,
				 salad1,
				 pizza;
	
	private Salad salad2,
				  salad3,
	              salad4,
	              salad5;
	            
	
	
	
	private GroupIFG<Dish>	gifg1,
							gifg2,
							gifg3,
							gifg4,
							gifg5,
							gifg6,
							gifg7;
	
	private GroupIFG<Salad> gifgS;
	
	@BeforeEach
	void setupStream(){System.setOut(new PrintStream(this.outContent)); 
	}
	
	
	@BeforeEach
	void setup() {
		this.dish1  = new Dish<>();
		this.dish2  = new Dish<>();
		this.salad1 = new Salad<>();
		this.pizza  = new Pizza<>();
		this.salad2 = new Salad<>();
		this.salad3 = new Salad<>();
		this.salad4 = new Salad<>();
		this.salad5 = new Salad<>();
		this.dishes = new Dish[] {dish1, dish2, salad1, pizza};
		this.salads = new Salad[] {salad2, salad3, salad4, salad5};
		this.gifg1  = new GroupOfFourG<>(dishes);
		this.gifgS  = new GroupOfFourG<>(salads);
		this.gifg2  = new GroupOfFourG<>(new Dish[] {new Dish<>(), new Dish<>(), new Salad<>(), new Pizza<>(40, 13)});
		this.gifg3  = new GroupOfFourG<>(new Dish[] {new Pizza<>(44, 18), new Salad<>(300, 17), new Dish<>(), new Dish<>("Hamburger", 15)});
		this.gifg4  = new GroupOfFourG<>(new Dish[] {new Pizza<>(), new Salad<>(), new Dish<>("Halloumi", 15)});
		this.gifg5  = new GroupOfFourG<>();
		this.gifg6  = new GroupOfFourG<>();
		this.gifg7  = new GroupOfFourG<>();
	}
	
	
	@AfterEach
	void resetStream(){System.setOut(this.original);}
	
	@AfterEach
	void teardown() {
		this.dish1  = null;
		this.dish2  = null;
		this.salad1 = null;
		this.pizza  = null;
		this.salad2 = null;
		this.salad3 = null;
		this.salad4 = null;
		this.salad5 = null;
		this.dishes = null;
		this.salads = null;
		this.gifg1  = null;
		this.gifgS  = null;
		this.gifg2  = null;
		this.gifg3  = null;
		this.gifg4  = null;
		this.gifg5  = null;
		this.gifg6  = null;
		this.gifg7  = null;
		
	}
	
	
	@Test
	void testHelloWorld() {
		System.out.print("Hello World");
		Assertions.assertEquals("Hello World", this.outContent.toString());
	} 
	
	@Test
	void testPrintAllWith1Param() {
		System.out.println(MyUtil.printAll(gifg1));
		try {
			Assertions.assertEquals("\n" + this.gifg1 + "\n", this.outContent.toString(), "MyUtil.printAll(GroupOfFour<Dish> works not properly-no.1");
		} catch (Exception E) {
				E.printStackTrace();
		}
	}
	
	
	@Test
	void testPrintAllWith2ParamsOne() {
		System.out.println(MyUtil.printAll(this.gifg2, this.gifg3));
		try {
			Assertions.assertEquals("\n" + this.gifg2 + "\n\n" + this.gifg3 + "\n", this.outContent.toString(), "MyUtil.printAll(GroupOfFour<Dish> works not properly-no.2");
		} catch (Exception E) {
				E.printStackTrace();
		}
	}
	
	@Test
	void testPrintAllWith2ParamsTwo() {
		System.out.println(MyUtil.printAll(this.gifg2, this.gifg4));
		try {
			Assertions.assertEquals("\n" + this.gifg2 + "\n\n" + this.gifg4 + "\n", this.outContent.toString(), "MyUtil.printAll(GroupOfFour<Dish> works not properly-no.3");
		} catch (Exception E) {
				E.printStackTrace();
		}
	}
	
	@Test
	void testShallowCopy() {
		int no = 0;
		try {
			MyUtil.shallowCopy(this.gifg1, this.gifg5);
			for (int index = 0; index < MyUtil.maxSize(this.gifg1, this.gifg5); index++) {
				Assertions.assertTrue(this.gifg1.get(index) == this.gifg5.get(index), "MyUtil.shallowCopy(x,y) works not properly-no." + ++no);
			}
			
			MyUtil.shallowCopy(this.gifg2, this.gifg6);
			for (int index = 0; index < MyUtil.maxSize(this.gifg2, this.gifg6); index++, no++) {
				Assertions.assertTrue(this.gifg2.get(index) == this.gifg6.get(index), "MyUtil.shallowCopy(x,y) works not properly-no." + ++no);
			}
			
			MyUtil.shallowCopy(this.gifgS, this.gifg7);
			for (int index = 0; index < MyUtil.maxSize(this.gifgS, this.gifg7); index++, no++) {
				Assertions.assertTrue(this.gifgS.get(index) == this.gifg7.get(index), "MyUtil.shallowCopy(GIFG<Salad>,GIFG<Dish>) works not properly-no." + ++no);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//nur durch Verändern der gesamten KlassenStrukturen möglich, daher nicht weiter verfolgt	
//--------------------------------------------------------------------------------------------	
//	@Test
//	void testDeepCopy() {
//		int no = 0;
//		try {
//			MyUtil.deepCopy(this.gifg1, this.gifg5);
//			Assertions.assertEquals(this.gifg1, this.gifg5, "MyUtil.deepCopy(x,y) works not properly-no." + ++no);
//			for (int index = 0; index < MyUtil.maxSize(this.gifg1, this.gifg5); index++) {
//				Assertions.assertEquals(this.gifg1.get(index), this.gifg5.get(index), "MyUtil.deepCopy(x,y) works not properly-no." + ++no);
//			}
//			
//			MyUtil.shallowCopy(this.gifg2, this.gifg6);
//			Assertions.assertEquals(this.gifg2, this.gifg6, "MyUtil.deepCopy(x,y) works not properly-no.6");
//			for (int index = 0; index < MyUtil.maxSize(this.gifg2, this.gifg6); index++) {
//				Assertions.assertEquals(this.gifg2.get(index), this.gifg6.get(index), "MyUtil.deepCopy(x,y) works not properly-no." + ++no);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	

}
