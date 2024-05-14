package Java;
import java.util.*;

public class DELarrayList {
	public static void main(String[] args) {
		//create a random array list
		ArrayList<String> names = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		//Add method 1 -- add (value);
		names.add("Stiles");
		names.add("Kira");
		names.add("Pram");
		names.add("Zeme");
		
		//Printing our Array List
		for (int i=0 ; i<names.size() ; i++) {
			System.out.print(names.get(i)+ " ");
		}
		System.out.println();
		
		//Remove element
		System.out.println("Which name do you want to remove? : ");
		String takename=scanner.nextLine();
		names.remove(takename);
		//Printing our Array List
		System.out.println("Here is the updated arraylist : ");
		for (int i=0 ; i<names.size() ; i++) {
			System.out.print(names.get(i)+ " ");
		}
		System.out.println();
		
		//Replace element
		System.out.println("What is the index of the name you want to replace : ");
		int indexname=scanner.nextInt();
		scanner.nextLine();
		System.out.println("What name do you want to replace it with : ");
		String changename=scanner.nextLine();
		names.set(indexname , changename);
		//Printing our Array List
		System.out.println("Here is the updated arraylist : ");
		for (int i=0 ; i<names.size() ; i++) {
			System.out.print(names.get(i)+ " ");
		}
	}	
}
