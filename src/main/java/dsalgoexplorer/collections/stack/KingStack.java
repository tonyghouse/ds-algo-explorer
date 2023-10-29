
//person implementation of Stack

import java.util.LinkedList;

public class KingStack {

    public static void main(String[] args) {
        LinkedList<Integer> ks = new LinkedList<>();
        // adding first and removing first is better for stack implemenataion
        //bcoz addinge elements and removing from tail is bad due to traversal

        //addding
        ks.addFirst(1001);
        ks.addFirst(2001);
        ks.addFirst(3001);
        ks.addFirst(4001);
        ks.addFirst(5001);


        //removing 
        Integer val = ks.removeFirst();

        System.out.println("popped val: "+val);

        System.out.println(ks);

    }

}
