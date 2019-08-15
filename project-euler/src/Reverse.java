import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reverse {
	public static void main(String[] args) {
		reverse1();
		reverse2();
		reverse3();
	}
	
	protected static void reverse1() {
	    String[] arr = {"earth", "mars", "mercury"};
	    List<String> ll = Arrays.stream(arr).map(s -> new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
	    System.out.println(ll);
	}
	
	protected static void reverse2() {
		String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", 
		        "Jupiter", "Saturn", "Uranus", "Neptune" };
		Arrays.asList(planets).replaceAll(s -> new StringBuilder(s).reverse().toString());
		System.out.println(Arrays.toString(planets));
	}
	
	protected static void reverse3() {
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        read.close();
        
        StringBuilder sb = new StringBuilder(str);
        
        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());
	}
}
