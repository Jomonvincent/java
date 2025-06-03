import java.io.*;
public class oddeven
{
    public static void main(String[] args)
    {
        try{
            BufferedWriter wr=new BufferedWriter(new FileWriter("number.txt"));
            wr.write("12\n34\n54\n45\n645\n666\n342\n55\n43\n66\n74\n76\n45\n34\n32");
            wr.close();
            BufferedReader r=new BufferedReader(new FileReader("number.txt"));
            BufferedWriter odd=new BufferedWriter(new FileWriter("odd.txt"));
            BufferedWriter even=new BufferedWriter(new FileWriter("even.txt"));
            
            String line;
            while((line=r.readLine())!=null)
            {
                try{
                    int num=Integer.parseInt(line.trim());
                    if(num%2==0)
                    {
                        even.write(num+"\n");
                    }
                    else
                    {
                        odd.write(num+"\n");
                    }  
                }catch(NumberFormatException nfe)
                {
                    System.out.println("Invalid line : " +line);
                }
            }
            odd.close();  
            even.close();
            BufferedReader rodd=new BufferedReader(new FileReader("odd.txt"));
            BufferedReader reven=new BufferedReader(new FileReader("even.txt"));
            System.out.println("odd numbers");
            while((line=rodd.readLine())!=null)
            {
                    System.out.println(line);
            }
            System.out.println("even numbers");

            while((line=reven.readLine())!=null)
            {
                System.out.println(line);
            }
            reven.close();
            rodd.close();
            r.close();

        }catch(IOException ioe)
        {
            System.err.println("Input output esception");
        }
       
    }
}
