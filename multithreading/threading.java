import java.util.Scanner;
class fibThread implements Runnable
{
    int n;
    public fibThread(int n)
    {
        this.n=n;
    }
    public void run()
    {
        int a=0, b=1;
        System.out.print("Fibonacci : "+a+" "+b);
        for(int i=2; i<n; i++)
        {
            int next=a+b;
            System.out.print(" "+next);
            a=b;
            b=next;
        }
        System.out.print("\n");  

    }
}
class evenThread implements Runnable
{
    int n;
    public evenThread(int n)
    {
        this.n=n;
    }
    public void run()
    {
        System.out.print("Even numbers are : ");
        for(int i=2; i<=n; i+=2)
        {
                System.out.print(" "+i);  
        }
        System.out.print("\n");  

    }
}

public class threading {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit for fibonnaci series : ");
        int limit=obj.nextInt();
        System.out.println("Enter the range for even numbers : ");
        int range=obj.nextInt();
        fibThread f1=new fibThread(limit);
        evenThread e1=new evenThread(range);
        Thread fib=new Thread(f1);
        Thread even=new Thread(e1);
        fib.start();
        even.start();
        obj.close();
    }
}