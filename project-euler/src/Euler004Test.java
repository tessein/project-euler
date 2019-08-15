import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author tesse
 *
 */
class Euler004Test {

	@Test
	void testTruePalindromLong() {
		assertTrue(Euler004.isNumericPalindrome(906609));
	}
	
	@Test
	void testFalsePalindrome() {
		assertFalse(Euler004.isNumericPalindrome(906009));
	}

	@Test
	void testTruePalindromeOne() {
		assertTrue(Euler004.isNumericPalindrome(1));
	}
}
