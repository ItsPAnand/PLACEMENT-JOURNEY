package DSA_in_java;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        //Queue<Integer> q=new PriorityQueue<>();   //In priorityQueue it will sort the element when adding
        Queue<Integer> q=new LinkedList<>();
        q.add(50);
        q.add(4);
        q.add(7);
        q.add(69);
        System.out.println(q.peek());

        System.out.println(q);

        System.out.println(q.remove());                   //if queue is empty it will throw exception
        System.out.println(q.remove());

        System.out.println(q.poll());                 //if queue is empty is will throw NULL 
        System.out.println(q.poll()); 

        //System.out.println(q.remove());   //throws exception

        System.out.println(q.poll());   //throws NULL

        System.out.println(q);
    }
}
