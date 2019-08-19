import java.util.stream.IntStream;

public class Euler006 {
	
	
	/**
	 * main method to solve Euler 6
	 * @param args
	 */
	public static void main(String[] args) {
	
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
