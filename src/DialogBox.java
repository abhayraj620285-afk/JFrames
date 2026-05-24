import javax.swing.*;

public class DialogBox {
    static void main() {
        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               or inform them of something

        JOptionPane.showMessageDialog(null,"This is something useless info","title",JOptionPane.PLAIN_MESSAGE);
        int answer = JOptionPane.showConfirmDialog(null,"bro,do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showInputDialog("What is your name");


    }
}
