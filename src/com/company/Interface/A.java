package com.company.Interface;

@FunctionalInterface
public interface A {
    void m1();
    default void m2(){};
}
