import java.util.Arrays;

public class Euler007 {
	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		final int upperBound = 200000;
		// assume everything is prime
		boolean[] primeCandidates = new boolean[upperBound + 1];
		Arrays.fill(primeCandidates, Boolean.TRUE);
		// identify non-primes using Sieve of Eratosthenes
		for (int i = 2; i * i <= upperBound; i++)
			if (primeCandidates[i])
				for (int j = i; i * j <= upperBound; j++)
					primeCandidates[i * j] = false;
		// count up to find the 10001th prime
		int nthPrime = 0;
		for (int i = 0; i <= upperBound; i++) {
			if (primeCandidates[i]) {
				nthPrime++;
				if (nthPrime == 10001) {
					long endTime = System.nanoTime();
					System.out.println("Euler007 = " + i + " - runtime of "
					    + (endTime - startTime) + " nanos");
					break;
				}
			}
		}
	}
}
