import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Euler001Test {

	@Test
	void testMethodEquality() {
		assertEquals(Euler001.sumTraditional(), Euler001.sumWithIntStream());

	}
	
	@Test
	void testTraditionalMethodCorrectness() {
		assertEquals(Euler001.sumTraditional(), 233168);
	}
	
	@Test
	void testIntStreamMethodCorrectness() {
		assertEquals(Euler001.sumWithIntStream(), 233168);
	}

}
