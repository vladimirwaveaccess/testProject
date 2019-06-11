package com.company.Polymorphism;

class Box {
    static void m() {
        System.out.println("m()");
    }

    static void m(int a) {
        System.out.println("m(int a)");
    }

    static void m(int a, int b) {
        System.out.println("m(int a, int b)");
    }

    static void m(double a) {
        System.out.println("m(double a)");
    }

    static double m(int... a) {
        System.out.println("m(int... a)");
        int avg = 0;
        for (int i : a) {
            avg += i;
        }
        return avg / a.length;
    }
}

public class Main {
    public static void aMethod(long val1, int val2) {
        System.out.println("long, int");
    }

    public static void aMethod(int val1, long val2) {
        System.out.println("int long");
    }

    public static void main(String[] args) {
        Box.m(12);
        Box.m(1, 2);
        Box.m(1, 2, 3, 4, 5);

        aMethod(9l, 10);
    }
}
