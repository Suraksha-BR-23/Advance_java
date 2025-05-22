package ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DeleteNthColor {
	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        List<String> colors = new ArrayList<>();

	        // Adding different colors
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display original list
	        System.out.println("Original Colors List: " + colors);

	        // Get input from user for nth element to delete
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the position (n) of the color to delete (1-based index): ");
	        int n = scanner.nextInt();

	        // Validate and delete
	        if (n > 0 && n <= colors.size()) {
	            String removedColor = colors.remove(n - 1); // Convert to 0-based index
	            System.out.println("Deleted color: " + removedColor);
	        } else {
	            System.out.println("Invalid position. Please enter a number between 1 and " + colors.size());
	        }

	        // Display updated list
	        System.out.println("Updated Colors List: " + colors);

	        scanner.close();
	    }
	}
