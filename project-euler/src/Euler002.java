import java.lang.invoke.MethodHandles;

/**
 * 
 */

/**
 * @author tesse
 *
 */
public class Euler002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println(formatDisplay(getFibonacciSum(startTime), startTime));
		startTime = System.nanoTime();
	}
	
	protected static long getFibonacciSum(long startTime) {
		final int MAX = 4000000;
		int firstFibNum = 1;
		int secondFibNum = 1;
		long sum = 0;
		while (secondFibNum < MAX) {
			int temp = secondFibNum;
			secondFibNum += firstFibNum;
			firstFibNum = temp;
			if ( firstFibNum % 2 == 0)
				sum += firstFibNum;
		}
		return sum;
	}
	
	protected static String formatDisplay(long fibonacciSum, long startTime) {
		return MethodHandles.lookup().lookupClass().getName()
				.concat(" = ").concat(Long.toString(fibonacciSum))
				.concat(" = ").concat(" finished in ")
				.concat(Long.toString(System.nanoTime() - startTime))
				.concat(" nanos.");
	}
}
