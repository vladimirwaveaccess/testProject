package com.company.Interface;

public class ClothesDemo {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(34, 12.5, "green"),
                new Pant(40, 24.6, "black"),
                new Skirt(36, 54, "Yellow"),
                new Tie(85, 6, "pink")
        };

        Atelier atelier = new Atelier();

        atelier.PutOnMan(clothes);
        System.out.println();
        atelier.PutOnWoman(clothes);
    }
}
