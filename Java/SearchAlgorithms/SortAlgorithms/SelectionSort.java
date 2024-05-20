package Java;
import java.util.*;

public class SelectionSort {
	//Orders a list of values by repeatedly putting the smallest or largest unplaced value into its final position.
	//Similar Algorithms:
		//1. Bubble Sort = Make repeated passes, swapping adjacent values
			//it is slower than selection sort (has to do more swaps)
		//2. Insertion Sort =  Shift each element into a sorted sub-array
			//it is faster than selection sort
	public static String selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        return Arrays.toString(arr);
    }
	
	public static void swap(int[] arr , int i , int j) {
		if(i!=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	
	public static void main(String[] args) {
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
		String answer= selectionSort(myarray);
		System.out.print(answer);
		
		scanner.close();
	}
}
