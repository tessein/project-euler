import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Euler002Test {

//	@Test
//	void testMethodEquality() {
//		assertEquals(Euler001.sumTraditional(System.nanoTime()), Euler001.sumWithIntStream(System.nanoTime()));
//
//	}
	
	@Test
	void testTraditionalMethodCorrectness() {
		assertEquals(Euler002.getFibonacciSum(), 4613732);
	}
	
//	@Test
//	void testIntStreamMethodCorrectness() {
//		assertEquals(Euler001.sumWithIntStream(System.nanoTime()), 233168);
//	}

}
