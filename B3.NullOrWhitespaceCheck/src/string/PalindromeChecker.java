package string;
import java.util.Scanner;
	public class PalindromeChecker {

	    // User-defined function to check if a string is a palindrome
	    public static boolean isPalindrome(String input) {
	        if (input == null) {
	            return false;
	        }

	        // Remove all non-letter/digit characters and convert to lowercase
	        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        int left = 0;
	        int right = cleaned.length() - 1;

	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a string to check for palindrome: ");
	        String input = scanner.nextLine();

	        // Check using user-defined function
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome (ignoring case and punctuation).");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }

	        scanner.close();
	    }
	}



