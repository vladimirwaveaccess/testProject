package com.company.LS7OOP.animals;

import java.util.Objects;

public class Horse extends Animal {
    private String copita;

    public Horse(String food, String location, String copita) {
        super(food, location);
        this.copita = copita;
    }

    public String getCopita() {
        return copita;
    }

    public void setCopita(String copita) {
        this.copita = copita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(copita, horse.copita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), copita);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "copita='" + copita + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        System.out.println("Igo-go");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat oats");
    }
}
