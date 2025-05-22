package ArrayList;
import java.util.Collections;
import java.util.LinkedList;

	public class SwapElements {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Add elements to the list
	        colorList.add("Red");     // index 0
	        colorList.add("Blue");    // index 1
	        colorList.add("Green");   // index 2
	        colorList.add("Yellow");
	        colorList.add("Purple");

	        // Display original list
	        System.out.println("Original LinkedList: " + colorList);

	        // Swap the first (index 0) and third (index 2) elements
	        Collections.swap(colorList, 0, 2);

	        // Display list after swap
	        System.out.println("LinkedList after swapping first and third elements: " + colorList);
	    }
	}
