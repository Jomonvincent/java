import java.util.Scanner;
class Employee
{
    int n;
    String name;
    float salary;
    Employee(int n,String name,float salary)
    {
        this.n=n;
        this.name=name;
        this.salary=salary;
    }
}
public class emp 
{
    public static void main(String[] args)
    {
        System.out.println("Enter Employee details");
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of employees you want to enter : ");
        int n=obj.nextInt();
        Employee[] emp=new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the id : ");
            int id=obj.nextInt();
            obj.nextLine();
            System.out.print("Enter the name : ");
            String name=obj.nextLine();
            System.out.print("Enter the salary : ");
            float salary=obj.nextFloat();
            emp[i] =new Employee(id,name,salary);
        }

        System.out.println("Enter the id to search : ");
        int search=obj.nextInt();
        boolean found=false;
        for(Employee employee:emp)
        {
            if(search==employee.n)
            {
                System.out.println("Employee Found");
                System.out.println("Name : "+employee.name);
                System.out.println("Id : "+employee.n);
                System.out.println("Salary : "+employee.salary);
                found=true;
            }
        }
        if(!found)
            System.out.println("Employee not found");
        obj.close();

    }
}
