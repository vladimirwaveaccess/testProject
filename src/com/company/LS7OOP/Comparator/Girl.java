package com.company.LS7OOP.Comparator;

public class Girl implements Comparable<Girl>{
    String name;
    int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Girl girl) {
        return age - girl.age;
    }
}
