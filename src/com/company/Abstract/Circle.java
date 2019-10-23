package com.company.Abstract;

import java.util.Objects;

public class Circle extends Shape {
    private int x, y, z;

    public Circle(String color, int x, int y, int z) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x &&
                y == circle.y &&
                z == circle.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, z);
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                "} " + super.toString();
    }
}
