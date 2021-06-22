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

public class Wizard extends Immortal {

	public Wizard(final String NAME, final int AGE) {super(NAME, AGE);}
	
	public final void heals(final Mortal MORTAL) {
		MORTAL.setLifeExpectancy( (MORTAL.alive() ? MORTAL.getLifeExpectancy() : MORTAL.getLifeExpectancy()) );
		String output = MORTAL.alive() ?
				MORTAL.getName() + " has been healed. The life expectancy is " + MORTAL.getLifeExpectancy() + " years.":
					MORTAL.getName() + " can't be healed anymore.";
		System.err.println(output);
	}
	
	public final String greeting() {return "Hail!";}
	
	public void take(final Portable PORTABLE) {
		/*  making a DeepCopy of PORTABLE, so PORTABLE and temporaryPortable
		 *  don't share the same reference and due to that,
		 *  don't share the very same thingsIndex
		 */
		Portable temporaryPortable = new PortableItem(PORTABLE) {
			//anonymous classes to make PortableItem instantiable
			public double weight() {return PORTABLE.weight();}
			public double valueDropRate() {return ((PortableItem) PORTABLE).valueDropRate();}
		};
		this.thing = temporaryPortable;
		temporaryPortable.setCarrier(this);
		if (PORTABLE.carrier() instanceof Enigmatic) {
			((Enigmatic) PORTABLE.carrier()).things[PORTABLE.carrier().thingsIndex--] = null;
		}else {
			PORTABLE.carrier().thing = null;
		}
		PORTABLE.setCarrier(this);
	}
	
}
