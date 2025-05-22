package Swing;
import javax.swing.*;
import java.awt.*;
	public class HelloSwing {

	    public static void main(String[] args) {
	        // Create a new JFrame (window) with title
	        JFrame frame = new JFrame("Swing Hello");

	        // Set default close operation
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create a JLabel with the message
	        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", SwingConstants.CENTER);

	        // Set font to plain, size 32
	        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

	        // Set text color to blue
	        label.setForeground(Color.BLUE);

	        // Add label to the frame's content pane
	        frame.getContentPane().add(label);

	        // Set frame size
	        frame.setSize(700, 150);

	        // Center the frame on screen
	        frame.setLocationRelativeTo(null);

	        // Make frame visible
	        frame.setVisible(true);
	    }
	}
