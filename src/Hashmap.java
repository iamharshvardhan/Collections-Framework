import java.util.*;

public class Hashmap {
    
    public static void hashmap() {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put("Zero", 0);
        hmap.put("One", 1);
        hmap.put("Two", 2);
        hmap.put("Three",3);
        hmap.put("Four", 4);

        System.out.println(hmap);

        System.out.println(hmap.get("Zero"));

        hmap.remove("Three");
        System.out.println(hmap);

        hmap.replace("Two", 2, 700);
        System.out.println(hmap);

        System.out.println(hmap.containsKey("One"));
        System.out.println(hmap.containsValue(1));

        System.out.println(hmap.containsKey("Hundred"));
        
        hmap.clear();
        System.out.println(hmap);
    }
}
