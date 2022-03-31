//radiobuttons
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing4 extends JFrame {
    JRadioButton rbMale,rbFemale ;
    ButtonGroup bgGender;
    JButton btnShow;
    JLabel lblMessage ;

    swing4(){
        lblMessage = new JLabel("");

        lblMessage.setBounds(100,200,100,30);

        rbMale = new JRadioButton("Male");
        rbMale.setBounds(100,50,100,30);

        rbFemale = new JRadioButton("Female");
        rbFemale.setBounds(100,100,100,30);

        bgGender = new ButtonGroup();
        bgGender.add(rbMale);
        bgGender.add(rbFemale);

        btnShow = new JButton("Show");
        btnShow.setBounds(150,170,80,30);

        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rbMale.isSelected()){
                    lblMessage.setText("Male is selected ");
                }
                if(rbFemale.isSelected()){
                    lblMessage.setText("Female is selected ");
                }
            }
        });

        add(lblMessage);
        add(rbMale);
        add(rbFemale);
        add(btnShow)    ;
        setLayout(null);
        setSize(400,500);
        setVisible(true);
    }


    public static void main(String[] args) {
new swing4();

    }
}
