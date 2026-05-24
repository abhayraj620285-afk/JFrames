import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileSelection extends JFrame implements ActionListener {
    JButton button;
    FileSelection(){
        button = new JButton("Select File");
        button.addActionListener(this);
        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null); // Select a file
        }
    }
}
