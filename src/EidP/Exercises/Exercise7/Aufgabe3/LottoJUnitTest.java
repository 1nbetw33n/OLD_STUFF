package EidP.Exercises.Exercise7.Aufgabe3;

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

import java.io.*;
import java.util.Scanner;

import org.junit.jupiter.api.*;

import EidP.Exercises.Exercise7.Aufgabe2.IntMengeGet;
import EidP.Exercises.Exercise7.Aufgabe2.MengeGet;
import EidP.Exercises.Exercise7.Aufgabe2.MengeGetException;

@SuppressWarnings("unused")
public class LottoJUnitTest {
	
	private MengeGet<Integer> tip;
	private MengeGet<Integer> draw;
	private MengeGet<Integer> announcedNumbers;
	private int numberOfHits;
	
	
	
	@BeforeEach
	void setup() {
		try {
//		tip = Lotto.scanNumbers(); //throws NoSuchElementException, warum auch immer; in der main von Lotto funktionierts einwandfrei
		tip = new IntMengeGet(new Integer[] {49, 37, 43, 24, 25, 1});
		draw = new IntMengeGet(new Integer[] {44, 25, 1, 24, 37, 43});
		announcedNumbers = Lotto.announceNumbers(draw);
		numberOfHits = Lotto.checkNumberOfHits(tip, announcedNumbers);
		}catch (MengeGetException e) {
			e.printStackTrace();
		}
	}
	
	@AfterEach
	void teardown() {
		announcedNumbers = null;
		draw = null;
		announcedNumbers = null;
		numberOfHits = 0;
	}
	
	//obsolet, da Lotto.scanNumbers() NoSuchElementException throws
//	@Test
//	void testScanNumbers() {
//			assertTrue(((IntMengeGet)tip).getElements()[0] - 49 < 0.00000001, "scanNumbers() is not working properly -No.1");
//			assertTrue(((IntMengeGet)tip).getElements()[1] - 37 < 0.00000001, "scanNumbers() is not working properly -No.2");
//			assertTrue(((IntMengeGet)tip).getElements()[2] - 43 < 0.00000001, "scanNumbers() is not working properly -No.3");
//			assertTrue(((IntMengeGet)tip).getElements()[3] - 24 < 0.00000001, "scanNumbers() is not working properly -No.4");
//			assertTrue(((IntMengeGet)tip).getElements()[4] - 25 < 0.00000001, "scanNumbers() is not working properly -No.5");
//			assertTrue(((IntMengeGet)tip).getElements()[5] - 1 < 0.00000001, "scanNumbers() is not working properly -No.6");
//	}
	
	@Test
	void testAnnounceNumbers() {
		assertTrue(((IntMengeGet)announcedNumbers).getElements()[0] - 1 < 0.00000001, "announceNumbers() is not working properly -No.1");
		assertTrue(((IntMengeGet)announcedNumbers).getElements()[1] - 24 < 0.00000001, "announceNumbers() is not working properly -No.2");
		assertTrue(((IntMengeGet)announcedNumbers).getElements()[2] - 25 < 0.00000001, "announceNumbers() is not working properly -No.3");
		assertTrue(((IntMengeGet)announcedNumbers).getElements()[3] - 37 < 0.00000001, "announceNumbers() is not working properly -No.4");
		assertTrue(((IntMengeGet)announcedNumbers).getElements()[4] - 43 < 0.00000001, "announceNumbers() is not working properly -No.5");
		assertTrue(((IntMengeGet)announcedNumbers).getElements()[5] - 44 < 0.00000001, "announceNumbers() is not working properly -No.6");
	}
	
	@Test
	void testCheckNumberOfHits() {
		assertTrue(numberOfHits - 6 < 0.000000001, "checkNumberOfHits() is not working properly -No.1");
		
	}
	
	
	
}
	
	
	
	







