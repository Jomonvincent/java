import java.util.*;
import java.util.Deque;
import java.util.LinkedList;

public class mydq
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        Deque<String> dq=new LinkedList<>();
        int choice;
        System.out.println("Deque Operation");
        System.out.println("1. Insert at the begining.\n2. Insert at the end\n3. Delete at the begining\n4. Delete at the end\n5. Display\n6. Exit");
        while(true)
        {
            System.out.print("Enter you choice : ");
            if(!obj.hasNextInt())
            {
                System.out.println("Invalid input .Enter a positive integer.");
                obj.next();
                continue;
            }
            choice=obj.nextInt();
            obj.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the element to insert at first position:");
                    String first=obj.nextLine();
                    dq.addFirst(first);
                    System.out.println(first+" inserted at first position");
                    break;
                case 2:
                    System.out.println("Enter the element to insert at last position");
                    String last=obj.nextLine();
                    dq.addLast(last);
                    System.out.println(last+"inserted at last position");
                    break;
                case 3:
                    String fst=dq.removeFirst();
                    System.out.println(fst+" deleted from the front of the dqueue");
                    break;
                case 4:
                    String lst=dq.removeLast();
                    System.out.println(lst+" deleted from the end of the dequeue");
                    break;
                case 5:
                    System.out.println("Deque : "+dq);
                    break;
                case 6:
                    System.out.println("exiting program...");
                    return;
                default:
                    System.out.println("Invalid input ,enter a valid integer");
            }
        } 
    }
}
