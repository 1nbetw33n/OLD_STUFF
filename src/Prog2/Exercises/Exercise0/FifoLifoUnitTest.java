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

package Prog2.Exercises.Exercise0;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * @author Bella Abshagen
 *
 */
public class FifoLifoUnitTest {
	
	private Fifo fifo;
	private Lifo lifo;
	

	@BeforeEach
	void setup() {
		this.fifo = new Fifo(5);
		this.lifo = new Lifo(5);
	}
	
	@AfterEach
	void teardown() {
		this.fifo = null;
		this.lifo = null;
	}

	@Test
	void testPushPop() {
		try {
			this.lifo.push(1);
			this.lifo.push(2);
			this.lifo.push(3);
			this.lifo.push(4);
			this.lifo.push(5);
			assertTrue(this.lifo.pop() - 5 < 0.0000000001, "Lifo.pop() not working properly-No.1");
			assertTrue(this.lifo.pop() - 4 < 0.0000000001, "Lifo.pop() not working properly-No.2");
			assertTrue(this.lifo.pop() - 3 < 0.0000000001, "Lifo.pop() not working properly-No.3");
			assertTrue(this.lifo.pop() - 2 < 0.0000000001, "Lifo.pop() not working properly-No.4");
			assertTrue(this.lifo.pop() - 1 < 0.0000000001, "Lifo.pop() not working properly-No.5");
			assertThrows(Exception.class, () -> this.lifo.pop(), "no IndexOutOfBoundsException?-No.1");
		
			this.fifo.push(1);
			this.fifo.push(2);
			this.fifo.push(3);
			this.fifo.push(4);
			this.fifo.push(5);
			assertTrue(this.fifo.pop() - 1 < 0.0000000001, "Fifo.pop() not working properly-No.1");
			assertTrue(this.fifo.pop() - 2 < 0.0000000001, "Fifo.pop() not working properly-No.2");
			assertTrue(this.fifo.pop() - 3 < 0.0000000001, "Fifo.pop() not working properly-No.3");
			assertTrue(this.fifo.pop() - 4 < 0.0000000001, "Fifo.pop() not working properly-No.4");
			assertTrue(this.fifo.pop() - 5 < 0.0000000001, "Fifo.pop() not working properly-No.5");
			assertThrows(Exception.class, () -> this.fifo.pop(), "no IndexOutOfBoundsException?-No.2");
		}catch (final Exception E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testMove() {
		try {
			this.fifo.push(6);
			this.fifo.push(7);
			this.fifo.push(8);
			this.fifo.push(9);
			this.fifo.push(10);
			
			assertTrue(this.lifo.size() - 0 < 0.000000001, "Lifo.pop() not working properly-No.6");
			assertTrue(this.fifo.size() - 5 < 0.000000001, "Fifo.pop() not working properly-No.6");
			
			Helper.move(this.fifo, this.lifo);
			
			assertTrue(this.lifo.size() - 5 < 0.000000001, "Lifo.pop() not working properly-No.7");
			assertTrue(this.fifo.size() - 0 < 0.000000001, "Fifo.pop() not working properly-No.7");
			assertTrue(this.lifo.pop() - 10 < 0.0000000001, "Helper.move() not working properly-No.1");
			assertTrue(this.lifo.pop() - 9 < 0.0000000001, "Helper.move() not working properly-No.2");
			assertTrue(this.lifo.pop() - 8 < 0.0000000001, "Helper.move() not working properly-No.3");
			assertTrue(this.lifo.pop() - 7 < 0.0000000001, "Helper.move() not working properly-No.4");
			assertTrue(this.lifo.pop() - 6 < 0.0000000001, "Helper.move() not working properly-No.5");
			assertTrue(this.lifo.size() - 0 < 0.000000001, "Lifo.pop() not working properly-No.8");
			assertTrue(this.fifo.size() - 0 < 0.000000001, "Fifo.pop() not working properly-No.8");
			
			Helper.move(this.lifo, this.fifo);
			
			assertTrue(this.fifo.pop() - 6 < 0.0000000001, "Helper.move() not working properly-No.1");
			assertTrue(this.fifo.pop() - 7 < 0.0000000001, "Helper.move() not working properly-No.2");
			assertTrue(this.fifo.pop() - 8 < 0.0000000001, "Helper.move() not working properly-No.3");
			assertTrue(this.fifo.pop() - 9 < 0.0000000001, "Helper.move() not working properly-No.4");
			assertTrue(this.fifo.pop() - 10 < 0.0000000001, "Helper.move() not working properly-No.5");
			assertTrue(this.lifo.size() - 0 < 0.000000001, "Lifo.pop() not working properly-No.9");
			assertTrue(this.fifo.size() - 0 < 0.000000001, "Fifo.pop() not working properly-No.9");

		}catch(final Exception E) {
			E.printStackTrace();
		}
		
	}
	

	
	
}
