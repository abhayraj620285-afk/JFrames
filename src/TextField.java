import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame implements ActionListener {
    JButton button;
    JTextField field;
    TextField(){
        button = new JButton("Submit");
        button.addActionListener(this);
        this.add(button);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

//      Creating text field box
//        JTextField field = new JTextField();
//        field.setPreferredSize(new Dimension(250,40));
//        JCheckBox checkBox = new JCheckBox();
//        checkBox.setText("I am not a robot");
//        checkBox.setFocusable(false);
//        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
//        this.add(checkBox);
        JRadioButton pizzaButton = new JRadioButton("Pizza");
        JRadioButton hamburgerButton = new JRadioButton("Burger");
        JRadioButton hotDogButton = new JRadioButton("HotDog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotDogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotDogButton);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==button){
//            field.getText();
//        }
    }
}
