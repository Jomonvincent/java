import java.util.Scanner;
import java.util.ArrayList;

public class StrList {
    public static void main(String args[])
    {
        ArrayList<String> strlist=new ArrayList<>();
        Scanner obb=new Scanner(System.in);
        int ch;
        do{
            System.out.println("Enter you choice \n1. add a string \n2. remove a string \n3. Search \n4.Display \n5. Exit");
            ch=obb.nextInt();   
            obb.nextLine();
            switch(ch)
            {
                case 1:
                {
                    System.out.print("Enter a string to add : ");
                    String add_item=obb.nextLine();
                    strlist.add(add_item);
                    System.out.println(add_item+" added to list ");
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the string to remove : ");
                    String rem_item=obb.nextLine();
                    if(strlist.remove(rem_item))
                        System.out.println(rem_item+" removed from list");
                    else
                        System.out.println(rem_item+" is not in list");
                    break;
                }
                case 3:
                {
                    System.out.print("Enter the string to search : ");
                    String ser_item=obb.nextLine();
                    strlist.contains(ser_item);
                    if(strlist.remove(ser_item))
                        System.out.println(ser_item+" found in list");
                    else
                        System.out.println(ser_item+" not found in list");
                    break;
                }
                case 4:
                {
                    if(strlist.isEmpty())
                    {
                        System.out.println("The list is empty");
                    }
                    else
                    {
                        System.out.println("current list ");
                        for(String str: strlist)
                            System.out.println("\n"+str);
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("exiting program.... ");
                    obb.close();
                    break;
                }
                default:
                    System.out.println("Invalid input ");
            }
        }while(ch!=5);
        
    }
}
