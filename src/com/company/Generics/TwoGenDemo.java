package com.company.Generics;

public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generic");

        tgObj.showTypes();
        int v = tgObj.getOb1();
        String str = tgObj.getOb2();

        System.out.println("value: " + v);
        System.out.println("value: " + str);
    }
}
