
	// 5d. Develop a Swing program in Java to create a Tabbed Pane of Cyan, Magenta, and Yellow
	// and display the concerned color whenever the specific tab is selected

	package prg5;

	import javax.swing.*;
	import java.awt.*;

	public class ColorTabbedPaneExample {

	    public static void main(String[] args) {
	        // Create the JFrame window
	        JFrame frame = new JFrame("Color Tabbed Pane Example");

	        // Create the TabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels for each color
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        // Add tabs to the tabbed pane
	        tabbedPane.addTab("Cyan", cyanPanel);
	        tabbedPane.addTab("Magenta", magentaPanel);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Set bounds and layout
	        tabbedPane.setBounds(50, 50, 400, 300);

	        // Add tabbed pane to the frame
	        frame.add(tabbedPane);

	        // Frame settings
	        frame.setSize(500, 400);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null); // Center the frame
	        frame.setVisible(true);
	    }
	}

