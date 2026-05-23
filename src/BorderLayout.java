import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayout {
    static void main() {
        // Boarder Layout => Places component in five areas -> NORTH,SOUTH,EAST,WEST
        //                   All Extra spaces is placed in the center
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new java.awt.BorderLayout());
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();


        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.pink);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1, java.awt.BorderLayout.NORTH);
        frame.add(panel2, java.awt.BorderLayout.SOUTH);
        frame.add(panel3, java.awt.BorderLayout.EAST);
        frame.add(panel4, java.awt.BorderLayout.WEST);
        frame.add(panel5, java.awt.BorderLayout.CENTER);







    }
}
