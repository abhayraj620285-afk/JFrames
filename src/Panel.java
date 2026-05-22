import javax.swing.*;
import java.awt.*;

public class Panel {
    static void main() {

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.green);
        panel1.setBounds(0,0,250,250);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        panel2.setBounds(250,0,250,250);
        JPanel panel3= new JPanel();
        panel3.setBackground(Color.blue);
        panel3.setBounds(0,250,500,250);

        JFrame frame = new JFrame(); // create a frame

        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setSize(750, 750); // Sets the x dimension,y dimension for the frames
        frame.setLayout(null); // IMPORTANT
        frame.setResizable(true); // prevent frames from resizing
        frame.pack();
        frame.setVisible(true); // makes frames visible
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

    }
}
