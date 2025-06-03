import java.awt.*;
import java.awt.event.*;

class cal extends Frame implements ActionListener {
    TextField tf; // Input field
    Button[] b;   // Array of buttons
    String operators[] = {"+", "-", "*", "/", "="}; // Supported operators
    String operator = "";
    double num1, num2;

    cal() 
    {
        // Create TextField for input
        tf = new TextField();
        tf.setBounds(50, 50, 200, 30);
        add(tf);

        // Create buttons dynamically
        b = new Button[operators.length];
        int x = 50, y = 100, width = 50, height = 50;
        for (int i = 0; i < operators.length; i++) {
            b[i] = new Button(operators[i]); 
            b[i].setBounds(x, y, width, height);
            b[i].addActionListener(this); // Register button click listener
            add(b[i]);
            x += 50;
            if (x >= 200) {
                x = 50;
                y += 50;
            }
        }
        
        // Set Frame properties
        setSize(300, 400);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("=")) {
            try {
                String expression = tf.getText();
                double result = evaluateExpression(expression); // Extract and compute
                tf.setText(String.valueOf(result));
            } catch (Exception ex) {
                tf.setText("Error");
            }
        } else {
            tf.setText(tf.getText() + command); // Append to text field
        }
    }

    private double evaluateExpression(String expression) {
        for (String op : operators) {
            int index = expression.indexOf(op); // Find operator position
            if (index > 0) {
                try {
                    double num1 = Double.parseDouble(expression.substring(0, index));
                    double num2 = Double.parseDouble(expression.substring(index + 1));
                    return performCalculation(num1, num2, op);
                } catch (NumberFormatException e) {
                    return Double.NaN;
                }
            }
        }
        return Double.NaN;
    }

    private double performCalculation(double num1, double num2, String operator) {
        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return (num2 != 0) ? num1 / num2 : Double.NaN; // Avoid division by zero
            default: return Double.NaN;
        }
    }

    public static void main(String[] args) {
        new cal();
    }
}
