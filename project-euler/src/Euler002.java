import java.lang.invoke.MethodHandles;


/**
 * @author tesse
 *
 */
public class Euler002 {

	final static int MAX = 4000000;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println(formatDisplay(getFibonacciSum(), startTime));
		//startTime = System.nanoTime();
	}
	
	/**
	 * Get sum of even fibonacci numbers
	 * @param startTime
	 * @return the calculated value
	 */
	protected static long getFibonacciSum() {
		int thisFibNum = 1;
		int followingFibNum = 1;
		long sum = 0;
		while (followingFibNum < MAX) {
			int temp = followingFibNum;
			followingFibNum += thisFibNum;
			thisFibNum = temp;
			if ( thisFibNum % 2 == 0)
				sum += thisFibNum;
		}
		return sum;
	}
	
	/**
	 * format display
	 * @param fibonacciSum
	 * @param startTime
	 * @return the result string
	 */
	protected static String formatDisplay(long fibonacciSum, long startTime) {
		return MethodHandles.lookup().lookupClass().getName()
				.concat(" = ").concat(Long.toString(fibonacciSum))
				.concat(" = ").concat(" finished in ")
				.concat(Long.toString(System.nanoTime() - startTime))
				.concat(" nanos.");
	}
}
