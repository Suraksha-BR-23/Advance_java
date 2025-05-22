package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ColorSearch {

	    public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        List<String> colors = new ArrayList<>();

	        // Adding different colors
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Purple");

	        // Display all colors
	        System.out.println("Available Colors: " + colors);

	        // Search for "Red"
	        if (colors.contains("Red")) {
	            System.out.println("The color 'Red' is available in the list.");
	        } else {
	            System.out.println("The color 'Red' is NOT available in the list.");
	        }
	    }
	}


