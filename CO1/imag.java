import java.util.*;
class imaginary
{
    int r,i;
    imaginary(Scanner obj)
    {
        System.out.print("Enter the real part : ");
        this.r=obj.nextInt();
        obj.nextLine();
        System.out.print("Enter the imaginary part : ");
        this.i=obj.nextInt();
    }
    public void display()
    {
        if(i>0)
            System.out.println(this.r+"+"+this.i+"i");
        else    
            System.out.println(this.r+""+this.i+"i");
    }
}
public class imag
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two imaginary numbers");
        imaginary n1=new imaginary(obj);
        n1.display();
        imaginary n2=new imaginary(obj);
        n2.display();
        int rsum=n1.r+n2.r;
        int isum=n1.i+n2.i;
        if(isum>0)
            System.out.println(rsum+"+"+isum+"i");
        else    
            System.out.println(rsum+""+isum+"i");
        obj.close();
    }
}