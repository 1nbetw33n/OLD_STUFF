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

package Prog2.Exercises.AufgabenSammlung.Iterations;

import java.util.NoSuchElementException;

/**
 * @author Bella Abshagen, 
 * 		   Oct 5, 2020
 *
 */
public final class IteratorFuerArray2<T> implements java.util.Iterator<T> {

	private int indexZ,
				indexS;
	private int zStart,
				sStart;
	
	private T[][] elements;
	
	private boolean zeilenweise;
	private boolean vorwaerts;
	
	private boolean hasNext;
	
	public IteratorFuerArray2(final T[][] ELEMENTS) {
		this.elements = ELEMENTS;
		this.zeilenweise = true;
		this.vorwaerts = true;
		this.zStart = 0;
		this.sStart = 0;
		this.indexZ = this.zStart;
		this.indexS = this.sStart;
	}
	
	public IteratorFuerArray2(final T[][] ELEMENTS, final boolean ZEILENWEISE) {
		this.elements = ELEMENTS;
		this.zeilenweise = ZEILENWEISE;
		this.vorwaerts = true;
		this.zStart = 0;
		this.sStart = 0;
		this.indexZ = this.zStart;
		this.indexS = this.sStart;
	}
	
	public IteratorFuerArray2(final T[][] ELEMENTS, final boolean ZEILENWEISE, final boolean VORWAERTS) {
		this.elements = ELEMENTS;
		this.zeilenweise = ZEILENWEISE;
		this.vorwaerts = VORWAERTS;
		this.zStart = 0;
		this.sStart = 0;
		this.indexZ = this.zStart;
		this.indexS = this.sStart;
	}
	
	public IteratorFuerArray2(final T[][] ELEMENTS, final boolean ZEILENWEISE, final boolean VORWAERTS, final int ZSTART, final int ESTART) {
		this.elements = ELEMENTS;
		this.zeilenweise = ZEILENWEISE;
		this.vorwaerts = VORWAERTS;
		this.zStart = ZSTART;
		this.sStart = ESTART;
		this.indexZ = this.zStart;
		this.indexS = this.sStart;
	}
	
	
	@Override
	public boolean hasNext() {return this.indexZ < this.elements[0].length && this.indexS < this.elements.length;}
	
	@Override
	public T next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		} else {
			//case 1:
			if(istZeilenweise() && istVorwaerts()){
				while(this.indexZ < this.elements[0].length) {
				
					return this.elements[this.indexS][this.indexZ++];
				}
				
				return this.elements[this.indexS++][this.indexZ];
			//case 2:
			} else if(!istZeilenweise() && istVorwaerts()) {
				while(this.indexS < this.elements.length) {
					return this.elements[this.indexS++][this.indexZ];
				}
				return this.elements[this.indexS][this.indexZ++];
			//case 3:	
			}else if(istZeilenweise() && !istVorwaerts()){
				while(this.indexZ < this.elements[0].length) {
					return this.elements[this.indexS][this.indexZ--];
				}
				return this.elements[this.indexS--][this.indexZ];
			//case 4:
			}else {
				while(this.indexS < this.elements.length) {
					return this.elements[this.indexS--][this.indexZ];
				}
				return this.elements[this.indexS][this.indexZ--];
			}
		}
	}

	
	private boolean istZeilenweise() {return this.zeilenweise;}
	
	private boolean istVorwaerts() {return this.vorwaerts;}
	
	
	
	public static void main(String[] args) {
		
		final Integer[][] A = {
							   {1, 2, 3},
							   {4, 5, 6},
							   {7, 8, 9}
										};
		final IteratorFuerArray2<Integer> iterator1 = new IteratorFuerArray2<Integer>(A);
		
		
		while(iterator1.hasNext())
	    {
	       Integer integer = iterator1.next();

	        System.out.print(integer);
	       
	    }
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
