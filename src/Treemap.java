import java.util.*;

public class Treemap {
    
    public static void treemap() {
        Map<String, Integer> tmap = new TreeMap<String, Integer>();

        tmap.put("Zero", 0);
        tmap.put("One", 1);
        tmap.put("Two", 2);
        tmap.put("Three",3);
        tmap.put("Four", 4);

        System.out.println(tmap);       // Output wil be arranged in the order of the keys in

        System.out.println(tmap.get("Zero"));

        tmap.remove("Three");
        System.out.println(tmap);

        tmap.replace("Two", 2, 15001);
        System.out.println(tmap);

        // tmap.clear();
        // System.out.println(hmap);

        System.out.println(tmap.containsKey("One"));
        System.out.println(tmap.containsValue(1));

        System.out.println(tmap.containsKey("Hundred"));

        tmap.putIfAbsent("Three", 3);
        System.out.println(tmap);

        System.out.println(tmap.hashCode());
    }
}
