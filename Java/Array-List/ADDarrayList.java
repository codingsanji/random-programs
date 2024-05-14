package Java;
import java.util.*;

public class ADDarrayList {
	public static void main(String[] args) {
		//create a random array list
		ArrayList<String> names = new ArrayList<String>();
		
		//Add method 1 -- add (value);
		names.add("Stiles");
		names.add("Kira");
		names.add("Pram");
		names.add("Zeme");
		
		//Add method 2 -- add (index , value);
		names.add(4 , "A");
		names.add(5 , "B");
		names.add(6 , "C");
		names.add(7 , "D");
		
		//Printing our Array List
		for (int i=0 ; i<names.size() ; i++) {
			System.out.print(names.get(i)+ " ");
		}
		
	}	
}
