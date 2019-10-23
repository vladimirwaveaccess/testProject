package com.company;

import java.util.LinkedHashSet;
import java.util.Set;

public class Empty {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,1};
        Set<Integer> res = new LinkedHashSet<>();


        for (int i: x) {
            res.add(i);
        }

        System.out.println(res);

    }
}
