package com.company.Collections;

import java.util.HashSet;

public class HashSetDemo {
    static HashSet<String> set = new HashSet<>();
    static {
        set.add("B");
        set.add("A");
        set.add("D");
        set.add("E");
        set.add("C");
        set.add("F");
    }

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);

        hs.forEach(s-> System.out.print(s.hashCode() + " "));
    }
}
