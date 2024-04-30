package Java;

public class EvenRemove {
	public int[] DeletEve(int[] arr) { 
		int n=arr.length; //Count how many odd numbers are present to know the bounds of new array where the odd numbers will be placed
		int count=0;
		for (int i=0 ; i<n ; i++) {
			if (arr[i]%2!=0) {
				count++;
			}
		}
		int[] newArr=new int[count]; //Making a new array named newArr to carry filtered odd numbers
		int index=0; //needed because we need to also change index of newArr as we add in elements or it will just keep replacing the element in the same index 
		for (int i=0 ; i<n ; i++) {
			if (arr[i]%2!=0) {
				newArr[index]=arr[i];
				index++;
			}
		}
		return newArr; 
	}
	
	public void printArr(int[] arr) {
		int n=arr.length;
		for (int i=0 ; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void ArrMain() {
		int[] myArr = {3, 2, 4, 7, 10, 6, 5};
		int[] newArray= DeletEve(myArr); //making another array to contain the newArr array from DeletEve's operation because it can't access directly
        System.out.print("Array with no even numbers: ");
        printArr(newArray);
		
	}
	
	public static void main(String[] args) {
		EvenRemove run= new EvenRemove(); //give class to run so it can run the whole program
		run.ArrMain();
	}
}
