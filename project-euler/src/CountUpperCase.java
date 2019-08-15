
public class CountUpperCase {
	String inputString; // get user input

	static String outputString = "AAdddddddddddAAaaaaaaAAAAAAAAAAAAAAAAA";

	public static void main(String args[]) {
		long tally = 0;
		tally = outputString
        .chars() // get all chars from the argument
        .filter(charToBeChecked -> Character.isUpperCase(charToBeChecked)) // filter only the uppercase
        .count(); // count the uppercase

		System.out.println(tally);
		System.out.println(countUpperCase(outputString));
		
		tally = 0;
		tally = outputString
        .chars() // get all chars from the argument
        .filter(charToBeChecked -> Character.isLowerCase(charToBeChecked)) // filter only the uppercase
        .count(); // count the lowercase
		System.out.println(tally);
		System.out.println(countLowerCase(outputString));
	}
	
	private static long countUpperCase(String inputString) {
	    return inputString.codePoints().filter(charToBeChecked-> charToBeChecked>='A' && charToBeChecked<='Z').count();
	}

	private static long countLowerCase(String inputString) {
	    return inputString.codePoints().filter(charToBeChecked-> charToBeChecked>='a' && charToBeChecked<='z').count();
	}
}
