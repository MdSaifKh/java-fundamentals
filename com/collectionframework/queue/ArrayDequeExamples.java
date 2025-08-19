package com.collectionframework.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExamples {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // both side insertion and deletion possible

        arrayDeque.offer(12);
        arrayDeque.offer(14); // add element to last - coming from queue interface
        arrayDeque.offerFirst(10); // add element to first - ArrayDeque method

        System.out.println(arrayDeque);
    }
}
