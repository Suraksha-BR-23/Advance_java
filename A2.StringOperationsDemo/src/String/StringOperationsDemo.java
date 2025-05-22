package String;
import java.util.Scanner;

	public class StringOperationsDemo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("str1 equals 'Hello'? " + str1.equals("Hello"));
	        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));

	        // 4. String Searching
	        String searchString = "Java Programming";
	        System.out.println("Index of 'Prog': " + searchString.indexOf("Prog"));
	        System.out.println("Contains 'Java'? " + searchString.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("Substring (5 to 16): " + searchString.substring(5, 16));

	        // 6. String Modification
	        String modified = searchString.replace("Java", "Python");
	        System.out.println("Modified String: " + modified);

	        // 7. Whitespace Handling
	        String messy = "   Trim me   ";
	        System.out.println("Before trim: '" + messy + "'");
	        System.out.println("After trim: '" + messy.trim() + "'");

	        // 8. String Concatenation
	        String full = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated String: " + full);

	        // 9. String Splitting
	        String sentence = "Apple,Banana,Orange";
	        String[] fruits = sentence.split(",");
	        System.out.println("Splitted Fruits:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Welcome");
	        sb.append(" to Java");
	        sb.insert(0, "Hi! ");
	        sb.replace(4, 11, "Hello");
	        System.out.println("StringBuilder Result: " + sb);

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 30;
	        System.out.println(String.format("Name: %s, Age: %d", name, age));

	        // 12. Validate Email
	        System.out.print("Enter an email to validate: ");
	        String email = scanner.nextLine();

	        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
	            System.out.println("Valid Email Format (based on custom rules).");
	        } else {
	            System.out.println("Invalid Email Format.");
	        }

	        scanner.close();
	    }
	}



