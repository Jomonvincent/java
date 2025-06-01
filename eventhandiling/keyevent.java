import java.awt.*;
import java.awt.event.*;

class keyevent extends Frame implements KeyListener
{
    Label label;
    keyevent()
    {
        label=new Label();
        label.setBounds(50,50,200,20);
        add(label);
        addKeyListener(this);

        setSize(300,300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent w)
            {
                dispose();
            }
        });
    }
    public void keyPressed(KeyEvent e)
    {
        label.setText("key pressed : "+e.getKeyCode());
    }
    public void keyReleased(KeyEvent e)
    {
        label.setText("Key released : "+e.getKeyChar());
    }
    public void keyTyped(KeyEvent e)
    {
        label.setText("Key typed : "+e.getKeyChar());
    }
    public static void main(String[] args)
    {
        new keyevent();
    }
}