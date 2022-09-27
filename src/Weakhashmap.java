import java.util.*;

public class Weakhashmap {
    
    public static void weakhashmap() {
        Map<String, Integer> whmap = new WeakHashMap<String, Integer>();

        whmap.put("Zero", 0);
        whmap.put("One", 1);
        whmap.put("Two", 2);
        whmap.put("Three",3);
        whmap.put("Four", 4);

        System.out.println(whmap);

        System.out.println(whmap.get("Zero"));

        whmap.remove("Three");
        System.out.println(whmap);

        whmap.replace("Two", 2, 74287);
        System.out.println(whmap);

        // whmap.clear();
        // System.out.println(whmap);

        System.out.println(whmap.containsKey("One"));
        System.out.println(whmap.containsValue(1));

        System.out.println(whmap.containsKey("Hundred"));

        whmap.putIfAbsent("Three", 3);
        System.out.println(whmap);

        System.out.println(whmap.hashCode());
    }

}
