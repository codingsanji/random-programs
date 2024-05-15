package Java;
import java.util.*;

public class EndStartArrList {
	public static void main(String[] args) {
		ArrayList<String> arrlinsty = new ArrayList<String>();
		
		//Ask user to input values
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many values do you want to add? : ");
		int rollno = scanner.nextInt();
		
		scanner.nextLine();
		
		for (int i=0 ; i<rollno ; i++) {
			System.out.print("Value " + i + " : ");
			String val = scanner.nextLine();
			arrlinsty.add(i , val);
		}
		
		
		//Printing the ArrayList
		System.out.println("Here are your elements:");
		for (int i=0 ; i<arrlinsty.size() ; i++) {
			System.out.print(arrlinsty.get(i) + " ");
		}
		System.out.println();
		
		//Take and check things
		System.out.println("Which value do you want to play with? :");
		String play=scanner.nextLine();
		
		int playtake= arrlinsty.indexOf(play);
		
		System.out.println("Does it start with ___? (enter what you want to fill in that question's dash) : " );
		char letter1= scanner.nextLine().charAt(0);
		System.out.println(arrlinsty.get(playtake).startsWith(String.valueOf(letter1)));
		
		System.out.println("Does it end with ___? (enter what you want to fill in that question's dash) : " );
		char letter2= scanner.nextLine().charAt(0);
		System.out.println(arrlinsty.get(playtake).endsWith(String.valueOf(letter2)));
	}
}
