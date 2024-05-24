package Java;
import java.util.*;

public class minparenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the parentheses string: ");
        String input = scanner.nextLine();
        
        int result = minAddToMakeValid(input);
        System.out.println("Min moves required to make the string valid: " + result);
    }
    
    public static int minAddToMakeValid(String s) {
        int opening = 0; 
        int closing = 0; 

        for (char c : s.toCharArray()) {
            if (c == '(') {
                opening++;
            } else if (c == ')') {
                if (opening > 0) {
                    opening--; 
                } else {
                    closing++; 
                }
            }
        }

        return opening + closing; 
    }
}
