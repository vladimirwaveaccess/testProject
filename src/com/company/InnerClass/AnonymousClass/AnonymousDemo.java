package com.company.InnerClass.AnonymousClass;

import com.company.Interface.Printable;

public class AnonymousDemo {
    public static void main(String[] args) {
        Printable newspaper = new Printable() {
            @Override
            public void print() {
                System.out.println("Print newspaper");
            }
        };

        Printable[] printables = {newspaper};

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
