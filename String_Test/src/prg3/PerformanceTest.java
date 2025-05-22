//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
//appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
//your answer which one is better.

package prg3;

public class PerformanceTest {
	
	    public static void main(String[] args) {
	        String appendString = "AIET";
	        int iterations = 10000;

	        // Using StringBuffer
	        long startBuffer = System.nanoTime();
	        StringBuffer stringBuffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(appendString);
	        }
	        long endBuffer = System.nanoTime();
	        long bufferTime = endBuffer - startBuffer;

	        // Using StringBuilder
	        long startBuilder = System.nanoTime();
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(appendString);
	        }
	        long endBuilder = System.nanoTime();
	        long builderTime = endBuilder - startBuilder;

	        // Output results
	        System.out.println("Time taken by StringBuffer: " + bufferTime + " ns");
	        System.out.println("Time taken by StringBuilder: " + builderTime + " ns");

	        // Justification
	        if (bufferTime > builderTime) {
	            System.out.println("\nStringBuilder is faster than StringBuffer for single-threaded operations.");
	        } else {
	            System.out.println("\nStringBuffer is better only in multi-threaded scenarios due to thread safety.");
	        }
	    }
	}
