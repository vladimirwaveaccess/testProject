package com.company.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {
        Supplier<Double> supplier1 = () -> (Math.random() * 10);
        Supplier<Integer> supplier2 = () -> (int) (Math.random() * 10);
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());
    }
}
