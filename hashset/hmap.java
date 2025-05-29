import java.util.HashMap;
import java.util.Map;
public class hmap {
    public static void main(String[] args)
    {
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three"); 
        map.put(4,"for");
        map.put(5,"five");
        System.out.println("Map = "+map);
        map.replace(4,"four");
        map.remove(1);
        System.out.println("Map = "+map);
        if(!map.isEmpty())
            System.out.println("size of map "+map.size());
        else
            System.out.println("Map is empty");
    }
}