package Java;
import java.util.*;

public class TenBack {
    public static boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = scanner.nextInt();

        boolean result = nearHundred(num);
        System.out.println(result);

        scanner.close();
    }
}
