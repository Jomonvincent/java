import java.util.Scanner;
class Shapes
{
    int area(int n)
    {
        return n*n;
    }
    int area(int l,int w)
    {
        return l*w;
    }
    double area(int h,int b,boolean isTriangle)
    {
        return 0.5*b*h;
    }
    double area(double r,boolean isCircle)
    {
        return r*r*Math.PI;
    }
}


public class over
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        Shapes shape=new Shapes();
        System.out.println("Enter the length of th square");
        int n=obj.nextInt();
        System.out.println("area of the square :"+shape.area(n));

        System.out.println("Enter the length of th rectangle");
        int l=obj.nextInt();
        System.out.println("Enter the bredth of th rectangle");
        int w=obj.nextInt();
        System.out.println("area of the square :"+shape.area(l,w));

        System.out.println("Enter the height of th trianngle");
        int h=obj.nextInt();
        System.out.println("Enter the bredth of th trianlge");
        int b=obj.nextInt();
        System.out.println("area of the square :"+shape.area(h,b,true));

        System.out.println("Enter the radius of th circle");
        double r=obj.nextInt();
        System.out.println("area of the square :"+shape.area(r,true));
        obj.close();
    }
}
