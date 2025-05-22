package ArrayList;
import java.util.LinkedList;

	public class InsertAtEnd {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Add initial elements
	        colorList.add("Red");
	        colorList.add("Blue");
	        colorList.add("Green");

	        // Display original list
	        System.out.println("Original LinkedList: " + colorList);

	        // Insert "Pink" at the end using offerLast()
	        colorList.offerLast("Pink");

	        // Display updated list
	        System.out.println("LinkedList after inserting 'Pink' at the end: " + colorList);
	    }
	}


