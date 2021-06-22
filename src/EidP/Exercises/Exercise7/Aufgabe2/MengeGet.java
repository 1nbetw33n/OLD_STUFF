package EidP.Exercises.Exercise7.Aufgabe2;

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

public interface MengeGet<T> {

	boolean contains(final T OBJECT) throws MengeGetException;
	
	boolean containsTwo(final T OBJECT) throws MengeGetException;
	
	void insert(final T OBJECT) throws MengeGetException;
	
	void remove(final T OBJECT) throws MengeGetException;

	int size() throws MengeGetException;
	
	T get() throws MengeGetException;
	
	MengeGet<T> clone();
	
	void copyCatKiller() throws MengeGetException;
	
	void normalize() throws MengeGetException;

	T min();
	
	
	
}
