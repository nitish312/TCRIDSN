import javax.swing.*;
import java.awt.*;

public class swing1 extends JFrame {

    public swing1(){
        setTitle("First swing window");
        JButton btn = new JButton("say hello");

        //add(btn);

        setLayout(new FlowLayout());
        setSize(400,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new swing1();
    }
}
