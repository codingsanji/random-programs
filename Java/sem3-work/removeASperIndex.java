package Java;
import java.util.*;


public class removeASperIndex {
    public static String missingChar(String word, int index) {
        String newWord = word.substring(0, index) + word.substring(index + 1);
        return newWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String word = scanner.nextLine();

        System.out.println("Which index do you want to remove the letter of? : ");
        int index = scanner.nextInt();

        String result = missingChar(word, index);
        System.out.println("Resulting word: " + result);

        scanner.close();
    }
}

