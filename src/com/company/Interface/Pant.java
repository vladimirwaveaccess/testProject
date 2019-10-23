package com.company.Interface;

public class Pant extends Clothes implements MensClothes, WomensClothes {
    public Pant(int size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void PutOnMan() {
        System.out.println("Man's pant, size is " + getSize() + ", color is " + getColor() + " and price is " + getPrice());
    }

    @Override
    public void PutOnWoman() {
        System.out.println("Woman's pant, size is " + getSize() + ", color is " + getColor() + " and price is " + getPrice());
    }

    @Override
    public String toString() {
        return "Pant{} " + super.toString();
    }
}
