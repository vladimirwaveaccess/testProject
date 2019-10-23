package com.company.Flower;

import static com.company.Flower.Settings.*;

public class FlowerDemo {

    public static void main(String[] args) {

//        Rose rose = new Rose("Ukraine", 10, 12.5);
//        Gvozdiki gvozdiki = new Gvozdiki("Russia", 20, 10);
//        Tulpani tulpan = new Tulpani("Holland", 18, 15);
//        Romashki romashka = new Romashki("Belarus", 14, 8);

        Flower[] buket1 = new Flower[]{
                new Romashki("Belarus", 14, 8),
                new Romashki("Belarus", 14, 8),
                new Romashki("Belarus", 14, 8),
                new Romashki("Belarus", 14, 8),
                new Romashki("Belarus", 14, 8)};

        Flower[] buket2 = new Flower[]{
                new Rose("Ukraine", 10, 12.5),
                new Rose("Ukraine", 10, 12.5),
                new Rose("Ukraine", 10, 12.5)};

        Flower[] buket3 = new Flower[]{
                new Gvozdiki("Russia", 20, 10),
                new Gvozdiki("Russia", 20, 10),
                new Gvozdiki("Russia", 20, 10),
                new Gvozdiki("Russia", 20, 10),
                new Romashki("Belarus", 14, 8),
                new Romashki("Belarus", 14, 8),
                new Romashki("Belarus", 14, 8)};

        Flower[] buket4 = new Flower[]{
                new Tulpani("Holland", 18, 15),
                new Tulpani("Holland", 18, 15),
                new Tulpani("Holland", 18, 15),
                new Tulpani("Holland", 18, 15),
                new Tulpani("Holland", 18, 15)};

        Flower[] buket5 = new Flower[]{
                new Romashki("Belarus", 14, 8),
                new Rose("Ukraine", 10, 12.5),
                new Gvozdiki("Russia", 20, 10),
                new Tulpani("Holland", 18, 15),
                new Romashki("Belarus", 14, 8)};

        System.out.printf("Cost of 1 bouquet is %f\n", calculationCost(buket1));
        System.out.printf("Cost of 2 bouquet is %f\n", calculationCost(buket2));
        System.out.printf("Cost of 3 bouquet is %f\n", calculationCost(buket3));
        System.out.printf("Cost of 4 bouquet is %f\n", calculationCost(buket4));
        System.out.printf("Cost of 5 bouquet is %f\n", calculationCost(buket5));

        System.out.printf("Count of flowers in the bouquets is %d\n", Flower.getCount());
    }
}
