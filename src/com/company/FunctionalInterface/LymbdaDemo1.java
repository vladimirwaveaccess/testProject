package com.company.FunctionalInterface;

public class LymbdaDemo1 {
    public static void main(String[] args) {
        Printable newspaper = () -> System.out.println("Print newspaper");
        Printable[] printables = {newspaper};


        for (Printable printable : printables) {
            printable.print();
        }
    }
}
