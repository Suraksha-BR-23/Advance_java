package String;
import java.util.Random;
import java.util.Scanner;
	public class RandomStringGenerator {

	    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	    // User-defined function to generate random string of specified length
	    public static String generateRandomString(int length) {
	        if (length <= 0) {
	            return "";
	        }

	        Random random = new Random();
	        StringBuilder sb = new StringBuilder(length);

	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(CHARACTERS.length());
	            sb.append(CHARACTERS.charAt(index));
	        }

	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input length from user
	        System.out.print("Enter the length of the random string: ");
	        int length = scanner.nextInt();

	        // Generate random string
	        String randomString = generateRandomString(length);

	        System.out.println("Generated Random String: " + randomString);

	        scanner.close();
	    }
	}


