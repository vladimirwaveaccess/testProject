package com.company.Exceptions;

public class MyExceptionDemo {
    static void d1() {
        try {
            throw new MyException("hi");
        } catch (MyException e) {
            e.m();
        }
    }

    static void d2() throws MyException {
        throw new MyException("hi");
    }

    public static void main(String[] args) throws MyException {
        d1();
        d2();
    }
}
