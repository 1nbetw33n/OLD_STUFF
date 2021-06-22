package EidP.Exercises.Exercise8.Aufgabe2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class WayJUnitTest {
	
	@Test
	void testNumberOfWays() {
		assertEquals(3, Way.numberOfWays(0, 0, 1, 2), "numberOfWays not working properly-No.1");
		assertEquals(10, Way.numberOfWays(5, 7, 8, 9), "numberOfWays not working properly-No.2");
		assertEquals(1, Way.numberOfWays(5, 7, 5, 9), "numberOfWays not working properly-No.3");
	}
}
