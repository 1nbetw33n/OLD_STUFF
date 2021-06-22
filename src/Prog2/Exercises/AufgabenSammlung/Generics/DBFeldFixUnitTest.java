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
 * 		   Oct 2, 2020
 *
 */
public final class DBFeldFixUnitTest {

	private DBFeldFix<Boolean> feld1;
	private DBFeldFix<Boolean> feld2;
	private DBFeldFix<Boolean> feld3;
	private DBFeldFix<Integer> feld4;
	private DBFeldFix<Double>  feld5;
	private DBFeldFix<Long>    feld6;
	private DBFeldFix<Number>  feld7;
	private DBFeldFix<Boolean> feld11;
	private DBFeldFix<Boolean> feld12;
	private DBFeldFix<Boolean> feld13;
	private DBFeldFix<Integer> feld14;
	private DBFeldFix<Double>  feld15;
	private DBFeldFix<Long>    feld16;
	private DBFeldFix<Number>  feld17;
	
	
	@BeforeEach
	void setup() {
		feld1 = new DBFeldFix<>(new Boolean [] {false, false, false, false, false, false, false});
		feld2 = new DBFeldFix<>(new Boolean [] {false, true, false, false, false, false, false});
		feld3 = new DBFeldFix<>(new Boolean [] {true, true, true, true});
		feld4 = new DBFeldFix<>(new Integer[] {1, 1, 1, 1, 1, 1, 1});
		feld5 = new DBFeldFix<>(new Double[] {2.2, 2.2, 2.2, 2.2, 2.22});
		feld6 = new DBFeldFix<>(new Long[] {5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L});
	    feld7 = new DBFeldFix<>(new Number[] {1, 1., 1L, 1F});
		feld11 = new DBFeldFix<>(new Boolean [] {false, false, false, false, false, false, false});   
	    feld12 = new DBFeldFix<>(new Boolean [] {false, true, false, false, false, false, false});    
	    feld13 = new DBFeldFix<>(new Boolean [] {true, true, true, true});                            
	    feld14 = new DBFeldFix<>(new Integer[] {1, 1, 1, 1, 1, 1, 1});                                
	    feld15 = new DBFeldFix<>(new Double[] {2.2, 2.2, 2.2, 2.2, 2.22});                            
	    feld16 = new DBFeldFix<>(new Long[] {5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L, 5L});
	    feld17 = new DBFeldFix<>(new Number[] {1, 1., 1L, 1F});                                       
	}
	
	@AfterEach
	void teardown() {
		feld1 =  null;
		feld2 =  null;
		feld3 =  null;
		feld4 =  null;
		feld5 =  null;
		feld6 =  null;
		feld7 =  null;
		feld11 = null;
		feld12 = null;
		feld13 = null;
		feld14 = null;
		feld15 = null;
		feld16 = null;
		feld17 = null;
	}
	
	@Test
	void testAreAllEqual() {
		long no = 0L;
		Assertions.assertTrue(feld1.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertFalse(feld2.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertTrue(feld3.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertTrue(feld4.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertFalse(feld5.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertTrue(feld6.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertFalse(feld7.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertTrue(feld11.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertFalse(feld12.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertTrue(feld13.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertTrue(feld14.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertFalse(feld15.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertTrue(feld16.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
		Assertions.assertFalse(feld17.AreAllEqual(), "Looks like .AreAllEqual() works not properly-no." + ++no);
	}
	
	@Test
	void testEquals() {
		long no = 0L;
		try {
			Assertions.assertTrue(feld1.equals(feld11), "Looks like .AreAllEqual() works not properly-no." + ++no);
			Assertions.assertTrue(feld2.equals(feld12), "Looks like .AreAllEqual() works not properly-no." + ++no);
			Assertions.assertTrue(feld3.equals(feld13), "Looks like .AreAllEqual() works not properly-no." + ++no);
			Assertions.assertFalse(feld4.equals(feld15), "Looks like .AreAllEqual() works not properly-no." + ++no);
			Assertions.assertFalse(feld5.equals(feld14), "Looks like .AreAllEqual() works not properly-no." + ++no);
			Assertions.assertFalse(feld6.equals(feld17), "Looks like .AreAllEqual() works not properly-no." + ++no);
			Assertions.assertFalse(feld7.equals(feld16), "Looks like .AreAllEqual() works not properly-no." + ++no);
			
			
		}catch(final Exception E) {
			E.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
