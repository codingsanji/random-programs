package Java;
import java.util.*;

public class TwoDArr {
	public static void main(String[] args) {
		int[][] myarr = new int[2][3]; //2 rows and 3 columns
		Scanner scanner=new Scanner(System.in);
		
		//Ask to enter values
		System.out.println("Enter values for array (2x3): ");
		int n=myarr.length;
		for (int i=0 ; i<n; i++ ) { //i is the row count
			int m=myarr[i].length;
			for (int j=0 ; j<m ; j++) {  //j is the column count
				System.out.println("Enter value for ("+ i + "x" + j +"):" );
				myarr[i][j]= scanner.nextInt();
			}
		}
		
		//Printing of the 2D Array
		System.out.println("Here is your 2D array: ");
		for (int i=0 ; i<n ; i++) {
			int m=myarr[i].length;
			for (int j=0 ; j<m ; j++ ) {
				System.out.print(myarr[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
