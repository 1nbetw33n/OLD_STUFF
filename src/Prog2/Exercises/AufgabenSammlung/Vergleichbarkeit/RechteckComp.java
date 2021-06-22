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

package Prog2.Exercises.AufgabenSammlung.Vergleichbarkeit;

/**
 * @author Bella Abshagen, 
 * 		   Oct 5, 2020
 *
 */
public final class RechteckComp extends Rechteck implements java.lang.Comparable<RechteckComp>{
	
	public int compareTo(final RechteckComp RECHTECK) {
		return (int) (this.flaeche() - RECHTECK.flaeche());
	}

}
