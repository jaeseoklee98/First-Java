package week02.week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {

        Queue<Integer> intQueue = new LinkedList<>();

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());
    }
}
