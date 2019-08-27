package com.company.Abstract;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", 10, 10, 10);
        shapes[1] = new Circle("blue", 10, 10, 10);
        shapes[2] = new Rectangle("blue", 10, 10, 10, 12);

        Circle circle1 = new Circle("Green", 10, 10, 10);
        Circle circle2 = new Circle("Red", 12, 12, 12);
        Circle circle3 = new Circle("Red", 12, 12, 12);
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape);
        }

        System.out.println("circle1 equals circle2 is " + circle1.equals(circle2));
        System.out.println("circle2 equals circle3 is " + circle2.equals(circle3));
    }
}
