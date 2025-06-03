import java.util.HashSet;
import java.util.Scanner;
public class hash
{
    public static  void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        HashSet<String> h1=new HashSet<>();
        HashSet<String> h2=new HashSet<>();
        System.out.print("Enter the number of elements you want to enter : ");
        int n=obj.nextInt();
        obj.nextLine();
        String[] a=new String[n];
        for (int i=0;i<n;i++)
        {
            System.out.print("enter the "+i+" element : ");
            a[i]=obj.nextLine();
            h1.add(a[i]);
        }

        System.out.print("Enter the number of elements you want to enter : ");
        int m=obj.nextInt();
        obj.nextLine();
        String[] b=new String[m];
        for(int j=0;j<n;j++)
        {
            System.out.print("Enter the "+j+" element : ");
            b[j]=obj.nextLine();
            h2.add(b[j]);
        }

        if(m==n && h1.equals(h2) )
            System.out.println("Both set contain the same value : "+String.valueOf(h1));//convert hashset element to string and print it
        else
            System.out.println("Bothe are not the same ");

        System.out.println("Checking if the hashsets are empty : "+h1.isEmpty()+" "+h2.isEmpty());
        System.out.println("Checking if h1 contian 'jomon' :"+h1.contains("jomon"));
        System.out.println(h2.remove("jomon"));
        //differnet ways to print hashset
        System.out.println("h1 :"+h2);

        for(String str:h1)
        {
            System.out.println(str);
        }
        obj.close();
    }
}
