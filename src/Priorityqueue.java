import java.util.*;

public class Priorityqueue {
    
    public static void priorityqueue() {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < 5; i++) {
            pq.add(i);
        }
        System.out.println(pq);

        pq.add(5);
        System.out.println(pq);

        pq.offer(7);
        System.out.println(pq);

        pq.remove(3);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }

}
