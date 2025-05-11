import java.util.Scanner;
import java.util.PriorityQueue;


public class PriorityQ
{
    public static void main(String args[])
    {
        int ch;
        Scanner poo=new Scanner(System.in);
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        do{
            System.out.println("Enter your choice \n1. Add an element \n2. remove an element \n3. View the smallest element(peek) \n4. remove the smallest element(poll) \n5. Display the size of the pq \n6. Display the elements of the queue \n7. Exit ");
            ch=poo.nextInt();
            poo.nextLine();
            switch(ch)
            {
                case 1:
                {
                    System.out.print("Enter the element to insert :");
                    int add_item=poo.nextInt();
                    pq.add(add_item);
                    System.out.println(add_item+" inserted in to PQ");
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the element to remove :");
                    int rem_item=poo.nextInt();
                    if(pq.remove(rem_item))
                        System.out.println(rem_item+" removed from PQ");
                    else
                        System.out.println(rem_item+" not fount in PQ");
                    break;
                }
                case 3:
                {
                    Integer small=pq.peek();
                    if(small==null)
                        System.out.println("pq is empty");
                    else
                        System.out.println(small+" is the smallest element in PQ");
                    break;
                }
                case 4:
                {
                    Integer rem=pq.poll();
                    if(rem==null)
                        System.out.println("PQ is empty");
                    else
                        System.out.println(rem+" is removed ");
                    break;
                }
                case 5:
                {
                    System.out.println("size of the pq is "+pq.size());
                    break;
                }
                case 6:
                {
                    if(!pq.isEmpty())
                    {
                        System.out.print("Elements of the pq are : ");
                        for(Integer num : pq)
                            System.out.print(" "+num);
                        System.out.println("");
                    }
                    else
                    {
                        System.out.println("pq is empty");
                    }
                    break;
                }
                case 7:
                {
                    System.out.println("Exiting program");
                    poo.close();
                    break;
                }
                default:
                {
                    System.out.println("Invalid input");
                }   
            }    
        }while(ch!=7);   
    }
}