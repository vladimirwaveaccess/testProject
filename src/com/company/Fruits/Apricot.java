package com.company.Fruits;

import java.util.Objects;

public class Apricot extends  Fruit{

    private double pricePerKg;
    private static double count = 0;

    public Apricot(double weight, double pricePerKg) {
        super(weight);
        this.pricePerKg = pricePerKg;
        count += costOfFruit();
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public static double getCount() {
        return count;
    }

    public static void setCount(double count) {
        Apricot.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apricot apricot = (Apricot) o;
        return Double.compare(apricot.pricePerKg, pricePerKg) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pricePerKg);
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "pricePerKg=" + pricePerKg +
                "} " + super.toString();
    }

    @Override
    public double costOfFruit() {
        return getWeight() * getPricePerKg();
    }

}
