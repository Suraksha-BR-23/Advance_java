
	// 5c. Develop a Swing program in Java to add countries into a JList
	// and display the capital of the selected countries on the console

	package prg5;

	import javax.swing.*;
	import javax.swing.event.*;
	import java.awt.*;
	import java.util.HashMap;

	public class CountryCapitalJList {

	    public static void main(String[] args) {
	        // Create the JFrame window
	        JFrame frame = new JFrame("Country and Capital Viewer");

	        // Array of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada",
	            "Denmark", "France", "Great Britain",
	            "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Map of country-capital pairs
	        HashMap<String, String> capitals = new HashMap<>();
	        capitals.put("USA", "Washington, D.C.");
	        capitals.put("India", "New Delhi");
	        capitals.put("Vietnam", "Hanoi");
	        capitals.put("Canada", "Ottawa");
	        capitals.put("Denmark", "Copenhagen");
	        capitals.put("France", "Paris");
	        capitals.put("Great Britain", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("Africa", "Varies by country");
	        capitals.put("Greenland", "Nuuk");
	        capitals.put("Singapore", "Singapore");

	        // Create JList with countries
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        countryList.setVisibleRowCount(8);
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        scrollPane.setBounds(50, 50, 200, 150);

	        // Add ListSelectionListener to display capital on selection
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selected = countryList.getSelectedValuesList();
	                    for (String country : selected) {
	                        System.out.println("Country: " + country + ", Capital: " + capitals.get(country));
	                    }
	                }
	            }
	        });

	        // Add components to frame
	        frame.add(scrollPane);

	        // Frame settings
	        frame.setSize(320, 300);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null); // Center the frame
	        frame.setVisible(true);
	    }
	}



