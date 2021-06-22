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

package Prog2.Exercises.Exercise3;

/**
 * @author Bella Abshagen, 
 * 		   Aug 7, 2020
 *
 */

import org.junit.jupiter.api.*;

import Prog2.Exercises.Exercise1.*;

class HelperTest {
	Object[] feld = {2, "Hallo", "Hallo", new String("Hallo"), new Pizza(), new Salad(), new Pizza()};

	@Test
	void test() {
		for(Object o1:feld) {
			for(Object o2:feld) {
				if(o1.toString().length()>o2.toString().length())
					Assertions.assertEquals(o1, Helper.stringLaenge(o1, o2), "Problem mit stringLaenge(..)");
				else
					Assertions.assertEquals(o2, Helper.stringLaenge(o1, o2), "Problem mit stringLange(...)");
			}
		}
	}

}
