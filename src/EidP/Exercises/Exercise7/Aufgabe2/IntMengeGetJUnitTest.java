package EidP.Exercises.Exercise7.Aufgabe2;

/* copyright (c) 2019-2022 xx63ll4 Labs
 * St. Augustin, North Rhine Westphalia, 53757 F.R.G.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of 
 * xx63ll4 Labs ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * xx63ll4.
 */
/*                
 * @version xxxxxx
 * @author Bella Abshagen 23.6.20
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class IntMengeGetJUnitTest {
	
	private MengeGet<Integer> set1;
	private MengeGet<Integer> set2;
	@SuppressWarnings("unused")
	private MengeGet<Integer> union;
	private MengeGet<Integer> clonedSet1;
	private MengeGet<Integer> nullSet;
	
	@BeforeEach
	void setup() {
		set1 = new IntMengeGet(new Integer[] {128, null, 127, 5, null, 3, 2, 127, 128});
		set2 = new IntMengeGet(new Integer[] {6, 45, 9, null, 1, null, 9, 6});
		clonedSet1 = ((IntMengeGet) set1).clone();
	}
	
	@AfterEach
	void teardown() {
		set1 = null;
		set2 = null;
		clonedSet1 = null;
	}
	
	@Test
	void testContains(){
		try {
			assertTrue(set1.contains((5)), "contains() is not working properly-No.1");
			assertFalse(set1.contains((123)), "contains() is not working properly-No.2");
			assertThrows(MengeGetException.class, () -> new IntMengeGet().contains(123), "No MengeGetException?-No.1");
			assertThrows(NullPointerException.class, () -> nullSet.contains(123), "No MengeGetException?-No.2");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testContainsTwo() {
		try {
			assertTrue(set2.containsTwo((6)), "containsTwo() is not working properly-No.3");
			assertFalse(set1.containsTwo((5)), "containsTwo() is not working properly-No.4");
			assertThrows(MengeGetException.class, () -> new IntMengeGet().containsTwo(123), "No MengeGetException?-No.3");
			assertThrows(NullPointerException.class, () -> nullSet.containsTwo(123), "No MengeGetException?-No.4");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testInsert() {
		try {
			set2.insert(42);
			set2.insert(41);
		assertTrue(((IntMengeGet) set2).getElements()[set2.size() - 1].intValue() - ((Integer) 42).intValue() < 0.0000000001, "insert(Integer) is not working properly-No.1");
		assertTrue(((IntMengeGet) set2).getElements()[set2.size() - 1].intValue() - ((Integer) 41).intValue() < 0.0000000001, "insert(Integer) is not working properly-No.2");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testRemove() {
		try {
			set1.remove(128);
			assertFalse(set2.contains(128), "remove(Integer) is not working properly-No.1");
			assertThrows(MengeGetException.class, () -> set2.remove(11), "No MengeGetException?-No.5");
			assertThrows(MengeGetException.class, () -> new MengenAnwendung().remove(123), "No MengeGetException?-No.6");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testSize() {
		try {
			assertTrue(set1.size() - 9 < 0.00000001, "size() is not working properly-No.1");
			
			set1.normalize();
			
			assertTrue(set1.size() - 7 < 0.00000001, "size() is not working properly-No.2");
			
			set1.copyCatKiller();
			
			assertTrue(set1.size() - 5 < 0.00000001, "size() is not working properly-No.3");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testClone() {
		try {
			assertTrue(((IntMengeGet) set1).getElements()[set1.size() - 1].intValue() - ((IntMengeGet) clonedSet1).getElements()[clonedSet1.size() - 1].intValue() < 0.0000001, "clone() is not working properly-No.1");
			assertTrue(((IntMengeGet) set1).getElements()[0].doubleValue() - ((IntMengeGet) clonedSet1).getElements()[0].doubleValue() < 0.0000001, "clone() is not working properly-No.2");
			assertFalse(set1 == set2, "clone() creates only a ShallowCopy");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
