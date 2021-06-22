/* copyright (c) 2019-2022 xx63ll4 Labs
 * St. Augustin, North Rhine Westphalia, 53757 F.R.G.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of 
 * xx63ll4 Labs ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * xx63ll4 Labs.
 */

package Prog2.Exercises.Exercise2.Generics;

/**
 * @author Bella Abshagen, 
 * 		   Aug 19, 2020
 *
 */
public final class IceCream<T> extends Dish<T> {
	
	private String flavour;
	
	public IceCream() {
		super("Vanilla", 1);
		this.flavour = "vanilla";
	}
	
	public IceCream(final int PRICE, final String FLAVOUR) {
		super("Common Icecream", PRICE);
		this.flavour = FLAVOUR;
	}
	
	/*
	 * constructor that creates deep copies
	 */
	public IceCream(final IceCream ICECREAM) {
		super(ICECREAM);
		this.flavour = ICECREAM.getFlavour();
	}
	
	public final String getFlavour() {return this.flavour;}
	
	public final void setFlavour(final String FLAVOUR) {this.flavour = FLAVOUR;}
	
	public final String toString() {return this.getName() + "\t" + this.getFlavour() + "\t" + this.getPrice() + "€\n";}

}
