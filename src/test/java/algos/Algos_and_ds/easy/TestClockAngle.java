package algos.Algos_and_ds.easy;

import org.junit.Test;

import junit.framework.TestCase;

public class TestClockAngle extends TestCase {
	
	@Test
	public static void testGetAngle(){
		assertEquals(90, ClockAngle.getAngle(9, 60));
		assertEquals(75, ClockAngle.getAngle(3, 30));
	}
}
