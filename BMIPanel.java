import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMIPanel extends JPanel {
    public BMIPanel(){

        JLabel height = new JLabel("Height (cm):");
        JTextField heightField = new JTextField();
        JLabel weight = new JLabel("Weight (kg):");
        JTextField weightField = new JTextField();
        JButton calaculate = new JButton("calculate!");
        JLabel result = new JLabel("your BMI:");

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        JLabel gender = new JLabel("choose your gender(or not if you prefer not to say): %s");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        add(gender);
        add(female);
        add(male);
        add(height);
        add(heightField);
        add(weight);
        add(weightField);
        add(calaculate);
        add(result);

         calaculate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                double h = Double.parseDouble(heightField.getText());
                double w = Double.parseDouble(weightField.getText());
                double bmiScore = (w /(h/100*h/100));
                String stat;
                if (bmiScore<18.5){
                    stat = "Underweight";
                }
                else if (bmiScore<25 && bmiScore>18.5){
                    stat = "Normal";
                }
                else if (bmiScore<30){
                    stat = "Overweight";
                }
                else 
                    stat = "Obese";
                if (male.isSelected()){
                    result.setText(String.format("Gender: male; Your BMI is : %.2f (%s)", bmiScore, stat));
                }
                else if (female.isSelected()){
                    result.setText(String.format("Gender: Female; Your BMI is : %.2f (%s)", bmiScore, stat));
                } 
                else
                    result.setText(String.format("Your BMI is : %.2f (%s)", bmiScore, stat));
                
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "please enter valid number","input error",JOptionPane.ERROR_MESSAGE);
            }
                 
            }
            
        });




    }



}
