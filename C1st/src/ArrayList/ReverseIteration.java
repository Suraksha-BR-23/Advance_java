package ArrayList;
import java.util.LinkedList;
import java.util.Iterator;


public class ReverseIteration {

	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();

	        // Add elements to the LinkedList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Get descending iterator (reverse order)
	        Iterator<String> reverseIterator = colors.descendingIterator();

	        // Iterate and print elements in reverse
	        System.out.println("LinkedList in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}
