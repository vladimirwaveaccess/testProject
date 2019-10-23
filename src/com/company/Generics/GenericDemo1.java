package com.company.Generics;

public class GenericDemo1 {
    public static void main(String[] args) {
        ThreeGen<Integer, Dog, Double> threeGen = new ThreeGen<>(12, new Dog(), 78.8);

        threeGen.showTypes();

        System.out.println();

        int v = threeGen.getOb1();
        System.out.println("Value: " + v);

        Dog dog = threeGen.getOb2();
        System.out.println("Value: " + dog);

        System.out.println(threeGen.getOb3());
    }

}
