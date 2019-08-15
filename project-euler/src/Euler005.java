/**
 * 
 */

/**
 * @author tesse
 *
 */
public class Euler005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		final int alimit = 20;
		for (long i = alimit; i <= Long.MAX_VALUE; i += alimit) {
			boolean done = true;
			for (int j = alimit; j >= 2; j--)
				if (i % j != 0) {
					done = false;
					break;
				}
			if (done) {
				System.out.println("Euler005 = " + i + " - runtime = "
				    + (System.currentTimeMillis() - startTime) + " millis");
				break;
			}
		}
	}
}
