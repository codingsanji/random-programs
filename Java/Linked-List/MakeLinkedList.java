package Java;
import java.util.*;

public class MakeLinkedList {
	
	public ListNode head;
	
	public static class ListNode{
		int data; //Data can be any type
		ListNode next;
		
		ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void printing() {
		ListNode current = head;
		while (current!=null) {
			System.out.print(current.data + " -> ");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		MakeLinkedList linky = new MakeLinkedList();
		linky.head=new ListNode(10);
		ListNode second= new ListNode(20);
		ListNode third= new ListNode(30);
		ListNode fourth= new ListNode(40);
		
		//Connecting NODES to create a singly linked list
		linky.head.next=second;  //10->20
		second.next=third;       //10->20->30
		third.next=fourth;       //10->20->30->40->null
		
		linky.printing();
	}
}
