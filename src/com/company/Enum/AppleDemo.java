package com.company.Enum;

public class AppleDemo {
    public static void main(String[] args) {
        Apple ap = Apple.GoldenDel;
        Apple ap2 = Apple.RedDel;
        Apple ap3 = Apple.Winesap;
        Apple[] apples = Apple.values();
        Example ex = Example.valueOf("");

//        System.out.println("Value of ap: " + ap);
//        System.out.println();
//
//        if (ap == Apple.GoldenDel) {
//            System.out.println("ap contains GoldenDel.\n");
//        }
//
//        switch (ap) {
//            case Jonathan:
//                System.out.println("Jonathan is red.");
//                break;
//            case GoldenDel:
//                System.out.println("Golden Delicious is yellow.");
//                break;
//            case RedDel:
//                System.out.println("Red delicious is red.");
//                break;
//            case Winesap:
//                System.out.println("Winesap is red.");
//                break;
//            case Cortland:
//                System.out.println("Cortland is red.");
//                break;
//        }
//
//        for (Apple apple : apples) {
//            System.out.println(apple);
//        }
//        System.out.println();
//
//        for (Apple apple : apples) {
//            System.out.println(apple.ordinal());
//        }
//        System.out.println();
//
//        ap = Apple.valueOf("Winesap");
//        System.out.println(ap);

        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " comes before " + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " comes before " + ap);
        }
        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " equals " + ap3);
        }

        System.out.println();

        if (ap.equals(ap2)) {
            System.out.println("Error!");
        }
        if (ap.equals(ap3)) {
            System.out.println(ap + " equals " + ap3);
        }
        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }
    }
}
