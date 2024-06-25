package Java;
import java.util.*;

public class TenBack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int num=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Within the range or 100 or 200?");
		int choice= scanner.nextInt();
		scanner.nextLine();
		
		if (choice==100) {
			if(num<90 || num>100) {
				System.out.println("false");
			}
			else {
				System.out.println("true");
			}
		}
		if (choice==200) {
			if(num<190 || num>200) {
				System.out.println("false");
			}
			else {
				System.out.println("true");
			}
		}
		else {
			System.out.println("Invalid range");
		}
	}
}
