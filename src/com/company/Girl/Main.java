package com.company.Girl;

import com.company.Girl.Girl;

public class Main {

    public static void main(String[] args) {
        Girl girl = new Girl();
//        System.out.println(girl.age);
//        System.out.println(girl.name);

        girl.age = 23;
        girl.name = "Ira";
        girl.show();
        girl.goToCinema();

        Girl girl1 = new Girl();

        girl1.age = 27;
        girl1.name = "Ket";
        girl1.show();
        girl1.goToCinema();
    }
}
