package Java;
import java.util.*;

public class AddRemoveSet {
	public static void main(String[] args) {
		
		//set is also an interface like queue therefore 
		//we use hash-set , tree-set and linked-hash-set to implement it 
		Set<String> fruits= new HashSet<String>();
		
		//add values into set
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("tomato");
		fruits.add("apple");   // Duplicate element, will not be added
		
		//printing hash-set
		System.out.print("Here is our set:");
		System.out.println(fruits);
		
		//are guavas found in the set?
		System.out.print("Are guavas present?: ");
		System.out.println(fruits.contains("guavas"));
		
		//remove elements from set
		fruits.remove("tomato");
		
		//printing hash-set
		System.out.print("Here is our updated set:");
		System.out.println(fruits);
	}
}
