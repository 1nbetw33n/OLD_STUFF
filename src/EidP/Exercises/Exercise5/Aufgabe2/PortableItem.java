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

public abstract class PortableItem extends Item implements Portable, Ownable{
	
	protected Entity carrier;
	
	//creates a new Portable Item and sets ownership to new Enigmatic() and also puts the Portable in new Emigmatics() hands,
	//since Tom Bombadil (new Enigmatic()) represents nature
	public PortableItem(final String NAME, final double PRICE) {
		super(NAME, PRICE);
		this.owner = new Enigmatic();
		this.owner.propertyIndex++; //so the next created Portable will be inserted at index+1 of property
		
		this.carrier = this.owner; 
		this.carrier.thingsIndex++; //so the next created Portable will be inserted at index+1 of things
	}
	
	// Constructor for making DeepCopys of PORTABLE
	public PortableItem(final Portable PORTABLE) {
		this(PORTABLE.name(), PORTABLE.price());
//		PORTABLE.setPrice(PORTABLE.price() * (1 + ((Item) PORTABLE).valueDropRate));   ***commented out, because in current implementation Item loses value, only when traded***
		PORTABLE.owner().propertyIndex--; // so new Engmatic()'s propertyIndex will be the same as it was before making the DeepCopy
		this.owner = PORTABLE.owner();
		this.owner.propertyIndex++; //so the next created Portable will be inserted at index+1 of property
		
		PORTABLE.carrier().thingsIndex--; // so new Engmatic()'s thingsIndex will be the same as it was before making the DeepCopy
		this.carrier = PORTABLE.carrier();
		this.carrier.thingsIndex++; //so the next created Portable will be inserted at index+1 of things
		
	}
	
	public String name() {return this.name;} 
	
	public double price() {return this.price;}
	
	public void setPrice(final double PRICE) {this.price = PRICE;}
	
	public abstract double weight();
	
	public Entity carrier() {return this.carrier;}
	
	public void setCarrier(final Entity ENTITY) {this.carrier = ENTITY;}
	
	public Entity owner() {return this.owner;}
	
	public void setOwner(final Entity OWNER) {this.owner = OWNER;}
	
	public void setValueDropRate(final double VALUEDROPRATE) {this.valueDropRate = VALUEDROPRATE;}
	

	
}
