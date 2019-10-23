package com.company.Static;

public class Ball {
    public static int count;

    static int getCountInstance() {
        return count;
    }

    private String color = "none";

    public Ball(String color) {
        this.color = color;
        count++;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("ASD");
        count--;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                '}';
    }
}
