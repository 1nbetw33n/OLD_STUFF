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

public abstract class RideableEnigmatic extends Enigmatic implements Rideable{
	
	public String greeting() throws EnigmaticException{throw new EnigmaticException("Enigmatic Entities don't greet. :P");}

	public RideableEnigmatic() {
		super("shadowfax", 54960);
		this.property = new Item[9999999];
	}

	public RideableEnigmatic(final String NAME, final int AGE) {
		super(NAME, 54960);
		this.property = new Item[9999999];
	}
	
	public double stamina() {return this.stamina;}
	
	public void setStamina(final double STAMINA) {this.stamina = STAMINA;}
	
	public double maxStamina() {return this.maxStamina;}
	
	public void recover() { this.stamina = this.stamina <= this.maxStamina() / 2. ? this.maxStamina() / 2 : this.maxStamina();}


}
