import java.util.*;

public class Collectionsclass {
    
    public static void collectionsclass() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(505);
        list.add(100);
        list.add(100);
        list.add(31);
        System.out.println(list);

        System.out.println("Minimum Element: " + Collections.min(list));
        System.out.println("Maximum Element: " + Collections.max(list));

        System.out.println(Collections.frequency(list, 100));
        System.out.println(Collections.frequency(list, 5));

        Collections.sort(list, Comparator.naturalOrder());  // ascending
        System.out.println(list);

        int searchPosition = Collections.binarySearch(list, 31);
        System.out.println(searchPosition);

        Collections.sort(list, Comparator.reverseOrder());  // descending
        System.out.println(list);
    }
}
