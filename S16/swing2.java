import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing2 extends JFrame {
    public swing2(){
        JTextField tname = new JTextField();
        tname.setBounds(130,50, 150 , 20);

        JLabel lblName = new JLabel("Enter your name");
        lblName.setBounds(10,30,100,50);

        JButton btn = new JButton("Click me !!!");
        btn.setBounds(150,150,100,30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tname.setText("welcome to swing controls");
            }
        });


        add(tname);
        add(lblName);
        add(btn);

        setLayout(null);
        setSize(400,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new swing2();
    }
}

