import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

class GenericStack<T>
{
    private Stack<T> stack=new Stack<T>();
    public void push(T item)
    {
        stack.push(item);
    }
    public T pop()
    {
        if(!stack.isEmpty())
        {
            return stack.pop();
        }
        throw new EmptyStackException();
    }
    public void display()
    {
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack elements are");
            for(int i=stack.size()-1; i>=0; i--)
            {
                System.out.println(stack.get(i));
            }
        }
    }
}

public class GenStack {
    public static void main(String args[])
    {
        int ch;
        GenericStack<String> stack=new GenericStack<>();
        Scanner obj=new Scanner(System.in);
        
        do{
            System.out.println("Enter your choice: \n1. push \n2. pop \n3. Display \n 4. Exit");
            ch=obj.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the item : ");
                    obj.nextLine();
                    String item=obj.nextLine();
                    stack.push(item);
                    System.out.println(item+"pushed to the stack");
                    break;
                }
                case 2:
                {
                    try{
                        String pop_item=stack.pop();
                        System.out.println(pop_item+" poped from stack");
                    }catch(EmptyStackException e)
                    {
                        System.out.println("Stack is empty cannot pop");
                    }
                    break;
                }
                case 3:
                {
                    stack.display();
                    break;
                }
                case 4:
                {
                    System.out.println("exiting program");
                    break;
                }
                default:
                {
                    System.out.println("Invalid input");
                }
            }
        }while(ch!=4);
    }
}
