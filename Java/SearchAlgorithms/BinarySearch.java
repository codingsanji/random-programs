package Java;
import java.util.*;

public class BinarySearch {
	public static int binarySearch(int[] arr , int target) {
		int min=0;
		int max=arr.length-1;
		while (min<=max) {
			int mid =(min+max)/2;
			if (arr[mid]>target) {
				max=mid-1;
			} else if(arr[mid]<target) {
				min=mid+1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//user inputs their array
		System.out.print("How many values does your array have: ");
		int count=scanner.nextInt();
		scanner.nextLine();
		int[] yourarr = new int[count];
		for (int i=0 ; i<count ; i++) {
			System.out.print("Value "+ (i+1) + ": ");
			int value=scanner.nextInt();
			yourarr[i]=value;
		}
		scanner.nextLine();
		
		//gets the target value
		System.out.print("Your target value: ");
		int target=scanner.nextInt();
		
		Arrays.sort(yourarr);
		System.out.print("Here is your sorted array: ");
		System.out.println(Arrays.toString(yourarr));
		int index=binarySearch(yourarr , target);
		if (index!=-1) {
			System.out.println("The index of "+ target + " is hence "+ index + ".");
		} else {
			System.out.println("Your target isn't there in your inputted array.");
		}
		
		scanner.close();
	}
}
