package com.company.Collections;

import java.util.*;

public class CollectionsExample1 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("red", "green", "blue");
        Collections.sort(list1);
        System.out.println(list1);

        List<String> list2 = Arrays.asList("green", "red", "yellow", "blue");
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

        List<String> list3 = Arrays.asList("green", "red", "yellow", "blue");
        Collections.reverse(list3);
        System.out.println(list3);

        List<String> list4 = Arrays.asList("green", "red", "yellow", "blue");
        Collections.shuffle(list4);
        System.out.println(list4);

        List<String> list5 = Arrays.asList("green", "red", "yellow", "blue");
        Collections.fill(list5, "black");
        System.out.println(list5);

        //Проверка имеют ли коллекции одинаковые элементы
        System.out.println(Collections.disjoint(list3, list4));
        System.out.println(Collections.disjoint(list3, list5));

        Collection<String> collection = Arrays.asList("red", "cyan", "red");
        System.out.println(Collections.frequency(collection, "red"));

        String[] init = {"One", "Two", "Three", "One", "Two", "Three"};
        List list6 = new ArrayList(Arrays.asList(init));
        List list7 = new ArrayList(Arrays.asList(init));
        list6.remove("One");
        System.out.println(list6);
        list7.removeAll(Collections.singleton("One"));
        System.out.println(list7);
    }
}
