package prg4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageButtonExample {

    public static void main(String[] args) {
        // Create the JFrame window
        JFrame frame = new JFrame("Button Image Demo");

        // Create the JLabel for the message
        JLabel messageLabel = new JLabel("Press a button", JLabel.CENTER);
        messageLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        messageLabel.setBounds(100, 50, 400, 50);

        // Load images (ensure these images are accessible and paths are correct)
        ImageIcon digitalClockIcon = new ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\download.jpg");
        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\hourglass.png");

        // Create the "Digital Clock" button
        JButton digitalClockButton = new JButton("Digital Clock", digitalClockIcon);
        digitalClockButton.setBounds(50, 150, 200, 200);
        digitalClockButton.setFont(new Font("Serif", Font.PLAIN, 18));

        // Create the "Hour Glass" button
        JButton hourGlassButton = new JButton("Hour Glass", hourGlassIcon);
        hourGlassButton.setBounds(250, 150, 200, 200);
        hourGlassButton.setFont(new Font("Serif", Font.PLAIN, 18));

        // Add action listener for Digital Clock button
        digitalClockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        // Add action listener for Hour Glass button
        hourGlassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to the frame
        frame.add(messageLabel);
        frame.add(digitalClockButton);
        frame.add(hourGlassButton);

        // Frame settings
        frame.setSize(600, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  // Center the frame
        frame.setVisible(true);
    }
}
