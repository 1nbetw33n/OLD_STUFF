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

public class MengenAnwendungJUnitTest {
	
	private MengeGet<Number> set1;
	private MengeGet<Number> set2;
	private MengeGet<Number> clonedSet1;
	private MengeGet<Number> nullSet;
	
	@BeforeEach
	void setup() {
		set1 = new MengenAnwendung(new Number[] {128, null, 127, 5., null, 3.7, 2, 127, 128});
		set2 = new MengenAnwendung(new Number[] {6., 4.5, 9., null, 1, null, 9., 6.});
		clonedSet1 = ((MengenAnwendung) set1).clone();
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
			assertTrue(set1.contains((5.)), "contains() is not working properly-No.1");
			assertFalse(set1.contains((123)), "contains() is not working properly-No.2");
			assertThrows(MengeGetException.class, () -> new MengenAnwendung().contains(123), "No MengeGetException?-No.1");
			assertThrows(NullPointerException.class, () -> nullSet.contains(123), "No MengeGetException?-No.2");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testContainsTwo() {
		try {
			assertTrue(set2.containsTwo((6.)), "containsTwo() is not working properly-No.3");
			assertFalse(set1.containsTwo((5.)), "containsTwo() is not working properly-No.4");
			assertThrows(MengeGetException.class, () -> new MengenAnwendung().containsTwo(123), "No MengeGetException?-No.3");
			assertThrows(NullPointerException.class, () -> nullSet.containsTwo(123), "No MengeGetException?-No.4");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testInsert() {
		try {
			set2.insert(42.);
			set2.insert(42);
		assertTrue(((MengenAnwendung) set2).getElements()[set2.size() - 1].doubleValue() - ((Number) 42.).doubleValue() < 0.0000000001, "insert(Number) is not working properly-No.1");
		assertTrue(((MengenAnwendung) set2).getElements()[set2.size() - 1].intValue() - ((Number) 42).intValue() < 0.0000000001, "insert(Number) is not working properly-No.2");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testRemove() {
		try {
			set1.remove(128);
			assertFalse(set2.contains(128), "remove(Number) is not working properly-No.1");
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
			assertTrue(((MengenAnwendung) set1).getElements()[set1.size() - 1].intValue() - ((MengenAnwendung) clonedSet1).getElements()[clonedSet1.size() - 1].intValue() < 0.0000001, "clone() is not working properly-No.1");
			assertTrue(((MengenAnwendung) set1).getElements()[0].doubleValue() - ((MengenAnwendung) clonedSet1).getElements()[0].doubleValue() < 0.0000001, "clone() is not working properly-No.2");
			assertFalse(set1 == clonedSet1, "clone() creates only a ShallowCopy");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
