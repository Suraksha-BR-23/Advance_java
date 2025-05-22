//5b)Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN
// and display the concerned color whenever the specific tab is selected in the Pan.

package prg5;
import javax.swing.*;
import java.awt.*;

	public class ColorTabbedPaneExample {

	    public static void main(String[] args) {
	        // Create the JFrame window
	        JFrame frame = new JFrame("Color TabbedPane Example");

	        // Create the JTabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create the RED panel
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);
	        tabbedPane.addTab("RED", redPanel);

	        // Create the BLUE panel
	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);
	        tabbedPane.addTab("BLUE", bluePanel);

	        // Create the GREEN panel
	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Set the bounds and add the tabbed pane to frame
	        tabbedPane.setBounds(50, 50, 300, 200);
	        frame.add(tabbedPane);

	        // Frame settings
	        frame.setSize(400, 300);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null); // Center the frame
	        frame.setVisible(true);
	    }
	}


