package Java;
import java.util.*;

public class FindMissing {
	//QUESTION: Given an array containing 10 distinct numbers taken from 0, 1, 2, ..., 9...
	//find the one that is missing from the array.
	//Example: Input: [3, 0, 1]; Output: 2 , 4 , 5 , 6 , 7 , 8 , 9
	
	public void printing(ArrayList<Integer> arr ) {
		for (int i=0 ; i<arr.size() ; i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		FindMissing run = new FindMissing();
		
		System.out.print("How many values do you want to input: ");
		int count = scanner.nextInt();
		scanner.nextLine();
		
		ArrayList<Integer> userinput= new ArrayList<Integer>();
		
		for (int i=0 ; i<count ; i++) {
			System.out.print("Value " + (i+1) + ": ");
			int input=scanner.nextInt();
			userinput.add(input);
		}
		
		System.out.print("These are your values: ");
		run.printing(userinput);
		
		ArrayList<Integer> reference=new ArrayList<Integer>();
		reference.add(0); reference.add(1); reference.add(2);
		reference.add(3); reference.add(4); reference.add(5);
		reference.add(6); reference.add(7); reference.add(8);
		reference.add(9); 
		for (int i=0 ; i<userinput.size(); i++) {
			int index = reference.indexOf(userinput.get(i));
			reference.remove(index);
		}
		
		System.out.print("Here are your missing values: ");
		run.printing(reference);
		
		
	}
}
