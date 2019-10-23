package com.company.Interface;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("Book1"),
                new Magazine("Magazine1"),
                new Magazine("Magazine2")
        };

//        for (Printable printable : printables) {
//            printable.print();
//        }

        Magazine.printMagazine(printables);
        System.out.println();
        Book.printBook(printables);
    }
}
