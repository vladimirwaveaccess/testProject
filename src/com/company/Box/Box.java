package com.company.Box;

public class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
    }

    double volume() {
        return width * height * depth;
    }

    double avg(int... a) {
        int c = 0;
        for (int i : a) {
            c += i;
        }
        return c/a.length;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("good");
    }
}
