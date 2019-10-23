package com.company.Inheritance;

public class SuperGirl extends Girl{
    private String superPower;

    public SuperGirl(String name, int age, String superPower) {
        super(name, age);
        this.superPower = superPower;
    }

    @Override
    public String toString() {
        return "SuperGirl{" +
                "superPower='" + superPower + '\'' +
                "} " + super.toString();
    }
}
