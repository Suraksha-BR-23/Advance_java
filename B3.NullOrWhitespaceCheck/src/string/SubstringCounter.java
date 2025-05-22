package string;
import java.util.Scanner;


	public class SubstringCounter {

	    // User-defined function to count how many times a substring occurs in a main string
	    public static int countOccurrences(String mainString, String subString) {
	        if (mainString == null || subString == null || subString.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        while ((index = mainString.indexOf(subString, index)) != -1) {
	            count++;
	            index += subString.length(); // Move past the last found substring
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input main string and substring
	        System.out.print("Enter the main string: ");
	        String mainStr = scanner.nextLine();

	        System.out.print("Enter the substring to search: ");
	        String subStr = scanner.nextLine();

	        // Count occurrences
	        int result = countOccurrences(mainStr, subStr);
	        System.out.println("The substring '" + subStr + "' appears " + result + " time(s) in the main string.");

	        scanner.close();
	    }
	}



