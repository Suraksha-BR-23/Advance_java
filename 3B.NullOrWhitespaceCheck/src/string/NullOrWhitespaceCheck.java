package string;
import java.util.Scanner;




	public class NullOrWhitespaceCheck {

	    // User-defined function to check if a string is null or empty/whitespace
	    public static boolean isNullOrEmpty(String input) {
	        return input == null || input.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        // Check using user-defined function
	        if (isNullOrEmpty(userInput)) {
	            System.out.println("The input is either null or contains only whitespace.");
	        } else {
	            System.out.println("The input is valid: '" + userInput + "'");
	        }

	        scanner.close();
	    }
	}


