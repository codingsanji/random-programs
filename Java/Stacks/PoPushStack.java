package Java;
import java.util.*;

public class PoPushStack {
	//COMPLEXITY : O(1)
	public static void main(String[] args) {
		
		//creating a new stack
		Stack<Integer> mystack = new Stack<Integer>();
		
		//pushing values into the stack (adding into the stack)
		mystack.push(10);
		mystack.push(20);
		mystack.push(30);
		mystack.push(40);
		mystack.push(69);
		mystack.push(96);
		
		//printing the contents of the stack
		System.out.println(mystack);
		
		//check if stack is empty
		System.out.print("Is our stack empty?: ");
		System.out.println(mystack.isEmpty());
		
		//popping values from the stack (remove something from the stack)
		System.out.print("Let's remove the last 2 elements and print the stack: ");
		mystack.pop();
		mystack.pop();
		System.out.println(mystack);
		
		System.out.print("Let's see what the 3rd last element is before popping: ");
		int thirdlast=mystack.pop();
		System.out.println(thirdlast);
		System.out.println("Now we have left: ");
		System.out.print(mystack);
	}

}
