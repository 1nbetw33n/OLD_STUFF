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

public abstract class Entity {
	
	protected String name;
	protected int age;
	protected Portable thing;
	protected Wallet purse;
	protected Item[] property;
	protected int propertyIndex;
	protected int thingsIndex;
	protected double stamina;
	protected double maxStamina;
	
	public Entity(final String NAME, final int AGE) {
		this.name = NAME;
		this.age = AGE;
		this.purse = new Wallet();
		this.property = new Item[10];
	}
	
	public abstract boolean alive();
	
	public abstract String greeting() throws EnigmaticException;
	
	public abstract void take(final Portable PORTABLE) throws PortableItemException;
		
	public void purchase(final Item ITEM) throws EntityException {
		if (this.purse.balance - ITEM.price < 0.0000001) {
			throw new EntityException("You don't have enough money to do that. :(");
		}else if (this.propertyIndex > 9) {
			throw new EntityException("You don't have enough free space to purchase another item."
					+ "Please sell on of the items in your property first and then try again. :)");
		} else {
			this.purse.balance -= ITEM.getPrice();
			ITEM.owner.purse.balance += ITEM.getPrice();
			ITEM.owner.property[ITEM.owner.propertyIndex = ITEM.owner.propertyIndex > 0 ? --ITEM.owner.propertyIndex : ITEM.owner.propertyIndex] = null;
			this.property[this.propertyIndex++] = ITEM;
			ITEM.price *= (1 + ITEM.valueDropRate);
			ITEM.owner = this;
		}
	}
	
	public Portable carrying() {return this.thing;}
	
	public void ride(final Rideable RIDEABLE, final double DURATION) throws EntityException{
		if (RIDEABLE.stamina() < 10 * DURATION) {
			throw new EntityException("You can't ride thise mount. Let it recover first. :)");
		}else {
			RIDEABLE.setStamina(RIDEABLE.stamina() - 10 * DURATION) ;
		}
	}
	
	public void showProperty() throws EntityException{
		if (property == null) {
			throw new EntityException("There is no property to show");
		}else {
			String output = "";
			for (int index = 0; index < this.property.length; index++) {
				output = this.property[index] != null ? this.property[index].getName() + "\n" : "";
			}
			System.err.println(output);
		}
	}
	
	public String getName() {return this.name;}
	
	public int getAge() {return this.age;}

}
