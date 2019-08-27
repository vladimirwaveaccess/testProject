package com.company.Flower;

public class Gvozdiki extends Flower {

    public Gvozdiki(String country, int storageTerm, double price) {
        super(country, storageTerm, price);
    }

    @Override
    public String toString() {
        return "Gvozdiki{} " + super.toString();
    }
}
