import javax.sql.rowset.serial.SerialJavaObject;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    static void main(){
        // a GUI display area for a string of text , an image or both
        ImageIcon image = new ImageIcon("src/images/spider.png");
        Border border = BorderFactory.createLineBorder(Color.green);

        JLabel label = new JLabel();
        label.setText("Bro i started coding");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBackground(Color.red); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,100,250,250); // it sets the x,y position within frame as well as dimension


        // JPanel -> a GUI component that functions as a container to hold the component
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.red);
        panel1.setBounds(0,0,250,250);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        JPanel panel3= new JPanel();
        panel3.setBackground(Color.red);

        // JFrame = a GUL window to add components
        JFrame frame = new JFrame(); // create a frame

        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(true); // prevent frames from resizing
        //frame.setSize(500, 500); // Sets the x dimension,y dimension for the frames
       // frame.setLayout(null); // IMPORTANT
       // frame.getContentPane().setBackground(new Color(123,50,250)); // change color of background
        frame.add(label);
        frame.pack();
        frame.setVisible(true); // makes frames visible

    }

}
