import java.util.Arrays;
import java.util.List;

public class Main {

	final static String inputString1 = "ABCDEFGHIJKLMNOP";
	final static String inputString2 = "MBCDRQWCTJKLSVHGT";
	final static String UCString = "thisIsCamelCase";
	
    public static void main(String[] args) {
		List<Integer> ints1 = Arrays.asList(1, 2, 3);
		List<Integer> ints2 = Arrays.asList(5,6,7,8);
    	int sum = sumLists(ints1, ints2);
    	
    	String shared = buildUppercase(UCString);
    	
    	int sharedLength = sharedChars(inputString1, inputString2);

    }

	/**
	 * Given two lists of any lengths, return a single integer that is the sum of the values in both lists
	 * For example, list1 being [1, 2, 3] and list2 being [3, 4, 5] would return 18
	 * @param list1
	 * @param list2
	 */
	public static int sumLists(List<Integer> list1, List<Integer> list2) {

		Integer sum = list1.stream()
				  .reduce(0, (a, b) -> a + b) +
				  list2.stream()
				  .reduce(0, (a,b) -> a + b);
		System.out.println(sum);
		return sum;
	
		

	}

	/**
	 * Given two strings, return the number of indices that share the same character
	 * For example, string1 being 'LOREM' and string2 being 'IPSUM' would return 1, string1 being 'Snake' and string2 being 'snowing' would return 1
	 * @param string1
	 * @param string2
	 * @return
	 */
	public static int sharedChars(String string1, String string2) {
		String resultString = "";
		for (int i = 0; i < inputString1.length(); i++) {
			//for (int j = 0; j < inputString2.length(); j++) {
				if (inputString1.charAt(i) == inputString2.charAt(i)) {
					if (resultString.indexOf(inputString1.charAt(i)) < 0)
						resultString += inputString1.charAt(i);
				}
			//}
		}
		System.out.println(resultString.length());
		return resultString.length();
	}

	/**
	 * Given a string, build a new string with only the uppercase characters of that string
	 * For example, the input string 'thisIsCamelCase' would return 'ICC'
	 * @param string
	 * @return
	 */
	public static String buildUppercase(String string) {
		String outputString = "";

		for (int i = 0; i < UCString.length(); i++) {
		    char c = UCString.charAt(i);
		    outputString += Character.isUpperCase(c) ? c : ""; 
		}
		System.out.println(outputString);
		return outputString;
	}
}

