package com.company.Flower;

public class Tulpani extends Flower {

    public Tulpani(String country, int storageTerm, double price) {
        super(country, storageTerm, price);
    }

    @Override
    public String toString() {
        return "Tulpani{} " + super.toString();
    }
}
