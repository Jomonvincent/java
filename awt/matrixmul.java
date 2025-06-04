import java.awt.*;
import java.awt.event.*;
class matrixmul extends Frame implements ActionListener
{
    TextField r1,r2,c1,c2;
    Label lbr1,lbr2,lbc1,lbc2;
    Button matrix_btn,matrixMul_btn;
    TextField[][] a,b,mul;

    matrixmul()
    {
        lbr1=new Label("Enter row of first matrix");
        lbr1.setBounds(30,30,150,30);
        add(lbr1);
        r1=new TextField();
        r1.setBounds(180,30,30,30);
        r1.addActionListener(this);
        add(r1);

        lbc1=new Label("Enter column of first matrix");
        lbc1.setBounds(30,70,150,30);
        add(lbc1);
        c1=new TextField();
        c1.setBounds(180,70,30,30);
        c1.addActionListener(this);
        add(c1);

        lbr2=new Label("Enter row of second matrix");
        lbr2.setBounds(30,140,150,30);
        add(lbr2);
        r2=new TextField();
        r2.setBounds(180,140,30,30);
        r2.addActionListener(this);
        add(r2);

        lbc2=new Label("Enter column of second matrix");
        lbc2.setBounds(30,180,150,30);
        add(lbc2);
        c2=new TextField();
        c2.setBounds(180,180,30,30);
        c2.addActionListener(this);
        add(c2);

        matrix_btn=new Button("Create matrix");
        matrix_btn.setBounds(30,230,100,30);
        matrix_btn.addActionListener(this);
        add(matrix_btn);

        matrixMul_btn=new Button("Multiply matrix");
        matrixMul_btn.setBounds(150,230,100,30);
        matrixMul_btn.addActionListener(this);
        add(matrixMul_btn);

        setSize(500,700);
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
        int row1=Integer.parseInt(r1.getText());
        int row2=Integer.parseInt(r2.getText());
        int col1=Integer.parseInt(c1.getText());
        int col2=Integer.parseInt(c2.getText());
        if(e.getSource()==matrix_btn)
        {
            if(!c1.getText().equals(r2.getText()))
            {
                Label lb=new Label("Colum1 and row2 doesn't match can't perform multiplication");
                lb.setBounds(30,300,200,30);
                add(lb);
                
            }
            else
            {
                

                a=new TextField[row1][col1];
                b=new TextField[row2][col2];
                mul=new TextField[row1][col2];
                
                int x1=30,y1=300,w1=30,h1=30;
                for(int i=0;i<row1;i++)
                {
                    for(int j=0;j<col1;j++)
                    {
                        a[i][j]=new TextField();
                        a[i][j].setBounds(x1,y1,w1,h1);
                        a[i][j].addActionListener(this);
                        add(a[i][j]);
                        x1+=40;
                     
                    }
                    y1+=40;
                    x1=30;
                }
               
                int x2 = x1 + (col1 * 40) + 50;
                y1=300;
                for(int i=0;i<row2;i++)
                {
                    for(int j=0;j<col2;j++)
                    {
                        b[i][j]=new TextField();
                        b[i][j].setBounds(x2,y1,w1,h1);
                        b[i][j].addActionListener(this);
                        add(b[i][j]);
                        x2+=40;
                        
                    }
                    y1+=40;
                    x2 = x1 + (col1 * 40) + 50;                
                }

                y1=300;
                int x3 = x2 + (col2 * 40) + 50;
                for(int i=0;i<row1;i++)
                {
                    for(int j=0;j<col2;j++)
                    {
                        mul[i][j]=new TextField();
                        mul[i][j].setBounds(x3,y1,w1,h1);
                        mul[i][j].addActionListener(this);
                        add(mul[i][j]);
                        x3+=40;
                    }
                    y1+=40;
                    x3 = x2 + (col2 * 40) + 50;               
                }
            }
        }
        if(e.getSource()==matrixMul_btn)
        {
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    mul[i][j].setText("0");
                    for(int k=0;k<col1;k++)
                    {
                        int num1=Integer.parseInt(a[i][k].getText());
                        int num2=Integer.parseInt(b[k][j].getText());
                        mul[i][j].setText(String.valueOf(Integer.parseInt(mul[i][j].getText())+(num1*num2)));
                    }
                }
            }
        }

    }
    public static void main(String[] args)
    {
        new matrixmul();
    }
    
}
