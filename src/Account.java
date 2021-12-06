import javax.swing.*;

public class Account {

    public static void main(String[] args){
        JFrame frame = new AccountFrame();
        frame.setTitle("My Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
