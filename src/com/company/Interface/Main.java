package com.company.Interface;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        A a = () -> System.out.println("hi");
        a.m1();

        IntPredicate d = s -> s % 2 == 0;
        IntPredicate d1 = s -> s % 2 != 0;

        Stream.of("1", "2", "3", "4", "5", "6")
                .mapToInt(Integer::parseInt)
                .filter(d1)
                .forEach(System.out::println);
    }
}
