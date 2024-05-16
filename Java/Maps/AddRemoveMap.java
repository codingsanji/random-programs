package Java;
import java.util.*;

public class AddRemoveMap {
	public static void main(String[] args) {
		//Format Map<Key , Value>
		Map<String , Integer> students = new HashMap<>();
		
		//to add , we use put
		students.put("Hannah",90);
		students.put("Sana",70);
		students.put("Elliot",70);
		students.put("Rosanne",65);
		students.put("Rohan",69);
		
		//to print
		System.out.print("This is our map: ");
		System.out.println(students);
		
		//to remove 
		students.remove("Rohan");
		
		//to print
		System.out.print("This is our updated map: ");
		System.out.println(students);
		
		//to ONLY get key
		System.out.print("These are our keys: ");
		System.out.println(students.keySet());
		
		//to ONLY get value
		System.out.print("These are our values: ");
		for (String key : students.keySet()) {
			System.out.print(students.get(key) + " " );
		}
		
	}
}
