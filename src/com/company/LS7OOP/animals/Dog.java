package com.company.LS7OOP.animals;

import java.util.Objects;

public class Dog extends Animal {
    private String hvost;

    public Dog(String food, String location, String hvost) {
        super(food, location);
        this.hvost = hvost;
    }

    public String getHvost() {
        return hvost;
    }

    public void setHvost(String hvost) {
        this.hvost = hvost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(hvost, dog.hvost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hvost);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hvost='" + hvost + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        System.out.println("Gav-Gav");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat bones");
    }
}
