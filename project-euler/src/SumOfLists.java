import java.util.List;
import java.util.Arrays;

public class SumOfLists {


	
	public static void main (String args[]) {
		sum1();
		sum2();
	}
	
	public static void sum1() {
		List<Integer> ints1 = Arrays.asList(1, 2, 3);
		List<Integer> ints2 = Arrays.asList(5,6,7,8);

		// get the sum of the elements in the list
		Integer sum = ints1.stream()
				  .reduce(0, (a, b) -> a + b) +
				  ints2.stream()
				  .reduce(0, (a,b) -> a + b);
		System.out.println(sum);
	}
	
	public static void sum2() {
		List<Integer> ints1 = Arrays.asList(1, 2, 3);
		List<Integer> ints2 = Arrays.asList(5,6,7,8);
		int sum = 0;
		for (int i:ints1)
			sum += i;
		for (int i : ints2)
			sum += i;
		System.out.println(sum);
	}
}
