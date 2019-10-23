package com.company.LS7OOP;

public class Phone {
    private String number;
    private String model;
    private double weight;
    private static int count;


    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        count++;
        this.number = number;
        this.model = model;
    }

    public Phone() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " is calling form " + number + " number");
    }

    public void sendMessage(String message, String... numbers) {
        System.out.printf("Send \"%s\" message to the: \n", message);
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
