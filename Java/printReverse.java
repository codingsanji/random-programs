package Java;

public class printReverse {
	public void printArr(int[] arr) {
		 int n=arr.length;
		 for (int i=0 ; i<n ; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 System.out.println();
	 }
	public void reverseArr(int[] arr , int start , int end) {
		while(start<end) {
			int temp = arr[start];		
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	 System.out.print("Reversed Array: ");
	 printArr(arr);
	}
	public static void main(String[] args) {
	  int[] myArr= {2 , 11 , 5 , 10 , 7 , 8};
	  printReverse run = new printReverse();
	  System.out.print("Original Array: ");
	  run.printArr(myArr);
	  run.reverseArr(myArr , 0 , (myArr.length-1));
  }

}
