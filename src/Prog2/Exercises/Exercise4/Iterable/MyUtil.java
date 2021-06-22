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

package Prog2.Exercises.Exercise4.Iterable;

import Prog2.Exercises.Exercise1.TableSpaceOutOfBoundsException;
import Prog2.Exercises.Exercise2.Generics.*;

/**
 * @author Bella Abshagen, Aug 20, 2020
 *
 */
public final class MyUtil {

	public static final <T extends Dish> String printAll(final GroupIFG<? extends T> GIFG) {
		String output = "\n" + new String();
		for (T t : GIFG) {
			output += t;
		}
		return output;
	}

	public static final <T extends Dish> String printAll(final GroupIFG<? extends T> GIFG1, final GroupIFG<? extends T> GIFG2) {
		String output1 = "\n" + new String();
		String output2 = "\n" + new String();
		for (int index = 0; index < MyUtil.maxSize(GIFG1, GIFG2); index++) {
			try {
				output1 += GIFG1.get(index);
				output2 += GIFG2.get(index);
			} catch (Exception E) {
				E.printStackTrace();
			}
		}
		return output1 + "\n" + output2;
		
	}

	public static final <T extends Dish> void shallowCopy(final GroupIFG<? extends T> SRC, final GroupIFG<? super T> DST) throws TableSpaceOutOfBoundsException {
		if (!DST.isEmpty()) {
			throw new TableSpaceOutOfBoundsException();
		} else {
			for (int index = 0; index < SRC.size(); index++) {
				try {
					DST.append(SRC.get(index));
				} catch (final Exception E) {
					E.printStackTrace();
				}
			}
		}
	}

	
	public static final <T extends Dish> void deepCopy(final GroupIFG<? extends T> SRC, GroupIFG<? super T> DST)throws TableSpaceOutOfBoundsException {
		if (!DST.isEmpty()) {
			throw new TableSpaceOutOfBoundsException();
		} else {
			try {
				DST = (GroupIFG<? super T>) new GroupOfFourG<>(SRC);
			} catch (final Exception E) {
				E.printStackTrace();
			}
		}

	}

	public static final <T extends Dish> int maxSize(final GroupIFG<? extends T> GIFG1, final GroupIFG<? extends T> GIFG2) {
		return GIFG1.size() > GIFG2.size() ? GIFG1.size() : GIFG2.size();
	}

}
