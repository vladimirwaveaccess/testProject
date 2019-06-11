package com.company.Inheritance.P1;

import com.company.Inheritance.P2.C3;

public class Main {
    public static void main(String[] args) {
        C1 c = new C3();
        System.out.println(c.m());
        c = new C2();
        System.out.println(c.m());
    }
}
