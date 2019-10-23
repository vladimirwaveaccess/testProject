package com.company.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
    static List<String> set1 = Arrays.stream(new String[]{"A", "D", "H", "B"}).collect(Collectors.toList());
    static List<String> set = new ArrayList<>();
    static {
        set.add("B");
        set.add("A");
        set.add("D");
        set.add("E");
        set.add("C");
        set.add("F");
    }

    public static void main(String[] args) {
        List<String> hs = new ArrayList<>();

        System.out.println("Initial size of hs: " + hs.size());

        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        hs.add(1,"df");
        System.out.println("Size of hs after additions: " + hs.size());
        System.out.println("Contents of hs: " + hs);

        hs.remove("E");
        hs.remove(2);
        System.out.println("Size of hs after deletions: " + hs.size());
        System.out.println("Contents of hs: " + hs);
    }
}
