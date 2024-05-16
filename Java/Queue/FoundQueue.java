package Java;
import java.util.*;

public class FoundQueue {
	public static void main(String[] args) {
		Queue<String> countries = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		
		//enter values into your queue
		System.out.print("How many countries are there in your queue?: ");
		int number=scanner.nextInt();
		scanner.nextLine();
		
		for (int i=0 ; i<number ; i++) {
			System.out.print("Country "+ (i+1) + ":");
			String place =scanner.nextLine();
			countries.offer(place.toLowerCase());
		}
		
		//printing the queue
		System.out.print("The following countries are in our queue:");
		System.out.println(countries);
		
		//check if the country is there in the queue
		System.out.print("Is _____ country there in the queue? (provide value for the dash): ");
		String checkcount=scanner.nextLine();
		System.out.print(countries.contains(checkcount.toLowerCase()));
	}
}
