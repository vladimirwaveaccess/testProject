package com.company.LS7OOP.animals;

import java.util.Objects;

public class Cat extends Animal {
    private String poroda;

    public Cat(String food, String location, String poroda) {
        super(food, location);
        this.poroda = poroda;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(poroda, cat.poroda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), poroda);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "poroda='" + poroda + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow-Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat drink milk");
    }
}
