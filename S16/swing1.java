import javax.swing.*;

public class swing1 extends JFrame {
    public swing1(){
        JTextField tname = new JTextField();
        tname.setBounds(130,50, 150 , 20);

        JLabel lblName = new JLabel("Enter your name");
        lblName.setBounds(10,30,100,50);

        JButton btn = new JButton("Click me !!!");
        btn.setBounds(150,150,100,30);

        add(tname);
        add(lblName);
        add(btn);

        setLayout(null);
        setSize(400,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new swing1();
    }
}
