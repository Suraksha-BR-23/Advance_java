package String;
import java.util.Scanner;

	public class NumericVerifier {

	    // User-defined function to check if string contains only digits
	    public static boolean isNumeric(String input) {
	        if (input == null || input.isEmpty()) {
	            return false;
	        }

	        // Check each character to be a digit
	        for (int i = 0; i < input.length(); i++) {
	            if (!Character.isDigit(input.charAt(i))) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string to verify if numeric: ");
	        String input = scanner.nextLine();

	        // Check using user-defined function
	        if (isNumeric(input)) {
	            System.out.println("The string contains only numeric characters.");
	        } else {
	            System.out.println("The string contains non-numeric characters.");
	        }

	        scanner.close();
	    }
	}


