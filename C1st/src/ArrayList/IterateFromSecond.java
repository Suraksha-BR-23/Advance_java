package ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class IterateFromSecond {
	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();

	        // Adding elements to the LinkedList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");

	        System.out.println("Full LinkedList: " + colors);
	        System.out.println("Iterating from 2nd element onward:");

	        // Start iterating from the 2nd element (index 1)
	        ListIterator<String> iterator = colors.listIterator(1);  // index 1 = 2nd element

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}

