import java.util.*;

public class Linkedhashset {
    
    public static void linkedhashset() {
        Set<Integer> linkedhset = new LinkedHashSet<>();
        for (int i = 0; i < 5; i++) {
            linkedhset.add(i);
        }
        System.out.println(linkedhset);

        linkedhset.add(300);
        linkedhset.add(600);
        linkedhset.add(777);
        linkedhset.add(551011);
        System.out.println(linkedhset);

        linkedhset.remove(4);
        System.out.println(linkedhset);

        System.out.println(linkedhset.size());

        if (linkedhset.contains(3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (linkedhset.contains(7)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (linkedhset.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
