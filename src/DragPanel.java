import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel{
    ImageIcon icon = new ImageIcon("src/images/spider.png");
    final int WIDTH = icon.getIconWidth();
    final int HEIGHT = icon.getIconHeight();
    Point imageCorner;
    Point prevPt;
    DragPanel(){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }
    public void paintComponent(Graphics g){

    }
    private class ClickListener extends MouseAdapter{

    }
    private class DragListener extends MouseMotionAdapter{

    }

}