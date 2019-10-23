package com.company.Flower;

public class Romashki extends Flower {

    public Romashki(String country, int storageTerm, double price) {
        super(country, storageTerm, price);
    }

    @Override
    public String toString() {
        return "Romashki{} " + super.toString();
    }
}
