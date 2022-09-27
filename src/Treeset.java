import java.util.*;

public class Treeset {
    
    public static void treeset() {
        Set<Integer> treehset = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            treehset.add(i);
        }
        System.out.println(treehset);

        treehset.add(9);
        treehset.add(60);
        treehset.add(7627);
        treehset.add(1002001);
        treehset.add(1);
        System.out.println(treehset);

        treehset.remove(4);
        System.out.println(treehset);

        System.out.println(treehset.size());

        if (treehset.contains(3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (treehset.contains(7)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (treehset.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
