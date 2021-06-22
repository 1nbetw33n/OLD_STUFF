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

package Prog2.Exercises.Exercise4.Generics;

import Prog2.Exercises.Exercise2.Generics.*;;

/**
 * @author Bella Abshagen, 
 * 		   Aug 18, 2020
 *
 */
public final class GroupOfFourGDishes<T extends Dish> extends GroupOfFourG<T> {
	
	public GroupOfFourGDishes() {super();}
	
	public GroupOfFourGDishes (final T[] DISHES) {
		super(DISHES);
	}

	public final double totalPrice() {
		double totalPrice = 0;
		while(!isEmpty()) {
			try {
				totalPrice += this.removeLast().getPrice();
			}catch(final Exception E) {
				E.printStackTrace();
			}
		}
		return totalPrice;
	}
	
}
