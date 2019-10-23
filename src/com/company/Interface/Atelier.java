package com.company.Interface;

public class Atelier {
    public void PutOnMan(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof MensClothes) {
                System.out.println(clothe);
            }
        }
    }

    public void PutOnWoman(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomensClothes) {
                System.out.println(clothe);
            }
        }
    }
}
