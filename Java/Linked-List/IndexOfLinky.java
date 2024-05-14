package Java;
import java.util.*;

public class IndexOfLinky {
	public static class ListNode{
		int data;
		ListNode next;
		
		ListNode(int data){ 
			this.data=data;
			this.next=null;
		}
	}
	
	public ListNode head; 
	
	public void printing() {
		ListNode current=head; 
		while (current!=null) {
			System.out.print(current.data + "->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public void find(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("From the given values , what do you want to find the index of?: ");
		int value=scanner.nextInt();
		
		int count=0;
		int check=0;
		ListNode current=head; 
		while (current!=null) {
			count++;
			if (current.data==value) {
				System.out.print("The index of " + value + " is " + count + ".");
				check++;
				break;
			}
			current=current.next;
		}
		if (current==null && check==0) {
			System.out.println("The value you inputted wasn't found.");
		}
	}
	
	public static void main(String[] args) {
		IndexOfLinky linky= new IndexOfLinky();
		linky.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);	
		
		//connect
		linky.head.next=second;
		second.next=third;
		third.next=fourth;
		
		linky.printing();
		linky.find();
		
	}
}
