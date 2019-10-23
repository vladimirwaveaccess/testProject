package com.company.Wrappers;

public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = 1.1;
        Double double2 = new Double("2.2");
        Double double3 = 3.3;
        Double double4 = Double.valueOf("4444444444.4444444444");
        double double5 = Double.parseDouble("5.5");

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
        System.out.println(double5);

        System.out.println(double4.byteValue());
        System.out.println(double4.doubleValue());
        System.out.println(double4.floatValue());
        System.out.println(double4.intValue());
        System.out.println(double4.longValue());
        System.out.println(double4.shortValue());
    }
}
