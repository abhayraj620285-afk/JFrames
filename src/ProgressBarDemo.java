import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    ProgressBarDemo(){

    bar.setValue(0);
    bar.setBounds(0,0,420,50);
    bar.setStringPainted(true);
    bar.setFont(new Font("My Boli",Font.BOLD,25));

    frame.add(bar);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    fill();
    }
    public void fill(){
        int counter = 0;
        while(counter<=100){
            try{
                bar.setValue(counter);
                Thread.sleep(1000);
            }catch(Exception e){
                e.getStackTrace();
            }
            counter+=10;

        }
    }
}
