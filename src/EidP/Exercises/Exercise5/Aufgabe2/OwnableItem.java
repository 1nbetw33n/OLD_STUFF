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

public abstract class OwnableItem extends Item implements Ownable {
	
	//creates a new Ownable Item and sets ownership to new Enigmatic(),
	//since Tom Bombadil (new Enigmatic()) represents nature
	public OwnableItem(final String NAME, final double PRICE) {
		super(NAME, PRICE);
		this.owner = new Enigmatic();
		this.owner.propertyIndex++; //so the next created Portable will be inserted at index+1 of property
	}
		
	// Constructor for making DeepCopys of OWNABLE
	public OwnableItem(final Ownable OWNABLE) {
		this(OWNABLE.name(), OWNABLE.price());
//		OWNABLE.setPrice(OWNABLE.price() * (1 + ((Item) OWNABLE).valueDropRate));   ***commented out, because in current implementation Item loses value, only when traded***
		OWNABLE.owner().propertyIndex--; // so new Engmatic()'s propertyIndex will be the same as it was before making the DeepCopy
		this.owner = OWNABLE.owner();
		this.owner.propertyIndex++; //so the next created Ownable will be inserted at index+1 of property
	}
	
	public String name() {return this.name;}
	
	public double price() {return this.price;}
	
	public void setPrice(final double PRICE) {this.price = PRICE;}
	
	public Entity owner() {return this.owner;}
	
	public void setOwner(final Entity OWNER) {this.owner = OWNER;}
	
	public abstract double valueDropRate();
	
	public void setValueDropRate(final double VALUEDROPRATE) {this.valueDropRate = VALUEDROPRATE;}
	
}
