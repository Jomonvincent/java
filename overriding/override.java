import java.util.*;
class shape
{
    double area()
    {
        return 0;
    }
}
class square extends shape
{
    double side;
    square(double side)
    {
        this.side=side;
    }
    double area()
    {
        return side*side;
    }
}
class rectangle extends shape
{
    double len,bre;
    rectangle(double l,double b)
    {
        this.len=l;
        this.bre=b;
    }
    double area()
    {
        return len*bre;
    }
}
class triangle extends shape
{
    double hei,bre;
    triangle(double l,double b)
    {
        this.hei=l;
        this.bre=b;
    }
    double area()
    {
        return 0.5*hei*bre;
    }
}
class circle extends shape
{
    double rad;
    circle(double r)
    {
        this.rad=r;
    }
    double area()
    {
        return Math.PI*rad*rad;
    }
}
public class override
{
    public static void main(String[] args)
    {
        shape rect=new rectangle(5,6);
        System.out.println("area of reactangle: "+rect.area());

        shape cir=new circle(5);
        System.out.println("area of circle: "+cir.area());
        
        shape sq=new square(6);
        System.out.println("area of square: "+sq.area());

        shape tri=new triangle(5,6);
        System.out.println("area of triangle: "+tri.area());

    }
}