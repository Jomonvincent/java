import java.awt.*;
import java.awt.event.*;
public class calculator extends Frame implements ActionListener
{
    TextField tf;
    Button[] b;
    String[] operators={"+","-","*","/","=","AC"};
    String[] numbers={"1","2","3","4","5","6","7","8","9","0"};
    String op;
    double num1,num2;

    calculator()
    {
        tf=new TextField();
        tf.setBounds(10,40,300,20);
        add(tf);

        Panel buttonPanel=new Panel();
        buttonPanel.setLayout(new GridLayout(4,4));
        

        b = new Button[operators.length+numbers.length];
        for(int i=0;i<10;i++)
        {
            b[i]=new Button(numbers[i]);
            b[i].addActionListener(this);
            buttonPanel.add(b[i]);
        }
        for(int i=0;i<operators.length;i++)
        {
            b[i]=new Button(operators[i]);
            b[i].addActionListener(this);
            buttonPanel.add(b[i]);
        }
        
        buttonPanel.setBounds(10,70,250,250);
        add(buttonPanel);
        setSize(300,500);
        setLayout(null);
        setVisible(true); 
        

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String command=e.getActionCommand();
        if(command.equals("AC"))
        {
            tf.setText("");
        }
        else if(command.equals("="))
        {
            try{
                String expression=tf.getText();
                double result=evaluate(expression);
                tf.setText(String.valueOf(result));
            }catch(Exception ec)
            {
                tf.setText("Error");
            }
        }
        else{
            tf.setText(tf.getText()+command);
        }
    }
    public double evaluate(String expression)
    {
        double result;
        for(String op:operators)
        {
            int index=expression.indexOf(op);
            if(index>0)
            {
                try{
                    num1=Double.parseDouble(expression.substring(0,index));
                    num2=Double.parseDouble(expression.substring(index+1));
                    result=calculateExp(num1,num2,op);
                    return result;  
                }catch(Exception e)
                {
                    return Double.NaN;
                }
            }
        }
        return Double.NaN;
    }
    double calculateExp(double num1,double num2,String op)
    {
        switch (op) {
            case "+": return num1+num2; 
            case "-": return num1-num2; 
            case "*": return num1*num2; 
            case "/": return (num2>0)?num1/num2:Double.NaN;   
            default: return Double.NaN;
        }
    }
    public static void main(String[] args)
    {
        new calculator();
    }
}
