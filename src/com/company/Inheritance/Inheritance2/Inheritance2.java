package com.company.Inheritance.Inheritance2;

public class Inheritance2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point = new Point(10, 10);
        Point point2 = (Point) point.clone();


        Point point1 = new Point(10, 10);
        System.out.println(point.hashCode());
        System.out.println(point2.hashCode());

        System.out.println(point.getClass() == Point.class);


    }
}
