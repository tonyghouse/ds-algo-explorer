package dsalgoexplorer.collections.queue;

import java.util.*;

public class RevKElements {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.offer(60);
        q.offer(70);

        System.out.println(q);

         int k =3;
        System.out.println("\n\n\n reversing K elems:  "+k);
        for(int i =0;i<k;i++){
            int num = q.poll();
            st.push(num);
        }

        while(st.size()>0){
           q.offer(st.pop());
        }

         for(int i =0; i< q.size()-k;i++){
            q.offer(q.poll());
        }


        System.out.println(" final q:  "+q);



    }
}
