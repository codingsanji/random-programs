package Java;
import java.util.*;

public class SqrtCheck {
	public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the value you want to check if it is a squared value: ");
        int value = scanner.nextInt();
        
        //to check if value is a squared number you must square root it
        double check=Math.sqrt(value);
        
        if (check == (int) check) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        scanner.close();
    }
}


