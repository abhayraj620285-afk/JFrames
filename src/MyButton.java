import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JFrame {
    JButton button;
    MyButton(){
         button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(e -> System.out.println("Pooooo"));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
}
