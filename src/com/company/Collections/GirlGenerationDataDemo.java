package com.company.Collections;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GirlGenerationDataDemo {
    public static void main(String[] args) {
        Stream.generate(()->new Girl(DataUtils.getRandomName(), DataUtils.getRandomAge())).limit(5).forEach(System.out::println);
        System.out.println();
        List<Girl> collect = Stream.generate(() -> new Girl(DataUtils.getRandomName(), DataUtils.getRandomAge())).limit(5).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println();

        Random random = new Random();
        random.ints(1, 10).limit(5).forEach(System.out::println);
    }
}
