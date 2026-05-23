import javax.swing.*;
import java.awt.*;

public class JLayeredPane{
    static void main() {

        // JLayeredPane = Swing Container that provide a third dimension for positioning components
        //                ex :- Depth,Z-index;
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150,150,200,200);

        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        label4.setBackground(Color.red);
        label4.setBounds(50,50,200,200);

        javax.swing.JLayeredPane layeredPane = new javax.swing.JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1);
        layeredPane.add(label2);
        layeredPane.add(label3);
        layeredPane.add(label4);

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

}
