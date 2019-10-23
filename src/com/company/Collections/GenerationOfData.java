package com.company.Collections;

import java.util.Date;
import java.util.stream.Stream;

public class GenerationOfData {
    public static void main(String[] args) {
        Stream.generate(()->new Date()).limit(5).forEach(System.out::println);
    }
}
