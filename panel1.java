import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panel1 extends JPanel{
    public panel1 (CardLayout layout, JPanel mainPanel){

        JLabel label = new JLabel("\nWelcome to BMI calculator!");
        JTextArea text = new JTextArea("\n \n \nWhat is BMI? \nBody mass index (BMI) is a measure of body fat based on height and weight that applies to adult men and women.");
        JLabel name = new JLabel("What's your name?");
        JTextField nameField = new JTextField();
         JButton button1 = new JButton("Let's go!");

        label.setFont(new Font("Arial",Font.PLAIN,24));
        text.setFont(new Font("Arial",Font.PLAIN,18));
        //calc.setFont(new Font("Arial",Font.PLAIN,18));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
       

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            layout.show(mainPanel, "bmi");
            }
        });

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));;
        
        add(label);
        add(text);
        add(name);
        add(nameField);
        add(button1);
}
}
