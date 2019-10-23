package com.company.Exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        int a;
        int[] massive = {1, 2, 3};

        try {
            a = massive.length;
            int b = 42 / a;
            int d = 42 / 0;
            int[] c = new int[a];
            c[a-1] = 666;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero." + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("After \"try - catch - catch\" block");
    }
}
