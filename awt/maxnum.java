import java.awt.*;
import java.awt.event.*;

public class maxnum extends Frame implements ActionListener
{
    TextField num1,num2,num3;
    Label result;
    maxnum()
    {
        num1=new TextField();
        num1.setBounds(100,100,150,20);
        add(num1);
        num2=new TextField();
        num2.setBounds(100,150,150,20);
        add(num2);
        num3=new TextField();
        num3.setBounds(100,200,150,20);
        add(num3);
            //created three numfields
        Button bt=new Button("find max");
        bt.setBounds(150,250,50,20 );
        bt.addActionListener(this);
        add(bt);
        result=new Label();
        result.setBounds(100,300,150,20);
        add(result);
            //created a button and a label named result for storing result
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(num1.getText());
        int n2=Integer.parseInt(num2.getText());
        int n3=Integer.parseInt(num3.getText()); //collected the three value from user
        int max=Math.max(n1,Math.max(n2,n3));   //find the max value
        result.setText("Max val = "+max);      //printed the result into the result label
    }
    public static void main(String[] args)
    {
        new maxnum();
    }
} 