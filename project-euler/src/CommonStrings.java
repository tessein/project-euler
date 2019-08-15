
public class CommonStrings {

	final static String inputString1 = "ABCDEFGHIJKLMNOP";
	final static String inputString2 = "MBCDRQWCTJKL";
	static String resultString = "";
	
	
	public static void main (String args[]) {
		compare1();
		compare2();
	}
	
	public static void compare1() {
		for (int i = 0; i < inputString1.length(); i++) {
			for (int j = 0; j < inputString2.length(); j++) {
				if (inputString1.charAt(i) == inputString2.charAt(j)) {
					if (resultString.indexOf(inputString1.charAt(i)) < 0)
						resultString += inputString1.charAt(i);
				}
			}
		}
		System.out.println(resultString);
	}
	
	public static void compare2() {
	    inputString1.chars()
        .distinct()
        .mapToObj(ch -> String.valueOf((char) ch))
        .filter(inputString2::contains)
        .forEach(System.out::print);
	    //.forEach(System.out::println);
	}
			
}
