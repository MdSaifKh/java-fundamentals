package com.collectionframework.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListExamples {
    public static void main(String[] args) {
        /*Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(10);
        System.out.println(queue.peek()); // display which element is next to be removed
        System.out.println(queue.poll()); // remove first element and the value(FIFO)
        System.out.println(queue.peek());
        System.out.println(queue);
*/

        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); // by default smallest int has max priority
        // we want max will have the highest priority
        // element with high priority will poll first(pop/remove)

        priorityQueue.offer(10);
        priorityQueue.offer(5);
        priorityQueue.offer(40);
        priorityQueue.offer(30);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());


    }
}
