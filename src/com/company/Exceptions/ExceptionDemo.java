package com.company.Exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("hi");
    }
}
