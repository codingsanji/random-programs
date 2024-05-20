package Java;
import java.util.*;

public class MergeSort {
	//Repeatedly divides the data in half, sorts each half, and combines the sorted halves into a sorted whole.
	public static void merge(int[] arr , int[] left , int[] right) {
		int leftIndex = 0; // Index to track left array elements
		  int rightIndex = 0; // Index to track right array elements

		  // Loop through the result array
		  for (int i = 0; i < arr.length; i++) {
		    // Check if elements from left are exhausted
		    if (leftIndex >= left.length) {
		      // Take remaining elements from right
		      arr[i] = right[rightIndex];
		      rightIndex++;
		    } else if (rightIndex >= right.length) {
		      // Take remaining elements from left
		      arr[i] = left[leftIndex];
		      leftIndex++;
		    } else if (left[leftIndex] <= right[rightIndex]) {
		      // Take smaller element from left
		      arr[i] = left[leftIndex];
		      leftIndex++;
		    } else {
		      // Take smaller element from right
		      arr[i] = right[rightIndex];
		      rightIndex++;
			}
		}
	}
	
	public static String mergeFarm(int[] arr) {
		if (arr.length >=2) {
			int mid=arr.length/2;
			int[] left = Arrays.copyOfRange(arr , 0 , mid);
			int[] right= Arrays.copyOfRange(arr , mid , arr.length);
			
			mergeFarm(left);
			mergeFarm(right);
			
			merge(arr , left , right);
		}
		String answer = Arrays.toString(arr);
		return answer;
	}
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many values does your array have: ");
		int count=scanner.nextInt();
		scanner.nextLine();
		int[] myarray = new int[count];
		
		for (int i=0 ; i<count ; i++) {
			System.out.println("Value "+ (i+1) + ":");
			myarray[i]=scanner.nextInt();
		}
		
			
		System.out.println();
		System.out.print("These are your values as you inputted it: ");
		String yours=Arrays.toString(myarray);
		System.out.print(yours);
		System.out.println();
		
		System.out.print("This is your sorted array using Bogo Sort: ");
		String answer= mergeFarm(myarray);
		System.out.print(answer);
		
		scanner.close();
	}
}
