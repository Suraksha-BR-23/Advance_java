package string;
import java.util.Scanner;

public class WhitespaceRemover {

    // User-defined function to remove all whitespace characters from a string
    public static String removeWhitespace(String input) {
        if (input == null) {
            return null;
        }
        // Replace all whitespace characters (space, tab, newline, etc.) with empty string
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string with whitespace: ");
        String original = scanner.nextLine();

        // Remove whitespace using user-defined function
        String result = removeWhitespace(original);

        System.out.println("String after removing whitespace: '" + result + "'");

        scanner.close();
    }
}

