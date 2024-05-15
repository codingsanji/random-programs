package Java;
import java.util.*;

public class peekStack {
	public static void main(String[] args) {
		//creating a new stack
		Stack<Integer> mystack = new Stack<Integer>();
				
		//pushing values into the stack (adding into the stack)
		mystack.push(10);
		mystack.push(20);
		mystack.push(30);
		mystack.push(40);
				
		//printing the contents of the stack
		System.out.println(mystack);
		
		//peek -- returns top most element of stack without removing it from the stack 
		System.out.print("Here is the top-most element of the list: ");
		System.out.println(mystack.peek());
		
		//printing the contents of the stack
		System.out.print("Here's our stack (to confirm that element hasn't been removed): ");
		System.out.println(mystack);
	}
}
