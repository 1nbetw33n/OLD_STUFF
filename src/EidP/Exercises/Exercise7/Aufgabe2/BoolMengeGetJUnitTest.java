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

public class BoolMengeGetJUnitTest {
	
	private MengeGet<Boolean> set1;
	private MengeGet<Boolean> set2;
	private MengeGet<Boolean> clonedSet1;
	private MengeGet<Boolean> nullSet;
	
	@BeforeEach
	void setup() {
		set1 = new BoolMengeGet(new Boolean[] {true, true, true , null, true , true});
		set2 = new BoolMengeGet(new Boolean[] {false, false, true, null, false, null, false, false});
		clonedSet1 = ((BoolMengeGet) set1).clone();
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
			assertTrue(set1.contains((true)), "contains() is not working properly-No.1");
			assertFalse(set1.contains((false)), "contains() is not working properly-No.2");
			assertThrows(MengeGetException.class, () -> new BoolMengeGet().contains(false), "No MengeGetException?-No.1");
			assertThrows(NullPointerException.class, () -> nullSet.contains(true), "No MengeGetException?-No.2");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testContainsTwo() {
		try {
			assertTrue(set1.containsTwo((true)), "containsTwo() is not working properly-No.3");
			assertFalse(set1.containsTwo((false)), "containsTwo() is not working properly-No.4");
			assertThrows(MengeGetException.class, () -> new BoolMengeGet().containsTwo(true), "No MengeGetException?-No.3");
			assertThrows(NullPointerException.class, () -> nullSet.containsTwo(false), "No MengeGetException?-No.4");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testRemove() {
		try {
			set2.remove(true);
			assertFalse(set2.contains(true), "remove(Number) is not working properly-No.1");
			assertThrows(MengeGetException.class, () -> set2.remove(true), "No MengeGetException?-No.5");
			assertThrows(MengeGetException.class, () -> new BoolMengeGet().remove(false), "No MengeGetException?-No.6");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testSize() {
		try {
			assertTrue(set2.size() - 8 < 0.00000001, "size() is not working properly-No.1");
			
			set2.normalize();
			
			assertTrue(set2.size() - 6 < 0.00000001, "size() is not working properly-No.2");
			
			set2.copyCatKiller();
			
			assertTrue(set2.size() - 2 < 0.00000001, "size() is not working properly-No.3");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testClone() {
		try {
			assertTrue(((BoolMengeGet) set1).getElements()[set1.size() - 1].equals(((BoolMengeGet) clonedSet1).getElements()[clonedSet1.size() - 1]), "clone() is not working properly-No.1");
			assertTrue(((BoolMengeGet) set1).getElements()[0].equals(((BoolMengeGet) clonedSet1).getElements()[0]), "clone() is not working properly-No.2");
			assertFalse(set1 == clonedSet1, "clone() creates only a ShallowCopy");
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
}
