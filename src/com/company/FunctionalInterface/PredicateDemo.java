package com.company.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> s != null;
        Predicate<String> predicate2 = s -> !s.isEmpty();

        System.out.println(predicate1.and(predicate1).test(null));
        System.out.println(predicate1.or(predicate1).test(""));
        System.out.println();
        System.out.println(predicate2.and(predicate2).test(""));
        System.out.println(predicate2.or(predicate2).test("ABC"));
    }
}
