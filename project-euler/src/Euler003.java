import java.lang.invoke.MethodHandles;
import java.util.stream.IntStream;

/**
 * 
 */

/**
 * @author tesse
 *
 */
public class Euler003 {

	final static long theTestValue = 600851475143L ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println(formatDisplay(largestPrimeFactor(), startTime));
	}
	
	/**
	 * Calculate largest prime factor of a value
	 * @return
	 */
	protected static long largestPrimeFactor() {
		long value = theTestValue;
		for (long  i = 3; i <= Math.sqrt(value); i += 2) {
			while (value % i == 0)
				value /= i;
		}
		return value;
	}
	
//	protected static long testLPFactor() {
//		long value = theTestValue;
//		long largestPrime = IntStream.range(3, Math.sqrt(value) - 1)
//				.forEach( i -> {
//					if (i % 2 == 0) {
//						while (theTestValue % i == 0)
//							theTestValue /= i;
//					}
//				};
//				
//	}

	/**
	 * format display
	 * @param primeFactor
	 * @param startTime
	 * @return
	 */
	protected static String formatDisplay(long primeFactor, long startTime) {
		return MethodHandles.lookup().lookupClass().getName()
				.concat(" = ").concat(Long.toString(primeFactor))
				.concat(" = ").concat(" finished in ")
				.concat(Long.toString(System.nanoTime() - startTime))
				.concat(" nanos.");
	}
}
