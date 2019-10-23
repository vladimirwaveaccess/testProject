package com.company.Flower;

import java.util.Objects;

public class Flower {
    private String country;
    private int storageTerm;
    private double price;
    private static int count;

    public Flower(String country, int storageTerm, double price) {
        this.country = country;
        this.storageTerm = storageTerm;
        this.price = price;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getStorageTerm() {
        return storageTerm;
    }

    public void setStorageTerm(int storageTerm) {
        this.storageTerm = storageTerm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return storageTerm == flower.storageTerm &&
                Double.compare(flower.price, price) == 0 &&
                Objects.equals(country, flower.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, storageTerm, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", storageTerm=" + storageTerm +
                ", price=" + price +
                '}';
    }
}
