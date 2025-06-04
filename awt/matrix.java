import java.awt.*;
import java.awt.event.*;
public class matrix extends Frame implements ActionListener
{
    TextField tf_row,tf_col;
    Label lb_row,lb_col;
    TextField[][] m1,m2,sum;
    Button readMatrixes_btn, MatrixSum_btn;
    matrix()
    {
        lb_row=new Label("Enter row size");
        lb_row.setBounds(20,40,100,20);
        add(lb_row);

        tf_row=new TextField();
        tf_row.setBounds(20,70,50,20);
        tf_row.addActionListener(this);
        add(tf_row);

        lb_col=new Label("Enter column size");
        lb_col.setBounds(20,90,100,20);
        add(lb_col);

        tf_col=new TextField();
        tf_col.setBounds(20,120,50,20);
        tf_col.addActionListener(this);
        add(tf_col);

        readMatrixes_btn=new Button("create matrix");
        readMatrixes_btn.setBounds(150,70,80,30);
        readMatrixes_btn.addActionListener(this);
        add(readMatrixes_btn);

        MatrixSum_btn=new Button("calculate  sum");
        MatrixSum_btn.setBounds(150,120,80,30);
        MatrixSum_btn.addActionListener(this);
        add(MatrixSum_btn);

        setSize(500,600);
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

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==readMatrixes_btn)
        {
            int m=Integer.parseInt(tf_row.getText()); //get the row and column number from the text field
            int n=Integer.parseInt(tf_col.getText());
            m1=new TextField[m][n];                    //create new Textfield Array
            m2=new TextField[m][n];
            sum=new TextField[m][n];
    
            //reading first matrix
            Label lb_m1=new Label("Enter the first matrix");
            lb_m1.setBounds(20,160,140,15);
            add(lb_m1);
    
            int x=20,y=180,w=30,h=30;
            int a=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    m1[i][j]=new TextField();
                    m1[i][j].setBounds(x,y,w,h);
                    m1[i][j].addActionListener(this);
                    add(m1[i][j]);
                    x+=35;
                    a=x;
                }
                y+=35;
                x=20;
            }
    
    
            //reading second matrix
            Label lb_m2=new Label("Enter the second matrix");
            lb_m2.setBounds(160,160,140,15);
            add(lb_m2);
    
            x=a+50;
            y=180;
            w=30;
            h=30;
            int b=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    m2[i][j]=new TextField();
                    m2[i][j].setBounds(x,y,w,h);
                    m2[i][j].addActionListener(this);
                    add(m2[i][j]);
                    x+=35;
                    b=x;
                }
                y+=35;
                x=a+50;
            }
    
    
            //matrix to display sum
            Label lb_sum=new Label("Sum of two matrix");
            lb_sum.setBounds(340,160,140,15);
            add(lb_sum);
    
            x=b+50;
            y=180;
            w=30;
            h=30;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    sum[i][j]=new TextField();
                    sum[i][j].setBounds(x,y,w,h);
                    sum[i][j].addActionListener(this);
                    sum[i][j].setEditable(false);
                    add(sum[i][j]);
                    x+=35;
                }
                y+=35;
                x=b+50;
            }
    
        }
        if(e.getSource()==MatrixSum_btn)
        {
            for (int i=0;i<Integer.parseInt(tf_row.getText());i++)
            {
                for(int j=0;j<Integer.parseInt(tf_col.getText());j++)
                {
                    int num1=Integer.parseInt(m1[i][j].getText());
                    int num2=Integer.parseInt(m2[i][j].getText());
                    sum[i][j].setText(String.valueOf(num1+num2));       
                }
            }
        }
    }
   
    public static void main(String[] args)
    {
        new matrix();
    }
}
