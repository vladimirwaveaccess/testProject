package com.company.Generics;

public interface MinMax <T extends Comparable<T>> {
    T min();
    T max();
}
