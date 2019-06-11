package com.company.Static;

public class Main {
    public static void main(String[] args) {
        Ball sd = new Ball("red");
        System.out.println(sd);
        System.out.println(Ball.getCountInstance());
        System.out.println(Ball.count);
    }
}
