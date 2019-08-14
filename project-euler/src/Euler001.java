import java.lang.invoke.MethodHandles;
import java.util.stream.IntStream;

/**
 * 
 */

/**
 * @author tesse
 *
 */
public class Euler001 {

	/**
	 * @param args - no args necessary
	 */
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		System.out.println(formatDisplay(sumTraditional(), startTime));
		startTime = System.nanoTime();
		System.out.println(formatDisplay(sumWithIntStream(), startTime));
	}
	
	/**
	 * sum with traditional loop
	 * @param sum of elements
	 * @return
	 */
	protected static long sumTraditional() {
		int sumOfElements = 0;
		for (int i = 3; i < 1000; i++)
			if (i % 3 == 0 || i % 5 == 0)
				sumOfElements += i;
		return sumOfElements;
	}
	
	/**
	 * sum with java 8 IntStream
	 * @param sum of elements
	 * @return
	 */
	protected static long sumWithIntStream() {

		long sumOfElements = IntStream.range(3, 1000)
				.filter(num -> num % 3 == 0|| num % 5 == 0)
				.sum();
		return sumOfElements;
	}
	
	/**
	 * display sum message
	 * @param sumOfElements
	 * @param startTime
	 * @return string displaying sum and time used in nans
	 */
	private static String formatDisplay(long sumOfElements, long startTime) {
		return MethodHandles.lookup().lookupClass().getName()
				.concat(" = ").concat(Long.toString(sumOfElements))
				.concat(" = ").concat(" finished in ")
				.concat(Long.toString(System.nanoTime() - startTime))
				.concat(" nanos.");
	}

}
