package ArrayList;
import java.util.*;
public class ListOperationsDemo {
	

	    public static void main(String[] args) {
	        // 1. Adding elements
	        List<String> arrayList = new ArrayList<>();
	        List<String> linkedList = new LinkedList<>();
	        addElements(arrayList);
	        addElements(linkedList);

	        // 2. Adding element at specific index
	        arrayList.add(1, "Grapes");
	        linkedList.add(1, "Grapes");

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
	        arrayList.addAll(moreFruits);
	        linkedList.addAll(moreFruits);

	        // 4. Accessing elements
	        System.out.println("Accessed from ArrayList: " + arrayList.get(2));
	        System.out.println("Accessed from LinkedList: " + linkedList.get(2));

	        // 5. Updating elements
	        arrayList.set(2, "Kiwi");
	        linkedList.set(2, "Kiwi");

	        // 6. Removing elements
	        arrayList.remove("Banana");
	        linkedList.remove("Banana");

	        // 7. Searching elements
	        System.out.println("ArrayList contains Apple? " + arrayList.contains("Apple"));
	        System.out.println("LinkedList contains Apple? " + linkedList.contains("Apple"));

	        // 8. List size
	        System.out.println("ArrayList size: " + arrayList.size());
	        System.out.println("LinkedList size: " + linkedList.size());

	        // 9. Iterating over list (enhanced for loop)
	        System.out.println("ArrayList elements:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        System.out.println("LinkedList elements:");
	        for (String fruit : linkedList) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        System.out.println("ArrayList using Iterator:");
	        Iterator<String> arrayIterator = arrayList.iterator();
	        while (arrayIterator.hasNext()) {
	            System.out.println(arrayIterator.next());
	        }

	        System.out.println("LinkedList using Iterator:");
	        Iterator<String> linkedIterator = linkedList.iterator();
	        while (linkedIterator.hasNext()) {
	            System.out.println(linkedIterator.next());
	        }

	        // 11. Sorting
	        Collections.sort(arrayList);
	        Collections.sort(linkedList);
	        System.out.println("Sorted ArrayList: " + arrayList);
	        System.out.println("Sorted LinkedList: " + linkedList);

	        // 12. Sublist
	        System.out.println("ArrayList sublist (0 to 2): " + arrayList.subList(0, 2));
	        System.out.println("LinkedList sublist (0 to 2): " + linkedList.subList(0, 2));

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();
	        System.out.println("ArrayList after clear: " + arrayList);
	        System.out.println("LinkedList after clear: " + linkedList);
	    }

	    private static void addElements(List<String> list) {
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	    }
	}

