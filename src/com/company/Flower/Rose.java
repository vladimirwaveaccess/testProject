package com.company.Flower;

public class Rose extends Flower {

    public Rose(String country, int storageTerm, double price) {
        super(country, storageTerm, price);
    }

    @Override
    public String toString() {
        return "Rose{} " + super.toString();
    }
}
