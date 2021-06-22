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

public interface Portable {
	
	String name();
	
	double price();
	
	void setPrice(final double PRICE);
	
	double weight();
	
	Entity carrier();
	
	void setCarrier(final Entity ENTITY);
	
	Entity owner();
	
	void setOwner(final Entity ENTITY);
	
}
