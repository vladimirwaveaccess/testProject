package com.company.Encapsulation;

public class Encapsulation1 {
    public static void main(String[] args) {
        Girl girl = new Girl("Ket", 23);
        Girl girl1 = new Girl("Ket1", 33);
        girl.goToCinema();
        girl.setAge(1000);

        System.out.println(girl);
        System.out.println(girl1);
    }
}
