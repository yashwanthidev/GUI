import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class IntegerDivisionGUI extends JFrame implements ActionListener{
    //GUI components
    JTextField num1Field,num2Field,resultField;
    JButton divideButton;
    public IntegerDivisionGUI(){
        //Frame settings
        setTitle("Integer Division");
        setSize(400,200);
        setLayout(new GridLayout(4,2,10,10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Labels
        JLabel num1Label = new JLabel("Num1:");
        JLabel num2Label = new JLabel("Num2:");
        JLabel resultLabel = new JLabel("Result:");

        //Text fields
        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);
 
       //Button
       divideButton = new JButton("Divide");
       divideButton.addActionListener(this);

       //Adding components to frame
       add(num1Label);
       add(num1Field);
       add(num2Label);
       add(num2Field);
       add(resultLabel);
       add(resultField);
       add(new JLabel());
       add(divideButton);
       setVisible(true);
}
    //Event handling
    public void actionPerformed(ActionEvent e){
        try{
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            //Check for division by zero
            int result = num1/num2;
            resultField.setText(String.valueOf(result));
           }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(this,"Please enter valid integers!","Input Error",JOptionPane.ERROR_MESSAGE);
            }catch(ArithmeticException ae){
                JOptionPane.showMessageDialog(this,"Division by zero is not allowed!","Arithmetic Error",JOptionPane.ERROR_MESSAGE);
              }
             }
            public static void main(String[] args){
                new IntegerDivisionGUI();
              }
             }
