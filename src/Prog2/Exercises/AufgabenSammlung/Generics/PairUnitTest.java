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

package Prog2.Exercises.AufgabenSammlung.Generics;


import org.junit.jupiter.api.*;

/**
 * @author Bella Abshagen, 
 * 		   Oct 1, 2020
 *
 */
class PairUnitTest {
	
	private Pair<Integer, Integer> pair1;
	private Pair<Double, Double> pair2;
	private Pair<Integer, Integer> pair3;
	private Pair<Long, Float> pair4;
	
	@BeforeEach
	void setup() {
		this.pair1 = new Pair<>(5, (int) 5.);
		this.pair2 = new Pair<>(3., 7.);
		this.pair3 = new Pair<>(1, 1);
		this.pair4 = new Pair<>(256L, 256F);
	}
	
	@AfterEach
	void teardown() {
		this.pair1 =  null;
		this.pair2 =  null;
		this.pair3 =  null;
		this.pair4 =  null;
	}
	
	
	@Test
	void testGetFirst_GetSecond() {
		long no = 0L;
		Assertions.assertTrue(3.- this.pair2.getFirst() < 0.0000000000001, "getFirst() works not properly no." + no++);
		Assertions.assertTrue(7.- this.pair2.getSecond() < 0.0000000000001, "getSecond() works not properly no." + no++);
		Assertions.assertEquals(1, this.pair3.getSecond(), "getSecond() works not properly no." + no++);
		Assertions.assertEquals(1, this.pair3.getSecond(), "getSecond() works not properly no." + no++);
		Assertions.assertTrue(256L - this.pair4.getSecond() < 0.0000000000001, "getSecond() works not properly no." + no++);
		Assertions.assertTrue(256F - this.pair4.getSecond() < 0.0000000000001, "getSecond() works not properly no." + no++);
	}
	
	@Test
	void testSetFirst_SetSecond() {
		long no = 0L;
		Assertions.assertTrue(3. - this.pair2.setFirst(13.) < 0000000000000000.1, "setFirst(F) works not properly no." + no++);
		Assertions.assertTrue(7. - this.pair2.setSecond(11.) < 0000000000000000.1, "setSecond(S) works not properly no." + no++);
		Assertions.assertTrue(1 - this.pair3.setFirst(2) < 0000000000000000.1, "setFirst(F) works not properly no." + no++);
		Assertions.assertTrue(1 - this.pair3.setSecond(3) < 0000000000000000.1, "setSecond(S) works not properly no." + no++);
		Assertions.assertTrue(256L - this.pair4.setFirst(67L) < 0000000000000000.1, "setFirst(F) works nor properly no." + no++);
		Assertions.assertTrue(256F - this.pair4.setSecond(55F) < 0000000000000000.1, "setSecond(S) works not properly no." + no++);
	}
	
	@Test
	void testEquals() {
		long no = 0L;
		Assertions.assertTrue(Pair.equals(pair1), "Pair.equals(PAIR<F, S>) works not properly no." + no++);
		Assertions.assertFalse(Pair.equals(pair2), "Pair.equals(PAIR<F, S>) works not properly no." + no++);
		Assertions.assertTrue(Pair.equals(pair3), "Pair.equals(PAIR<F, S>) works not properly no." + no++);
		//Assertions.assertTrue(Pair.equals(pair4), "Pair.equals(PAIR<F, S>) works not properly no." + no++);
	}
	
	@Test
	void testToString() {
		long no = 0L;
		Assertions.assertEquals("(3.0, 7.0)", pair2.toString(), "Pair.equals(PAIR<F, S>) works not properly no." + no++);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		