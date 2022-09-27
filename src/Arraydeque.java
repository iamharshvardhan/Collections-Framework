import java.util.*;

public class Arraydeque {
    
    public static void arraydeque() {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            adq.offer(i);
        }
        System.out.println(adq);

        adq.add(100);
        System.out.println(adq);

        adq.poll();
        System.out.println(adq);

        adq.offerFirst(200);
        System.out.println(adq);

        adq.offerLast(300);
        System.out.println(adq);

        adq.pollFirst();
        System.out.println(adq);

        adq.pollLast();
        System.out.println(adq);
    }
}
