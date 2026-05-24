import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener extends JFrame implements java.awt.event.MouseListener {
    JLabel label;
    ImageIcon spider;
    ImageIcon apple;
    ImageIcon Elite;
    ImageIcon rocket;

    MouseListener(){
        label = new JLabel();
        label.addMouseListener(this);
        spider = new ImageIcon("src/images/spider.png");
        apple = new ImageIcon("src/images/apple-logo.png");
        Elite = new ImageIcon("src/images/OFAAX40.jpg");
        rocket = new ImageIcon("src/images/rocket.png");

        label.setIcon(spider);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(label);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(500,500);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("you clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(Elite);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(apple);
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}