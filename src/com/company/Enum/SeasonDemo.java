package com.company.Enum;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season1 = Season.AUTUMN;
        Season season2 = Season.valueOf("SUMMER");

//        System.out.println(season1);
//        System.out.println(season2);

//        printSeason(season1);
//        printAllValues();
//        printPosition();
        for (Season season : Season.values()) {
            System.out.println(season + " " + season.getTmp() + " " + season.getDescription());
        }
    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("I like winter");
                break;
            case SPRING:
                System.out.println("I like spring");
                break;
            case SUMMER:
                System.out.println("I like summer");
                break;
            case AUTUMN:
                System.out.println("I like autumn");
                break;
        }
    }

    public static void printAllValues() {
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season);
        }
    }

    public static void printPosition() {
        for (Season season : Season.values()) {
            System.out.println(season + " " + season.ordinal());
        }
    }
}
