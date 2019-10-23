package com.company.Threads;

public class SynchDemo {
    public static void main(String[] args) {
        Callme target = new Callme();
//        Caller ob1 = new Caller(target, "Hello");
//        Caller ob2 = new Caller(target, "Synchronized");
//        Caller ob3 = new Caller(target, "World");

        CallerSynchronize ob4 = new CallerSynchronize(target, "Hello");
        CallerSynchronize ob5 = new CallerSynchronize(target, "Synchronized");
        CallerSynchronize ob6 = new CallerSynchronize(target, "World");
    }
}
