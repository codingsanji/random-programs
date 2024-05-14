package Java;
import java.util.*;

public class AddBe4Head {
	public static class ListNode{
		int data;
		ListNode next;
		
		ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public static ListNode head;
	
	public void printing() {
		ListNode current=head;
		while (current!=null) {
			System.out.print(current.data + "->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		AddBe4Head linky= new AddBe4Head();
		linky.head=new ListNode(10);
		ListNode second= new ListNode (20);
		ListNode third= new ListNode(30);
		
		//connect the nodes
		linky.head.next=second;
		second.next=third;
		
		//ask user what they want to add and add to the beginning
		Scanner scanner=new Scanner(System.in);
		System.out.print("What value do you want to replace as your first value? : " );
		int newnode = scanner.nextInt();
		ListNode firstNode = new ListNode(newnode);
		firstNode.next=head;
		head=firstNode;
		
		linky.printing();
	}
}

