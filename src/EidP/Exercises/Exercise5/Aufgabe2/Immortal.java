package EidP.Exercises.Exercise5.Aufgabe2;

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

public abstract class Immortal extends Entity {
	
	public Immortal(final String NAME, final int AGE) {
		super(NAME, AGE);
	}
	
	public final boolean alive() {return true;}
	
	public String toString() {return this.getName() + " is " + this.getAge() 
								+ " years old and has an infinite life expectancy" + 
								(this.getName() == "Gandalf" ? ", because he's a maia.;)" : ".");}
	
}
