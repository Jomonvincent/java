import java.util.Stack;
import java.util.*;
import java.util.EmptyStackException;

class GenericStack<T>
{
    private Stack<T> stack=new Stack<T>();
    public void push(T item)
    {
        stack.push(item);
        System.out.println(item +" pushed to the top of the stack");
    }
    public T pop()
    {
        if(stack.isEmpty())
        {
            throw new EmptyStackException();
        }
        else
            return stack.pop();
        
    }
    public void display()
    {
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack elements");
            for(int i=stack.size()-1;i>=0;i--)
            {
                System.out.println(stack.get(i));
            }
        }

    }

}

public class genstack {
    public static void main(String[] args)
    {
        GenericStack<String> stack=new GenericStack<>();
        int ch;
        System.out.println("Stack operations\n1. Push\n2. Pop\n3. Display\n4. Exit");
        Scanner obj=new Scanner(System.in);
        do{
            System.out.print("Enter your choice : ");
            ch=obj.nextInt();
            obj.nextLine();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter the item :");
                    String item=obj.nextLine();
                    stack.push(item);
                    break;
                case 2:
                    String del=stack.pop();
                    System.out.println(del+" poped from the stack");
                    break;  
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program.....");
                    return;
                default:
                    System.out.println("Invalid input");  
            }
        }while(ch!=4);
        obj.close();
    }
    
}
