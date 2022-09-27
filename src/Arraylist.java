import java.util.*;

public class Arraylist {

    public static void arraylist() {
        List<Integer> a1 = new ArrayList<>();
        // System.out.println(a1);
        for (int i = 0; i <= 5; i++) {
            a1.add(i);
        }
        System.out.println(a1);

        // a1.add(3, 100);
        // System.out.println(a1);

        // a1.remove(2);
        // System.out.println(a1);

        // a1.add(300);
        // System.out.println(a1);

        // a1.sort(null);
        // System.out.println(a1);

        // List<Integer> a2 = new ArrayList<>();
        // a2.addAll(a1);
        // System.out.println(a2);

        int a1Get = a1.get(3);
        System.out.println(a1Get);

        // a2.clear();
        // System.out.println(a2);

        a1.set(2, 100);
        System.out.println(a1);

        if (a1.contains(7)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        a1.add(7);

        if (a1.contains(7)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);
        int index = Collections.binarySearch(a1, 7);
        System.out.println(index);
        index = Collections.binarySearch(a1, 13);
        System.out.println(index);
        System.out.println(a1);

        // Iterator<Integer> it = new a1.iterator<>();
                // iterator not working
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
    }
    
}
