package com.company.Static;

public class Main {
    public static void main(String[] args) {
        Ball sd = new Ball("red");
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(15);

        System.out.println(sd);
        System.out.println(Ball.getCountInstance());
        System.out.println(Ball.count);

        System.out.println(SuperBall.count);
        System.out.println(SuperBall.getCountInstance());

        System.out.println(circle1.circleSquare());
        System.out.println(circle2.circleSquare());

        System.out.println(circle1.circumFerence());
        System.out.println(circle2.circumFerence());
    }
}
