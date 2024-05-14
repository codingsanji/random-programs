package Java;

public class LinkyListLength {
	public static class ListNode{
		int data;
		ListNode next;
		
		ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public ListNode head;
	
	public void lengthCheck() {
		int count=0;
		ListNode current= head; 
		while (current!=null) {
			count+=1;
			current=current.next;
		}
		System.out.println("We have "+ count + " nodes.");
	}
	
	public static void main(String[] args) {
		int count=0;
		LinkyListLength linky=new LinkyListLength();
		linky.head =new ListNode(10);
		ListNode second= new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth= new ListNode(40);
		
		//connect the nodes
		linky.head.next=second;
		second.next=third;
		third.next=fourth;
		
		linky.lengthCheck();
	}
}
