package com.company.Collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();

        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");
        System.out.println("Priority queue using Comparable: ");
        while (queue1.size() > 0) {
            System.out.println(queue1.remove() + " ");
        }
    }
}
