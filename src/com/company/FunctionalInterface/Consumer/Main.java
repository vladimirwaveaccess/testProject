package com.company.FunctionalInterface.Consumer;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("hello", "world")
                .forEach(System.out::println);
    }
}
