package String;

public class StringPerformanceTest {
	
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String text = "AIET";

	        // StringBuffer performance test
	        StringBuffer buffer = new StringBuffer();
	        long startTimeBuffer = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            buffer.append(text);
	        }
	        long endTimeBuffer = System.nanoTime();
	        long durationBuffer = endTimeBuffer - startTimeBuffer;
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

	        // StringBuilder performance test
	        StringBuilder builder = new StringBuilder();
	        long startTimeBuilder = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            builder.append(text);
	        }
	        long endTimeBuilder = System.nanoTime();
	        long durationBuilder = endTimeBuilder - startTimeBuilder;
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

	        // Result comparison
	        if (durationBuilder < durationBuffer) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        }
	    }
	}


