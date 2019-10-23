package com.company.Interface;

public class Tie extends Clothes implements MensClothes {
    public Tie(int size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void PutOnMan() {
        System.out.println("Man's tie, size is " + getSize() + ", color is " + getColor() + " and price is " + getPrice());
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
