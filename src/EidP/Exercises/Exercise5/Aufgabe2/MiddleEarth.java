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

public class MiddleEarth {

	public static void main(String[] args) {
		Entity[] party = new Entity[3];
		Hobbit frodo = new Hobbit("Frodo", 40);
		Hobbit bilbo = new Hobbit("Bilbo", 120);
		Wizard gandalf = new Wizard("Gandalf", 300);
		party[0] = frodo;
		party[1] = bilbo;
		party[2] = gandalf;
		status(party);
		frodo.getsWounded(10);
		bilbo.getsWounded(50);
		gandalf.heals(frodo);
		gandalf.heals(bilbo);
		status(party);
		
		System.err.println(frodo.greeting());
		System.err.println(gandalf.greeting());
		
	}
	
	public static void status(final Entity[] party) {
		System.err.println("Status: ");
		for (int index = 0; index < party.length; index++) {
			System.err.println(party[index].toString());
		}
		System.err.println();
	}

}