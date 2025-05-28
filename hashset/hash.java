import java.util.HashSet;
public class hash
{
    public static void main(String[] args)
    {
        HashSet<String> Set1=new HashSet<>();
        HashSet<String> Set2=new HashSet<>();
        Set1.add("A");
        Set1.add("B");
        Set1.add("C");

        Set2.add("A");
        Set2.add("B");
        Set2.add("C");
        if(Set1.equals(Set2))
            System.out.println("Both sets contain same elements : "+Set1 );
        else
            System.out.println("Both sets are not the same");
    }
}

