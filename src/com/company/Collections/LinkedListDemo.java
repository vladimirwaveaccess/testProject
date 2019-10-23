package com.company.Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> hs = new LinkedList<>();

        System.out.println("Initial size of hs: " + hs.size());

        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        hs.addLast("Z");
        hs.addFirst("A");
        hs.add(1,"df");
        System.out.println("Size of hs after additions: " + hs.size());
        System.out.println("Contents of hs: " + hs);

        hs.remove("E");
        hs.remove(2);
        System.out.println("Size of hs after deletions: " + hs.size());
        System.out.println("Contents of hs: " + hs);

        hs.removeFirst();
        hs.removeLast();
        System.out.println("hs after deleting first and last: " + hs);
        String val = hs.get(2);
        hs.set(2, val + " Changed");
        System.out.println("hs after change: " + hs);
    }
}
