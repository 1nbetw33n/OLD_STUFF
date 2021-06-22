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

public abstract class Item{
	
	protected String name;
	protected double price;
	protected Entity owner;
	protected double valueDropRate;
	
	public Item(final String NAME, final double PRICE) {
		this.name = NAME;
		this.price = PRICE;
	}
	
	// Constructor for making DeepCopies of Item
//	public Item(final Item ITEM) {this(ITEM.getName(), ITEM.getPrice());}
	
	public String getName() {return this.name;}
	
	public double getPrice() {return this.price;}
	

}
