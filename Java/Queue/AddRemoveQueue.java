package Java;
import java.util.*;

public class AddRemoveQueue {
	public static void main(String[] args) {
	//queue is an interface (like a template) and we can't create and instance of it
	//therefore to implement a queue we need a class that implements it like a linked list and a priority list
	//here we are using linked list
	Queue<String> queue = new LinkedList<String>();
	
	//enqueue (adding into queue)
	queue.offer("Sana");
	queue.offer("Chad");
	queue.offer("Steven");
	queue.offer("Lana");
	
	//printing queue
	System.out.print("This is our queue: ");
	System.out.println(queue);
	
	// To find the top most element in queue , here , the first element (FIFO)
	System.out.print("The top most element in the queue is: ");
	System.out.println(queue.peek());
	
	//To find size of the queue
	System.out.print("This is the size of the queue: ");
	System.out.println(queue.size());
	
	//dequeue (removing from queue)
	queue.poll();
	queue.poll();
	queue.poll();
	queue.poll();
	
	//Is our queue empty?
	System.out.print("Is our queue empty? (after all the removing): ");
	System.out.println(queue.isEmpty());
	}
}
