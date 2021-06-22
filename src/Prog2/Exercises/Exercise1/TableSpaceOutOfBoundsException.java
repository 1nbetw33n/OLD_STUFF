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

package Prog2.Exercises.Exercise1;

/**
 * @author Bella Abshagen
 *
 */

/*
 * specialization of Exception class without additional features
 */
public final class TableSpaceOutOfBoundsException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TableSpaceOutOfBoundsException() {super("TableSpaceOutOfBoundsException");}
	
	public TableSpaceOutOfBoundsException(final String MESSAGE) {super(MESSAGE);}

}
