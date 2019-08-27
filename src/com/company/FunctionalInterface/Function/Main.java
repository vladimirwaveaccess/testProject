package com.company.FunctionalInterface.Function;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream("4,-9,16".split(","))
                .map(Integer::parseInt)
                .map(i -> (i < 0) ? -i : i)
                .forEach(System.out::println);
    }
}
