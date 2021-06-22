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

public abstract class RideableImmortal extends Immortal implements Rideable{
	
	public RideableImmortal(final String NAME, final int AGE) {
		super(NAME, AGE);
	}
	
public abstract String greeting();
	
	public void take(final Portable PORTABLE) throws PortableItemException{
		throw new PortableItemException("Rideable Immortals can't carry portable items.");
	}
	
	public void purchase(final Item ITEM) throws EntityException {
		throw new EntityException("Rideable Immortals can't purchase items.");
	}
	
	public double stamina() {return this.stamina;}
	
	public void setStamina(final double STAMINA) {this.stamina = STAMINA;}
	
	public double maxStamina() {return this.maxStamina;}
	
	public void recover() { this.stamina = this.stamina <= this.maxStamina() / 2. ? this.maxStamina() / 2 : this.maxStamina();}

	

}
