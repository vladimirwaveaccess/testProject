package com.company.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        Consumer<HeavyBox> consumer1 = box -> System.out.println("Heavy box is - " + box.weight);
        Consumer<HeavyBox> consumer2 = box -> System.out.println("Heavy box is sent");
        HeavyBox box1 = new HeavyBox(23.5);

        consumer1.andThen(consumer2).accept(box1);
    }
}
