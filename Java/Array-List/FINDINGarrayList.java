package Java;
import java.util.*;

public class FINDINGarrayList {
	public static void main(String[] args) {
		ArrayList<Integer> linky = new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		
		//adding to linky
		linky.add(10);
		linky.add(25);
		linky.add(39);
		linky.add(42);
		linky.add(57);
		linky.add(69);
		
		//Printing our Array List
		for (int i=0 ; i<linky.size() ; i++) {
			System.out.print(linky.get(i)+ " ");
		}
		System.out.println();
		
		//find index
		System.out.print("Which element do you want to know the index of? : ");
		int searchval=scanner.nextInt();
		System.out.println(linky.indexOf(searchval));
		
		//get using index
		System.out.print("Which index's element do you want to retrieve : ");
		int retrieval=scanner.nextInt();
		System.out.print(linky.get(retrieval));
	}
}
