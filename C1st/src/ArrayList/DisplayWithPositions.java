package ArrayList;
import java.util.LinkedList;

	public class DisplayWithPositions {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Add elements to the list
	        colorList.add("Red");
	        colorList.add("Blue");
	        colorList.add("Green");
	        colorList.add("Yellow");
	        colorList.add("Purple");

	        // Display elements with their positions using get(index)
	        System.out.println("Elements and their positions in the LinkedList:");
	        for (int i = 0; i < colorList.size(); i++) {
	            System.out.println("Position " + i + ": " + colorList.get(i));
	        }
	    }
	}

