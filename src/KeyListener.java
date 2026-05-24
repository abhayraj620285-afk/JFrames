import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.font.ImageGraphicAttribute;

public class KeyListener extends JFrame implements java.awt.event.KeyListener {
    JLabel label;
    ImageIcon icon;
    KeyListener(){
        icon = new ImageIcon("src/images/apple-logo.png");
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);;
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        // Adding keyListener
        this.addKeyListener(this);
        this.setSize(500,500);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a' -> label.setLocation(label.getX()-10,label.getY());
            case 'd' -> label.setLocation(label.getX()+10,label.getY());
            case 'w' -> label.setLocation(label.getX(),label.getY()-10);
            case 's' -> label.setLocation(label.getX(),label.getY()+10);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
