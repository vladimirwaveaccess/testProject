package com.company.FunctionalInterface.Supplier;

import com.company.Inheritance.Inheritance2.Point;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /**
     * Point objects generation
     *
     * @param count - counts of objects
     * @return - objects of Point type
     */
    private static List<Point> getPoints(int count) {
        return Stream.generate(() -> new Point(10, 10))
                .limit(count)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Random random = new Random();
        Stream.generate(random::nextInt)
                .limit(5)
                .forEach(System.out::println);

        System.out.println(getPoints(10));
    }
}
