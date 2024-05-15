package Java;
import java.util.*;

public class InputandSeachStack {
	public static void main(String[] args) {
		Stack<String> students= new Stack<String>();
		Scanner scanner=new Scanner(System.in);
		
		//user inputs stack elements
		System.out.print("How many student names do you want to put in your stack: ");
		int number=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Be reminded that elements are placed in order of first in is last out.");
		for (int i=0 ; i<number ; i++) {
			System.out.println("student number " + i + ": ");
			String studentnames = scanner.nextLine();
			students.push(studentnames);
		}
		
		//printing the stack
		System.out.println("Stack of students: " + students);
		
		//to find if element is there in the stack and give back its index in the stack 
		System.out.println("What element do you want to search up: ");
		String findname=scanner.nextLine();
		if (students.search(findname) != -1) {
			System.out.println("Index of element: " + students.search(findname));
		}
		else {
			System.out.println("Index of element: Element not found!");
		}
		
		
	}
}
