package com.company.Flower;

public class Settings {
    public static double calculationCost(Flower[] flowers) {
        double cost = 0;
        for (Flower item: flowers) {
            cost += item.getPrice();
        }
        return cost;
    }
}
