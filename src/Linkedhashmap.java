import java.util.*;

public record Linkedhashmap() {
    
    public static void linkedhashmap() {
        Map<String, Integer> lhmap = new LinkedHashMap<String, Integer>();
        // Map<String, Integer> whmap = new WeakHashMap<String, Integer>();

        lhmap.put("Zero", 0);
        lhmap.put("One", 1);
        lhmap.put("Two", 2);
        lhmap.put("Three",3);
        lhmap.put("Four", 4);

        System.out.println(lhmap);

        System.out.println(lhmap.get("Zero"));

        lhmap.remove("Three");
        System.out.println(lhmap);

        lhmap.replace("Two", 2, 9871);
        System.out.println(lhmap);

        // lhmap.clear();
        // System.out.println(lhmap);

        System.out.println(lhmap.containsKey("One"));
        System.out.println(lhmap.containsValue(1));

        System.out.println(lhmap.containsKey("Hundred"));

        lhmap.putIfAbsent("Three", 3);
        System.out.println(lhmap);

        System.out.println(lhmap.hashCode());
    }
}
