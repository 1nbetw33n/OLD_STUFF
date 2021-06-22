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

public class Elve extends Immortal{
	
	public Elve(final String NAME, final int AGE) {super(NAME, AGE);}
	
	public final String greeting() {return "S Mae govannen!";}
	
	public void take(final Portable PORTABLE) throws PortableItemException {
		if (PORTABLE.weight() - 100. > 0.00000001) {
			throw new PortableItemException("Portable Item too heavy for an Elve");
		}else {
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

}
