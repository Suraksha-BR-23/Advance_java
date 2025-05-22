package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortColors {
	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        List<String> colors = new ArrayList<>();

	        // Adding different colors
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original Colors List: " + colors);

	        // Sort the list
	        Collections.sort(colors);

	        // Display sorted list
	        System.out.println("Sorted Colors List: " + colors);
	    }
	}

