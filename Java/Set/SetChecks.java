package Java;
import java.util.*;

public class SetChecks {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		
		//adding values
		numbers.add(10);
		numbers.add(25);
		numbers.add(39);
		numbers.add(42);
		
		//printing hash-set
		System.out.print("Here is our set: ");
		System.out.println(numbers);
		
		//what is the size of set?
		System.out.print("Size of set: ");
		System.out.println(numbers.size());
		
		//clear and checking if set is empty
		System.out.print("Is our set empty after clearing: ");
		numbers.clear();
		System.out.println(numbers.isEmpty());
	}
}
