package string;
import java.util.Scanner;

	public class StringReverser {

	    // User-defined function to reverse a string
	    public static String reverseString(String input) {
	        if (input == null) {
	            return null;
	        }

	        StringBuilder reversed = new StringBuilder(input);
	        return reversed.reverse().toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string to reverse: ");
	        String original = scanner.nextLine();

	        // Reverse using user-defined function
	        String reversed = reverseString(original);

	        System.out.println("Reversed String: " + reversed);

	        scanner.close();
	    }
	}

