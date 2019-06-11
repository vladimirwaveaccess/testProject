package com.company.Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        Girl girl = new Girl("Ket", 23);
        Girl girl1= new Girl("Ket1", 33);

        SuperGirl superGirl = new SuperGirl("Ket2", 32, "superPower");

        System.out.println(girl);
        System.out.println(girl1);

        System.out.println(superGirl);
        superGirl.goToCinema();
    }
}
