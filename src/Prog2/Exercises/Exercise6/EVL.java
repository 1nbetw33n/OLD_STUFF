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

package Prog2.Exercises.Exercise6;

/**
 * @author Bella Abshagen, 
 * 		   Aug 26, 2020
 *
 */
public final class EVL<T> {
	
	private final class Item{
		
		T element;
		Item next;
		
		private Item(final T T){
			this.element = T;
			this.next = null;
		}
		
	}
	
	private Item first = null;
	
	public final void append(final T T) {
		
	}
	
	public final T get(int POSITION) {
		Item tmp = first;
		while((tmp != null) && (POSITION-- > 0)) {
			tmp = tmp.next;
		}
		if (tmp != null ) {
			return tmp.element;
		}else {
			return null;
		}
	}
	
	public static final <E> EVL<? super Pair<E>> pairList(final EVL<E> LIST1, final EVL<E> LIST2){
		EVL<? super Pair<E>> concatList = new EVL<>();
		E item1 = LIST1.get(0);
		E item2 = LIST2.get(0);
		
		for (int index = 0; (item1 != null) && (item2 != null); index++) {
			item1 = LIST1.get(index);
			item2 = LIST2.get(index);
			concatList.append(new Pair<E>(item1, item2));
		}
		return concatList;
	}
	

}
