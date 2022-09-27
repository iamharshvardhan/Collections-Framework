import java.util.*;

public class Hashset {
    
    public static void hashset() {
        Set<Integer> hset = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            hset.add(i);
        }
        System.out.println(hset);

        hset.add(36);
        hset.add(61);
        hset.add(7);
        hset.add(55);
        System.out.println(hset);

        hset.remove(4);
        System.out.println(hset);

        System.out.println(hset.size());

        if (hset.contains(3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (hset.contains(7)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (hset.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
