package com.company.FunctionalInterface.Supplier;

import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Stream.generate(random::nextInt)
                .limit(5)
                .forEach(System.out::println);
    }
}
