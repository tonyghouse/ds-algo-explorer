package dsalgoexplorer.collections.queue;

import java.util.LinkedList;

public class KingQueue{
    public static void main(String[] args) {
        LinkedList<Integer> kq = new LinkedList<>();

        //removing first and adding last is better

        //adding
        kq.addLast(909);
        kq.addLast(809);
        kq.addLast(709);

        //removing
        kq.remove();

        System.out.println(kq);
                

    }
}