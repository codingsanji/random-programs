package Java;
import java.util.*;

public class BogoSort {
	//Orders a list of values by repetitively shuffling them and checking if they are sorted.
	public static String Bogus(int[] arr) {
		while (!isSorted(arr)) {
			shuffle(arr);
		} 
		String result=Arrays.toString(arr) ;
		return result ;
	}
	
	private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndexToSwap = rand.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
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
		String answer= Bogus(myarray);
		System.out.print(answer);
		
		scanner.close();
	}
}
