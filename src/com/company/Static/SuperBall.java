package com.company.Static;

public class SuperBall extends Ball{
    public SuperBall(String color) {
        super(color);
    }

    /**
     * Перекрывает метод в родительском классе
     * @return
     */
    static int getCountInstance() {
        return count + 10;
    }
}
