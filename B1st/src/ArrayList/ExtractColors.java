package ArrayList;
import java.util.ArrayList;
import java.util.List;


public class ExtractColors {

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

	        // Extract 1st and 2nd elements using subList (index 0 to 2, exclusive of end)
	        List<String> subColors = colors.subList(0, 2);

	        // Display the extracted sublist
	        System.out.println("Extracted Colors (1st and 2nd): " + subColors);
	    }
	}

