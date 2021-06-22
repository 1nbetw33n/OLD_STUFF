package EidP.Exercises.Exercise7.Aufgabe3;

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

import EidP.Exercises.Exercise7.Aufgabe2.IntMengeGet;
import EidP.Exercises.Exercise7.Aufgabe2.MengeGet;
import EidP.Exercises.Exercise7.Aufgabe2.MengeGetException;

import java.io.ByteArrayInputStream;
import java.util.*;

public class Lotto extends IntMengeGet {

	protected static final Scanner keyboard = new Scanner((new ByteArrayInputStream("49 37 43 24 25 1".getBytes()))); 
//	protected static final Scanner keyboard = new Scanner(System.in);
	protected static final Random RANDOM = new Random();
	
	//scans user's tip
	public static final MengeGet<Integer> scanNumbers() throws MengeGetException{
		IntMengeGet tip = new IntMengeGet();
		do {
			Integer input = keyboard.nextInt();
			tip = tip.size() < 1 ? new IntMengeGet(new Integer[] {input}) : tip;
			if (tip.size() > 0) {
				while (tip.contains(input) || input.intValue() > 49 || input.intValue() < 1) {
					input = keyboard.nextInt();
				}
			}
			tip.insert(input);
		} while(tip.size() < 6); {
			return tip;
		  }
	}
	
	//draws 6 pseudo-random Integers out of 49 Integers
	public static final MengeGet<Integer> drawNumbers() throws MengeGetException{
		IntMengeGet draw = new IntMengeGet();
		do {
			Integer random = RANDOM.nextInt(49) + 1;
			draw = draw.size() < 1 ? new IntMengeGet(new Integer[] {random}) : draw;
			if (draw.size() > 0) {
				while (draw.contains(random)) {
					random = RANDOM.nextInt(49) + 1;
				}
			}
			draw.insert(random);
		} while(draw.size() < 6); {
			return draw;
		  }
	}
	
	//sorts the Integers and returning them as sorted IntMengeGet
	public static final MengeGet<Integer> announceNumbers(final MengeGet<Integer> DRAW) throws MengeGetException{
		IntMengeGet announcedNumbers = new IntMengeGet();
		do {
			
			if (announcedNumbers.size() < 1) {
				announcedNumbers = new IntMengeGet(new Integer[] {DRAW.min()});
				DRAW.remove(DRAW.min());
			}
			announcedNumbers.insert(DRAW.min());
			DRAW.remove(DRAW.min());
		} while (announcedNumbers.size() < 6);{
			return announcedNumbers;
		}
	}
	
	//checks how many Integers of the tipped numbers are included in the drawn Numbers
	public static final int checkNumberOfHits(final MengeGet<Integer> TIP, final MengeGet<Integer> ANNOUNCED) throws MengeGetException{
		int counter = 0;
		for (int index = 0; index < ((IntMengeGet) TIP).getElements().length; index++) {
			counter = TIP.contains(((IntMengeGet) ANNOUNCED).getElements()[index]) ? ++counter : counter;
		}
		return counter;
	}
	
	public static void main(String[] args) {
		try {
//		MengeGet<Integer> tip = scanNumbers();
		MengeGet<Integer> tip = (announceNumbers(drawNumbers()));
		MengeGet<Integer> announce = (announceNumbers(drawNumbers()));
		int numberOfHits = (checkNumberOfHits(tip, announce));
		long counter = 0;
		Integer[] winningTip = new Integer[] {0, 0 ,0, 0, 0, 0, 0};;
		
		do {
			++counter;
			tip = (announceNumbers(drawNumbers()));
			announce = (announceNumbers(drawNumbers()));
			numberOfHits = (checkNumberOfHits(tip, announce));
			winningTip[numberOfHits]++;
			System.err.println(numberOfHits + "\t" + counter);
		} while (numberOfHits < 6); {
			String six = "";
			for (int index = 0; index < ((IntMengeGet) tip).getElements().length; index++) {
				six += ((IntMengeGet) tip).getElements()[index] + "\t";
			}
			six += "\n";
			System.err.println(six);
			String winningTIP = "";
			for (int index = 0; index < winningTip.length; index++) {
				winningTIP += index  + "\t" + winningTip[index] + "\n";
			}
			winningTIP += "\n";
			System.err.println(winningTIP);
			
		}
		System.err.println(counter);
//		System.err.println((checkNumberOfHits(tip, announce)));
		}catch (final MengeGetException E) {
			E.printStackTrace();
		}
	}

		
}

