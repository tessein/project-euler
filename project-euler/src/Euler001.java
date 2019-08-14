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
		System.out.println(formatDisplay(sumTraditional(startTime), startTime));
		startTime = System.nanoTime();
		System.out.println(formatDisplay(sumWithIntStream(startTime), startTime));
	}
	
	/**
	 * @param startTime
	 * @return
	 */
	protected static long sumTraditional(long startTime) {
		int sumOfElements = 0;
		for (int i = 3; i < 1000; i++)
			if (i % 3 == 0 || i % 5 == 0)
				sumOfElements += i;
		return sumOfElements;
	}
	
	/**
	 * @param startTime
	 * @return
	 */
	protected static long sumWithIntStream(long startTime) {

		long sumOfElements = IntStream.range(3, 1000)
				.filter(num -> num % 3 == 0|| num % 5 == 0)
				.sum();
		return sumOfElements;
	}
	
	/**
	 * @param sumOfElements
	 * @param startTime
	 * @return
	 */
	private static String formatDisplay(long sumOfElements, long startTime) {
		return Euler001.class.getSimpleName()
				.concat(" = ").concat(Long.toString(sumOfElements))
				.concat(" = ").concat(" finished in ")
				.concat(Long.toString(System.nanoTime() - startTime))
				.concat(" nanos.");
	}

}
