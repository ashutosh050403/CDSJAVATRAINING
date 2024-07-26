import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeGui {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("BMI Calculator");

        JLabel userWeightLabel = new JLabel("enter your weight in kg: ");
        userWeightLabel.setBounds(40,40,200,40);

        JTextField userWeightTextField=new JTextField("");
        userWeightTextField.setBounds(250,40,60,40);

        JLabel userHeightLabel = new JLabel("enter your height in meter: ");
        userHeightLabel.setBounds(40,100,200,40);

        JTextField userHeightTextField=new JTextField("");
        userHeightTextField.setBounds(250,100,60,40);


        jFrame.add(userWeightTextField);
        jFrame.add(userWeightLabel);

        jFrame.add(userHeightTextField);
        jFrame.add(userHeightLabel);

        JButton jButton=new JButton("Submit");
        jButton.setBounds(200,200,120,40);

        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float weight= Float.parseFloat(userWeightTextField.getText().toString());
                float height= Float.parseFloat(userHeightTextField.getText().toString());
                float bmiValue= weight/(height*height);
                jButton.setText(String.valueOf(bmiValue));
            }
        });
        //to use the default layout
        jFrame.setLayout(null);

        jFrame.setSize(400,300);

        jFrame.setVisible(true);

    }
}
