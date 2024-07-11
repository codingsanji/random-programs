package Java;
import java.util.*;

public class SameLastDigit {
	public static Boolean result(int num1 , int num2) {
		int last1=num1%10;
		int last2=num2%10;
		
		if(last1==last2) {
			return true;
		}
		else {
			return false; 
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int num1=scanner.nextInt();
		System.out.println("Enter number 2: ");
		int num2=scanner.nextInt();
		
		Boolean answer= result( num1 , num2);
		System.out.println(answer);
		
		scanner.close();
	}
}
