package String;
import java.util.Scanner;


	public class CapitalizeWordsDemo {

	    // User-defined function to capitalize first letter of each word
	    public static String capitalizeWords(String input) {
	        if (input == null || input.isEmpty()) {
	            return input;
	        }

	        String[] words = input.split("\\s+");  // Split on whitespace
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                // Capitalize first letter and append the rest in lowercase
	                capitalized.append(Character.toUpperCase(word.charAt(0)));
	                if (word.length() > 1) {
	                    capitalized.append(word.substring(1).toLowerCase());
	                }
	                capitalized.append(" ");
	            }
	        }

	        return capitalized.toString().trim();  // Remove trailing space
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String original = scanner.nextLine();

	        // Capitalize words
	        String result = capitalizeWords(original);

	        System.out.println("Capitalized: " + result);

	        scanner.close();
	    }
	}


