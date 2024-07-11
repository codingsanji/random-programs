package Java;
import java.util.*;

public class ThreE {
    public static int check(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                count++;
            }
        }
        return count;
    }
    
    public static Boolean result(int count) {
    	if (count >= 1 && count <= 3) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scanner.nextLine();
        
        int count = check(word);
        Boolean answer=result(count);
        System.out.println(answer);
        
        scanner.close(); 
    }
}
