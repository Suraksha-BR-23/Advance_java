import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;



	// Step 2: Create servlet class and use WebServlet annotation
	@WebServlet("/PrimeServlet")
	public class PrimeServlet extends HttpServlet {

	    // Step 3: Handle POST requests
	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html");

	        // Step 4: Get number from request
	        String input = request.getParameter("num");
	        int number = Integer.parseInt(input);

	        PrintWriter out = response.getWriter();

	        // Step 5: Check if number is prime
	        boolean isPrime = true;
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= number / 2; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        // Step 6: Generate HTML response
	        out.println("<html>");
	        out.println("<head><title>Prime Checker</title></head>");
	        out.println("<body>");
	        out.println("<h2>Prime Number Result</h2>");
	        if (isPrime) {
	            out.println("<font color='green'><h3>" + number + " is a Prime Number</h3></font>");
	        } else {
	            out.println("<font color='red'><h3>" + number + " is NOT a Prime Number</h3></font>");
	        }
	        out.println("</body></html>");
	    }

	    // Step 7: Handle GET requests (optional redirect to HTML)
	    public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.sendRedirect("prime.html");
	    }
	}


}
