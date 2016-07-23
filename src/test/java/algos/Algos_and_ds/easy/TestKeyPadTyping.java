package algos.Algos_and_ds.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestKeyPadTyping {

	@Test
	public void test() {
		assertEquals(null, KeyPadTyping.getNumberForm(null));
		assertEquals("4335736743357", KeyPadTyping.getNumberForm("geeksforgeeks"));
		assertEquals("433577849", KeyPadTyping.getNumberForm("geeksquiz"));
	}

}
