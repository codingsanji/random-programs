package Java;
import java.util.*;

public class CLEARarrayList {
	public static void main(String[] args) {
		ArrayList<Integer> linky=new ArrayList<Integer>();
		
		//adding values
		linky.add(1);
		linky.add(2);
		linky.add(3);
		linky.add(4);
		
		//printing it x1
		System.out.println("Here's our arraylist before clearing:");
		for (int i=0 ; i<linky.size() ; i++) {
			System.out.print(linky.get(i) + " ");
		}
		System.out.println();
		
		//clearing it
		linky.clear();
		
		//printing it x2
		System.out.println("Here's our arraylist after clearing:");
		for (int i=0 ; i<linky.size() ; i++) {
			System.out.print(linky.get(i) + " ");
		}
	}
	
	
}
