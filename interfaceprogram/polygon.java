import java.util.Scanner;
interface shape
{
    void area();
    void perimeter();
}
class circle implements shape
{
    double radius;
    circle(double radius)
    {
        this.radius=radius;
    }
    public void area()
    {
        double area=Math.PI*radius*radius;
        System.out.println("area of circle : "+area);
    }
    public void perimeter()
    {
        double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter of circle : "+perimeter);
    }

}
class rectangle implements shape
{
    int len,wid;
    rectangle(int len,int wid)
    {
        this.len=len;
        this.wid=wid;
    }
    public void area()
    {
        int area=len*wid;
        System.out.println("area :"+area);
    }
    public void perimeter()
    {
        int perimeter=2*(len+wid);
        System.out.println("perimter :"+perimeter);
    }
}
public class polygon
{
    public static void main(String[] args)
    {
        int ch;
        Scanner obj=new Scanner(System.in);
        do
        {
            System.out.println("Shapes \n1.Circle\n2.Rectangle\n3.Exit");
            System.out.print("Enter your choice: ");
            ch=obj.nextInt();
            switch(ch)
            {

                case 1:
                    System.out.print("Entet radius : ");
                    double radius=obj.nextDouble();
                    circle c=new circle(radius);
                    c.area();
                    c.perimeter();
                    break;
                case 2:
                    System.out.print("Entet length and breadth : ");
                    int len=obj.nextInt();
                    int wid=obj.nextInt();
                    rectangle r=new rectangle(len,wid);
                    r.area();
                    r.perimeter();
                    break;
                case 3:
                    System.out.println("Exiting the program ....");
                    obj.close();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }while(ch!=3);
    }
}