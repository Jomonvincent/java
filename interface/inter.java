import java.util.*;

interface shapes
{
    void area();
    void perimeter();
}
class circle implements shapes
{
    double radius;
    public circle(double radius)
    {
        this.radius=radius;
    }
    public void area()
    {
        double area=Math.PI*radius*radius;
        System.out.println("area of the circle = "+area);
    }
    public void perimeter()
    {
        double perimeter=2*Math.PI*radius;
        System.out.println("perimeter of the circle = "+perimeter);
    }
}
class rectangle implements shapes
{
    double len, wid;
    public rectangle(double len, double wid)
    {
        this.len=len;
        this.wid=wid;
    };
    public void area()
    {
        double area=len*wid;
        System.out.println("area of the rectangle ="+area);
    }
    public void perimeter()
    {
        double perimeter=2*(len+wid);
        System.out.println("area of the rectangle ="+perimeter);
    }
}
public class inter
{
    public static void main(String args[])
    {
        int ch;
        Scanner obj=new Scanner(System.in);
        do{
            System.out.println("Choose a shape\n1. Circle \n2.Rectangle \n3. Exit");
            ch=obj.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the radius of the circle : ");
                    double radius=obj.nextDouble();
                    circle c1=new circle(radius);
                    c1.area();
                    c1.perimeter();
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the length of the rectangle : ");
                    double length=obj.nextDouble();
                    System.out.println("Enter the breadth of the rectangle : ");
                    double width=obj.nextDouble();
                    rectangle r1=new rectangle(length,width);
                    r1.area();
                    r1.perimeter();
                    break;
                }
                case 3:
                {
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }
            }
        }while(ch!=3);
      obj.close();
    }
}