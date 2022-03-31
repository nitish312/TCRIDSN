//checkbox
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing5 extends JFrame {
    JCheckBox cbReading, cbPainting ;
    JButton btnShow;
    JLabel lblMessage;

    swing5() {
        cbReading = new JCheckBox("Reading");
        cbPainting= new JCheckBox("Painting");

        lblMessage = new JLabel("");
        btnShow = new JButton("Show");

        add(cbReading);
        add(cbPainting);
        add(btnShow);
        add(lblMessage);

        setLayout(new FlowLayout());
        setSize(400,500);
        setVisible(true);

        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hobbies = "";

                if(cbReading.isSelected()){
                    hobbies= " Reading";
                }

                if(cbPainting.isSelected()){
                    hobbies+= " Painting";
                }

                lblMessage.setText(hobbies);
            }
        });
    }

    public static void main(String[] args) {
        new swing5();
    }
}
