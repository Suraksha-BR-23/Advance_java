package String;
import java.util.Scanner;

	public class StringTruncator {

	    // User-defined function to truncate string to specified length with ellipsis
	    public static String truncate(String input, int maxLength) {
	        if (input == null || maxLength <= 0) {
	            return "";
	        }

	        if (input.length() <= maxLength) {
	            return input;
	        }

	        // If maxLength is less than or equal to 3, just return ellipsis or truncated substring
	        if (maxLength <= 3) {
	            return "...".substring(0, maxLength);
	        }

	        // Truncate string and append ellipsis
	        return input.substring(0, maxLength - 3) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string to truncate: ");
	        String original = scanner.nextLine();

	        // Input max length
	        System.out.print("Enter max length for the truncated string: ");
	        int maxLength = scanner.nextInt();

	        // Truncate using user-defined function
	        String truncated = truncate(original, maxLength);

	        System.out.println("Truncated String: " + truncated);

	        scanner.close();
	    }
	}


