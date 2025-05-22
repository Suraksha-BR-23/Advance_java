
//4b. Develop a Swing program in Java to display a message
//“Srilanka is pressed” or “India is pressed” depending upon the Jbutton
//either Srilanka or India is pressed by implementing the event handling mechanism
//with addActionListener()

package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryButtonDemo   {

 public static void main(String[] args) {
     // Create the JFrame window
     JFrame frame = new JFrame("Country Button Press");

     // Create the JLabel for the message
     JLabel label = new JLabel("Press a button", JLabel.CENTER);
     label.setFont(new Font("Serif", Font.PLAIN, 24));
     label.setBounds(100, 50, 300, 50);

     // Create the "Srilanka" button
     JButton srilankaButton = new JButton("Srilanka");
     srilankaButton.setBounds(100, 150, 150, 50);
     srilankaButton.setFont(new Font("Serif", Font.PLAIN, 18));
     
     // Create the "India" button
     JButton indiaButton = new JButton("India");
     indiaButton.setBounds(300, 150, 150, 50);
     indiaButton.setFont(new Font("Serif", Font.PLAIN, 18));

     // Add action listener for Srilanka button
     srilankaButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             label.setText("Srilanka is pressed");
             label.setForeground(Color.BLUE);
         }
     });

     // Add action listener for India button
     indiaButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             label.setText("India is pressed");
             label.setForeground(Color.GREEN);
         }
     });

     // Add components to the frame
     frame.add(label);
     frame.add(srilankaButton);
     frame.add(indiaButton);

     // Frame settings
     frame.setSize(600, 300);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLocationRelativeTo(null);  // Center the frame
     frame.setVisible(true);
 }
}

