import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    TextField tf;
    String num1 = "", operator = "", num2 = "";

    SimpleCalculator() {
        setLayout(new BorderLayout());

        tf = new TextField();
        tf.setEditable(false);
        add(tf, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttons = { "7", "8", "9", "/", "4", "5", "6", "*",
                             "1", "2", "3", "-", "0", "=", "+", "C" };

        for (String label : buttons) {
            Button b = new Button(label);
            b.addActionListener(this);
            buttonPanel.add(b);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setSize(300, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("C")) { 
            tf.setText("");
            num1 = ""; num2 = ""; operator = "";
        } else if ("0123456789".contains(cmd)) {
            if (operator.isEmpty()) {
                num1 += cmd;
                tf.setText(num1);
            } else {
                num2 += cmd;
                tf.setText(num2);
            }
        } else if ("+-*/".contains(cmd)) {
            if (!num1.isEmpty()) {
                operator = cmd;
            }
        } else if (cmd.equals("=")) {
            try {
                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);
                double result = 0;
                switch (operator) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = b != 0 ? a / b : Double.NaN; break;
                }
                tf.setText(String.valueOf(result));
                num1 = String.valueOf(result);
                num2 = "";
                operator = "";
            } catch (Exception ex) {
                tf.setText("Error");
                num1 = num2 = operator = "";
            }
        }
    }

    public static void main(String[] args) { new SimpleCalculator(); }
}