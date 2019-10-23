package com.company.Fruits;

public class FruitDemo {
    public static void main(String[] args) {

        double totalCost = 0;

        Apple apple1 = new Apple(2.4, 33);
        Apple apple2 = new Apple(5.9, 24);
        Apricot apricot1 = new Apricot(3, 55);
        Apricot apricot2 = new Apricot(5.5, 44);
        Pear pear1 = new Pear(10, 32.5);
        Pear pear2 = new Pear(4.2, 29.7);

        Fruit[] fruits = {apple1, apple2, apricot1, apricot2, pear1, pear2};

        totalCost = Apple.getCount() + Apricot.getCount() + Pear.getCount();
        System.out.println("Total cost of fruits is " + totalCost);

        System.out.println("Cost of apple is " + Apple.getCount());
        System.out.println("Cost of apricot is " + Apricot.getCount());
        System.out.println("Cost of pear is " + Pear.getCount());

    }
}
