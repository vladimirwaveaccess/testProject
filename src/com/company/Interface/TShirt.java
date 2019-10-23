package com.company.Interface;

public class TShirt extends Clothes implements MensClothes, WomensClothes {
    public TShirt(int size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void PutOnMan() {
        System.out.println("Man's T-shirt, size is " + getSize() + ", color is " + getColor() + " and price is " + getPrice());
    }

    @Override
    public void PutOnWoman() {
        System.out.println("Woman's T-shirt, size is " + getSize() + ", color is " + getColor() + " and price is " + getPrice());
    }

    @Override
    public String toString() {
        return "TShirt{} " + super.toString();
    }
}
