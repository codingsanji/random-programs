package Java;
import java.util.*;

public class AddEndLinky {
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
		AddEndLinky linky= new AddEndLinky();
		linky.head=new ListNode(10);
		ListNode second= new ListNode (20);
		ListNode third= new ListNode(30);
		
		//connect the nodes
		linky.head.next=second;
		second.next=third;
		
		//ask user what they want to add and add to the end
		Scanner scanner=new Scanner(System.in);
		System.out.print("What value do you want to add as your last value? : " );
		int newnode = scanner.nextInt();
		ListNode lastNode = new ListNode(newnode);
		if (head==null) {
			head=lastNode;
			return;
		}
		ListNode current=head;
		while (current.next!=null) {
			current=current.next;	
		}
		current.next=lastNode;
		
		linky.printing();
	}
}
