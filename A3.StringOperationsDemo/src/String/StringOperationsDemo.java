//2a)Develop a java program for performing various string operations with different string
//handling functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String
//Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
//contains( ) and startsWith() and endsWith()

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
	        System.out.println("Character at index 2 of str1: " + str1.charAt(2));

	        // 3. String Comparison
	        System.out.println("str1 equals 'Hello'? " + str1.equals("Hello"));
	        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));

	        // 4. String Searching
	        String sample = "Java Programming is powerful";
	        System.out.println("Sample String: " + sample);
	        System.out.println("Contains 'Programming'? " + sample.contains("Programming"));
	        System.out.println("Index of 'powerful': " + sample.indexOf("powerful"));

	        // 5. Substring Operations
	        System.out.println("Substring (5 to 16): " + sample.substring(5, 16));

	        // 6. String Modification
	        String modified = sample.replace("Java", "Python");
	        System.out.println("After replace: " + modified);

	        // 7. Whitespace Handling
	        String messy = "   Trim this string   ";
	        System.out.println("Before trim: '" + messy + "'");
	        System.out.println("After trim: '" + messy.trim() + "'");

	        // 8. String Concatenation
	        String concatResult = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated: " + concatResult);

	        // 9. String Splitting
	        String fruits = "Apple,Banana,Orange";
	        String[] fruitArray = fruits.split(",");
	        System.out.println("Split Fruits:");
	        for (String fruit : fruitArray) {
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
	        int age = 25;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Validate Email
	        System.out.print("Enter an email to validate: ");
	        String email = scanner.nextLine();

	        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
	            System.out.println("Valid Email Format (Custom Rule).");
	        } else {
	            System.out.println("Invalid Email Format.");
	        }

	        scanner.close();
	    }
	}


