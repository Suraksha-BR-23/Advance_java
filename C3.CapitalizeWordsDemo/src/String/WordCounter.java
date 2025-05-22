package String;
import java.util.Scanner;


	public class WordCounter {

	    // User-defined function to count words in a string
	    public static int countWords(String input) {
	        if (input == null || input.trim().isEmpty()) {
	            return 0;
	        }

	        // Split the string by whitespace (one or more spaces, tabs, newlines)
	        String[] words = input.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Count words using user-defined function
	        int wordCount = countWords(input);

	        System.out.println("Number of words: " + wordCount);

	        scanner.close();
	    }
	}
	
