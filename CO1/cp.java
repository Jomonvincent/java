class CPU
{
    int price;
    CPU(int price)
    {
        this.price=price;
    }
    void display()
    {
        System.out.println("price of CPU = "+this.price);
    }
    public class processor
    {
        int n;
        String manufacturer;
        processor(int n,String manufacturer)
        {
            this.n=n;
            this.manufacturer=manufacturer;
        }
        void display()
        {
            System.out.println("No of processor : "+this.n+"\nManufacturer : "+this.manufacturer);
        }
    }
    public static class ram
    {
        int memory;
        String manufacturer;
        ram(int memory, String manufacturer)
        {
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        void display()
        {
            System.out.println("Memory : "+memory+"\nMaufacturer : "+manufacturer);
        }
    }
}

public class cp
{
   public static void main(String[] args)
   {
    CPU c=new CPU(2000);
    c.display();
    CPU.processor p=c.new processor(4,"Intel");
    p.display();
    CPU.ram r=new CPU.ram(8,"Nividia"); 
    r.display();
   }
}
