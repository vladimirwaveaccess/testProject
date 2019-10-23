package com.company.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> nullCheck = arg -> arg != null;
        Predicate<String> emptyCheck = arg -> arg.length() > 0;
        Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);

        String helloStr = "hello";
        System.out.println(nullAndEmptyCheck.test(helloStr));
        String nullStr = null;
        System.out.println(nullAndEmptyCheck.test(nullStr));

    }
}
