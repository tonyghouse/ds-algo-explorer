package dsalgoexplorer.collections.queue;

import java.util.Queue;
import java.util.ArrayDeque;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<>();
        q.offer(101);
         q.offer(201);
          q.offer(301);
         Integer x = q.remove();
          System.out.println("x in queue: "+x);
          Integer y = q.poll();
          System.out.println("y in queue: "+y);

        // System.out.println("peek in queue: "+q.peek());
        System.out.println("size queue: "+q.size());

    }
}
