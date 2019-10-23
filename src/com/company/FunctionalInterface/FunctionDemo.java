package com.company.FunctionalInterface;

import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> function1 = i -> i > 0 ? "A positive number" : i < 0 ? "A negative number" : "Zero";

        System.out.println(function1.apply(-3));
        System.out.println(function1.apply(6));
        System.out.println(function1.apply(0));

        IntFunction<String> function2 = String::valueOf;
        System.out.println(function2.apply(450));
    }
}
