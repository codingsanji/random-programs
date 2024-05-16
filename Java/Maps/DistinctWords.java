package Java;
import java.util.*;

public class DistinctWords {
	public static void main(String[] args) {
		//asking user to input sentence
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your sentence: ");
		String sentence = scanner.nextLine();
		
		//make set to collect distinct words and map to store word frequency
		Set<String> distinctword=new HashSet<String>();
		Map<String , Integer> frequency = new HashMap<>();
		
		//splitting the words and putting in set
		String word = new String();
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (Character.isWhitespace(letter)) {
                String each = word.toString();
                distinctword.add(each);
                word = new String();
            } else {
                word += letter;
            }
        }
        if (!word.isEmpty()) {
            distinctword.add(word);
        }
	        
		//printing set
        System.out.print("These are the unique words: ");
		System.out.println(distinctword);
		
		//provide the frequency of words
		for (String w : distinctword) {
			int count=0;
			for (int i=0 ; i<sentence.length() ; i++) {
				if(sentence.contains(w)) {
					count++;
					sentence=sentence.replaceFirst(w ,  " ");
				}
			}
			frequency.put(w , count);
		}
		
		//printing the frequency
		System.out.print("These are the unique words and their frequency: ");
		System.out.println(frequency);
		
	}
}
