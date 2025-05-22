package prg2a;

public class StringOperationsDemo {
	

	

	    public static void main(String[] args) {
	        // String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = new String("Hello");

	        System.out.println("String Creation and Basic Operations:");
	        System.out.println("str1: " + str1);
	        System.out.println("str2: " + str2);
	        System.out.println("str3: " + str3);

	        // Length and Character Access
	        System.out.println("\nLength and Character Access:");
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

	        // String Comparison
	        System.out.println("\nString Comparison:");
	        System.out.println("str1.equals(str3): " + str1.equals(str3));
	        System.out.println("str1 == str3: " + (str1 == str3));
	        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));

	        // String Searching
	        System.out.println("\nString Searching:");
	        String sample = "Welcome to Java Programming";
	        System.out.println("Index of 'Java': " + sample.indexOf("Java"));
	        System.out.println("Last index of 'a': " + sample.lastIndexOf("a"));
	        System.out.println("Contains 'Java': " + sample.contains("Java"));

	        // Substring Operations
	        System.out.println("\nSubstring Operations:");
	        System.out.println("Substring (11 to 15): " + sample.substring(11, 15));

	        // String Modification
	        System.out.println("\nString Modification:");
	        String replaced = sample.replace("Java", "Python");
	        System.out.println("After replace: " + replaced);
	        System.out.println("To UpperCase: " + sample.toUpperCase());
	        System.out.println("To LowerCase: " + sample.toLowerCase());

	        // Whitespace Handling
	        System.out.println("\nWhitespace Handling:");
	        String withSpaces = "   Hello AIET   ";
	        System.out.println("Original: '" + withSpaces + "'");
	        System.out.println("Trimmed: '" + withSpaces.trim() + "'");

	        // String Concatenation
	        System.out.println("\nString Concatenation:");
	        String concat = str1 + " " + str2;
	        System.out.println("Concatenated: " + concat);
	        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

	        // String Splitting
	        System.out.println("\nString Splitting:");
	        String fruits = "Apple,Banana,Orange";
	        String[] fruitArray = fruits.split(",");
	        for (String fruit : fruitArray) {
	            System.out.println("Fruit: " + fruit);
	        }

	        // StringBuilder Demo
	        System.out.println("\nStringBuilder Demo:");
	        StringBuilder sb = new StringBuilder("AIET");
	        sb.append(" College");
	        sb.insert(4, " - ");
	        sb.replace(0, 4, "AIT");
	        sb.delete(4, 7);
	        System.out.println("StringBuilder Result: " + sb.toString());

	        // String Formatting
	        System.out.println("\nString Formatting:");
	        String name = "Alice";
	        int age = 22;
	        System.out.println(String.format("My name is %s and I am %d years old.", name, age));

	        // Validate Email
	        System.out.println("\nEmail Validation:");
	        String email = "user@example.com";
	        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
	            System.out.println("Email is valid.");
	        } else {
	            System.out.println("Email is invalid.");
	        }
	    }
	}


