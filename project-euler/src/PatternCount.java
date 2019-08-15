import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;



public class PatternCount {

	public static void main(String args[]) {
		oldWayInclusive();
		streamsUnique();
	}
	
	public static void oldWayInclusive() {
	    String input = "a3aaa3aaa3a";
	    String regex = "aa";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(input);
	    int from = 0;
	    int count = 0;
	    while(matcher.find(from)) {
	        count++;
	        from = matcher.start() + 1;
	    }
	    System.out.println(count);
	}
	
	public static void streamsUnique() {
	    String input = "a3aaa3aaa3a";
	    String regex = "aa";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(input);
	    System.out.println( Stream.iterate(0, i -> i + 1)
	            .filter(i -> !matcher.find())
	            .findFirst()
	            .get());
	}
}
