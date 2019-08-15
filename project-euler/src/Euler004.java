import java.util.TreeSet;

/**
 * 
 */

/**
 * @author tesse
 *
 */
public class Euler004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		final TreeSet<Integer> palindromes = new TreeSet<Integer>();
		for (int i = 900; i <= 999; i++)
			for (int j = 900; j <= 999; j++) {
				int cand = i * j;
				if (isNumericPalindrome(cand))
					palindromes.add(cand);
			}
		System.out.println("Euler004 = " + palindromes.last() + " - finished in "
		    + (System.nanoTime() - startTime) + " nanos");
	}
	
	
	/**
	 * Determine if numeric palindrome
	 * @param candidate
	 * @return true if palindrome, otherwise false
	 */
	protected static boolean isNumericPalindrome(final int candidate) {
		final StringBuilder val = new StringBuilder(String.valueOf(candidate));
		if (val.toString().equals(val.reverse().toString()))
			return true;
		return false;
	}
}
