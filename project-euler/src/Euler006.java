import java.util.stream.IntStream;

public class Euler006 {
	public static void main(String[] args) {
//		long startTime = System.nanoTime();
//		int sumsquares = 0;
//		int squaresum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sumsquares += i * i;
//			squaresum += i;
//		}
//		int answer = (squaresum * squaresum) - sumsquares;
//		System.out.println("Euler006 = " + answer + " - finished in "
//		    + (System.nanoTime() - startTime) + " nanos");
//		startTime = System.nanoTime();
//		System.out.println(sumOfSquaresIntStream() + " : " + (System.nanoTime() - startTime));
//		
//		startTime = System.nanoTime();
//		System.out.println(squareSumIntStream() + " : " + (System.nanoTime() - startTime));
		
		long startTime = System.nanoTime();
		System.out.println( "Euler006 = " + 
				(squareSumIntStream() - sumOfSquaresIntStream()) + " - finished in "
			    + (System.nanoTime() - startTime) + " nanos");
	}
	
	/**
	 * Calculate sum of squares
	 * @return
	 */
	public static long sumOfSquaresIntStream() {
		long sumOfSquares = IntStream.rangeClosed(1, 100).map(i -> i * i).sum();
		return sumOfSquares;	
	}
	
	/**
	 * calculate square of xums
	 * @return
	 */
	public static long squareSumIntStream() {
		long squaresum = IntStream.rangeClosed(1,  100).map(i -> i).sum();	
		return squaresum * squaresum;	
	}
	
	
}
