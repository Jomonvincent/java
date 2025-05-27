import java.util.*;
class mat
{
    int n;
    int[][] arr;
    mat(int size)
    {
        this.n=size;
        this.arr=new int[n][n];
    }
    Scanner obj=new Scanner(System.in);
    int[][] getmatrix(int n)
    {
        this.n=n;
        arr=new int[n][n];
        System.out.println("enter matrix : ");

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j]=obj.nextInt();

            }
        }
        return arr;
    }
    void printmatrix()
    {
        System.out.println("matrix : ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void add(int[][] m1,int[][] m2)
    {
        System.out.println("sum of matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                this.arr[i][j]=m1[i][j]+m2[i][j];
            }
        }
    }
    
}
public class matrix {
    public static void main(String[] args)
    {
        System.out.println("Enter the array size :");
        Scanner obb=new Scanner(System.in);
        int n=obb.nextInt();
        mat m1=new mat(n);
        mat m2=new mat(n);
        m1.getmatrix(n);
        m2.getmatrix(n);
        m1.printmatrix();
        m2.printmatrix();
        mat sum=new mat(n);
        sum.add(m1.arr,m2.arr);
        sum.printmatrix();
        obb.close();
    }
}
