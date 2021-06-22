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

/**
 * @author Bella Abshagen, 
 * 		   Oct 2, 2020
 *
 */
public final class DBFeldFix<T> {
	
	T[] elements;
	
	DBFeldFix(){}
	
	DBFeldFix(final T[] ELEMENTS){this.elements = ELEMENTS;}
	
	final boolean AreAllEqual() {
		for (int indexA = 0; indexA < this.elements.length; indexA++) {
			for (int indexB = 0; indexB < this.elements.length; indexB++) {
				if (!(this.elements[indexA].equals(this.elements[indexB]))) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	final boolean equals(final DBFeldFix<T> FELD) throws Exception{
		if (this.elements.length != FELD.elements.length) {
			throw new Exception("Both Felds don't have the same length!");
		}else {
			for (int index = 0; index < this.elements.length; index++) {
				if (!(this.elements[index].equals(FELD.elements[index]))) {
					return false;
				}
			}
		}
		return true;
	}

}
