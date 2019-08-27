package com.company.Abstract;

import java.util.Objects;

public class Rectangle extends Shape {

    private int x, y, z, s;

    public Rectangle(String color, int x, int y, int z, int s) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
        this.s = s;
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

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x &&
                y == rectangle.y &&
                z == rectangle.z &&
                s == rectangle.s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, z, s);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
