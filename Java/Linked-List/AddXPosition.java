package Java;
import java.util.*;

public class AddXPosition {
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
	
	public void addmid() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("At what digit do you want to place your node? : ");
		int position=scanner.nextInt();
		System.out.println("At what digit do you want to place your node? : ");
		int value=scanner.nextInt();
		ListNode newnode=new ListNode(value);
		
		
		int count=0;
		ListNode current=head;
		while (current!=null) {
			count++;
			if (count==(position-1)) {
				ListNode temp=current.next;
				current.next=newnode;
				newnode.next=temp;
				break;
				
			}
			current=current.next;

		}
	}
	
	public static void main(String[] args) {
		AddXPosition linky= new AddXPosition();
		linky.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);	
		
		//connect
		linky.head.next=second;
		second.next=third;
		third.next=fourth;
		
		linky.addmid();
		linky.printing();
	}
	
}






