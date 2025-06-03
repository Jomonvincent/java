import java.awt.*;
import java.awt.event.*;
public class mousewin extends Frame implements MouseListener,WindowListener
{
    mousewin()
    {
        addMouseListener(this);
        addWindowListener(this); 
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }


    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Mouse clicked");
    }
    public void mousePressed(MouseEvent e)
    {
        System.out.println("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Mouse released");
    }
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Mouse entered");
    }
    public void mouseExited(MouseEvent e)
    {
        System.out.println("Mouse Exiting");
    }


    public void windowOpened(WindowEvent e)
    {
        System.out.println("Window opened");
    }
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Closing window");
        dispose();
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("window closed");
    }
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Window iconified");
    }
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Window deiconified");
    }
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Window activated");
    }
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Window deactivated");
    }
    
    public static void main(String[] args)
    {
        new mousewin();
    }
    
}