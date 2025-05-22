// 5a. Develop a Swing program in Java to add the countries
// USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan,
// Africa, Greenland, Singapore into a JList and
// display them on console whenever the countries are selected on the list.
package prg5;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class CountryListExample {

    public static void main(String[] args) {
        // Create the JFrame window
        JFrame frame = new JFrame("Country List Selection");

        // Create the JLabel for instructions
        JLabel label = new JLabel("Select countries from the list", JLabel.CENTER);
        label.setFont(new Font("Serif", Font.PLAIN, 24));
        label.setBounds(50, 20, 400, 30);

        // Create the list of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create the JList
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        countryList.setFont(new Font("Serif", Font.PLAIN, 18));
        JScrollPane scrollPane = new JScrollPane(countryList);
        scrollPane.setBounds(100, 70, 250, 150);

        // Add selection listener to the JList
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selected = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries: " + selected);
                }
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(scrollPane);

        // Frame settings
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}