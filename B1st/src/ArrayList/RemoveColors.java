package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class RemoveColors {

	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        List<String> colors = new ArrayList<>();

	        // Adding different colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        System.out.println("Original Colors List: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedByIndex = colors.remove(1);
	            System.out.println("Removed 2nd element (index 1): " + removedByIndex);
	        }

	        // Remove "Blue" by value
	        boolean removedBlue = colors.remove("Blue");
	        if (removedBlue) {
	            System.out.println("Removed color 'Blue' from the list.");
	        } else {
	            System.out.println("Color 'Blue' was not found in the list.");
	        }

	        // Final list
	        System.out.println("Final Colors List: " + colors);
	    }
	}

