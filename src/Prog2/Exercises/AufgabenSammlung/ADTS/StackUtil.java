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

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Bella Abshagen, 
 * 		   Oct 6, 2020
 *
 */


public final class StackUtil {
	
	public static final <T> void revert(Stack<T> STACK) {
		if (STACK.empty()) {
			throw new java.util.NoSuchElementException();
		}
		else {
			Stack<T> tmp1 = new Stack<>();
			Stack<T> tmp2 = new Stack<>();
			while(!STACK.empty()) {
				tmp1.push(STACK.pop());
			}
			while(!tmp1.isEmpty()) {
				tmp2.add((tmp1.pop()));
			}
			while(!tmp2.empty()) {
				STACK.add(tmp2.pop());
			}
		}
	}
	
	public static final <T> void append(final Stack<? super T> ZIEL, final Stack<T> QUELLE) {
		if (QUELLE.empty()) {
			throw new java.util.NoSuchElementException();
		}else {
			Stack tmp = new Stack<>();
			while(!QUELLE.isEmpty()) {
				tmp.add(QUELLE.pop());
			}
			while(!tmp.empty()) {
				ZIEL.push((T) tmp.peek());
				QUELLE.push((T) tmp.pop());
			}
		}
	}
	
	
		
	public static void main(String[] args) {
		Stack<Double> stack1 = new Stack<>();
		Stack<Double> stack2 = new Stack<>();
		stack1.add(1.);
		stack1.add(2.);
		stack1.add(3.);
		stack1.add(4.);
		StackUtil.revert(stack1);
		System.err.println(stack1.toString());
		
		StackUtil.append(stack2, stack1);
		System.err.println(stack2.toString());
	
	
	
	
	
	
	
}
	
	
	

}
