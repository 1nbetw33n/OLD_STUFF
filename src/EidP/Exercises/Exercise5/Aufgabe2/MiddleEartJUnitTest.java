package EidP.Exercises.Exercise5.Aufgabe2;

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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class MiddleEartJUnitTest {

	private Entity[] ringParty;
	private Sword anduril;
	private Entity frodo;
	private Entity boromir;
	private Entity gimli;
	private Entity gandalf;
	private SuperHeavyObject superHeavyObject;
	private RideableMortal commonHorse;
	private Entity elrond;
	private Enigmatic sauron;
	private Enigmatic eru;
	private Sword commonSword;
	
	@BeforeEach
	void setUp() { ringParty = new Entity[9];
		anduril = new Sword("Andúril, Flame of the West", 9999.);
		frodo = new Hobbit("Frodo", 33);
		boromir = new HumanOfMiddleEarth("Boromir", 41);
		gimli = new Dwarf("Gimli",139); 
		gandalf = new Wizard("Gandalf", 54960);
		superHeavyObject = new SuperHeavyObject();
		commonHorse = new Horse("Horse", 20);
		elrond = new Elve("Elrond", 6518);
//		sauron = new Enigmatic("Sauron", 54960);
//		eru = new Enigmatic("Eru", 54960);
		commonSword = new Sword();
	}

	@AfterEach
	void tearDown() {
		ringParty = null;
		anduril = null;
		anduril = null;
		frodo = null;
		boromir = null;
		gimli = null;
		gandalf = null;
		superHeavyObject = null;
		commonHorse = null;
		elrond = null;
		sauron = null;
		eru = null;
		commonSword = null;
	}

	@Test
	void testItem() {
		try {
			elrond.purse.setBalance(9999.);
			elrond.purchase(anduril);
			
			assertEquals("Andúril, Flame of the West", anduril.getName(), "getName not working");
			assertEquals(9999., anduril.getPrice(),"getPrice not working");
			
			boromir.purse.setBalance(9999.);
			
			boromir.take(anduril);
			
			assertEquals("Elrond", anduril.owner().getName(), "OwnerShip not working- No.1");
			
			boromir.purchase(anduril);
			
			assertEquals("Boromir", anduril.owner().getName(), "OwnerShip resp. purchase(Item) not working");
		}catch (final PortableItemException | EntityException E) {
		E.printStackTrace();
		}
	}
	
	@Test
	void testEntityPurchase() {
		try {
			elrond.purse.setBalance(9999.);
			elrond.purchase(anduril);
			
			assertTrue(0. - boromir.purse.getBalance() < 0.0000001, "purse.getBalance() not working-No.1");
			assertThrows(EntityException.class, () -> boromir.purchase(anduril), "no EntityEcxeption-(not enough money)-No.1?");
			
			boromir.purse.setBalance(9999);
			
			assertTrue(9999. - boromir.purse.getBalance() < 0.0000001, "purse.getBalance() not working-No.1");
			assertEquals(null, boromir.property[0], "property resp. purchase(Item) not working - No.1");
			assertEquals("Andúril, Flame of the West", elrond.property[0].getName(), "property resp. purchase(Item) not working- No.2");
			
			boromir.purchase(anduril);
			
			assertTrue(0. - boromir.purse.getBalance() < 0.0000001, "purse.getBalance() resp. purchase(Item) not working-No.1");
			assertTrue(9999. - elrond.purse.getBalance() < 0.0000001, "financial transaction off purchase(Item) not working-No.1");
			assertEquals("Andúril, Flame of the West", boromir.property[0].getName(), "property resp. purchase(Item) not working - No.3");
			assertEquals(null, elrond.property[0], "property resp. purchase(Item) not working- No.4");
		
			assertEquals("Tom Bombadil", superHeavyObject.owner().getName(), "ownership not working-No.2");
			
			gandalf.purse.setBalance(0.1);
			gandalf.purchase(superHeavyObject);
			
			assertEquals("Gandalf", superHeavyObject.owner().getName(), "ownership not working-No.3");
			
			gandalf.purse.setBalance(9999.);
			gandalf.purchase(anduril);
			
			assertEquals("Gandalf", anduril.owner().getName(), "ownership not working-No.4");
			assertEquals(anduril, gandalf.property[1], "property resp. purchase(Item) not working - No.5");
			
			gandalf.purse.setBalance(50.);
			gandalf.purchase(commonSword);
			
			assertEquals(commonSword, gandalf.property[2], "property resp. purchase(Item) not working - No.6");
			
			frodo.purse.setBalance(9999.);
			frodo.purchase(anduril);
			
			assertTrue(9999. - gandalf.purse.getBalance() < 0.00000001, "property resp. purchase(Item) not working - No.7");
			assertEquals(null, gandalf.property[1].getName(), "property resp. purchase(Item) not working - No.8");
			
			
			
		}catch (final EntityException E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testEntityTakeAndCarrying() {
		try {
			elrond.purse.setBalance(9999.);
			elrond.purchase(anduril);
			
			assertEquals("Tom Bombadil", anduril.carrier.getName(), "carrier() not working-No.1");
			assertThrows(PortableItemException.class, () -> frodo.take(anduril), "no PortableItemExcpetion-(too heavy)?-No.1");
			
			boromir.take(anduril);
			
			assertEquals("Boromir", anduril.carrier.getName(), "carrier() not working-No.2");
			
//			sauron.take(anduril);
//			sauron.take(superHeavyObject);
			
//			assertEquals("Andúril, Flame of the West", sauron.things[0].name(), "take(Portable) not working-No.1");
//			assertEquals("Common super heavy object", sauron.things[1].name(), "take(Portable) not working-No.2");
			
//			eru.take(anduril);
			
//			assertEquals("Andúril, Flame of the West", eru.things[0].name(), "take(Portable) not working-No.3");
//			assertEquals(null, sauron.things[0].name(), "take(Portable) not working-No.4");   stopped debugging, because I wasn't able to fix it yet :(
			
			
		}catch (final EntityException | PortableItemException E) {
			E.printStackTrace();
		}
	}
	
	@Test
	void testEntityRide() {
		try {
			assertTrue(100. - commonHorse.maxStamina < 0.0000001, "maxStamina() for RideableMortals not working-No.1");
			assertTrue(100. - commonHorse.stamina < 0.00000001, "stamina() for RideableMortals not working-No.1");
			
			gandalf.ride(commonHorse, 1.);
			
			assertEquals(90., commonHorse.stamina(), "ride(Rideable, double) not working-No.1");
			
			gimli.ride(commonHorse, 8.5);
			
			assertTrue(5 - commonHorse.stamina() < 0.0000001, "ride(Rideable, double) not working-No.2");
			assertThrows(EntityException.class, () -> gandalf.ride(commonHorse, 1), "no EntityException (not enough stamina)?-No.1");
			
			commonHorse.recover();
			
			assertTrue(55 - commonHorse.stamina() < 0.0000001, "recover() not working-No.1");
			
			commonHorse.recover();
			
			assertTrue(100 - commonHorse.stamina() < 0.0000001, "recover() not working-No.2");
		} catch (final EntityException E) {
			E.printStackTrace();
		}
	}
	



}




































