package Java;

public class printArray {
    public void printArray(int [] arr) {
        int n =arr.length;
        for (int i =0 ; i<n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void arrayDemo() {
        int[] myArray=new int[5];
        myArray[1] = 2; 
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        myArray[0] = 1;
        myArray[4] = 9; //UPDATED ELEMENT 4 FROM 5 TO 9
        printArray(myArray);
        System.out.println("Number of elements: " + myArray.length);
        System.out.println("Last Element in Array: " + myArray[myArray.length-1]);
        System.out.println("Last Index in Array: " + (myArray.length-1));
        //int LastIndex = myArray.length-1;
        //System.out.println("Last Index in Array: " + LastIndex);
    }
     public static void main(String[] args) {
    	 printArray Array1 = new printArray();
         Array1.arrayDemo();

    }
}
