import java.util.Scanner;
//imginary number addition in a complex,time wasting way

class imaginary
{
    int i,r;
    imaginary(int i,int r)
    {
        this.i=i;
        this.r=r;
    }
    public static imaginary add(imaginary a,imaginary b)
    {
        int isum=a.i+b.i;
        int rsum=a.r+b.r;
        return new imaginary(rsum,isum);
    }
}
public class img
{
    public static void main(String[] args)
    {
        Scanner obb=new Scanner(System.in);
        System.out.println("Enter two imaginary numbers ");
        imaginary[] n= new imaginary[2];
        for(int k=0;k<2;k++)
        {
            System.out.println("Enter the real part of the no :");
            int r=obb.nextInt();
            obb.nextLine();
            System.out.println("Enter the imaginary part of the no :");
            int i=obb.nextInt();
            n[k]=new imaginary(r,i);
        }
        imaginary result=imaginary.add(n[0],n[1]);
        if(result.i>0)
            System.out.println(result.r+"+"+result.i+"i");
        else
            System.out.println(result.r+""+result.i+"i");
        obb.close();
    }
}
