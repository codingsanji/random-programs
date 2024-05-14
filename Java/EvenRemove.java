package Java;
import java.util.Arrays;

public class EvenRemove{
	public int[] RemovEven(int[] arr) {
		int n=arr.length;
		int count=0; //Count how many odd numbers are present to know the bounds of new array where the odd numbers 
		for (int i=0 ; i<n ; i++) {
			if (arr[i]%2!=0) {
				count++;
			}
		}
		int[] newArr= new int[count]; //Making a new array named newArr to carry filtered odd numbers
		int index=0; //needed because we need to also change index of newArr as we add in elements or it will just keep replacing the element in the same index 
		for (int i=0 ; i<n ; i++) {
			if (arr[i]%2!=0) {
				newArr[index]=arr[i];
				index++;
			}
		}
		return newArr;
	}
	
	public void PrintArr(int[] arr) {
		int n=arr.length;
		for (int i=0 ; i<n ; i++) {
			System.out.print(arr[i]+ " "); 
		}
		System.out.println();
	}
		
	public void DemoArr() {
		int[] myArr= {3, 2, 4, 7, 10, 6, 5};
		int[] newestArr=RemovEven(myArr); //making another array to contain the newArr array from DeletEve's operation because 
		//System.out.println("Old Array: " + Arrays.toString(myArr)); 
			//if you don't use arrays.tostring and directly use myArr then it will print [I@6f539caf
			// [I@6f539caf means that array type is integer (as per first 2 characters)
			// The rest of it is the identifier / hash code of the array
		System.out.print("Old Array: ");
		PrintArr(myArr);
		System.out.print("New Array: ");
		PrintArr(newestArr);
		
		
	}
	
	public static void main(String[] args) {
		EvenRemove run=new EvenRemove();
		run.DemoArr();
	}
}