import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args){

        JFrame frame = new JFrame("BMI App");
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        panel1 introPanel = new panel1(cardLayout, mainPanel);
        BMIPanel bmiPanel = new BMIPanel();

        mainPanel.add(introPanel, "intro");
        mainPanel.add(bmiPanel, "bmi");

        frame.add(mainPanel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


    //     CardLayout cardLayout = new CardLayout();
    //     JPanel mainPanel = new JPanel(cardLayout);

    //     JFrame frame = new JFrame("BMI App ");
    //     JPanel panel1 = new JPanel(new BorderLayout());
    //     JLabel label = new JLabel("\nWelcome to BMI calculator!");
    //     JTextArea text = new JTextArea("\n \n \nWhat is BMI? \n Body mass index (BMI) is a measure of body.");
        

    //     label.setFont(new Font("Arial",Font.PLAIN,24));
    //     text.setFont(new Font("Arial",Font.PLAIN,18));
    //     //calc.setFont(new Font("Arial",Font.PLAIN,18));
    //     text.setLineWrap(true);
    //     text.setWrapStyleWord(true);
    //     text.setEditable(false);
    //     JButton button = new JButton("<CALCULATE MY BMI!>");
    //     //button.addActionListener(
            
            
    //     //);


    //     panel1.setLayout(new BorderLayout());
    //     panel1.add(button,BorderLayout.SOUTH);
    //     panel1.add(label,BorderLayout.NORTH);
    //     panel1.add(text,BorderLayout.CENTER);
    //     //panel.add(calc,BorderLayout.WEST);


    //     JPanel bmi = new JPanel();
    //     bmi.setLayout(new BoxLayout(bmi, 0));

    //     JLabel height = new JLabel("Height (cm):");
    //     JTextField heightField = new JTextField();
    //     JLabel weight = new JLabel("Weight (kg):");
    //     JTextField weightField = new JTextField();

    //     JButton calaculate = new JButton("Let's go!");
    //     JLabel result = new JLabel("your BMI:");

    //     bmi.add(height);
    //     bmi.add(heightField);
    //     bmi.add(weight);
    //     bmi.add(weightField);
    //     bmi.add(calaculate);
    //     bmi.add(result);

    //     mainPanel.add(panel1,"panel1");
    //     mainPanel.add(bmi,"bmi");
        
    //     frame.add(mainPanel);
    //     frame.setSize(500,500);
    //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     frame.setVisible(true);

    //     calaculate.addActionListener( new ActionListener() {
    //         @Override
    //         public void actionPerformed(ActionEvent e){
    //              double h = Double.parseDouble(height.getText());
    //             double w = Double.parseDouble(weight.getText());
    //             double bmiScore = (w /(h*h))/10000;
    //             String stat;
    //             if (bmiScore<18.5){
    //                 stat = "Underweight";
    //             }
    //             else if (bmiScore<25 && bmiScore>18.5){
    //                 stat = "Normal";
    //             }
    //             else if (bmiScore<30){
    //                 stat = "Overweight";
    //             }
    //             else 
    //                 stat = "Obese";
    //             result.setText(String.format("Your BMI is : %.2f (%s)", bmiScore, stat));
    //         }
            
    //     });
            

