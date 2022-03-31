import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//addition of two numbers and display result in third textfield by clicking on button.


class swing3  extends JFrame {

    swing3(){
        JLabel lbl1 =new JLabel("Enter first number");
        lbl1.setBounds(30,20,120,30);

        JLabel lbl2 =new JLabel("Enter second number");
        lbl2.setBounds(30,55,120,30);

        JLabel lbl3 =new JLabel("sum");
        lbl3.setBounds(30,90,80,30);

        JTextField t1 = new JTextField(5);
        t1.setBounds(145,20,50,30);

        JTextField t2 = new JTextField(5);
        t2.setBounds(145,55,50,30);

        JTextField t3 = new JTextField(5);
        t3.setBounds(145,90,50,30);

        JButton btnCalc = new JButton("Calculate");
        btnCalc.setBounds(30,125,110,30);

        add(lbl1);
        add(t1);
        add(lbl2);
        add(t2);
        add(lbl3);
        add(t3);
        add(btnCalc);

        setLayout(null);
        setSize(400,500);
        setVisible(true);

        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt( t1.getText());
                int num2 = Integer.parseInt( t2.getText());

                int sum = num1 + num2 ;
                t3.setText(String.valueOf(sum));
            }
        });
    }

    public static void main(String[] args) {
        new swing3() ;
    }
}
