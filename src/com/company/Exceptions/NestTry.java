package com.company.Exceptions;

public class NestTry {
    public static void main(String[] args) {
        int[] mas = {1, 2};

        try {
            int a = mas.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            function(a);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: " + e);
        }
    }

    private static void function(int a) {
        try {
            if (a == 1)
                a = a / (a - a);
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range: " + e);
        }
    }
}
