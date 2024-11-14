import java.util.*;

public class largestNum {

    public void max(ArrayList<Double> linky) {
        System.out.println("Here are the values in the array-list: ");
        for (int i = 0; i < linky.size(); i++) {
            System.out.println(linky.get(i) + " ");
        }

        // Linear search for the largest number
        Double max = linky.get(0); 
        for (int i = 1; i < linky.size(); i++) {
            if (linky.get(i) > max) {
                max = linky.get(i);
            }
        }
        
        System.out.println("The largest number is: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> linky = new ArrayList<Double>();

        System.out.print("How many numbers will you input? : ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            Double value = scanner.nextDouble();
            linky.add(value);
        }

        largestNum largestnum = new largestNum();
        largestnum.max(linky); 
        
        scanner.close();
    }
}
