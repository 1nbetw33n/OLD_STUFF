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

public abstract class Mortal extends Entity {
	
	protected int lifeExpectancy;
	protected int maxLifeExpectancy;
	
	
	public Mortal(final String NAME, final int AGE) {
		super(NAME, AGE);
	}
	public final boolean alive() {return this.getAge() < this.lifeExpectancy;}
	
	public void getsWounded(final int SEVERERITY) {
		this.lifeExpectancy -= this.getAge() < (this.lifeExpectancy - SEVERERITY) ? SEVERERITY : this.lifeExpectancy;
		String output = this.alive() ?
			this.getName() + " gets wounded. The life expectancy decreases to " + this.lifeExpectancy + " years." :
				this.getName() + " gets deadly injured.";
		System.err.println(output);
	}
	
	public int getLifeExpectancy() {return this.lifeExpectancy;}
	
	public void setLifeExpectancy(final int LIFEEXPECTANCY) {this.lifeExpectancy = LIFEEXPECTANCY;}
	
	public int getMaxLifeExpectancy() {return this.maxLifeExpectancy;}
	
	public void setMaxLifeExpectancy(final int MAXLIFEEXPECTANCY) {this.maxLifeExpectancy = MAXLIFEEXPECTANCY;}
	
	public String toString() {return (this.alive() ? 
			this.getName() + " is " + this.getAge() + " years old and has a life expectancy of " + this.lifeExpectancy + " years." :
				this.getName() + " has already passed away.");}
	
}

