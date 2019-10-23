package com.company.Collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("B");
        set.add("A");
        set.add("D");
        set.add("E");
        set.add("C");
        set.add("F");
        System.out.println(set);

        set.forEach(s-> System.out.print(s.hashCode() + " "));
    }
}
