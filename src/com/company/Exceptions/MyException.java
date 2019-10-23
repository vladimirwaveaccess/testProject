package com.company.Exceptions;

public class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }

    public void m() {
        System.out.println("Hi from MyException");
    }
}
