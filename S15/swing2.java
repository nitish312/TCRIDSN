import javax.swing.*;
import java.awt.*;

public class swing2 extends JFrame {
    public swing2(){
        setTitle("second swing window");

        JButton btn = new JButton("say hello");
        JLabel lbl = new JLabel("username ");

        add(btn);
        add(lbl);

        setLayout(new FlowLayout());
        setSize(400,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new swing2();
    }
}