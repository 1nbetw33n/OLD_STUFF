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

package Prog2.Exercises.AufgabenSammlung.ADTS;

import java.util.Queue;
import java.util.LinkedList;

/**
 * @author Bella Abshagen, 
 * 		   Oct 6, 2020
 *
 */
public final class QueueUtil {

	public static final <T> void revert(Queue<T> QUEUE) {
		if (QUEUE.isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		Queue<T> tmp = new LinkedList<>();
		while(!QUEUE.isEmpty()) {
			tmp.add(QUEUE.poll());
		}
		while(!tmp.isEmpty()) {
			QUEUE.add(((LinkedList<T>) tmp).pollLast());
		}
	}
	
	public static final <T> void append(final Queue<? super T> ZIEL, final Queue<? extends T> QUELLE) {
		if (QUELLE.isEmpty()) {
			throw new java.util.NoSuchElementException();
		}else {
			Queue tmp = QUELLE;
			while(!tmp.isEmpty()) {
				ZIEL.add((T) tmp.poll());
			}
		}
		
	}
	
	public static void main(String[] args) {
		Queue<Double> queue1 = new LinkedList<>();
		Queue<Double>queue2 = new LinkedList<>();
		queue1.add(1.);
		queue1.add(2.);
		queue1.add(3.);
		queue1.add(4.);
		QueueUtil.revert(queue1);
		System.err.println(queue1.toString());
		
		QueueUtil.append(queue2, queue1);
		System.err.println(queue2.toString());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
