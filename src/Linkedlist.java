import java.util.*;

public class Linkedlist {

    public static void linkedlist() {
        // List<Integer> list = new LinkedList<>();
        // for (int i = 0; i < 5; i++) {
        //     list.add(i);
        // }
        // System.out.println(list);
        
        // list.add(2, 100);
        // System.out.println(list);

        // System.out.println(list.get(1));

        // list.remove(4);
        // System.out.println(list);

        // list.remove(Integer.valueOf(100));
        // System.out.println(list);

        // list.add(300);
        // System.out.println(list);

        // LinkedList<Integer> list2 = new LinkedList<>();
        // for (int i = 0; i < 5; i++) {
        //     list2.add(i);
        // }
        // System.out.println("List 2: " + list2);
        
        // // list2.removeAll(list2);
        // // System.out.println("List 2: " + list2);

        // list.set(0, 500);
        // System.out.println(list);

        // System.out.println(list.contains(3));
        // System.out.println(list.contains(2));

        // Collections.sort(list);
        // System.out.println(list);

        // Collections.reverse(list2);
        // System.out.println("List2: " + list2);

        // int index = Collections.binarySearch(list, 300);
        // System.out.println(index);
        // index = Collections.binarySearch(list, 2);
        // System.out.println(index);
        // System.out.println(list);

        // *******************LinkedList as Queue***************************

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }
        System.out.println(queue);

        queue.add(100);
        queue.offer(200);
        System.out.println(queue);

        queue.poll();
        queue.remove(200);
        System.out.println(queue);

        System.out.println(queue.peek());

        queue.add(300);
        queue.add(50);
        queue.add(36);
        System.out.println(queue);
    }
}
