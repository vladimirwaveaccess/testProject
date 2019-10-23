package com.company.Interface;

public class Skirt extends Clothes implements WomensClothes {
    public Skirt(int size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void PutOnWoman() {
        System.out.println("Woman's skirt, size is " + getSize() + ", color is " + getColor() + " and price is " + getPrice());
    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}
